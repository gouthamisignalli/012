class Car {
    String make;
    String model;
    int year;
   Car(String make, String model, int year) 
   {
      //default constructor 
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void display() 
    {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    public static void main(String[] args) 
    {
        Car C1 = new Car("Benz", "ABC", 2022); 
        C1.display(); 
    }
}
