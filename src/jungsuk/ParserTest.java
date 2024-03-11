package jungsuk;

public class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParseManager.getParger("XML");
        parser.parse("document.xml");
        parser = ParseManager.getParger("HTML");
        parser.parse("document2.html");
    }
}

interface Parseable {
    public abstract void parse(String fileName);
}

class ParseManager {
    // 리턴타입이 Parseable인터페이스다
    public static Parseable getParger(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            Parseable p = new HTMLParser();
            return p;
        }
    }
}

class XMLParser implements Parseable {
    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "- XML");
    }
}

class HTMLParser implements Parseable {
    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "- HTML");
    }
}