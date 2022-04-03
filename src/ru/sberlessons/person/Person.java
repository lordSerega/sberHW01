package ru.sberlessons.person;

public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean isMan() {
        return man;
    }

    public String getName() {
        return name;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public boolean marry(Person person) {

        if (this.isMan() == person.isMan()) {
            return false;
        }

        if (this.spouse != null) {
            this.spouse.divorce();
        }

        this.spouse = person;
        person.marry(this);
        return true;
    }

    public boolean divorce() {
        if (this.spouse == null) {
            return false;
        } else {
            Person secondPerson = this.spouse;
            this.setSpouse(null);
            secondPerson.divorce();
            return true;
        }

    }
}