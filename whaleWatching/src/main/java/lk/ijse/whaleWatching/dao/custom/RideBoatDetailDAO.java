package lk.ijse.whaleWatching.dao.custom;

import lk.ijse.whaleWatching.dao.CrudDAO;
import lk.ijse.whaleWatching.db.Dbconnection;
import lk.ijse.whaleWatching.dto.RideBoatDto;
import lk.ijse.whaleWatching.entity.RideBoatDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface RideBoatDetailDAO extends CrudDAO<RideBoatDetail> {
    public long findBoatSeatCount(String rideId) throws SQLException, ClassNotFoundException;

    //public boolean saveRideBoatDetail(RideBoatDto rideBoatDto) throws SQLException, ClassNotFoundException;
}
