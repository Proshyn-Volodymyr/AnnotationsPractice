public class Audi extends Car {
    private String engine;
    private int doors;
    private String color;
    private int price;
    private String model;
    private boolean isAvailable;

    public Audi(String engine, int doors, String color, int price, String model, boolean isAvailable) {
        super('S', "gasoline", 4.2, true);
        this.engine = engine;
        this.doors = doors;
        this.color = color;
        this.price = price;
        this.model = model;
        this.isAvailable = isAvailable;
    }

    public String getEngine() {
        return engine;
    }

    @MethodInfo()
    public void setEngine(@ParameterInfo() String engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @MethodInfo()
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @MethodInfo()
    public String getModel() {
        return model;
    }

    public void setModel(@ParameterInfo() String model) {
        this.model = model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @MethodInfo
    public void setAvailable(@ParameterInfo boolean available) {
        isAvailable = available;
    }
    @MethodInfo
    public void doSmth(@ParameterInfo String s){
        System.out.println(s);
    }
}
