void main() {
    IO.print("Enter your age : ");
    int age = Integer.parseInt(IO.readln());

    if (age >= 59) {
        IO.println("Your age group is : Senior ");
    } else if (age >= 29) {
        IO.println("Your age group is : Adult  ");
    } else if (age >= 19) {
        IO.println("Your age group is : Teenager ");
    } else if (age >= 0) {
        IO.println("Your age group is :  Child");
    } else  {
        IO.println("Invalid age!!!");
    }
}
