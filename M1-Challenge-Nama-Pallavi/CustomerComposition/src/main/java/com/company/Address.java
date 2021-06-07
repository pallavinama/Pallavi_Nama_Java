package com.company;

import java.util.Objects;
//Address Class Design to Implement Composition
public class Address {
        private String street1;
        private String street2;
        private String city;
        private String state;
        private int zip;


        public String getStreet1() {
                return street1;
        }

        public void setStreet1(String street1) {
                this.street1 = street1;
        }

        public String getStreet2() {
                return street2;
        }

        public void setStreet2(String street2) {
                this.street2 = street2;
        }

        public String getCity() {
                return city;
        }

        public void setCity(String city) {
                this.city = city;
        }

        public String getState() {
                return state;
        }

        public void setState(String state) {
                this.state = state;
        }

        public int getZip() {
                return zip;
        }

        public void setZip(int zip) {
                this.zip = zip;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Address address = (Address) o;
                return zip == address.zip && Objects.equals(street1, address.street1) && Objects.equals(street2, address.street2) && Objects.equals(city, address.city) && Objects.equals(state, address.state);
        }

        @Override
        public int hashCode() {
                return Objects.hash(street1, street2, city, state, zip);
        }

        @Override
        public String toString() {
                return "Address{" +
                        "street1='" + street1 + '\'' +
                        ", street2='" + street2 + '\'' +
                        ", city='" + city + '\'' +
                        ", state='" + state + '\'' +
                        ", zip=" + zip +
                        '}';
        }
}


