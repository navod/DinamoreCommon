/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.rmi.Remote;
import java.rmi.RemoteException;
import model.Orders;

/**
 *
 * @author kushantha
 */
public interface ChefObserver extends Remote{
    
    public void set(int orders) throws RemoteException;
    
    public void setOrder(Orders order) throws RemoteException;
    
    public void noOrders() throws RemoteException;
}
