package selection.sort;

public class Main {

    public static void main(String[] args) {

        // Selection sort = search through an array and keep track of the 
        //          minimum value during each iteration. At the end of each
        //          iteration, we swap variables.
        //      Complexity: quadratic time O(n^2)
        //      Small data set = okay
        //      Large data set = Bad
        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        selectionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;//current minimum
            for (int j = i + 1; j < array.length; j++) {
                if(array[min] > array[j]){
                    min = j;
                }
            }
            
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

    }

}
