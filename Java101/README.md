[Java101 guide](https://github.com/SciBorgs/SciGuides/blob/f069b159a43422559d9ee1573da3498aaebf370f/projects/intro-to-programming/Java101.md)

Test code for Question 1:
```java
int[] arr = {7, 1, 594, 3, 1482, 19, 12, 3};
int result = PracticeProblems.countOccurances(arr, 3);
System.out.println(3 + " appears in arr " + result + " times" );
```
Test code for Question 2:
```java
int[] arr = {7, 1, 594, 3, 1482, 19, 12, 3};
int[] result = PracticeProblems.reverseArray(arr);
for (int r = 0; r < result.length; r++)
System.out.print(result[r] + " ");
```
Test code for Question 3:
```java
double[][] grid = {
   {3.1, 4.2, 2.7},
   {1.2, 8.1, 0.7},
   {6.3, 2.4, 1.3}
};
double result = PracticeProblems.sumGrid(grid);
System.out.print("The sum of all elements in the grid is " + result);
//why does it say the sum of all elements is 29.999999999999996??
```
Test code for Question 4:
```java
int n = 10;
System.out.print("The " + n + "th number in the fibonacci sequence is " + PracticeProblems.fib(n));
```
