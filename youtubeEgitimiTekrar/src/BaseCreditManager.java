abstract class BaseCreditManager implements ICreditManager{
    @Override
    public abstract void calculate(); //imza olarak bırakıldı ortak operasyon değil

    @Override
    public void Save() {
        System.out.println("Kaydedildi");
    }
}
