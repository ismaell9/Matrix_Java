/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Reputation
 */
public class Matrix {
    
    int rows;
    int columns;
    String name;
    int[][] matrix;

    
    public Matrix(){
        
    }
    public Matrix(int rows, int columns,String name){
        this.rows = rows; 
        this.columns = columns;
        this.name = name;
    }
    public Matrix(int[][] matrix,String name){
        this.matrix = matrix;
    }
    
    


// Create Dynamic Matrix and put values inside it
        int[][] createMatrix(int rows, int columns , String name){
        Scanner scan = new Scanner(System.in);
        int[][] tempMatrix = new int[rows][columns];
        
        for(int i = 0; i<rows; i++){
            System.out.println("Enter row number "+(i+1));
            for(int j=0; j<columns; j++){
                try{
                    tempMatrix[i][j] = scan.nextInt();
                }catch(Exception e){
                    System.out.println("Excution error " + e);
                    return null;
                }
            }
            
        }
        this.matrix = tempMatrix;
        System.out.println("Matrix" + name + " is added");
        return tempMatrix;
    }

    // Prints the matrix passed to the function to the console
    void printMatrix(int[][] matrix){
        for(int[] arr:matrix){
            for(int values: arr){
                System.out.print(values + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    int numberOfRows(int[][] matrix){
        return matrix.length;
    }
    int numberOfColumns(int[][] matrix){
        int n = 0;
        for(int[]arr:matrix){
            n = arr.length;
        }
        return n;
    }
    int[][] multiplyScaler(int x, int[][] matrix){
        
        for(int i=0; i<this.rows; i++){
            for(int j=0; j<this.columns; j++){
                matrix[i][j] *= x;
            }
        }
        
        return matrix;
    }
    Matrix multiplyTwoMatrix(Matrix m1,Matrix m2,String name){
        if(m1.columns == m2.rows){
            // it holds the indesx of columns of productMatrix during loop
            // sum holds each value of productMatrix output cell
            
            int it = 0 , sum =0;
            System.out.println("For Matrix "+m1.name);
            m1.matrix = this.createMatrix(m1.rows, m1.columns, m1.name);
            System.out.println("For Matrix "+m2.name);
            m2.matrix = this.createMatrix(m2.rows, m2.columns, m2.name);
            int[][] m1tmp = m1.matrix;
            int[][] m2tmp = m2.matrix;
            int[][] multipliedMatrix = new int[m1.rows][m2.columns];
            for(int k=0; k<m1.rows; k++){
                for(int i=0; i<m2.columns; i++){
                    for(int j=0; j<m1.columns; j++){
                        sum+= m1tmp[k][j]*m2tmp[j][i];
                    }
                    multipliedMatrix[k][it] = sum; it++;
                    sum =0; 
                    it = (it>=m2.columns) ? 0 : it;
                    
                }
            }
            Matrix mm = new Matrix(multipliedMatrix,name);
            return mm;
        }else{
            System.out.println("These two matrix cannot be multiplied because "
                    + "number of rows in first matrix not equal number of columns"
                    + "of second matrix");
            return null;
        }
    }
    
    int getMinInMatrix(int matrix[][]){
        
        return 0;
    }
    
    int getMaxInMatrix(int matrix[][]){
        
        return 0;
    }
}
