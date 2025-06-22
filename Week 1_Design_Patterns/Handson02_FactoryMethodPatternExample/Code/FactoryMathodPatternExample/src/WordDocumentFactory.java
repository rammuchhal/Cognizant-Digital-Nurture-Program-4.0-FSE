public class WordDocumentFactory extends DocumentFactory {

     @Override
    public WordDocument createDocument(){
        System.out.println("Creating Word Document");
        return new WordDocumentClass();
    }
}
