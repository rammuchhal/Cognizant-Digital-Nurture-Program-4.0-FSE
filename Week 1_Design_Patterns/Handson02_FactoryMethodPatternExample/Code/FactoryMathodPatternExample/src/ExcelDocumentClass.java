public class ExcelDocumentClass implements ExcelDocument{
    @Override
    public void open(){
        System.out.println("Opening the excel document");
    }

    @Override
    public void print(){
        System.out.println("Printing the excel document");
    }

    @Override
    public void close(){
        System.out.println("Closing the excel document");
    }
}
