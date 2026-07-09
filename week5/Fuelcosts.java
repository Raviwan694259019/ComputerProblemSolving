FuelCosts() {
    IO.print("Enter distance (km) : ");
    int distance = Integer.parseInt(IO.readln());
    IO.print("Enter fuel efficiency (km/liter) : ");
    int fuel_efficiency = Integer.parseInt(IO.readln());
    IO.print("Enter fuel prices per liter : ");
    int fuel_prices = Integer.parseInt(IO.readln());
    int fuel_used = distance / fuel_efficiency;
    int total_cost = fuel_used * fuel_prices;
    IO.println("Fuel used = " + fuel_used + " liters ");
    IO.println("Total cost = " + total_cost + " baht ");
}
