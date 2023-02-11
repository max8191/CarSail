public class sell extends forSellSndBuy{
    protected sell(String typeOfBody, String maker, String model, int issueDate, double price, int mileage, String typeOfgas, String typeOfEngine, boolean haveBeenInAccsident, String state) {
        super(typeOfBody, maker, model, issueDate, price, mileage, typeOfgas, typeOfEngine, haveBeenInAccsident,state);
    }

    @Override
    public String toString() {
        return "information:" +
                "typeOfBody='" + typeOfBody + '\'' +
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", issueDate=" + issueDate +
                ", price=" + price +
                ", mileage=" + mileage +
                ", typeOfgas='" + typeOfgas + '\'' +
                ", typeOfEngine='" + typeOfEngine + '\'' +
                ", haveBeenInAccsident=" + haveBeenInAccsident +
                ", state='" + state;
    }
}
