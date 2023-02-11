public class forSellSndBuy {
    protected String typeOfBody;
    protected String maker;
    protected String model;
    protected int issueDate;
    protected double price;
    protected int mileage;
    protected String typeOfgas;
    protected String typeOfEngine;
    protected boolean haveBeenInAccsident;
    protected String state;

    protected forSellSndBuy(String typeOfBody, String maker, String model, int issueDate, double price, int mileage, String typeOfgas, String typeOfEngine, boolean haveBeenInAccsident,String state) {
        this.typeOfBody = typeOfBody;
        this.maker = maker;
        this.model = model;
        this.issueDate = issueDate;
        this.price = price;
        this.mileage = mileage;
        this.typeOfgas = typeOfgas;
        this.typeOfEngine = typeOfEngine;
        this.haveBeenInAccsident = haveBeenInAccsident;
        this.state = state;
    }

    public String getModel() {
        return model;
    }

    public String getMaker() {
        return maker;
    }

    public double getPrice() {
        return price;
    }

    public int getMileage() {
        return mileage;
    }

    public String getTypeOfgas() {
        return typeOfgas;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getIssueDate() {
        return issueDate;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public boolean isHaveBeenInAccsident() {
        return haveBeenInAccsident;
    }

    public String getState() {
        return state;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setTypeOfgas(String typeOfgas) {
        this.typeOfgas = typeOfgas;
    }

    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public void setIssueDate(int issueDate) {
        this.issueDate = issueDate;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public void setHaveBeenInAccsident(boolean haveBeenInAccsident) {
        this.haveBeenInAccsident = haveBeenInAccsident;
    }

    public void setState(String state) {
        this.state = state;
    }
}
