package ro.ase.acs.cts.main;


import ro.ase.acs.cts.classes.ConnectionManager;
import ro.ase.acs.cts.classes.DataInserter;
import ro.ase.acs.cts.classes.DataReader;
import ro.ase.acs.cts.classes.TableCreator;
import ro.ase.acs.cts.interfaces.IConnectionManager;
import ro.ase.acs.cts.interfaces.IDataInserter;
import ro.ase.acs.cts.interfaces.IDataReader;
import ro.ase.acs.cts.interfaces.ITableCreator;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {


        try {

            IConnectionManager connectionManager = new ConnectionManager();
            Connection connection = connectionManager.getConnection();

            ITableCreator employeeTableCreator = new TableCreator();
            employeeTableCreator.createTable(connection);

            IDataInserter employeeDataInsertor = new DataInserter();
            employeeDataInsertor.insertData(connection);

            IDataReader employeeDataReader = new DataReader();
            employeeDataReader.readData(connection);

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
