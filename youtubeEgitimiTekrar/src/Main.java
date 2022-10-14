public class Main {
    public static void main(String[] args) {
//        CreditManager creditManager = new CreditManager();
//        creditManager.Calculate();
//        creditManager.Save();
//
//        Customer customer = new Customer(); //bu olaya instance creation
//        customer.setId(1);
//        customer.setCity("İstanbul");
//
//        CustomerManager customerManager = new CustomerManager(customer);
//        customerManager.Save();
//        customerManager.Delete();
//
//        Company company = new Company();
//        company.setTaxNumber("100000");
//        company.setCompanyName("Beko");
//        company.setId(100);
//
//        CustomerManager customerManager2 = new CustomerManager(new Person());
//
//        Person person = new Person();
//        person.setFirstName("Gorkem");
//        person.setLastName("Alyagut");
//        person.setNationalIdentity("1234567");
        //IoC Container yapı, dependence injection
        CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
        customerManager.giveCredit();

    }
}