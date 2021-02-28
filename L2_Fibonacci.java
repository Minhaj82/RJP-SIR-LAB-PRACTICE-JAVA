/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class L2_Fibonacci {
	public static void main(String[] args) {

        int count, n1 = 0, n2 = 1;
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        //System.out.println(count);

        int i=1;
        while(i<count)
        {
            System.out.print(n1+" ");
            int sumOfPrevTwo = n1 + n2;
            n1 = n2;
            n2 = sumOfPrevTwo;
            i++;
        }
        System.out.println(n2);
    }
}

