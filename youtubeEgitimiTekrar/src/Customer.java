public class Customer {

    //new lendiği anda constructor bloğu devreye girecektir.
    public Customer() {
        System.out.println("Müşteri nesnesi başlatıldı");
    }
    private int Id;

    private String city;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
