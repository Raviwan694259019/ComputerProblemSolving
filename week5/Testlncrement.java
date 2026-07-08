void main() {
    int x, num;
    IO.println("-----Pre increment-----");
    x = 10;
    IO.println("Brfore x = " + x);
    num = ++x;
    IO.println("num = " + num);
    IO.println("After x = " + x);
    IO.println("-----Post-increment-----");
    x = 10;
    IO.println("Before x = " + x);
    num = x++;
    IO.println("num = " + num);
    IO.println("After x =" + x);

}