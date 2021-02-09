import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        ArrayList<Integer> auxList = new ArrayList<>();
        for (int i : list) {
            if (auxList.size() == 0) {
                auxList.add(i);
            } else {
                for (int j = 0; j < auxList.size(); j++) {
                    if (auxList.get(j) > i) {
                        auxList.add(j, i);
                        break;
                    } else if (j == auxList.size() - 1) {
                        auxList.add(i);
                        break;
                    }
                }
            }
        }
        return auxList;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        int[] arr3 = new int[arr1.length * 2];
        int arr1Pointer = 0;
        int arr2Pointer = 0;
        for (int i = 0; i < arr1.length * 2; i++) {
            int num;
            if (arr1Pointer == arr1.length) {
                num = arr2[arr2Pointer];
                arr2Pointer++;
            } else if (arr2Pointer == arr2.length) {
                num = arr1[arr1Pointer];
                arr1Pointer++;
            } else {
                if (arr1[arr1Pointer] >= arr2[arr2Pointer]) {
                    num = arr2[arr2Pointer];
                    arr2Pointer++;
                } else {
                    num = arr1[arr1Pointer];
                    arr1Pointer++;
                }
            }
            arr3[arr1Pointer + arr2Pointer - 1] = num;
        }
        return arr3;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(2);
        list1.add(9);
        list1.add(7);
        list1.add(1);
        list1.add(6);
        list1.add(2);
        System.out.println(insertionSort(list1).toString());
    }
}
