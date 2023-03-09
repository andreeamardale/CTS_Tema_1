package ro.ase.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface IDataReader {

    void readData(Connection connection) throws SQLException;

}
