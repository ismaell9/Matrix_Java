/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author Reputation
 */

public class Practice {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here

                    
        int decision; 
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("1-Create Matrix" + "\n" + "2-Multiply" + "\n" + "3-close");
            try {
                decision = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Excution error " + e);
                decision = 0;
            }
            if (decision == 1) {
                int rows = 0;
                int columns = 0;
                String name = "";
                try {
                    System.out.println("Enter Matrix name");
                    name = scan.next();
                    System.out.println("For Matrix "+name);
                    System.out.println("Enter Number of rows");
                    rows = scan.nextInt();
                    System.out.println("Enter Number of coulmns");
                    columns = scan.nextInt();

                } catch (Exception e) {
                    System.out.println("Excution error " + e);
                }
                rows = Math.abs(rows);
                columns = Math.abs(columns);
                Matrix m1 = new Matrix(rows, columns, name);
                int[][] temp = m1.createMatrix(rows, columns, name);
                m1.printMatrix(temp);
            } else if (decision == 2) {
                Practice p = new Practice();
                int rows = 0;
                int columns = 0;
                String name = "";
                
                Matrix[] matrixArray = new Matrix[2];
                for (int i = 0; i < 2; i++) {
                    try {
                        System.out.println("Enter Matrix name");
                        name = scan.next();
                        System.out.println("For Matrix "+name);
                        System.out.println("Enter Number of rows");
                        rows = scan.nextInt();
                        System.out.println("Enter Number of coulmns");
                        columns = scan.nextInt();
                        rows = Math.abs(rows);
                        columns = Math.abs(columns);
                    } catch (Exception e) {
                        System.out.println("Excution error " + e);
                    }
                    matrixArray[i] = new Matrix(rows, columns, name);
                }
                Matrix multiplied = new Matrix();
                multiplied = multiplied.multiplyTwoMatrix(matrixArray[0], matrixArray[1], "z");
                
                if (multiplied == null) {
                } else {
                    multiplied.printMatrix(multiplied.matrix);
                }
                
            }
        } while (decision<3 && decision>0);
        scan.close();
    }
}
    

