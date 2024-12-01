package org.example;

import java.util.ArrayList;

public class Quest {

    ArrayList<Player> stages;
    int value;
    int stageCount;
    ArrayList<Player> attacks;
    Player currentStage, previousStage = null;
    public Quest(int n) {
        value = n;
        stageCount = 0;
        stages = new ArrayList<>(0);
        attacks = new ArrayList<>(0);
    }
    public void addStage(Player s){
        previousStage = s;
        stages.add(s);
        stageCount++;
    }
    //stores current and increments by one, if at last stage, return null
    public Player nextStage() {
        if (currentStage.id +1== stageCount){
            return null;
        }
        currentStage = stages.get(currentStage.id+1);
        return currentStage;
    }
}
