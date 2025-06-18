package factory;

public class DocumentFactory {
    public Document createDocument(String type){
        if (type == null) return null;

        if (type.equalsIgnoreCase("word")) {
            return new WordDocument();
        } else if (type.equalsIgnoreCase("pdf")) {
            return new PdfDocument();
        } else if (type.equalsIgnoreCase("excel")) {
            return new ExcelDocument();
        }

        System.out.println("Unknown document type.");
        return null;
    }
}
