package de.dercrafter.backend.customer;

public class BusinessCustomer extends Customer {

    private String companyName;
    private String taxID;
    private String vat;
    private int duns;

    private BusinessCustomer(Builder builder) {
        super(builder);
        this.companyName = builder.companyName;
        this.taxID = builder.taxID;
        this.vat = builder.vat;
        this.duns = builder.duns;
    }

    public static class Builder extends Customer.Builder {
        private String companyName;
        private String taxID;
        private String vat;
        private int duns;

        public Builder companyName(String companyName) { this.companyName = companyName; return this; }
        public Builder taxID(String taxID) { this.taxID = taxID; return this; }
        public Builder vat(String vat) { this.vat = vat; return this; }
        public Builder duns(int duns) { this.duns = duns; return this; }

        @Override
        public BusinessCustomer build() {
            return new BusinessCustomer(this);
        }
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public String getTaxID() {
        return this.taxID;
    }

    public String getVAT() {
        return this.vat;
    }

    public int getDUNS() {
        return this.duns;
    }

    @Override
    public String getCustomerInfo(){
        String tmp;
        tmp = "Company: ".concat(this.companyName).concat("\n");
        tmp = tmp.concat("TaxID: ").concat(this.taxID).concat("\n");
        tmp = tmp.concat("VAT: ").concat(this.vat).concat("\n");
        tmp = tmp.concat("DUNS: ").concat(String.valueOf(this.duns)).concat("\n");
        tmp = tmp.concat(super.getCustomerInfo());
        tmp = tmp.concat("\n");
        return tmp;
    }

}
