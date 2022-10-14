public class CustomerManager {
    //encapsulation

    private Customer _customer;
    private ICreditManager _iCreditManager;


    public CustomerManager(Customer  customer, ICreditManager iCreditManager) {
        _customer = customer;
        _iCreditManager = iCreditManager;
    }
    public void Save() {
        System.out.println("Müşteri kaydedildi ");
    }

    public void Delete() {
        System.out.println("Müşteri kaydedildi ");
    }

    public void giveCredit() {
        _iCreditManager.calculate();
        System.out.println("Kredi verildi");
    }

}
