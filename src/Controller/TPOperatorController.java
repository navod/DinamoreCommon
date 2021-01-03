/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import model.Orders;
import observer.TPOperatorObserver;

/**
 *
 * @author kushantha
 */
public interface TPOperatorController extends Remote{
     public void addOperator(TPOperatorObserver tPOperatorObserver) throws RemoteException;

    public void removeOperator(TPOperatorObserver tPOperatorObserver) throws RemoteException;

    public void placeOrder(Orders order) throws RemoteException;
    
    public void getOrderId(TPOperatorObserver tPOperatorObserver) throws RemoteException;
}
