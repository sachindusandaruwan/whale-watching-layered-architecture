package lk.ijse.whaleWatching.dao.custom;

import lk.ijse.whaleWatching.dao.CrudDAO;
import lk.ijse.whaleWatching.dto.EmployeeBoatDto;
import lk.ijse.whaleWatching.entity.EmployeeBoatDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface BoatEmployeeDetailsDAO extends CrudDAO<EmployeeBoatDetail> {
    //public boolean save(EmployeeBoatDto boatDto) throws SQLException, ClassNotFoundException;
}
