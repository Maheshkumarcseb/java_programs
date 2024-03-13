// example of constructor chaining

class Temp {
    Temp() {
        this(5);   // Calls the constructor Temp(int)

        System.out.println("The Default constructor");
    }

    Temp(int x) {
        this(5, 15);  // Calls the constructor Temp(int, int)
        System.out.println(x);
    }

    Temp(int x, int y) {
        System.out.println(x * y);
    }

    public static void main(String args[]) {
        // invokes default constructor first
        new Temp();
        // Temp myob=new Temp();
    }
}