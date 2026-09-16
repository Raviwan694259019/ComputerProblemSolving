void main() {
    int balance = 10000;
    IO.print("Enter your PIN:  ");
    int password =Integer.parseInt(IO.readln());
    if (password == 1234) {
        IO.println("===== ATM MENU=====");
        IO.println("1. Check balance");
        IO.println("2. Withdraw money");
        IO.println("3. Deposit money");
        IO.println("4. Exit");

        IO.print("Select an option: ");
        int menu =Integer.parseInt(IO.readln());

        if (menu == 1) {
            IO.println("Your balance is 10000.0 baht");
            } else {
                if (menu == 2) {
                    IO.print("Enter the withdrawal amount:");
                    int amount =Integer.parseInt(IO.readln());
                        if (amount <= 0) {
                            IO.println("The amount must be greater than 0.");
                        } else {
                            if (amount <= balance) {
                                balance =balance - amount;
                                IO.println("Witharawal successful.");
                                IO.println("Remaining balance: "+balance+ " baht.");
                            } else {
                                IO.println("Insufficient funds.");
                                }
                            }
                }
                } else {
                if (menu == 3) {
                    IO.print("Enter the deposit amount: ");
                    int amount =Integer.parseInt(IO.readln());
                        if ( amount > 0) {
                            balance =balance + amount;
                            IO.println("Deposit successful.");
                            IO.println("Updated balance: "+balance+ " baht.");
                        } else {
                            IO.println("The amount must be greater than 0.");
                        }
                        }
                    }
                }
            }
