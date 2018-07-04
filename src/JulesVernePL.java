import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class JulesVernePL {
    public static void main(String[] args) {
        try {
            ANTLRInputStream input = new ANTLRInputStream(
                    new FileInputStream((new File(
                            "/Users/lado/Documents/MyProgrammingLanguage/example1.JulesVerne"))));

            JulesVerneLexer lexer = new JulesVerneLexer(input);
            JulesVerneParser parser = new JulesVerneParser(new CommonTokenStream(lexer));
            parser.addParseListener(new MyListener());

            // Start parsing
            parser.program();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
