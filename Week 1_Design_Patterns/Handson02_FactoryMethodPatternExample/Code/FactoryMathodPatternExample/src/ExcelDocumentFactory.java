public class ExcelDocumentFactory extends DocumentFactory{

     @Override
    public ExcelDocument createDocument(){
        System.out.println("Creating Excel Document");
        return new ExcelDocumentClass();
    }

}
