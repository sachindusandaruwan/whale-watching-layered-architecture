package lk.ijse.whaleWatching.bo.custom;

import lk.ijse.whaleWatching.bo.SuperBO;
import lk.ijse.whaleWatching.dto.EmpSalaryDto;

import java.sql.SQLException;
import java.util.ArrayList;

public interface EmpSalaryBO extends SuperBO {
    public boolean isUpdated(String empId, String date) throws SQLException, ClassNotFoundException;
    public boolean manage(EmpSalaryDto salaryDto) throws SQLException, ClassNotFoundException;

    ArrayList<EmpSalaryDto> getAllSalarys()throws SQLException, ClassNotFoundException;
}
