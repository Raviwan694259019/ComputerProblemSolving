void main() {
    IO.print("Enter width (m):");
    double width = Double.parseDouble(IO.readln());
    IO.print("Enter length (m):");
    double length = Double.parseDouble(IO.readln());
    double bsa = width * length / 360;
    IO.println("BSA = %2.f".formatted(bsa));
}