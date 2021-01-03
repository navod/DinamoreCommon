/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author kushantha
 */
public interface TPOperatorObserver extends Remote{
    public void orderId(String orderId) throws RemoteException;
}
