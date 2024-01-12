package lk.ijse.whaleWatching.dao.custom;

import lk.ijse.whaleWatching.dao.CrudDAO;
import lk.ijse.whaleWatching.dto.CustomerDto;
import lk.ijse.whaleWatching.entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface CustomerDAO extends CrudDAO<Customer> {
    //public ArrayList<CustomerDto> getAllCustomers() throws SQLException, ClassNotFoundException;

    //public boolean updateCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException;

   // public boolean deleteCustomer(String cusId) throws SQLException, ClassNotFoundException;

    //public boolean saveCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException;

    public CustomerDto searchCustomerNic(String cusNic) throws SQLException, ClassNotFoundException;

    //public CustomerDto searchCustomer(String cusId) throws SQLException, ClassNotFoundException;

    public List<String> findAllIds() throws SQLException, ClassNotFoundException;
    int getAllCustomerCount() throws SQLException,ClassNotFoundException;
}
