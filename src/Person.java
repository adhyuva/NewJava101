import com.sun.jdi.ClassNotLoadedException;
public class Person {
    //class variables
    static String SPECIES = "human";
    //instance variables
    String firstName;
    String lastName;
    int age;
    //constructors
    public Person (String fn, String ln, int a, String species) throws Exception{
        if (null == fn || null == ln || a<=0){
            Exception e = generateException();
            throw e;
        }
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
        Person.SPECIES = species;
    }
    // instance method
    private Exception generateException(){
        return new ClassNotLoadedException("Person" ,"The required args are missing or null!");
    }
    public void printDetails() {
        System.out.println(String.format("Meet the one and only: %s %s who is %d years old and is of type %s",this.firstName, this.lastName, this.age, Person.SPECIES));
    }

    public static void printStaticDetails() {
        System.out.println("Type :" + Person.SPECIES);

    }

}
