public class SelectionSort {

    // Sort by descending
    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int max = array[i]; // Lưu phần tử lớn nhất
            int index = i; // lưu vị trí chứa phần tử lớn nhất
            for (int j = i + 1; j < array.length; j++) {
                if(max < array[j]){
                    max = array[j];
                    index = j;
                }
            }
            // Nếu chỉ số đã thay đổi, ta sẽ hoán vị
            if(index != i){
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }

    }
}

//buble
for(int i = 0; i< array.length; i++){
            for (int j = array.length - 1; j > 0; j--) {
               if(array[j] < array[j-1]){
                   int temp = array[j];
                   array[j] = array[j-1];
                   array[j-1] = temp;
               }
            }    
        }

public class MainClass {
   public static long fibonacci(long number) {
      if ((number == 0) || (number == 1))
         return number;
      else
         return fibonacci(number - 1) + fibonacci(number - 2);
   }
   public static void main(String[] args) {
      for (int counter = 0; counter <= 10; counter++){
         System.out.printf("Fibonacci of %d is: %d\n",
         counter, fibonacci(counter));
      }
   }
}


package chuyende1;

import java.util.Scanner;

public class A {

	static int T,N;
	static int[] A;
	
	static boolean doixung(){
		int i=0,j=N-1;
		while(i<j){
			if(A[i]!=A[j]) return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		T=sc.nextInt();
		for(int test=1;test<=T;test++){
			N=sc.nextInt();
			A=new int[N];
			for(int i=0;i<N;i++){
				A[i]=sc.nextInt();
			}
			if(doixung()){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}


