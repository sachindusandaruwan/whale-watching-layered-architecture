package lk.ijse.whaleWatching.dao.custom;

import lk.ijse.whaleWatching.dao.CrudDAO;
import lk.ijse.whaleWatching.db.Dbconnection;
import lk.ijse.whaleWatching.dto.EmpAttendenceDto;
import lk.ijse.whaleWatching.dto.EmpSalaryDto;
import lk.ijse.whaleWatching.entity.Attendence;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface EmpAttendenceDAO extends CrudDAO<Attendence> {
    public boolean isUpdated(String id, String date) throws SQLException, ClassNotFoundException;

    //public boolean manage(EmpAttendenceDto attendenceDTO) throws SQLException, ClassNotFoundException;

    //public List<EmpAttendenceDto> getAllAttendeceDetail() throws SQLException, ClassNotFoundException;
    public EmpAttendenceDto isMarked(String id, String date) throws SQLException, ClassNotFoundException;
}
