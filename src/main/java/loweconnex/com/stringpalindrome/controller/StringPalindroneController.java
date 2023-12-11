package loweconnex.com.stringpalindrome.controller;

import loweconnex.com.stringpalindrome.model.PalindromeCheck;
import loweconnex.com.stringpalindrome.service.SaveToFileService;
import loweconnex.com.stringpalindrome.service.StringPalindomeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stringpalindromeAPI")
public class StringPalindroneController {

    private final StringPalindomeService stringPalindomeService;

    private final SaveToFileService saveToFileService;

    public StringPalindroneController(StringPalindomeService stringPalindomeService, SaveToFileService saveToFileService) {
        this.stringPalindomeService = stringPalindomeService;
        this.saveToFileService = saveToFileService;
    }

    @PostMapping("/checkInputString")
    public PalindromeCheck checkInputString(@RequestHeader String username, @RequestBody String inputString) throws Exception {

        boolean isPalindrome = stringPalindomeService.checkPalindrome(inputString);
        saveToFileService.writeToFile("OutputFile.txt", inputString, isPalindrome);
        /*can also easily add the call to the database service here once a database is configured in the properties file*/

        if(isPalindrome){
            System.out.println("Input string is a palindrome");
        }
        else{
            System.out.println("Input string is not a palindrome");
        }
        return new PalindromeCheck(inputString, isPalindrome);
    }
}
