public class StudentGrades {

    String studentName;
    double[] grades;
    
    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
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
        int count1 = 0;
        double count2 = 0;
        
        for (int i = 0; i < grades.length; i ++){
            count1 ++;
            count2+=i;
        }
        return count2/count1;
    }
    
    public void displayInfo(){
        System.out.println("Student's name: "+studentName);
        System.out.println("The highest grade is: "+this.calculateMaxGrade());
        System.out.println("The lowest grade is: "+this.calculateMinGrade());
        System.out.println("The number of grades is: "+this.calculateNumGrades());
        System.out.println("The average grade is: "+this.calculateAvGrade());
    }
    
    public static void main(String[] args){
        StudentGrades s1 = new StudentGrades("Amanda", new double[]{3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5});
        StudentGrades s2 = new StudentGrades("James", new double[]{2.0, 3.0, 2.0, 4.5, 4.5});   
        
        s1.displayInfo();
        s2.displayInfo();    
    }
}
