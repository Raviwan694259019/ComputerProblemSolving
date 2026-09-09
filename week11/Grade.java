void main() {
    IO.print("Enter your score : ");
    int score = Integer.parseInt(IO.readln());
    if ((score < 0) || (score > 100)) {
        IO.println("You must enter a correct score, try again later.");
    } else if (score >= 80) {
        IO.println("Your grade is A");
    } else if (score >= 70) {
        IO.println("Your grade is B");
    } else if (score >= 60) {
        IO.println("Your grade is C");
    } else if (score >= 50) {
        IO.println("Your grade is D");
    } else {
        IO.println("Your grade is E");
    }
}