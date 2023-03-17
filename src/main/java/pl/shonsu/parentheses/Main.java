package pl.shonsu.parentheses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class Main {

    static String PATH = System.getProperty("user.dir") + "/src/main/java/pl/shonsu/parentheses/";

    public static void main(String[] args) throws IOException {
        Path file = Path.of(PATH + "filesToTest.txt");
        List<String> filesToValidate = readFile(file);
        for (String s : filesToValidate) {
            String stringToTest = Files.readString(Path.of(PATH + s));
            System.out.println(stringToTest +
                    " is parentheses validated " +
                    Parentheses.validParentheses(stringToTest));
        }
    }

    static List<String> readFile(Path failePath) throws IOException {
        return Files.readAllLines(failePath);
    }
}
