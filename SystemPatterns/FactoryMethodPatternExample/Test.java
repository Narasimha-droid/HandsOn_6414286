package factory;

public class Test {
    public static void main(String[] args){
        DocumentFactory obj = new DocumentFactory();

        Document d1 = obj.createDocument("pdf");
        Document d2 = obj.createDocument("pdf");
        Document d3 = obj.createDocument("excel");
        Document d4 = obj.createDocument("ppt");

        if (d1 != null) d1.open();
        if (d2 != null) d2.open();
        if (d3 != null) d3.open();
        if (d4 != null) d4.open();
    }
}
