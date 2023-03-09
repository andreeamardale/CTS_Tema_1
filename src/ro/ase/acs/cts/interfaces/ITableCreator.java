package ro.ase.acs.cts.interfaces;

import java.sql.Connection;

public interface ITableCreator {

    void createTable(Connection connection) throws Exception;

}
