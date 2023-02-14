package Class24;

public abstract class File {
    int size;
    File(int size){
        this.size=size;

    }
   // public abstract void open();
     void edit(){
         System.out.println("edit");
     }
     void close(){
         System.out.println("closing the");
     }
}
class JavaFile extends File{
    JavaFile(int size) {
        super(size);
    }

    void open(){
        System.out.println("opening the file");
    }
}
class WordFile extends File{
    WordFile(int size) {
        super(size);
    }

    void open(){
        System.out.println(" open the file word");
    }
}
class PDFFile extends File{
        PDFFile(int size){
            super(size);

        }

}
