package com.acc.maven;

import java.util.SortedMap;
import java.util.TreeMap;

public class MarketProjects {
    public static void main(String[] args) {
        SortedMap<String, String> marketProjects = new TreeMap<>();
        
       
        marketProjects.put("North America", "Project A");
        marketProjects.put("Europe", "Project B");
        marketProjects.put("Asia", "Project C");
        
        
        for (Map.Entry<String, String> entry : marketProjects.entrySet()) {
            System.out.println("Market: " + entry.getKey() + ", Project: " + entry.getValue());
        }
    }
}
