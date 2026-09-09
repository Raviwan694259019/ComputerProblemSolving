void main() {
    IO.print("Enter your age : ");
    int age = Integer.parseInt(IO.readln());

    if (age <= 0) {
        IO.println("Error input !!!");
    } else if (age <= 9) {
        IO.println("Your age group is : Child ");
    } else if (age <= 19) {
        IO.println("Your age group is : Teenager ");
    } else if (age <= 59) {
        IO.println("Your age group is : Adult ");
    } else if (age < 120) {
        IO.println("Your age group is : Senior ");
    } else {
        IO.println("Error output ");
    }
}
