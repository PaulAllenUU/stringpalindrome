package loweconnex.com.stringpalindrome.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class SaveToFileServiceImpl implements SaveToFileService {

    private final StringPalindomeService stringPalindomeService;

    public SaveToFileServiceImpl(StringPalindomeService stringPalindomeService) {
        this.stringPalindomeService = stringPalindomeService;
    }

    @Override
    @Cacheable(cacheNames="inputString", key ="isPalindrome")
    public void writeToFile(String filePath, String inputString, boolean isPalindrome) throws Exception {

        isPalindrome = stringPalindomeService.checkPalindrome(inputString);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(inputString + " : " + isPalindrome);
            System.out.println("Result has been written to the file: " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing string to file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
