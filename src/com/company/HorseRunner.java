package com.company;

public class HorseRunner {

    public static void main(String[] args) {
	// write your code here
        Horse horse1 = new Mustang("Princess",12000);
        Horse horse2 = new Mustang("Pegasus", 13);
        Horse horse3 = new Mustang("Unicorn",13);
        Horse[] places = {horse1, horse2, horse3};
        //Returns the name of horses and their weights.
        for(Horse i : places){
            System.out.println(i.toString());
        }

        Horse[] horses = new Horse[6];
        horses[1] = horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println("Pegasus is in space: "+ barn.findHorseSpace("Pegasus"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println("Pegasus is now in space: " + barn.findHorseSpace("Pegasus"));

    }
}
