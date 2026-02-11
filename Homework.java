/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s244101080homeworkq2; //Karina Karkonen 244101080 question2

/**
 *
 * @author Karina
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] workHours=createWorkersArray();
        
        System.out.println("The workers' weekly working hours are: ");
        displayArray(workHours);
        
        double[] averageHours=calculateAvg(workHours);
        displayAvg(averageHours);
        
        System.out.println("Employee with the max average working time: "+maxAvg(averageHours));
        double[] salary=createSalary(workHours);
        displaySalary(salary);
    }
    
    public static int[][] createWorkersArray(){
        int[][] hours=new int[10][7];
        for(int i=0;i<hours.length;i++){
            for(int j=0;j<hours[i].length;j++){
                hours[i][j]=(int)(Math.random()*9)+1;
            }
        }
        return hours;
    }
    
    public static void displayArray(int[][] hours){
        System.out.print("          Su  M  T  W  Th F  Sa");
        System.out.println("");
        for(int i=0;i<hours.length;i++){
            System.out.print("employee"+i+"  ");
            for(int j=0;j<hours[i].length;j++)
               System.out.print(hours[i][j]+"  "); 
            System.out.println("");
        }
    }
    
    public static double[] calculateAvg(int[][] hours){
        double[] averages=new double[10];
        for(int i=0;i<hours.length;i++){
            int total=0;
            for(int j=0;j<hours[i].length;j++)
                total+=hours[i][j];
            averages[i]=total/7.0;
        }
            return averages;
    }
    
    public static void displayAvg(double[] avgHours){
        System.out.println("");
        System.out.println("average hours");
        for(int i=0;i<avgHours.length;i++)
            System.out.println("employee "+i+" average hours "+avgHours[i]);
    }
    
    public static double maxAvg(double[] avgHours){
        System.out.println("");
        double max=avgHours[0];
        for(int i=0;i<avgHours.length-1;i++){
            if(avgHours[i]>max)
                max=avgHours[i];
        }
            return max;
    }
    
    public static double[] createSalary(int[][] hours){
        double[] salaries=new double[10];
        for(int i=0;i<hours.length;i++){
            int totalHours=0;
            for(int j=0;j<hours[i].length;j++)
                totalHours+=hours[i][j];
            if(totalHours>35)
                salaries[i]=2500+(totalHours-35)*100;
            else
                salaries[i]=2500;
        }
        return salaries;
    }
    public static void displaySalary(double[] salaries){
        System.out.println("");
        System.out.println("workers salaries ");
        for(int i=0;i<salaries.length;i++)
            System.out.println("employee "+i+" salary is "+salaries[i]);    
    }
}
