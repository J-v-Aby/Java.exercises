package javabasics._2.oop.advanced2p._3;

import java.util.Objects;

public class Persona {
    private String name;
    private Integer age;
    private String address;

    public Persona(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return Objects.equals(getName(), persona.getName()) && Objects.equals(getAge(), persona.getAge()) && Objects.equals(getAddress(), persona.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getAddress());
    }


}
