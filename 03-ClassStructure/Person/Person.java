public class Person{

    String name;
    double weight;
    double height;
    double bmi;

    Person(String name){
        this.name = name;
    }

    Person(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(double weight, double height){
        this.weight = weight;
        this.height = height;
    }
    
    public void calculateBMI(double weight, double height){
        this.bmi = weight/(height*height);
    }
    
    public void displayRecord(){
        System.out.println("Name: "+name);
        System.out.println("Weight: "+weight);
        System.out.println("Height: "+height);
        System.out.println("BMI: "+bmi);
        if(18.5 <= bmi & bmi<= 24.9){
            System.out.println("Your BMI is normal");
        }
        else if (18.5 > bmi){
            System.out.println("Your BMI is too low");
        }
        else {
            System.out.println("Your BMI is too high");
        }
    }
    public static void main (String[] args){
        Person p1 = new Person("Alina");
        
        p1.setWeightAndHeight(61.0,1.66);
        p1.calculateBMI(61.0,1.66);
        p1.displayRecord(); 
    }
    
}
