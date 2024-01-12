package lk.ijse.whaleWatching.bo.custom.impl;

import lk.ijse.whaleWatching.bo.custom.DashBoardBO;
import lk.ijse.whaleWatching.dao.DAOFactory;
import lk.ijse.whaleWatching.dao.SqlUtil;
import lk.ijse.whaleWatching.dao.custom.BoatDAO;
import lk.ijse.whaleWatching.dao.custom.BookingDAO;
import lk.ijse.whaleWatching.dao.custom.CustomerDAO;
import lk.ijse.whaleWatching.dao.custom.EmployeeDAO;
import lk.ijse.whaleWatching.dao.custom.Impl.CustomerDAOImpl;
import lk.ijse.whaleWatching.dto.DashboardCommonDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DashboardBOImpl implements DashBoardBO {
    BoatDAO boatDAO=(BoatDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.BOAT);
    EmployeeDAO employeeDAO=(EmployeeDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.EMPLOYEE);
    CustomerDAO customerDAO= (CustomerDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    BookingDAO bookingDAO=(BookingDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.BOOKING);
    @Override
    public DashboardCommonDto getDashboardData() throws SQLException, ClassNotFoundException {

            //Connection connection= Dbconnection.getInstance().getConnection();
            //String sql="SELECT COUNT(c.cus_Id) FROM customer c";
            //PreparedStatement pstm= connection.prepareStatement("SELECT COUNT(c.cus_Id) FROM customer c");




            DashboardCommonDto dashboardCommonDto = new DashboardCommonDto();
            int customerCount=customerDAO.getAllCustomerCount();

            dashboardCommonDto.setAllCustomerCount(customerCount);


            //sql = "SELECT COUNT(e.emp_Id) FROM employee e";
            //pstm= connection.prepareStatement("SELECT COUNT(e.emp_Id) FROM employee e");
            int employeeCount=employeeDAO.allEmployeeCount();
                dashboardCommonDto.setAllEmployeeCount(employeeCount);


            //sql = "SELECT COUNT(b.boat_Id) FROM boat b";
            //pstm= connection.prepareStatement("SELECT COUNT(b.boat_Id) FROM boat b");
            int boatCount=boatDAO.allBoatCount();
                dashboardCommonDto.setAllBoatsCount(boatCount);


            //sql = "SELECT COUNT(bo.booking_Id) FROM booking bo";
            //pstm= connection.prepareStatement("SELECT COUNT(bo.booking_Id) FROM booking bo");
            int bookingCount=bookingDAO.allBookingCount();

                dashboardCommonDto.setAllBookingCount(bookingCount);


            //sql = "SELECT COUNT(b.booking_Id) FROM booking b, ride r WHERE b.ride_Id=r.ride_Id AND r.typ='Normal'";
            //pstm= connection.prepareStatement("SELECT COUNT(b.booking_Id) FROM booking b, ride r WHERE b.ride_Id=r.ride_Id AND r.typ='Normal'");
            int normalBookingCount=bookingDAO.getNormalBookingCount();
                dashboardCommonDto.setNormalBookingCount(normalBookingCount);


            //sql = "SELECT COUNT(b.booking_Id) FROM booking b, ride r WHERE b.ride_Id=r.ride_Id AND r.typ='Luxury'";
            //pstm= connection.prepareStatement("SELECT COUNT(b.booking_Id) FROM booking b, ride r WHERE b.ride_Id=r.ride_Id AND r.typ='Luxury'");
            int luxuryBookings=bookingDAO.getLuxuryBookingCount();

                dashboardCommonDto.setLuxuryBookingCount(luxuryBookings);


            return dashboardCommonDto;
        }
}
