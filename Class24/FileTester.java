package Class24;

public class FileTester {
    public static void main(String[] args) {
        File[]files={new JavaFile(10),new WordFile(25),new PDFFile(50)};

        for (int i = 0; i < files.length; i++) {
            File f=files[i];
            f.edit();
            f.close();


        }
    }
}
