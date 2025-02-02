import java.util.*;

class Array_ArrayList{
       public static void main(String args[]){
           int[] even = new int[5];  
           int[] odd = new int[5]; 
           int evenCount = 0; 
           int oddCount = 0;
           //int i = 0;   
            
           Scanner sc = new Scanner(System.in);

           //Performing for action for 5 numbers
           for(int i=1; i<=5;i++){
              System.out.println("Enter a number: ");
              int n = sc.nextInt();
              if(n%2==0){
                 even[evenCount++] = n;  
              }else{
                 odd[oddCount++] = n;
              }

            System.out.print("Even numbers: ");
            for(int j = 0; j < evenCount; j++) {
                 System.out.println(even[j] + " ");
            }
       
        
            System.out.print("Odd numbers: ");
            for (int k = 0; k < oddCount; k++) {
                 System.out.println(odd[k] + " ");
            }

 
           }
       }
}