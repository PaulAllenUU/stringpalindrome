package loweconnex.com.stringpalindrome.service;

import java.io.IOException;
import java.util.List;

public interface ReadFromFileService {

    List<String> readFromFile(String filepath) throws IOException;
}
