package Day9_2;

interface Parseable{
	public abstract void parse(String fileName);
}

public class ParserManager {
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		}else {
			Parseable p = new HTMLParser();
			return p;
			//return new HTMLParser
		}
	}
}

class XMLParser implements Parseable {
	public void parse ( String fileName) {
		System.out.println(fileName + "- XML parsing completed.");
	}
}

class HTMLParser implements Parseable {
	public void parse ( String fileName) {
		System.out.println(fileName + "- HTML parsing completed.");
	}
}