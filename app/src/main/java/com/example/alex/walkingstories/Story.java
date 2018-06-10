package com.example.alex.walkingstories;
import java.util.List;

public class Story {
    public String title = "Untitled";
    public String description = "";
    public int index;
    public List<Step> steps;

    Story(String titl, String desc, int ind) {
        this.title = titl;
        this.description = desc;
        this.index = ind;
    }

    public void addStep(Step newStep, int position) {
        if (position <= size) {
            this.steps.add(newStep);
        }
    }

    public void removeStep(int position) {
        if (position < size && >= 0) {
            this.steps.remove(position);
        }
    }

}
