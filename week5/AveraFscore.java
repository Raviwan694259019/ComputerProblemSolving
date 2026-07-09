void main() {
    IO.print("Enter score 1 : ");
    double score1 = Double.parseDouble(IO.readln());
    IO.print("Enter score 2 : ");
    double score2 = Double.parseDouble(IO.readln());
    IO.print("Enter score 3 : ");
    double score3 = Double.parseDouble(IO.readln());
    IO.print("Enter bonus score : ");
    double bonus_score = Double.parseDouble(IO.readln());
    double total_score = score1 + score2 + score3;
    double total_withBonus = total_score + bonus_score;
    double total_of_withBonus = total_withBonus / 3;
    IO.println("Total score = " + total_score + " points ");
    IO.println("Total with bonus = " + total_withBonus + " points ");
    IO.println("Average of totalWithBonus(230) = %.2f ".formatted(total_of_withBonus) + " points ");
}