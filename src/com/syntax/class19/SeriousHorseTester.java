package com.syntax.class19;

public class SeriousHorseTester {

        public static void main(String[] args) {
            Horse horse = new Horse("Jacky", 20, 400);
            //horse.setName("Jacky"); we use this before we apply the constructor on line 7

         /*
         Horse--> Data type(Names of classes)
         horse-->object creations which also called instance/reference variable/variable
         =--> assignment operator
         Horse("Jacky", 20,400)--> call to the constructor
         ; line terminator in java
          */
            horse.printHorseName();
        }
    }

