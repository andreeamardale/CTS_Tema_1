package ro.ase.acs.cts.interfaces;

import java.sql.Connection;

public interface IDataInserter {

    void insertData(Connection connection) throws Exception;

}
