package ch11.sec11.exam02;

import java.lang.reflect.Constructor;

public class Car {
    private String model;
    private String owner;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

class ReflectionExample {
    public static void main(String[] args) {
        Class clazz = Car.class;
        System.out.println("생성자 정보");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");
            Class[] parameters = constructor.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }


    }

    private static void printParameters(Class[] parameters) {
        for (int i = 0; i < parameters.length; i++) {
            System.out.print(parameters[i].getName());
            System.out.print(",");
        }
    }
}
