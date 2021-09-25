public class InterfaceTest {
    interface Gift  { void present(); }
    interface Guest { void present(); }

    interface Presentable extends Gift, Guest { }

    public static void main(String[] args) {
        Presentable johnny = new Presentable() {
            @Override public void present() {
                System.out.println("Heeeereee's Johnny!!!");
            }
        };
        johnny.present();                     
        ((Gift) johnny).present();           
        ((Guest) johnny).present();       

        Gift johnnyAsGift = (Gift) johnny;
        johnnyAsGift.present();              

        Guest johnnyAsGuest = (Guest) johnny;
        johnnyAsGuest.present();       
    }
}