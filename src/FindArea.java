import com.sun.jdi.ClassNotLoadedException;
public class FindArea {
    int answer;

    public FindArea (int num1){
        this.answer = num1 * num1;
    }
    public FindArea (int num1, int num2){
        this.answer = num1 * num2;
    }
    public void printAnswer() {
        System.out.println("The area of the shape is " + answer + " sq units");
    }

    private Exception generateNumException(){
        return new ClassNotLoadedException("Person" ,"The required args are missing or null!");
    }
}
