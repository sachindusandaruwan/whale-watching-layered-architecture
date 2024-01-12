package lk.ijse.whaleWatching.bo.custom.impl;

import lk.ijse.whaleWatching.bo.custom.RideBO;
import lk.ijse.whaleWatching.dao.DAOFactory;
import lk.ijse.whaleWatching.dao.SqlUtil;
import lk.ijse.whaleWatching.dao.custom.Impl.BoatDAOImpl;
import lk.ijse.whaleWatching.dao.custom.Impl.RideDAOImpl;
import lk.ijse.whaleWatching.dao.custom.RideBoatDetailDAO;
import lk.ijse.whaleWatching.dao.custom.RideDAO;
import lk.ijse.whaleWatching.db.Dbconnection;
import lk.ijse.whaleWatching.dto.RideBoatCustomDto;
import lk.ijse.whaleWatching.dto.RideBoatDto;
import lk.ijse.whaleWatching.dto.RideDto;
import lk.ijse.whaleWatching.dto.tm.RideBoatTm;
import lk.ijse.whaleWatching.entity.Ride;
import lk.ijse.whaleWatching.entity.RideBoatDetail;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RideBOImpl implements RideBO {
    //RideDAO rideDAO=new RideDAOImpl();
    RideDAO rideDAO= (RideDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.RIDE);
    BoatDAOImpl boatDAO= (BoatDAOImpl) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.BOAT);
    RideBoatDetailDAO rideBoatDetailDAO= (RideBoatDetailDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.RIDE_BOAT_DETAIL);
    @Override
    public RideDto searchRide(String rideId) throws SQLException, ClassNotFoundException {
//        return rideDAO.search(rideId);
        Ride ride= rideDAO.search(rideId);
        RideDto rideDto=new RideDto(ride.getRide_Id(),ride.getOne_Person_price(),ride.getType(),ride.getDate(),ride.getTime(),ride.getStatus());

        return rideDto;
    }

    @Override
    public boolean deleteRide(String rId) throws SQLException, ClassNotFoundException {
        return rideDAO.delete(rId);
    }

    @Override
    public boolean updateRide(RideDto dto) throws SQLException, ClassNotFoundException {
        /*Ride ride = new Ride();
        return rideDAO.update(ride);*/
        return rideDAO.update(new Ride(dto.getRide_Id(),dto.getPrice(),dto.getType(),dto.getDate(),dto.getTime(),dto.getStatus()));
    }

    @Override
    public boolean saveRide(RideDto dto) throws SQLException, ClassNotFoundException {
        Connection connection= Dbconnection.getInstance().getConnection();
        connection.setAutoCommit(false);
        try {
            Ride ride = new Ride(dto.getRide_Id(), dto.getPrice(),
                    dto.getType(), dto.getDate(), dto.getTime(),
                    dto.getStatus());
            boolean isSaved = rideDAO.save(ride);

            if (!isSaved) {
                connection.rollback();
                return false;
            }

            for (RideBoatTm rideBoatDto : dto.getRideBoatTms()) {

                RideBoatDetail rideBoatDetail = new RideBoatDetail(rideBoatDto.getBoat_id(), dto.getRide_Id());

                boolean isCreate = rideBoatDetailDAO.save(rideBoatDetail);

                if (!isCreate) {
                    connection.rollback();
                    return false;
                }

            }

            connection.commit();
            return true;

        } catch (Exception ex) {
            System.out.println(ex);
            connection.rollback();
            return false;
        } finally {
            connection.setAutoCommit(true);
        }
    }


    @Override
    public ArrayList<RideDto> getAllRides() throws SQLException, ClassNotFoundException {
       ArrayList<Ride> all=rideDAO.getAll();
       ArrayList<RideDto> rideDtos=new ArrayList<>();

       for (Ride ride:all){
           rideDtos.add(new RideDto(ride.getRide_Id(),ride.getOne_Person_price(),ride.getType(),ride.getDate(),ride.getTime(),ride.getStatus()));
       }
        return rideDtos;
    }

    @Override
    public List<String> findAllIds() throws SQLException, ClassNotFoundException {
        return rideDAO.findAllIds();
    }

    @Override
    public long findBoatSeatCount(String selectedItem) throws SQLException, ClassNotFoundException {
        return rideBoatDetailDAO.findBoatSeatCount(selectedItem);
    }



}
