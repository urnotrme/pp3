public class Student {
    
    //wykaz atrybutów
    String imie;
    int wiek;
    String IdCard;
    boolean isValid;
    int semester;
    double avGrade;
    
    //wykaz metod
    public void sayHello(){
        System.out.println("Hello!");
    };
    public void displayName(){
        System.out.println("My name is"+imie);
    };
    public void displayAge(){
        System.out.println("My age is"+wiek);
    };
    public void displayInfo(){
        System.out.println("My name is"+imie+", I'm on "+semester+
        "semester of studying and my average grade is"+avGrade);
    };
    public void changeStatus(){
        isValid = !isValid;
    };
    public void displayInfo2(){
        System.out.println("My name is"+imie+", my ID card number is "+IdCard+
        "and it's"+isValid);
    };
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.imie = "Alina";
        s1.wiek = 18;
        s1.IdCard = "222466";
        s1.avGrade = 4.31;
        s1.semester = 3;
        s1.isValid = true;
        
        s1.displayInfo();
        s1.changeStatus();
        s1.displayInfo2();
    };
}