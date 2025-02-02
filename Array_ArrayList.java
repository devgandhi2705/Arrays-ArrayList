import java.util.*;

class Array_ArrayList{
       public static void main(String args[]){
           //1. Even and Odd Separaton into 2 different Arrays
          
           int[] even = new int[10];  
           int[] odd = new int[10]; 
           int evenCount = 0; 
           int oddCount = 0;
           //int i = 0;   
            
           Scanner sc = new Scanner(System.in);

           //Performing for action for 10 numbers
           for(int i=1; i<6;i++){
              System.out.println("Enter a number: ");
              int n = sc.nextInt();
              if(n%2==0){
                 even[evenCount++] = n;  
              }else{
                 odd[oddCount++] = n;
              }
            }

            System.out.print("Even numbers: ");
            for(int j = 0; j < evenCount; j++) {
                 System.out.print(even[j] + " ");
            }
       
            System.out.print("Odd numbers: ");
            for (int k = 0; k < oddCount; k++) {
                 System.out.print(odd[k] + " ");
            }
          
            //2. Implement a java function that finds 2 neighboring numbers in an array with the smallest distance to each

            //For even array 
            int temp = 0;
            for(int n=0; n<evenCount;n++){
                even[n]  
            }

       }
}