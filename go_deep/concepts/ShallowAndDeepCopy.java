package com.example.github.concepts;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;

//https://www.baeldung.com/java-deep-copy
public class ShallowAndDeepCopy {
    static class Address implements Serializable {

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Address(String street,
                       String city,
                       String country) {
            this.street = street;
            this.city = city;
            this.country = country;
        }

        private String street;
        private String city;
        private String country;

        // standard constructors, getters and setters
    }
    static class User implements Serializable  {

        public User(String firstName,
                    String lastName,
                    Address address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        private String firstName;
        private String lastName;
        private Address address;

        // standard constructors, getters and setters
    }


    public static  void main(String[]args){
//        whenShallowCopying_thenObjectsShouldNotBeSame
//        Address address = new Address("Downing St 10", "London", "England");
//        User pm = new User("Prime", "Minister", address);
//
//        User shallowCopy = new User(pm.getFirstName(), pm.getLastName(), pm.getAddress());
//        //        In this case, pm != shallowCopy, which means that they’re different objects; however,
//        //        the problem is that when we change any of the original address’ properties,
//        //        this will also affect the shallowCopy‘s address.
//        //
//        //        We wouldn’t bother with it if Address was immutable, but it’s not:
//        System.out.println("before change");
//        System.out.println(shallowCopy.getAddress().getCountry());
//        System.out.println(pm.getAddress().getCountry());
//        //change in main object
//        address.setCountry("Great Britain");
//        System.out.println("after change");
//        System.out.println(shallowCopy.getAddress().getCountry());
//        System.out.println(pm.getAddress().getCountry());

//        5. Deep Copy
//        A deep copy is an alternative that solves this problem. Its advantage is that each mutable object in the object graph is recursively copied.
//
//        Since the copy isn’t dependent on any mutable object that was created earlier, it won’t get modified by accident like we saw with the shallow copy.
//
//        In the following sections, we’ll discuss several deep copy implementations and demonstrate this advantage.
//
        Address address = new Address("Downing St 10", "London", "England");
        User pm = new User("Prime", "Minister", address);
        User deepCopy = (User) SerializationUtils.clone(pm);

                System.out.println("before change");
                System.out.println(pm.getAddress().getCountry());
                System.out.println(deepCopy.getAddress().getCountry());
                //change in main object
                address.setCountry("Great Britain");
                System.out.println("after change");
        System.out.println(pm.getAddress().getCountry());
        System.out.println(deepCopy.getAddress().getCountry());
    }
}
