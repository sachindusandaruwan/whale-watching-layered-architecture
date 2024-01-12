package lk.ijse.whaleWatching.bo.custom.impl;

import lk.ijse.whaleWatching.bo.custom.PaymentBO;
import lk.ijse.whaleWatching.dao.DAOFactory;
import lk.ijse.whaleWatching.dao.custom.Impl.PaymentDAOImpl;
import lk.ijse.whaleWatching.dao.custom.PaymentDAO;
import lk.ijse.whaleWatching.dto.PaymentDto;
import lk.ijse.whaleWatching.entity.Payment;

import java.sql.SQLException;

public class PaymentBOImpl implements PaymentBO {
    //PaymentDAO paymentDAO=new PaymentDAOImpl();
    PaymentDAO paymentDAO= (PaymentDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.PAYMENT);


    @Override
    public boolean savePayment(PaymentDto paymentDto) throws SQLException, ClassNotFoundException {
        return paymentDAO.save(new Payment(paymentDto.getPay_id(),paymentDto.getDate(),paymentDto.getAmount()));
    }
}
