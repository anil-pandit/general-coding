package binary_search_questions.search_first_and_last_occrance_in_sorted_array;public class Main {    private static int firstOccurances(int[] arr, int element) {        int start = 0, end = arr.length-1;        int res = -1;        while(start <= end){            int mid = start + (end-start)/2;            if(element == arr[mid]){                res = mid;                end = mid - 1;            }            else if (element < arr[mid])                end = mid - 1;            else                start = mid + 1;        }        return res;    }    public static void main(String[] args) {        int arr[] = {0, 1, 2, 3, 5, 5, 5, 5, 6,};        System.out.println(firstOccurances(arr, 5));    }}