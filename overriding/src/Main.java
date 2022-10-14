public class Main {
    public static void main(String[] args) {
       BaseCreditManager[] creditManagers = new BaseCreditManager[] {
               new OgretmenCreditManager(),
               new TarimCreditManager(),
               new OgrenciCreditManager(),
       };
       for (BaseCreditManager creditManager : creditManagers ) {

           System.out.println(creditManager.hesapla(1000));
       }
    }
}