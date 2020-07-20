package com.customertimes.lection7.task4;

public abstract class TVDevice implements Device, Volume {

    private String modelName;
    private boolean isOn;

    public TVDevice(String modelName, boolean isOn) {
        this.modelName = modelName;
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }


}

