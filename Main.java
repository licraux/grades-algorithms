import java.util.Scanner;
import edu.princeton.cs.algs4.Insertion;

public class Main{

    public static void main(String [] args) throws Exception{
        StudentGrade [] dataArray;
        Scanner scn = new Scanner(System.in);
        int inputLines = Integer.parseInt(scn.nextLine());
        dataArray = new StudentGrade[inputLines];
       
        for (int j = 0; j<inputLines; j++){

            dataArray[j] = new StudentGrade(scn.nextLine());

        }
        scn.close();
        Insertion.sort(dataArray, new Rule());
        for (StudentGrade output : dataArray) System.out.println(output.getName());
        
    }

}