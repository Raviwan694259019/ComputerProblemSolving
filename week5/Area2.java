void main() {
    IO.print("Enter the base of the triangle : ");
    double base_triangle = Double.parseDouble(IO.readln());
    IO.print("Enter the heigth of the triangle : ");
    double height_triangle = Double.parseDouble(IO.readln());
    double area_triangle = (1.0 / 2.0) * base_triangle * height_triangle;
    IO.println("Area of the triangle : %.2f".formatted(area_triangle) + " square units");

    IO.println("-----------------------------------------------------");

    IO.print("Enter the length of the rectangle : ");
    double length_rectangle = Double.parseDouble(IO.readln());
    IO.print("Enter the width of the rectangle : ");
    double width_rectangle = Double.parseDouble(IO.readln());
    double area_rectangle = length_rectangle * width_rectangle;
    IO.println("Area of the rectangle : %.2f".formatted(area_rectangle) + " square units");
}