package unit.service;

import loweconnex.com.stringpalindrome.service.StringPalindromeServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class StringPalindromeServiceUT {

    @InjectMocks
    private StringPalindromeServiceImpl stringPalindomeService;

    @Test
    public void checkPalindrome_True() throws Exception {

        String palindrome = "civic";

        boolean isPalindrome = stringPalindomeService.checkPalindrome(palindrome);

        Assertions.assertTrue(isPalindrome);
    }

    @Test
    public void checkPalindrome_False() throws Exception {

        String notPalindrome = "test";

        boolean isPalindrome = stringPalindomeService.checkPalindrome(notPalindrome);

        Assertions.assertFalse(isPalindrome);
    }

    @Test
    public void checkPalindrome_ThrowsException() {

        String invalidString = "1test 1";

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> stringPalindomeService.checkPalindrome(invalidString));

        String expectedMessage = "Invalid input, string cannot contain numbers, spaces or punctuation";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }
}
