package lk.ijse.whaleWatching.bo.custom;

import lk.ijse.whaleWatching.bo.SuperBO;
import lk.ijse.whaleWatching.dto.PaymentDto;

import java.sql.SQLException;

public interface PaymentBO  extends SuperBO {
    public boolean savePayment(PaymentDto paymentDto) throws SQLException, ClassNotFoundException;

}
