void main() {
    IO.print("Enter salary : ");
    double salary = Double.parseDouble(IO.readln());
    IO.print("Enter deduction percent : ");
    double deduction_percect = Double.parseDouble(IO.readln());
    double deduction = salary * deduction_percect / 100;
    double net_salary = salary - deduction;
    IO.println("Deduction = %.2f ".formatted(deduction) + " baht ");
    IO.println("Net salary = %.2f".formatted(net_salary) + " baht ");
}