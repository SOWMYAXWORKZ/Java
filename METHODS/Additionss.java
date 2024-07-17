class Additionss {

    public static void main(String[] args) {
        System.out.println(12 + 23);
        System.out.println(32 + 44);
        System.out.println(12 + 2);

        // Calling the method that doesn't take parameters and returns an int
        int result = add();
        System.out.println(result);
    }

    // Method without parameters but with a return type
    public static int add() {
        int num1 = 10; // Example numbers
        int num2 = 20; // Example numbers
        return num1 + num2; // Returning the sum
    }
}
