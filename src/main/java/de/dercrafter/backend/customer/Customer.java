package de.dercrafter.backend.customer;

public class Customer {

    protected String surname;
    protected String prename;
    protected String gender;

    protected String email;
    protected String phone;

    protected String street;
    protected String zip;
    protected String city;
    protected String country;

    protected static int customerIDCounter = 1000;
    protected int customerID;

    protected Customer (Builder builder){
        this.surname = builder.surname;
        this.prename = builder.prename;
        this.gender = builder.gender;
        this.email = builder.email;
        this.phone = builder.phone;
        this.street = builder.street;
        this.zip = builder.zip;
        this.city = builder.city;
        this.country = builder.country;
        this.customerID = ++customerIDCounter;
    }

    public static class Builder {
        protected String surname;
        protected String prename;
        protected String gender;
        protected String email;
        protected String phone;
        protected String street;
        protected String zip;
        protected String city;
        protected String country;

        public Builder surname (String pSurname){
            this.surname = pSurname;
            return this;
        }

        public Builder prename (String pPrename){
            this.prename = pPrename;
            return this;
        }

        public Builder gender (String pGender){
            this.gender = pGender;
            return this;
        }

        public Builder email (String pEmail){
            this.email = pEmail;
            return this;
        }

        public Builder phone (String pPhone){
            this.phone = pPhone;
            return this;
        }

        public Builder street (String pStreet){
            this.street = pStreet;
            return this;
        }

        public Builder zip (String pZip){
            this.zip = pZip;
            return this;
        }

        public Builder city (String pCity){
            this.city = pCity;
            return this;
        }

        public Builder country (String pCountry){
            this.country = pCountry;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPrename() {
        return this.prename;
    }

    public String getGender() {
        return this.gender;
    }

    public String getSalutation() {
        try {
            return switch (this.gender.toLowerCase()) {
                case "male" -> "Herr";
                case "female" -> "Frau";
                default -> "";
            };
        }catch(Exception e){
            return "No Data";
        }
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getStreet() {
        return this.street;
    }

    public String getZip() {
        return this.zip;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCustomerInfo(){
        return "Customer: " + this.getSalutation().concat(" ") + this.surname.concat(" ") + this.prename.concat(" ") + "CustomerID: " + this.customerID ;
    }

}
