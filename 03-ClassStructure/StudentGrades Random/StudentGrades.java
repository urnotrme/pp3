import java.util.Random;

public class StudentGrades {

    String studentName;
    int numberOfGrades;
    double[] grades;
    
    StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;
        Random random = new Random();
        this.grades = new double[numberOfGrades];
        for (int i = 0; i < numberOfGrades; i++) {
            this.grades[i] = (double) ((2.0 + ((double) random.nextInt(7))/2));
        }
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
        StudentGrades s1 = new StudentGrades("Amanda", 7);
        StudentGrades s2 = new StudentGrades("James", 6);   
        
        s1.displayInfo();
        s2.displayInfo();        
    }
}
