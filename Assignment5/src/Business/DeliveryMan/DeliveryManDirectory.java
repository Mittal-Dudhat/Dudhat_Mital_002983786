/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private DeliveryMan deliveryMan;
    private ArrayList<DeliveryMan> deliveryManList;

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
    
    public DeliveryMan createDeliveryMan(String userName){
        deliveryMan= new DeliveryMan(userName);
        deliveryManList.add(deliveryMan);
        return deliveryMan;
    }
    
    public void deleteDeliveryMan(String username){
        for(int i=0;i<deliveryManList.size();i++){
            if(deliveryManList.get(i).getUserName().equals(username)){
                deliveryManList.remove(i);
            }
        }
    }
}