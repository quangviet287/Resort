public class Resort implements Payment{
    public String name;
    public Address address;

    public Resort(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public void getCustomer() {

    }

    @Override
    public void getPrice() {

    }

    @Override
    public void getTime() {

    }
}
