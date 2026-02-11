/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q10;

/**
 *
 * @author Karina
 */
public class MatrixDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] randomMatrix=createMatrix();
        displayMatrix(randomMatrix);
        digit(randomMatrix);
    }
    public static int[][] createMatrix(){
        int[][] matrix=new int[10][10];
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++)
                matrix[i][j]=(int)(Math.random()*101);
        return matrix;
    }
    public static void displayMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            System.out.println("");
            for(int j=0;j<matrix[i].length;j++)
                System.out.print(matrix[i][j]+" ");
        }
    }
    public static void digit(int[][] matrix){
        boolean allRow=true;
        boolean allColumn=true;
        for(int i=0;i<matrix.length;i++){
            boolean row=false;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]>=0 && matrix[i][j]<=9){
                    row=true;
                    break;
            }
            }
            if(!row){
                allRow=false;
                break;
            }
        }
        
        for(int j=0;j<matrix[0].length;j++){
            boolean col=false;
            for(int i=0;i<matrix.length;i++){
                if(matrix[i][j]>=0 && matrix[i][j]<=9){
                    col=true;
                    break;
                }
            }
            if(!col){
                allColumn=false;
                break;
            }
        }
        if(allRow && allColumn)
            System.out.println("\nevery row and column have at least one single digit.");
        else
            System.out.println("\ncondition not met");
    }
}
