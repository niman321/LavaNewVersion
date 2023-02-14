package Class24;

public abstract class Phone {
   abstract void displayPicture();
   abstract void unlockPhone();
   abstract void sendText();

}
class Iphone extends Phone{

    @Override
    void displayPicture() {
        System.out.println("display pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("unlocking phoning");

    }

    @Override
    void sendText() {
        System.out.println("can send text");

    }
}
class samsung extends Phone{

    @Override
    void displayPicture() {
        System.out.println("samsung display");
    }

    @Override
    void unlockPhone() {
        System.out.println("unlock samsung");

    }

    @Override
    void sendText() {
        System.out.println(" samsung can send text");

    }
}

