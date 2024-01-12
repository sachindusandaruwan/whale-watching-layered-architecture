package lk.ijse.whaleWatching.dao.custom;

import lk.ijse.whaleWatching.dao.CrudDAO;
import lk.ijse.whaleWatching.entity.User;

import java.sql.SQLException;

public interface UserDAO extends CrudDAO<User> {
    public  boolean getUser(String userName, String password) throws SQLException, ClassNotFoundException;
}
