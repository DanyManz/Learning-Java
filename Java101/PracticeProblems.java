public class PracticeProblems {
   
    public static int countOccurances(int[] arr, int n) {
        int Occurances = 0;
        for (int c = 0; c < arr.length; c++)
        if (arr[c] == n) {
        Occurances++;
        }
        return Occurances;
}
    public static void main(String[] args) {
        int[] arr = {7, 1, 594, 3, 1482, 19, 12, 3};
        int n = 3;
        int result = countOccurances(arr, n);
        System.out.println(n + " appears in arr " + result + " times" );
    }
}