package scanner;

import scanner.token.Token;

public class ScannerFacade {
    private lexicalAnalyzer lexicalAnalyzer;

    public ScannerFacade(java.util.Scanner sc) {
        lexicalAnalyzer = new lexicalAnalyzer(sc);
    }

    public Token getNextToken() {
        return lexicalAnalyzer.getNextToken();
    }
}
