package lk.ijse.whaleWatching.bo.custom.impl;

import lk.ijse.whaleWatching.bo.custom.UserBO;
import lk.ijse.whaleWatching.dao.DAOFactory;
import lk.ijse.whaleWatching.dao.custom.UserDAO;

import java.sql.SQLException;

public class UserBOImpl implements UserBO {

    UserDAO userDAO= (UserDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.USER);

    @Override
    public boolean getUser(String userName, String password) throws SQLException, ClassNotFoundException {
        return userDAO.getUser(userName, password);
    }
}
