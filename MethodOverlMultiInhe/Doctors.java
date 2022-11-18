package MethodOverlMultiInhe;

public class Doctors extends Human{
   private int noOfSurgery;

   public int getNoOfSurgery() {
      return noOfSurgery;
   }

   public void setNoOfSurgery(int noOfSurgery) {
      this.noOfSurgery = noOfSurgery;
   }

   @Override
   public String toString() {
      return "Doctors{" +
              "\n noOfSurgery=" + noOfSurgery +
              "\n name=" + getName() +
              "\n age=" +getAge() +
              "\n location=" +getLocation() +
              "\n experience=" +getExperience() +
              '}';
   }

}


