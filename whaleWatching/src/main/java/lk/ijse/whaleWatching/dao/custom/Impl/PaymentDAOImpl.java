package lk.ijse.whaleWatching.dao.custom.Impl;

import lk.ijse.whaleWatching.dao.SqlUtil;
import lk.ijse.whaleWatching.dao.custom.PaymentDAO;
import lk.ijse.whaleWatching.dto.EmpAttendenceDto;
import lk.ijse.whaleWatching.dto.EmployeeDto;
import lk.ijse.whaleWatching.dto.PaymentDto;
import lk.ijse.whaleWatching.entity.Payment;

import java.sql.SQLException;
import java.util.ArrayList;

public class PaymentDAOImpl implements PaymentDAO {
    public boolean save(Payment entity) throws SQLException, ClassNotFoundException {
        /*boolean isSaved=false;

        Connection connection=dbconnection;

        //String sql = "INSERT INTO payment VALUES(?,?,?)";
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO payment VALUES(?,?,?)");

        pstm.setString(1, paymentDto.getPay_id());
        pstm.setString(2, paymentDto.getDate());
        pstm.setDouble(3, paymentDto.getAmount());

        isSaved = pstm.executeUpdate() > 0;

        return isSaved;*/
        return SqlUtil.execute("INSERT INTO payment VALUES(?,?,?)",entity.getPay_Id(),entity.getDate(),entity.getAmount());
    }

    @Override
    public boolean update(Payment entity) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public ArrayList<Payment> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public Payment search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }
}
