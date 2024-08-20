public class ForL{//the class name is not same file name
    public static void main(String[] args) {
  
          for(int i=1;i<=10;i=i+2){//by using the decrement (i=i-2) by the  condition we get into infinite loop so changed to (i=i+2) 
              System.out.println("Hello World : "+i);
          }
          for(int i=15;i>0;i--){ //i'm assuming we need to print the numbers in increment order so i replaced  i>15 with i>0
              System.out.println("Hello World : "+i);
          }
      // Correct This Errors
      }
  }