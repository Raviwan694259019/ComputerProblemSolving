void main() {
    int hours = Integer.parseInt(IO.readln("Enter Hours : "));
    int minutes = Integer.parseInt(IO.readln("Enter Minutes : "));
    int totalMimutes = hours * 60 + minutes;
    IO.println("Total Minutes = " + totalMimutes + " นาที ");
}