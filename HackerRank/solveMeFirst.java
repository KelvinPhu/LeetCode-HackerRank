/**

Complete the function solveMeFirst to compute the sum of two integers.

Example
a = 7
b = 3

Return 10.

Function Description

Complete the solveMeFirst function in the editor below.

solveMeFirst has the following parameters:

int a: the first value
int b: the second value
Returns
- int: the sum of a and b

Constraints
1<= a,b <= 1000

Sample Input
a = 2
b = 3

Sample Output
5

Explanation
2 + 3 = 5

*/

package HackerRank;

import java.util.Scanner;

public class solveMeFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sum(a, b);
        System.out.println(result);
        sc.close();
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
