void main() {
    IO.print("Enter initial saving : ");
    double initial_saving = Double.parseDouble(IO.readln());
    IO.print("Enter monthly saving : ");
    double monthly_saving = Double.parseDouble(IO.readln());
    IO.print("Enter number of months : ");
    double months = Double.parseDouble(IO.readln());
    IO.print("Enter interest percent : ");
    double interest_percent = Double.parseDouble(IO.readln());
    double total_saving = initial_saving + monthly_saving * months;
    double interest = total_saving * interest_percent / 100;
    double final_saving = total_saving + interest_percent;
    IO.println("Total saving before interest : %.2f".formatted(total_saving) + " baht ");
    IO.println("Interest = %.2f".formatted(interest) + " baht ");
    IO.println("Final saving = %.2f".formatted(final_saving) + " baht ");
} 