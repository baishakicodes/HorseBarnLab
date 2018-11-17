package com.company;

public class HorseBarn {
    // the field is the horses in the array called spaces.
    private Horse[] spaces;
    // constructor to initialize spaces.
    public HorseBarn(Horse[] spaces){
        this.spaces = spaces;
    }
    //this method returns the index of the horse in the array spaces.
    public int findHorseSpace(String name){
      for(int i=0; i<spaces.length; i++){
          if (spaces[i] != null && name.equals(spaces[i].getName())){
              return i;
          }
      }
      return -1;
    }
    //this method makes sure that all the horses in the array are adjacent to each other.
    public void consolidate(){
        Horse[] newSpaces = new Horse[spaces.length];
        int newPlaces = 0;
        for(int i = 0; i<spaces.length; i++){
            if (spaces[i] != null){
                newSpaces[newPlaces] = spaces[i];
                newPlaces++;
            }
        }
        spaces = newSpaces;
    }
}
