package app.repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseRepository {
    static String convertInputStreamToString(InputStream inputStream)
    throws IOException {

String newLine = System.getProperty("line.separator");
String result;
try (Stream<String> lines = new BufferedReader(new InputStreamReader(inputStream)).lines()) {
  result = lines.collect(Collectors.joining(newLine));
}

return result;

}
}
