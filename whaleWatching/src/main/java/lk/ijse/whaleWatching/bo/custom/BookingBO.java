package lk.ijse.whaleWatching.bo.custom;

import lk.ijse.whaleWatching.bo.SuperBO;
import lk.ijse.whaleWatching.dto.BookingCustomDto;
import lk.ijse.whaleWatching.dto.BookingDto;
import lombok.SneakyThrows;

import java.sql.SQLException;
import java.util.List;

public interface BookingBO extends SuperBO {
    public  long bookedSheets(String selectedItem) throws SQLException, ClassNotFoundException;


    @SneakyThrows
    public  String getMail(String value) throws SQLException ;

    public boolean saveBooking(BookingDto bookingDto) throws SQLException, ClassNotFoundException;

    public List<BookingCustomDto> getAllBooking() throws SQLException, ClassNotFoundException;



}
