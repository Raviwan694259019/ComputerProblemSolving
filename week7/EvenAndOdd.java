void main() {
    IO.print("Enter a number :");
    int number = Integer.parseInt(IO.readln());
    if (number % 2 == 0) {
        IO.println("The number " + number + " is Even");
    } else {
        IO.println("The number " + number + " is Odd");
    }
    IO.println("End Program");
}