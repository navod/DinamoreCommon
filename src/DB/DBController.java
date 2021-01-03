/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Orders;

/**
 *
 * @author kushantha
 */
public class DBController {

    public String getLastOrderId() throws ClassNotFoundException, SQLException, RemoteException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "select orderId from orders order by orderId desc limit 1";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet set = pstm.executeQuery();
        if (set.next()) {
            return set.getString("orderId");
        }
        return null;
    }

    public boolean addOrders(Orders order) throws ClassNotFoundException, SQLException, RemoteException {
       Connection connection = DBConnection.getInstance().getConnection();
       String sql = "insert into orders "
                + "VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, order.getOrderId());
        pstm.setString(2, order.getChefId());
        pstm.setString(3, order.getOperatorId());
        pstm.setString(4, order.getCustomerName());
        pstm.setInt(5, order.getCustomerNumber());
        pstm.setInt(6, order.getQuantity());
        pstm.setString(7, order.getDateTime());
        pstm.setString(8, order.getProcessingTime());


        return pstm.executeUpdate() > 0;

    }

}
