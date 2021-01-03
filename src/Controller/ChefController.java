/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import model.Orders;
import observer.ChefObserver;

/**
 *
 * @author kushantha
 */
public interface ChefController extends Remote{
    public void addChef(ChefObserver chefObserver) throws RemoteException;

    public void removeChef(ChefObserver chefObserver) throws RemoteException;

    public void getNoOfOrders() throws RemoteException;

//    public void getOrder() throws RemoteException;

    public void takeOrder(Orders order) throws RemoteException;

    public void finishOrder(ChefObserver chefObserver, Orders order) throws RemoteException;
}
