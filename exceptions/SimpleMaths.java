package exceptions;

import java.util.List;

public class SimpleMaths {

   /** calculez la valeur moyenne d'une liste d'entiers
   *
   * @param listOfIntegers une liste contenant des nombres entiers
   * @return la moyenne de la liste
   */

   public static int calculateAverage(List<Integer> listOfIntegers) {
      int average=0;

      if (listOfIntegers.size()==0){
        return 0;
     }
      for (int value: listOfIntegers) {
         average+=value;
      }
      average/=listOfIntegers.size();
      return average;
   }

}