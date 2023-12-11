package unit.service;

import loweconnex.com.stringpalindrome.service.SaveToFileServiceImpl;
import loweconnex.com.stringpalindrome.service.StringPalindromeServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SaveToFileServiceUT {

    @Mock
    private StringPalindromeServiceImpl stringPalindromeService;

    @InjectMocks
    private SaveToFileServiceImpl saveToFileService;

    @Test
    public void printToFile_Success() throws Exception {

        String inputString = "civic";
        String filepath = "test.txt";

        when(stringPalindromeService.checkPalindrome(inputString)).thenReturn(true);

        boolean isPalindrome = stringPalindromeService.checkPalindrome(inputString);
        saveToFileService.writeToFile(filepath,
                inputString, isPalindrome);

        String outputFile = Files.readString(Path.of("test.txt"));

        Assertions.assertTrue(outputFile.contains(inputString));
    }
}
