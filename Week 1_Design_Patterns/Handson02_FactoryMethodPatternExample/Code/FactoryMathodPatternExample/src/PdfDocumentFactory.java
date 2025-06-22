public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public PdfDocument createDocument(){
        System.out.println("Creating Pdf Document");
        return new PdfDocumentClass();
    }

}
