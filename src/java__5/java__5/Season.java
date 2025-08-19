public enum Season {
    WINTER(10), SUMMER(20), SPRING(30), RAINY;
    private int number;
    private Season(int number) {
        this.number = number;
        System.out.println("This is the parameterized constructor !!!");
    }

    void display() {
        System.out.println("Inside the display() method in the enum class !!!");
        System.out.println("Number is : " + number);
    }

    Season() {
        System.out.println("Default parameter constructor !!!");
    }
}
