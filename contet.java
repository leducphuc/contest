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