package com.company;

import java.util.Objects;
//Customer Class Design to Implement Composition
public class Customer {
        private String firstName;
        private String lastName;
        private String email;
        private int phoneNumber;
        private Address shippingAddress;
        private Address billingAddress;
        private boolean isRewardsMember;

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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Address getShippingAddress() {
            return shippingAddress;
        }

        public void setShippingAddress(Address shippingAddress) {
            this.shippingAddress = shippingAddress;
        }

        public Address getBillingAddress() {
            return billingAddress;
        }

        public void setBillingAddress(Address billingAddress) {
            this.billingAddress = billingAddress;
        }

        public boolean isRewardsMember() {
            return isRewardsMember;
        }

        public void setRewardsMember(boolean rewardsMember) {
            isRewardsMember = rewardsMember;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return phoneNumber == customer.phoneNumber && isRewardsMember == customer.isRewardsMember && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email) && Objects.equals(shippingAddress, customer.shippingAddress) && Objects.equals(billingAddress, customer.billingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, phoneNumber, shippingAddress, billingAddress, isRewardsMember);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", shippingAddress=" + shippingAddress +
                ", billingAddress=" + billingAddress +
                ", isRewardsMember=" + isRewardsMember +
                '}';
    }
}
