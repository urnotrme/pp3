public class Person {
    String name;
    int age;

    Person (String name, int age){
        this.name = name;
        this.age= age;
    }

    //name
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //age
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void isAdult(){
        if (age<18) {
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }
    }

    public String toString(){
        return getName() + getAge();
    }

    public static void main(String[] args){
        Person p = new Person("Anna",21); 
        p.getAge();
        p.isAdult();
        p.setAge(17); 
        p.isAdult();
        p.toString();
    }

}
