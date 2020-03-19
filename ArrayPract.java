package guessingGame;

public class ArrayPract {
   /* Given an Array of any size. Complete the method to swap the position of the first and last elements in the array.
    For example if you were given this array
    {"A1","B2","C3"};
    Swap the positions of the A1 and C3 element so that the array now looks like this  {"C3", "B2", "A1"};
    */

   public static void main(String[] args) {
      String[] array = {"A1","B1","C1","D1"};
      arrayElements(array);
   }
   public static void arrayElements(String[] array){
      int lengthArray=array.length-1;
      String indexOne= array[0];
      array[0]=String.valueOf(array[lengthArray]);
      array[lengthArray]=String.valueOf(indexOne);
      for(int i = 0; i<=lengthArray;i++){
         System.out.println(array[i]);
    }

   }
}
