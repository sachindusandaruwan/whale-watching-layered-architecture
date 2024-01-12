package lk.ijse.whaleWatching.bo.custom.impl;

import lk.ijse.whaleWatching.bo.custom.EmpAttendenceBo;
import lk.ijse.whaleWatching.dao.DAOFactory;
import lk.ijse.whaleWatching.dao.custom.EmpAttendenceDAO;
import lk.ijse.whaleWatching.dao.custom.Impl.EmpAttendenceDAOImpl;
import lk.ijse.whaleWatching.dto.EmpAttendenceDto;
import lk.ijse.whaleWatching.entity.Attendence;

import java.sql.SQLException;
import java.util.ArrayList;

public class EmpAttendenceBOImpl implements EmpAttendenceBo {
    //EmpAttendenceDAO empAttendenceDAO=new EmpAttendenceDAOImpl();
    EmpAttendenceDAO empAttendenceDAO= (EmpAttendenceDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ATTENDANCE);
    @Override
    public boolean isUpdated(String id, String date) throws SQLException, ClassNotFoundException {
        return empAttendenceDAO.isUpdated(id, date);
    }

    @Override
    public boolean manage(EmpAttendenceDto attendenceDTO) throws SQLException, ClassNotFoundException {
        return empAttendenceDAO.save(new Attendence(attendenceDTO.getEmp_Id(),attendenceDTO.getDate(),attendenceDTO.getIn_time(),attendenceDTO.getOut_time()));
    }

    @Override
    public ArrayList<EmpAttendenceDto> getAllAttendeceDetail() throws SQLException, ClassNotFoundException {
        ArrayList<Attendence> all=empAttendenceDAO.getAll();
        ArrayList<EmpAttendenceDto> empAttendenceDtos=new ArrayList<>();

        for (Attendence attendence:all) {
        empAttendenceDtos.add(new EmpAttendenceDto(attendence.getEmp_Id(),attendence.getDate(),attendence.getIn_time(),attendence.getOut_time()));
        }

        return empAttendenceDtos;
    }


    @Override
    public EmpAttendenceDto isMarked(String id, String date) throws SQLException, ClassNotFoundException {
        return empAttendenceDAO.isMarked(id, date);
    }
}
