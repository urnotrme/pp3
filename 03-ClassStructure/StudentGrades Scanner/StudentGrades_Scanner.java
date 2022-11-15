import java.util.Scanner;

public class StudentGrades_Scanner {

    String studentName;
    double[] grades;
    int numberOfGrades;
    
    StudentGrades_Scanner(String studentName, int numberOfGrades) {
        this.studentName = studentName;
        this.numberOfGrades = numberOfGrades;
        Scanner sc = new Scanner(System.in);
        this.grades = new double[numberOfGrades];
        for (int i = 0; i < this.numberOfGrades; i++) {
            
            System.out.println("Enter grade: ");
            double grade = sc.nextDouble();
            this.grades[i] = grade;
        }
        sc.close();
    }
    
    public double calculateMaxGrade(){
        double max = 0;
     
        for(int i=0; i<grades.length; i++ ){
            if(grades[i]>max){
                max = grades[i];
            }
        }
        return max;
    }
    public double calculateMinGrade(){
        double min = grades[0];
     
        for(int i=0; i<grades.length; i++ ) {
            if(grades[i]<min) {
                min = grades[i];
            }
        }
        return min;
    }    
    
    public int calculateNumGrades(){
        int count = 0;
        for (int i = 0; i < grades.length; i ++){
            count ++;
        }
        return count;
    }
    
    public double calculateAvGrade(){
        double count2 = 0;
        
        for (int i = 0; i < grades.length; i ++){
            count2+=i;
        }
        return count2/calculateNumGrades();
    }
    
    public void displayInfo(){
        System.out.println("Student's name: "+studentName);
        System.out.println("The highest grade is: "+this.calculateMaxGrade());
        System.out.println("The lowest grade is: "+this.calculateMinGrade());
        System.out.println("The number of grades is: "+this.calculateNumGrades());
        System.out.println("The average grade is: "+this.calculateAvGrade());
    }
    
    public static void main(String[] args){
        StudentGrades_Scanner s1 = new StudentGrades_Scanner("Amanda", 5);
        StudentGrades_Scanner s2 = new StudentGrades_Scanner("James", 6);   
        
        s1.displayInfo();
        s2.displayInfo();    
    }
}
