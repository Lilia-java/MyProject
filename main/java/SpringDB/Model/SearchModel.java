package SpringDB.Model;


public class SearchModel {
    private String nameClient;
    private String gender;
    private String age;
    private String nameProduct;
    private String codProduct;
    private int quaProduct;
    private double priceProduct;
    private double sumOrder;
    private String dateOrd;

    public SearchModel() {
    }

    public SearchModel(String nameClient, String gender, String age, String nameProduct, String codProduct, int quaProduct, double priceProduct, double sumOrder, String dateOrd) {
        this.nameClient = nameClient;
        this.gender = gender;
        this.age = age;
        this.nameProduct = nameProduct;
        this.codProduct = codProduct;
        this.quaProduct = quaProduct;
        this.priceProduct = priceProduct;
        this.sumOrder = sumOrder;
        this.dateOrd = dateOrd;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCodProduct() {
        return codProduct;
    }

    public void setCodProduct(String codProduct) {
        this.codProduct = codProduct;
    }

    public int getQuaProduct() {
        return quaProduct;
    }

    public void setQuaProduct(int quaProduct) {
        this.quaProduct = quaProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public double getSumOrder() {
        return sumOrder;
    }

    public void setSumOrder(double sumOrder) {
        this.sumOrder = sumOrder;
    }

    public String getDateOrd() {
        return dateOrd;
    }

    public void setDateOrd(String dateOrd) {
        this.dateOrd = dateOrd;
    }
}

