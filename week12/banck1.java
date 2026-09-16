void main(){
    int balance = 10000;
    IO.print("Enter your PIN:  ");
    int password = Integer.parseInt(IO.readln());

    if (password == 1234) {
        IO.println("===== ATM MENU=====");
        IO.println("1. Check balance");
        IO.println("2. Withdraw money");
        IO.println("3. Deposit money");
        IO.println("4. Exit");

        IO.print("Select an option: ");
        int menu = Integer.parseInt(IO.readln());

        if (menu == 1) {
            IO.println("Your balance is 10000.0 baht");
        } else {
            if (menu == 2) {
                IO.print("Enter the withdrawal amount:");
                if (condition) {
                    
                } else {
                    
                }
            } else {
            }
        }
    }


}