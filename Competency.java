public class Competency{
  public static void main(String args[]){

    int[] numbers = new int[] {3,5,7,6,3,2,9};
    int sum = 0;

    for(int position=0;position<numbers.length;position++){
      System.out.println("number: " + numbers[position]);
      if(position==7){
        System.out.println("Hi everyone");
      }
      sum = sum + numbers[position];
    }

    System.out.println("The sum of the array is: " + sum);

  }



}