import java.util.*;

class Array_ArrayList{
       public static void Array_ArrayList(String args[]){
           int[] even = new int[10];  
           int[] odd = new int[10]; 
           int evenCount = 0; 
           int oddCount = 0;   
            
           Scanner sc = new Scanner(System.in);
           //Performing for action for 10 numbers
           for(int i=1; i<=10;i++){
              System.out.println("Enter a number: ");
              int n = sc.nextInt();
              if(n%2==0){
                 even[evenCount++] = n;  
              }else{
                 odd[oddCount++] = n;
              }

            System.out.print("Even numbers: ");
            for(int i = 0; i < evenCount; i++) {
                 System.out.print(even[i] + " ");
            }
       
        
            System.out.print("Odd numbers: ");
            for (int i = 0; i < oddCount; i++) {
                 System.out.print(odd[i] + " ");
            }

 
           }
       }
}