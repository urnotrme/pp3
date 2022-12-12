public class Family {
    Person [] person;

    public Family(Person [] person) {
        this.person = person;
    }

    public int adults(){
        int a = 0;
        for(Person p : person){
            if(p.getAge() >= 18){
                a++;
            }
        }
        return a;
    } 
    public static void main(String[] args) {
        Family f1 = new Family (new Person[] {new Person("Olivia", 7), new Person("George", 37), new Person("Anna", 32), new Person("Jack", 6)});
        System.out.println(f1.adults());
    }
}
