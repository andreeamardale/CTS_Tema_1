package ro.ase.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface IConnectionManager {

    Connection getConnection() throws ClassNotFoundException, SQLException;

}
