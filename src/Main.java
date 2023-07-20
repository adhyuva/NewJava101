public class Main {
    //testing
    public static void main(String[] args) {
        //handleDataTypes();
        //handlePerson();
        handleProduct();
    }

    private static void handleProduct() {
        Product p1 = new Product("diapers", 3.41F);
        System.out.println(p1.priceForXAQuantity(5));
        Product p2 = new Product("jattis", null);
        System.out.println(p2.priceForXAQuantity(5));
    }









    private static void handlePerson() {
        try {
            Person adhithya = new Person("Adhithya", "Yuvaraj", 14, "Human");
            Person arjun = new Person("Baby", "Arjun", 2, "Penguin");
            adhithya.printDetails();
            arjun.printDetails();
            Person nullPerson = new Person(null, "Yuvaraj", 45, "Nothing");
            nullPerson.printDetails();
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public static void handleDataTypes () {
        byte b = 10; //can only hold 0 to 127
        short s = 10; //can only hold 0 to 32767
        int i = 10; // can only hold 0 to 21474883647
        long l = 10;
        float f = 10;
        double d= 10;
        char c = 'a';
        System.out.println(
                "byte: " + b + "\n" +
                        "short: " + s + "\n" +
                        "int: " + i + "\n" +
                        "long: " + l + "\n" +
                        "float: " + f + "\n" +
                        "double: " + d + "\n" +
                        "char: " + c + "\n");
    }
}