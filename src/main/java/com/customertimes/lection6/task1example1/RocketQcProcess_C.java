package com.customertimes.lection6.task1example1;

public class RocketQcProcess_C {
    // поля які приймають тільки тру або фолс
    private boolean isEngineTested;
    private boolean isProgramsTested;
    private boolean isCosmonauntsTested;

    //метод для перевірки чи все == true
    public boolean rocketQC() {
        if (isEngineTested && isProgramsTested && isCosmonauntsTested) {
            return true;
        } else {
            return false;
        }
    }

    //гет + сет
    public boolean isEngineTested() {
        return isEngineTested;
    }

    public boolean isProgramsTested() {
        return isProgramsTested;
    }

    public boolean isCosmonauntsTested() {
        return isCosmonauntsTested;
    }

    public void setEngineTested(boolean engineTested) {
        isEngineTested = engineTested;
    }

    public void setProgramsTested(boolean programsTested) {
        isProgramsTested = programsTested;
    }

    public void setCosmonauntsTested(boolean cosmonauntsTested) {
        isCosmonauntsTested = cosmonauntsTested;
    }

}


