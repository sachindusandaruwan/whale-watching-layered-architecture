package lk.ijse.whaleWatching.dao.custom;

import lk.ijse.whaleWatching.dao.CrudDAO;
import lk.ijse.whaleWatching.dao.custom.Impl.RideBoatDetailDAOImpl;
import lk.ijse.whaleWatching.db.Dbconnection;
import lk.ijse.whaleWatching.dto.RideBoatDto;
import lk.ijse.whaleWatching.dto.RideDto;
import lk.ijse.whaleWatching.dto.tm.RideBoatTm;
import lk.ijse.whaleWatching.entity.Ride;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface RideDAO extends CrudDAO<Ride> {
   // public RideDto searchRide(String rideId) throws SQLException, ClassNotFoundException;

   // public boolean deleteRide(String rId) throws SQLException, ClassNotFoundException;
    //public boolean updateRide(RideDto dto) throws SQLException, ClassNotFoundException;

    //public boolean saveRide(RideDto dto) throws SQLException, ClassNotFoundException;

    //public ArrayList<RideDto> getAllRides() throws SQLException, ClassNotFoundException;

    public List<String> findAllIds() throws SQLException, ClassNotFoundException;
}
