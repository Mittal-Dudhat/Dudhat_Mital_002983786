/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dhaval
 */
public class Community {
    
    private String communityName;
    private ArrayList<Housing> HouseList;

    public ArrayList<Housing> getHouseList() {
        return HouseList;
    }

    public void addHouse(Housing house) {
        this.HouseList.add(house);
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
}
