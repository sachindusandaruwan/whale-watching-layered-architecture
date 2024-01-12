package lk.ijse.whaleWatching.dao.custom;

import lk.ijse.whaleWatching.dao.CrudDAO;
import lk.ijse.whaleWatching.dao.custom.Impl.BoatEmployeeDetailDAOImpl;
import lk.ijse.whaleWatching.db.Dbconnection;
import lk.ijse.whaleWatching.dto.EmployeeBoatDto;
import lk.ijse.whaleWatching.dto.EmployeeDto;
import lk.ijse.whaleWatching.dto.tm.EmployeeBoatTm;
import lk.ijse.whaleWatching.entity.Employee;

import java.sql.*;
import java.util.ArrayList;

public interface EmployeeDAO extends CrudDAO<Employee> {
    //public boolean deleteEmployee(String empId) throws SQLException, ClassNotFoundException;

    //public boolean saveEmployee(EmployeeDto dto) throws SQLException ;
    public EmployeeDto searchEmployeeNIC(String empNic) throws SQLException, ClassNotFoundException;
   // public boolean updateEmployee(EmployeeDto dto) throws SQLException, ClassNotFoundException;

   // public EmployeeDto searchEmployeeId(String id) throws SQLException, ClassNotFoundException;

    //public ArrayList<EmployeeDto> getAllEmployees() throws SQLException, ClassNotFoundException;

    int allEmployeeCount() throws SQLException,ClassNotFoundException;
}
