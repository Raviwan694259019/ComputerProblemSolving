import java.security.InvalidKeyException;

void main() {
    IO.print("Enter the num1 :");
    int num1 = Integer.parseInt(IO.readln());
    IO.print("Enter the num2 : ");
    int num2 = Integer.parseInt(IO.readln());
    if (num1 > num2) {
        int total = num1 - num2;
        IO.println("Total = " + total);
    } else if (num1 < num2) {
        int total = num1 + num2;
        IO.println("Total = " + total);
    }
}