abstract class Service {
    protected String name;
    protected String hour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getHour();
}
