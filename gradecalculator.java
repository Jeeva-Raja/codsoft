// Input: Take marks obtained (out of 100) in each subject.
// Calculate Total Marks: Sum up the marks obtained in all subjects.
// Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
// average percentage.
// Grade Calculation: Assign grades based on the average percentage achieved.
// Display Results: Show the total marks, average percentage, and the corresponding grade to the user

import java.util.Scanner;

class gradecalculator{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF SUBJECTS:");
        int numberofsubjects = scanner.nextInt();
        int[] marks = new int[numberofsubjects];
        double totalmarks = 0;

        for (int i  = 0; i< numberofsubjects; i++){
            System.out.println("ENTER MARKS OF SUBJECTS" +(i+1)+":");
            marks[i] = scanner.nextInt();
            totalmarks += marks[i];
        }
        double possiblemarks = numberofsubjects *100;
        double percentage = (totalmarks / possiblemarks) * 100;
        double average = totalmarks / numberofsubjects;

        System.out.println("TOTAL MARK IS :"+totalmarks+"/"+possiblemarks);
        System.out.println("AVERAGE PERCENTAGE IS :"+average);
        if(percentage >=90){
            System.out.println("GRADE:A");
        }else if(percentage < 90 && percentage >= 70){
            System.out.println("GRADE:B");
        }else if(percentage < 70 &&  percentage >= 50){
            System.out.println("GRADE:C");
        }else if(percentage < 50 && percentage >= 36)
        {
            System.out.println("GRADE:D");
        }else{
            System.out.println("GRADE:F");
        }
        scanner.close();
    }
}
