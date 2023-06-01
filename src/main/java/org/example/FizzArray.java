package org.example;

public class FizzArray {
        public int[] fizzArray(int n) {
            //first remember how to create an array. ok yeah forgot now I remember...it's given
            int[] newArray = new int[n]; //new array...added n as an afterthought

            //contain numbers 0, 1, 2, ... n-1
            //You do not need a separate if-statement for the length-0 case
            //the for-loop should naturally execute 0 times in that case
            for (int i = 0; i < n; i++) { //instantiate index, go until reaches n length, increase counter by one for each
                newArray[i] = i; //adds same number of index as next value in array//had to look this line up on google
            }
            return newArray; //first tried with brackets on it-didn't work, got rid of them
        }

    }
