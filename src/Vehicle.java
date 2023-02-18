public class Vehicle {
    private String type;
    private String carriedObjectType;

    public Vehicle(String type, String carriedObjectType) {
        this.type = type;
        this.carriedObjectType = carriedObjectType;
    }
    public Vehicle(){
        this.type = "watercraft";
        this.carriedObjectType = "cargo";
    }

    public String getType() {
        return type;
    }

    public void setType(@ParameterInfo String type) {
        this.type = type;
    }

    public String getCarriedObjectType() {
        return carriedObjectType;
    }

    public void setCarriedObjectType(@ParameterInfo String carriedObjectType) {
        this.carriedObjectType = carriedObjectType;
    }
}
