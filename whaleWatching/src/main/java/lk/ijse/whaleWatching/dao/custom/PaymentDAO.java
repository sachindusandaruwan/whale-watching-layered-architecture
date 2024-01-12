package lk.ijse.whaleWatching.dao.custom;

import lk.ijse.whaleWatching.dao.CrudDAO;
import lk.ijse.whaleWatching.dto.PaymentDto;
import lk.ijse.whaleWatching.entity.Payment;

import java.sql.Connection;
import java.sql.SQLException;

public interface PaymentDAO extends CrudDAO<Payment> {
   // public boolean savePayment(PaymentDto paymentDto, Connection dbconnection) throws SQLException, ClassNotFoundException;
}
