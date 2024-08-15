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
