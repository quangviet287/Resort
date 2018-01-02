abstract class Acommodation {
    protected float size;
    protected float price;
    protected float bed;

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setBed(float bed) {
        this.bed = bed;
    }

    public abstract float getPrice();
    public abstract float getBed();
}
