package lk.ijse.whaleWatching.bo.custom.impl;

import lk.ijse.whaleWatching.bo.custom.EmpSalaryBO;
import lk.ijse.whaleWatching.dao.DAOFactory;
import lk.ijse.whaleWatching.dao.custom.EmpSalaryDAO;
import lk.ijse.whaleWatching.dao.custom.Impl.EmpSalaryDAOImpl;
import lk.ijse.whaleWatching.dto.EmpSalaryDto;
import lk.ijse.whaleWatching.entity.Salary;

import java.sql.SQLException;
import java.util.ArrayList;

public class EmpSalaryBOImpl implements EmpSalaryBO {
    //EmpSalaryDAO empSalaryDAO=new EmpSalaryDAOImpl();
    EmpSalaryDAO empSalaryDAO= (EmpSalaryDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.SALARY);

    @Override
    public boolean isUpdated(String empId, String date) throws SQLException, ClassNotFoundException {
        return empSalaryDAO.isUpdated(empId, date);
    }

    @Override
    public boolean manage(EmpSalaryDto salaryDto) throws SQLException, ClassNotFoundException {
        return empSalaryDAO.save(new Salary(salaryDto.getSal_Id(), salaryDto.getEmp_Id(),salaryDto.getDate(),salaryDto.getAmount()));
    }

    @Override
    public ArrayList<EmpSalaryDto> getAllSalarys() throws SQLException, ClassNotFoundException {
        ArrayList<Salary> all=empSalaryDAO.getAll();
        ArrayList<EmpSalaryDto> salaryDtos=new ArrayList<>();

        for (Salary salary:all){
            salaryDtos.add(new EmpSalaryDto(salary.getSal_Id(),salary.getEmp_Id(),salary.getDate(),salary.getAmount()));
        }

        return salaryDtos;
    }


}
