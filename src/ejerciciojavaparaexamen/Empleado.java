/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojavaparaexamen;

/**
 *
 * @author victorvidales1
 */
public class Empleado {
    private final int ID; //Entre 10000 y 50000
    public int age;
    public String name;
    private String address;
    private int salary; //Entre 10000 y 80000
    private int bono; //Si el salario es mayor a 50,000 es 10,000 si no 5,000

    public Empleado() {
        this.ID = (int)Math.floor(Math.random()*(50000-10000+1)+10000);
    }
    
    public Empleado(int age, String name, String address, int salary) {
        this.ID = (int)Math.floor(Math.random()*(50000-10000+1)+10000);
        this.age = age;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.bono = this.salary > 50000 ? 10000 : 5000;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }
}
