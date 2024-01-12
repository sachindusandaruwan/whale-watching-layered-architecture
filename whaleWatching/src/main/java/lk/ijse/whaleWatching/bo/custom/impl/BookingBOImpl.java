package lk.ijse.whaleWatching.bo.custom.impl;

import lk.ijse.whaleWatching.bo.custom.BookingBO;
import lk.ijse.whaleWatching.dao.DAOFactory;
import lk.ijse.whaleWatching.dao.custom.BookingDAO;
import lk.ijse.whaleWatching.dao.custom.Impl.BookingDAOImpl;
import lk.ijse.whaleWatching.dao.custom.PaymentDAO;
import lk.ijse.whaleWatching.db.Dbconnection;
import lk.ijse.whaleWatching.dto.BookingCustomDto;
import lk.ijse.whaleWatching.dto.BookingDto;
import lk.ijse.whaleWatching.entity.Booking;
import lk.ijse.whaleWatching.entity.Payment;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BookingBOImpl implements BookingBO {
    //BookingDAO bookingDAO=new BookingDAOImpl();
    BookingDAO bookingDAO= (BookingDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.BOOKING);
    PaymentDAO paymentDAO=(PaymentDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.PAYMENT);

    @Override
    public long bookedSheets(String selectedItem) throws SQLException, ClassNotFoundException {
        return bookingDAO.bookedSheets(selectedItem);
    }

    @Override
    public String getMail(String value) throws SQLException {
        return bookingDAO.getMail(value);
    }

    @Override
    public boolean saveBooking(BookingDto bookingDto) throws SQLException, ClassNotFoundException {
        Connection connection= Dbconnection.getInstance().getConnection();
        connection.setAutoCommit(false);
        try {
            Payment payment=new Payment(bookingDto.getPaymentDto().getPay_id(),bookingDto.getPaymentDto().getDate(),bookingDto.getPaymentDto().getAmount());
            boolean isSaved=paymentDAO.save(payment);
            if (isSaved){
                Booking booking=new Booking(bookingDto.getBooking_id(),bookingDto.getRide_id(),bookingDto.getCus_id(),bookingDto.getPay_id(),bookingDto.getDate(),bookingDto.getTime());
                boolean bookingSaved=bookingDAO.save(booking);

                if (!bookingSaved) {
                    connection.rollback();
                    return false;
                }

            }
            connection.commit();
            return true;

        } catch (Exception ex) {
            System.out.println(ex);
            connection.rollback();
            return false;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public List<BookingCustomDto> getAllBooking() throws SQLException, ClassNotFoundException {
        return bookingDAO.getAllBooking();
    }
}
