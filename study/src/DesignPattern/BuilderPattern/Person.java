package DesignPattern.BuilderPattern;

public class Person {
    private String name;
    private String age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static final class PersonBuilder {
        private String name;
        private String age;
        private String address;

        private PersonBuilder() {
        }

        public static PersonBuilder aPerson() {
            return new PersonBuilder();
        }

        public PersonBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder withAge(String age) {
            this.age = age;
            return this;
        }

        public PersonBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.setName(name);
            person.setAge(age);
            person.setAddress(address);
            return person;
        }
    }
}
