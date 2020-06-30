package com.customertimes.lection4.homework.task3hasA;

class CarConstructor {
    Model m;
    Engine e;
    Wheels w;

    public void display (Model m, Engine e, Wheels w){
        System.out.println("Model name: " + m.model);
        System.out.println("Year of the Car is: "+ m.year);
        System.out.println("Dors Count: " + m.dorsCount);
        System.out.println("Prices in USA dolars: " + m.price);
        System.out.println("FuelType: " + e.fuelType);
        System.out.println("Engine Volume: " + e.Volume);
        System.out.println("Count of the Cylinders: " + e.cylinderCount);
        System.out.println("Horse Powers: " + e.HP);
        System.out.println("Wheels rim size is: " + w.rimSize);
        System.out.println("Wheels tire size is: " + w.tireSize);
        System.out.println("Tire name is: " + w.tireName);
        System.out.println("Max Tyre pressure Bar: " + w.maxTirePressure);
    }

    public static void main(String[] args) {
        CarConstructor BMW = new CarConstructor();
        Engine x5Engine = new Engine ("Disel", "3.0L", 6,227);
        Model x5Model = new Model("BMW x5 e53", 2012, 5, 16000);
        Wheels x5Wheels = new Wheels("19x12.5 +45", "300/90R19", "Continental", 4);
        BMW.display(x5Model, x5Engine, x5Wheels);

    }
}

