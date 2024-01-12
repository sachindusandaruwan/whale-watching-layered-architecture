package lk.ijse.whaleWatching.bo.custom;

import lk.ijse.whaleWatching.bo.SuperBO;

import java.sql.SQLException;

public interface UserBO extends SuperBO {


    boolean getUser(String userName, String password) throws SQLException, ClassNotFoundException;
}
