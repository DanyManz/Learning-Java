public class PracticeProblems {
   //question 1
    public static int countOccurances(int[] arr, int n) {
        int Occurances = 0;
        for (int c = 0; c < arr.length; c++)
        if (arr[c] == n) {
        Occurances++;
        }
        return Occurances;
}

    //question 2
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int r = 0; r < arr.length; r++) {
        reversed[r] = arr[arr.length-1-r]; 
        }
    return reversed;
    }
    public static void main(int[] args) {
    int[] arr = {7, 1, 594, 3, 1482, 19, 12, 3};
    int[] result = reverseArray(arr);
    for (int r = 0; r < result.length; r++)
    System.out.print(result[r]);
    }

}