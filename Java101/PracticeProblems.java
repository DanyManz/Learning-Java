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
    //question 3
    public static double sumGrid(double[][] grid) {
        double sum = 0.0;
        for (int l = 0; l < grid.length; l++) {
            for (int w = 0; w < grid[l].length; w++) {
            sum += grid[l][w];
            } 
        }
        return sum;
    }
    //question 4
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n-1) + fib(n-2);
    
    }

}