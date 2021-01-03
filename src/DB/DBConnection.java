/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kushantha
 */
public class DBConnection extends UnicastRemoteObject{
    
    private static DBConnection dBCOnnection;
    private Connection connection;
    
    public DBConnection() throws ClassNotFoundException, SQLException,RemoteException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String user = "root";
        String password ="1234";
        String url = "jdbc:mysql://localhost:3306/dinamore";
        connection = DriverManager.getConnection(url, user, password);
    }
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException, RemoteException{
        if(dBCOnnection == null){
            dBCOnnection = new DBConnection();
        }
        return dBCOnnection;
    }
    public Connection getConnection(){
        return connection;
    }
}
