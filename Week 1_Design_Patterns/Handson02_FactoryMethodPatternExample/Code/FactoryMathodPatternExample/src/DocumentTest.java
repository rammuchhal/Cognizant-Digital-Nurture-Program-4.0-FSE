public class DocumentTest {
    public static void main(String[] args) throws Exception {
        System.out.println();
        DocumentFactory excelFactory=new ExcelDocumentFactory();
        ExcelDocument excelDoc=(ExcelDocument)excelFactory.createDocument();

        System.out.println();

        System.out.println("Calling the methods of ExcelDocument that are implemented by ExcelDocumentClass");
        System.out.println();
        excelDoc.open();
        excelDoc.print();
        excelDoc.close();

        System.out.println();
        DocumentFactory wordFactory=new WordDocumentFactory();
        WordDocument wordDoc=(WordDocument) wordFactory.createDocument();

        System.out.println();

        System.out.println("Calling the methods of WordDocument that are implemented by WordDocumentClass");
        System.out.println();
        wordDoc.open();
        wordDoc.print();
        wordDoc.close();
        
        System.out.println();

        DocumentFactory pdfFactory=new PdfDocumentFactory();
        PdfDocument pdfDoc=(PdfDocument) pdfFactory.createDocument();
        System.out.println();

        System.out.println("Calling the methods of PdfDocument that are implemented by PdfDocumentClass");

        System.out.println();

        pdfDoc.open();
        pdfDoc.print();
        pdfDoc.close();

        

        


    }
}
