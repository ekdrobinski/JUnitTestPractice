package org.example;
public class CigarParty {

        public boolean cigarParty ( int cigars, boolean isWeekend){
            //first check if it's weekend
            if (isWeekend && cigars >= 40) { //if it's the weekend and there's enough cigars it's all good
                return true;
            } else if (cigars >= 40 && cigars <= 60) { //if it's not weekend and there's the right amount of cigars
                return true;
            } else { //if it's not weekend and not the right amount of cigars
                return false;
            }
        }

    }
