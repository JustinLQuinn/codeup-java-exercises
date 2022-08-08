

public class Person {
    private String name;


//constructor
    public Person(String name) {
        this.name = name;
    }

//accessors
    public String getName(){
//TODO: return the person's name
        return name;
        }
        public void setName(String name){
//TODO: change the name field to the passed value
            this.name = name;
        }
        public String sayHello(){
//TODO: print a message to the console using the person's name
            return String.format("%s sayes HI!", this.name);
        }


    public static void main(String[] args) {
        Person mary = new Person("Mary");
        System.out.println(mary.sayHello());
        System.out.println(mary.getName());
        mary.setName("Johnathan");
        System.out.println(mary.getName());
        System.out.println(mary.sayHello());
        System.out.println(mary);
    }
}
