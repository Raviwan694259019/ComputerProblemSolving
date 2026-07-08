void main() {
    IO.print("Enter fahrenheit :");
    double fahrenheit = Double.parseDouble(IO.readln());
    double celsius = (5.0 / 9.0) * (fahrenheit - 32);
    IO.println("celsius = %.2f".formatted(celsius));
}