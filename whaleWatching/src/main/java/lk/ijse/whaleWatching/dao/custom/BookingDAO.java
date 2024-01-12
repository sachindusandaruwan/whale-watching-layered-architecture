package lk.ijse.whaleWatching.dao.custom;

import lk.ijse.whaleWatching.dao.CrudDAO;
import lk.ijse.whaleWatching.dao.custom.Impl.PaymentDAOImpl;
import lk.ijse.whaleWatching.db.Dbconnection;
import lk.ijse.whaleWatching.dto.BookingCustomDto;
import lk.ijse.whaleWatching.dto.BookingDto;
import lk.ijse.whaleWatching.entity.Booking;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface BookingDAO extends CrudDAO<Booking> {
    public  long bookedSheets(String selectedItem) throws SQLException, ClassNotFoundException;


    @SneakyThrows
    public  String getMail(String value) throws SQLException ;
    int allBookingCount() throws  SQLException,ClassNotFoundException;
    int getNormalBookingCount() throws SQLException,ClassNotFoundException;
    int getLuxuryBookingCount() throws SQLException,ClassNotFoundException;

    //public boolean save(BookingDto bookingDto) throws SQLException;



    public List<BookingCustomDto> getAllBooking() throws SQLException, ClassNotFoundException;
}
