package pl.idzikdevs.DrivingLicenseProjectIdzik;

public class Food {
    String name;
    float price;
    String descryption;
    int calories;

    public Food(String name, float price, String descryption, int calories) {
        this.name = name;
        this.price = price;
        this.descryption = descryption;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescryption() {
        return descryption;
    }

    public void setDescryption(String descryption) {
        this.descryption = descryption;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", descryption='" + descryption + '\'' +
                ", calories=" + calories +
                '}';
    }

}
