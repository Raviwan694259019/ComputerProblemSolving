void main() {
    IO.print("Enter your midtem score : ");
    int midtem = Integer.parseInt(IO.readln());
    IO.print("Enter your fianl score : ");
    int fianl = Integer.parseInt(IO.readln());
    int totalScore = midtem + fianl;
    if (totalScore >= 50) {
        IO.println("Your total score is " + totalScore + " . The result is Pass!! ");
    } else {
        IO.println("Your total score is " + totalScore + " . The result is Fail!! ");
    }
}