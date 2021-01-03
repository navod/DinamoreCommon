/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author kushantha
 */
public class Orders implements Serializable{
    private String orderId;
    private String operatorId;
    private String chefId;
    private String customerName;
    private int customerNumber;
    private int quantity;
    private String dateTime;
    private String processingTime;

    public Orders(String orderId, String operatorId, String customerName, int customerNumber, int quantity, String dateTime) {
        this.orderId = orderId;
        this.operatorId = operatorId;
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.quantity = quantity;
        this.dateTime = dateTime;
    }

    public Orders() {
    }

    public Orders(String orderId, String operatorId, String customerName, int customerNumber, int quantity, String dateTime, String processingTime) {
        this.orderId = orderId;
        this.operatorId = operatorId;
        this.chefId = chefId;
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.quantity = quantity;
        this.dateTime = dateTime;
        this.processingTime = processingTime;
    }

    

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the operatorId
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId the operatorId to set
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * @return the chefId
     */
    public String getChefId() {
        return chefId;
    }

    /**
     * @param chefId the chefId to set
     */
    public void setChefId(String chefId) {
        this.chefId = chefId;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the customerNumber
     */
    public int getCustomerNumber() {
        return customerNumber;
    }

    /**
     * @param customerNumber the customerNumber to set
     */
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the dateTime
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime the dateTime to set
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @return the processingTime
     */
    public String getProcessingTime() {
        return processingTime;
    }

    /**
     * @param processingTime the processingTime to set
     */
    public void setProcessingTime(String processingTime) {
        this.processingTime = processingTime;
    }

    @Override
    public String toString() {
        return "Orders{" + "orderId=" + orderId + ", operatorId=" + operatorId + ", chefId=" + chefId + ", customerName=" + customerName + ", customerNumber=" + customerNumber + ", quantity=" + quantity + ", dateTime=" + dateTime + ", processingTime=" + processingTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.orderId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Orders other = (Orders) obj;
        if (!Objects.equals(this.orderId, other.orderId)) {
            return false;
        }
        return true;
    }


    
    
    
}
