s

void main() {
    IO.print("Enter a number : ");
    double number = Double.parseDouble(IO.readln());
    if (number == 1) {

        IO.print("Enter tne base of triangle : ");
        double base = Double.parseDouble(IO.readln());
        IO.print("Enter the height of triangle : ");
        double height = Double.parseDouble(IO.readln());
        double arse = (1.0 / 2.0) * base * height;
        IO.println("Arse of the triangle : %.2f".formatted(arse) + " square units");
    } else {

        IO.print("Enter your weight in kilogrom : ");
        double weight = Double.parseDouble(IO.readln());
        IO.print("Enter your heightBMI in meters : ");
        double heightBMI = Double.parseDouble(IO.readln());
        double BMI = weight / (heightBMI * heightBMI);
        IO.println("Your BMI for weight = %.2f".formatted(weight) + " kg and height = %.2f".formatted(heightBMI)
                + " meters is : " + BMI + "bmi.");
    }

}