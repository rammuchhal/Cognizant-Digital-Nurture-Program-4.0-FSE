public class PdfDocumentClass implements  PdfDocument{
    @Override
    public void open(){
        System.out.println("Opening the Pdf document");
    }

    @Override
    public void print(){
        System.out.println("Printing the Pdf document");
    }

    @Override
    public void close(){
        System.out.println("Closing the Pdf document");
    }
}
