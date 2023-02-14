package Class24;

public class PhoneTester {
    public static void main(String[] args) {
        Phone[] phone={new Iphone(),new samsung()};
        for (Phone phones:phone){
            phones.displayPicture();
            phones.unlockPhone();
            phones.sendText();
        }
    }

}
