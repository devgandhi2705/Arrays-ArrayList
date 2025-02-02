import java.util.*;

class Array_ArrayList{
       public static void main(String args[]){
           //1. Even and Odd Separaton into 2 different Arrays
          
           //Declare variables 
           int[] even = new int[10];  
           int[] odd = new int[10]; 
           int evenCount = 0; 
           int oddCount = 0; 
            
           Scanner sc = new Scanner(System.in);

           //Performing for action for 5 numbers
           for(int i=1; i<6;i++){
              System.out.println("Enter a number: ");
              int n = sc.nextInt();
              if(n%2==0){
                 even[evenCount++] = n;  
              }else{
                 odd[oddCount++] = n;
              }
            }
 
            //Print both the Arrays
            System.out.print("Even numbers: ");
            for(int j = 0; j < evenCount; j++) {
                 System.out.print(even[j] + " ");
            }
            System.out.println(); 
       
            System.out.print("Odd numbers: ");
            for (int k = 0; k < oddCount; k++) {
                 System.out.print(odd[k] + " ");
            }
            System.out.println();
          
            //2. Implement a java function that finds 2 neighboring numbers in an array with the smallest distance to each

            //For above even array calculate required thing
            int temp = Math.abs(even[0]-even[1]);
            int m = 0;
            for(int n=1; n<evenCount;n++){
               if(temp > Math.abs(even[n]-even[n+1])) {
                temp = Math.abs(even[n]-even[n+1]);
                m = n;
                }
            }

            //Print Output
            System.out.print("The Array is: ");
            for(int a = 0; a < evenCount; a++) {
                 System.out.print(even[a] + " ");
            }
            System.out.println(); 
            System.out.println("The Index is: " + m);  
            
            //3. Converting Arrays into Arraylist and Vice Versa.
            
            // Array to ArrayList
            String[] array = {"One", "Two", "Three"};
            List<String> arrayList = new ArrayList<>(Arrays.asList(array));

            System.out.println("ArrayList: " + arrayList);

            // ArrayList to Array
            String[] newArray = arrayList.toArray(new String[0]);

            System.out.println("Array: " + Arrays.toString(newArray));
              
             
       }
}