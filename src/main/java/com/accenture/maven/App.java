package com.acc.lkm.maven.Mavenprojectnewsam;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.*;
public class SortedMapProg {
    public static void main(String[] args) {
        SortedMap<String, String> marketProjects = new TreeMap<>();
        
        // Adding markets and their projects
        marketProjects.put("North America", "Project A");
        marketProjects.put("Europe", "Project B");
        marketProjects.put("Asia", "Project C");
        
        // Displaying the sorted map
        for (Map.Entry entry : marketProjects.entrySet()) {
            System.out.println("Market: " + entry.getKey() + ", Project: " + entry.getValue());
        }
    }
}


