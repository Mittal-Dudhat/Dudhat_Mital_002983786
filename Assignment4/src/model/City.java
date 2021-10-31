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
public class City {
    private String cityName;
    private ArrayList<Community> CommunityList;

    public ArrayList<Community> getCommunityList() {
        return CommunityList;
    }

    public void addCommunity(Community community) {
        this.CommunityList.add(community);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
}
