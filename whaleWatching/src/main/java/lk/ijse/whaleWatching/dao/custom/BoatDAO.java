package lk.ijse.whaleWatching.dao.custom;

import lk.ijse.whaleWatching.dao.CrudDAO;
import lk.ijse.whaleWatching.dto.BoatDto;
import lk.ijse.whaleWatching.dto.CustomerDto;
import lk.ijse.whaleWatching.entity.Boat;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface BoatDAO extends CrudDAO<Boat> {
   // public boolean delete(String bId) throws SQLException, ClassNotFoundException;
  //  public boolean save(BoatDto dto) throws SQLException,ClassNotFoundException;
   // public boolean update(BoatDto dto) throws SQLException, ClassNotFoundException;
    public BoatDto searchBoatName(String bname) throws SQLException, ClassNotFoundException;
    //public ArrayList<BoatDto> getAll() throws SQLException, ClassNotFoundException ;
    //public BoatDto search(String boatId) throws SQLException, ClassNotFoundException;
    public List<String> findAllIds() throws SQLException,ClassNotFoundException;
    int allBoatCount() throws  SQLException,ClassNotFoundException;
}
