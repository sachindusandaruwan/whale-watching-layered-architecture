package lk.ijse.whaleWatching.dao.custom;

import lk.ijse.whaleWatching.dao.CrudDAO;
import lk.ijse.whaleWatching.db.Dbconnection;
import lk.ijse.whaleWatching.dto.EmpSalaryDto;
import lk.ijse.whaleWatching.entity.Salary;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface EmpSalaryDAO extends CrudDAO<Salary> {
    public boolean isUpdated(String empId, String date) throws SQLException, ClassNotFoundException;
    //public boolean manage(EmpSalaryDto salaryDto) throws SQLException, ClassNotFoundException;

    //public List<EmpSalaryDto> getAllsalaryDetail() throws SQLException, ClassNotFoundException;
}
