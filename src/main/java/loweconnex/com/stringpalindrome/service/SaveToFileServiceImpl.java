package loweconnex.com.stringpalindrome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

@Service
public class SaveToFileServiceImpl implements SaveToFileService {

    //will check the cache for key : value pairs before performing this operation, improving performance
    @Override
    @Cacheable(cacheNames="isPalindrome", key ="'inputString'")
    public void writeToFile(String filePath, String inputString, boolean isPalindrome) throws Exception {

        try(BufferedWriter writer = Files.newBufferedWriter(Path.of(filePath), StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            writer.write(inputString + " : " + isPalindrome + System.lineSeparator());
            System.out.println("Result has been written to the file: " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing string to file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
