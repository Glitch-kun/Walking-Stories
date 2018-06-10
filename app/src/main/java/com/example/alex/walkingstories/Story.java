package com.example.alex.walkingstories;
import java.util.List;

public class Story {
    public String title = "Untitled";
    public String description = "";
    public int index;
    public List<Step> steps;

    Story(String titl, String desc) {
        this.title = titl;
        this.description = desc;
    }

}
