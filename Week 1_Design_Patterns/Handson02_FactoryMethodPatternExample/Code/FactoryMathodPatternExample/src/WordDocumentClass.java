public class WordDocumentClass implements WordDocument{
    @Override
    public void open(){
        System.out.println("Opening the word document");
    }

    @Override
    public void print(){
        System.out.println("Printing the word document");
    }

    @Override
    public void close(){
        System.out.println("Closing the word document");
    }

}
