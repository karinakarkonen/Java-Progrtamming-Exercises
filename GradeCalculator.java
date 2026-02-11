/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GradeCalculator;

/**
 *
 * @author Karina
 */
public class GradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrix=createArray();
        displayArray(matrix);
        char[] ch=createScoreLetter(matrix);
        displayLetter(ch);
        GANO(ch,matrix);
        System.out.println("GANO "+GANO(ch,matrix));
    }
    public static int[][] createArray(){
        int[][] array={{75,4},{60,5},{55,4},{90,7},{82,6},{40,3}};
        return array;
    }
    public static void displayArray(int[][] array){
        System.out.println("scores");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++)
                System.out.print(array[i][j]+" ");
            System.out.println("");
        }
    }
    public static char[] createScoreLetter(int[][] array){
        char[] ch=new char[6];
        for(int i=0;i<array.length;i++){
            if(array[i][0]>=85 && array[i][0]<=100)
                ch[i]='A';
            else if(array[i][0]>=75 && array[i][0]<=84)
                    ch[i]='B';
            else if(array[i][0]>=65 && array[i][0]<=74)
                ch[i]='C';
            else if(array[i][0]>=55 && array[i][0]<=64)
                ch[i]='D';
            else 
                ch[i]='F';
        }
        return ch;
    }
    public static void displayLetter(char[] alo){
        System.out.println("Score Letters");
        for(int i=0;i<alo.length;i++){
            
                System.out.println(alo[i]+" ");
            
        }
    }
    public static double GANO(char[] list, int[][] akts){
        double avg;
        double sum=0, sum2=0;
        for(int i=0;i<akts.length;i++)
            sum2+=akts[i][1];
        for(int i=0;i<list.length;i++){
            if(list[i]=='A')
                sum+=4*akts[i][1];
            else if(list[i]=='B'){
                sum+=3*akts[i][1];
            }
            else if(list[i]=='C'){
                sum+=2*akts[i][1];
            }
            else if(list[i]=='D'){
                sum+=1*akts[i][1];
            }
            else{
                sum+=0;
            }
    }
        avg=sum/sum2;
        return avg;
        
}
}
