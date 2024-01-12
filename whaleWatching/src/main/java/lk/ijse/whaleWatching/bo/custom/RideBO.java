package lk.ijse.whaleWatching.bo.custom;

import lk.ijse.whaleWatching.bo.SuperBO;
import lk.ijse.whaleWatching.dto.RideBoatCustomDto;
import lk.ijse.whaleWatching.dto.RideDto;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface RideBO extends SuperBO {
    public RideDto searchRide(String rideId) throws SQLException, ClassNotFoundException;

    public boolean deleteRide(String rId) throws SQLException, ClassNotFoundException;
    public boolean updateRide(RideDto dto) throws SQLException, ClassNotFoundException;

    public boolean saveRide(RideDto dto) throws SQLException, ClassNotFoundException;

    public ArrayList<RideDto> getAllRides() throws SQLException, ClassNotFoundException;

    public List<String> findAllIds() throws SQLException, ClassNotFoundException;


    long findBoatSeatCount(String selectedItem) throws SQLException, ClassNotFoundException;
}
