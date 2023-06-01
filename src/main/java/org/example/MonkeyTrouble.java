package org.example;

public class MonkeyTrouble {
    //Knew I needed an if statement, second one I did- knew I needed some warming up.
    //definitely easier for me to think through than SleepIn
    //pretty straightforward tbh
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile){ //if both smile, then ...
            return true; // ...we're in trouble!
        }
        else if (!aSmile && !bSmile){ //if both aren't smiling....
            return true;  // ...we're in trouble!
        }
        else {
            return false; //no trouble here
        }
    }
}