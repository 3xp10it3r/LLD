package LLD.Solid.Example3.BetterCode;

public class Main {
    
    public static void main(String[] args) {
        FileProcessor fp = new FileProcessor("sample.txt");

        TextProcessor textProcessor = new TextProcessor(fp);

        textProcessor.convertText();
    }
}
