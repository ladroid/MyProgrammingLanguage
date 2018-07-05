import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Scanner;

public class JulesVernePL {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter path to you file");
        String path;
        Scanner in = new Scanner(System.in);
        path = in.nextLine();

        File file = new File(path);

        String code = readFile(file, Charset.forName("UTF-8"));

        ANTLRInputStream input = new ANTLRInputStream(code);

        JulesVerneLexer lexer = new JulesVerneLexer(input);
        JulesVerneParser parser = new JulesVerneParser(new CommonTokenStream(lexer));
        parser.addParseListener(new MyListener());

        // Start parsing
        parser.program();
    }
    private static String readFile(File file, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, encoding);
    }
}
