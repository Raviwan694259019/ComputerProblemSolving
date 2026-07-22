void main() {
    int man = 1;
    int woman = 2;
    IO.print("Enter the Gender to (Man = 1 , Woman = 2) : ");
    int gender = Integer.parseInt(IO.readln());
    IO.print("Enter the Weight : ");
    double weight = Double.parseDouble(IO.readln());
    IO.print("Enter the Height : ");
    double height = Double.parseDouble(IO.readln());
    IO.print("Enter the Age :");
    double age = Double.parseDouble(IO.readln());
    if (gender == 1) {
        double bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        IO.println("Your the BMR is %.2f".formatted(bmr));
    } else if (woman == 2) {
        double bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        IO.print("yOUR THE BMR is %.2f".formatted(bmr));
    }
}