import java.io.IOException;

public class pancake_sorting {
        static void flip_array(int my_arr[], int i) {
           int temp, beg = 0;
           while (beg < i) {
              temp = my_arr[beg];
              my_arr[beg] = my_arr[i];
              my_arr[i] = temp;
              beg++;
              i--;
           }
        }
        static int find_index(int my_arr[], int n) {
           int max_ele, i;
           for (max_ele = 0, i = 0; i < n; ++i)
              if (my_arr[i] > my_arr[max_ele])
              max_ele = i;
           return max_ele;
        }
        static int pancake_sort(int my_arr[], int n) {
           for (int curr_size = n; curr_size > 1; --curr_size) {
              int max_ele = find_index(my_arr, curr_size);
              if (max_ele != curr_size - 1) {
                 flip_array(my_arr, max_ele);
                 flip_array(my_arr, curr_size - 1);
              }
           }
           return 0;
        }
        public static void main(String[] args) throws IOException {
            
            System.in.read();
           int my_arr[] = { 67, 43, 89, 11, 23, 0, 98, 102, 4, 3000, 340, 123, 456 , 123 , 11, 11, 123 ,12345, 43 };
           int arr_len = my_arr.length;
           pancake_sort(my_arr, arr_len);
           System.out.println("The sorted array is : ");
           for (int i = 0; i < arr_len; i++)
           System.out.print(my_arr[i] + " ");
           System.out.println("");
        }
     }
    

