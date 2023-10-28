package entities;

public class Customer {
    private String name;
    private String address;
    private String codeElectric;

    public Customer(String name, String address, String codeElectric) {
        this.name = name;
        this.address = address;
        this.codeElectric = codeElectric;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", codeElectric='" + codeElectric + '\'' +
                '}';
    }
}
