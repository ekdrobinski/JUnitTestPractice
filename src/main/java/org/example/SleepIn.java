package org.example;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation || !weekday) { // aaaand just needed to switch the not to the other word
            return true;
        } else {
            return false;
        }
    }

}
