import java.lang.annotation.Documented;

vain main() {
    IO.print("Enter salary : ");
    double salary = Double.parseDouble(IO.readln());
    double tax = salary * 0.10;
    IO.println("Tax = % .2f ".formatted(tax));
}
