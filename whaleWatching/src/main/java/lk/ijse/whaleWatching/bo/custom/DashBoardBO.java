package lk.ijse.whaleWatching.bo.custom;

import lk.ijse.whaleWatching.bo.SuperBO;
import lk.ijse.whaleWatching.dto.DashboardCommonDto;

import java.sql.SQLException;

public interface DashBoardBO {
    public DashboardCommonDto getDashboardData() throws SQLException, ClassNotFoundException;
}
