package loweconnex.com.stringpalindrome.controller;

import loweconnex.com.stringpalindrome.model.PalindromeCheck;
import loweconnex.com.stringpalindrome.service.SaveToDBService;
import loweconnex.com.stringpalindrome.service.SaveToFileService;
import loweconnex.com.stringpalindrome.service.StringPalindomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/stringpalindromeAPI")
public class StringPalindroneController {

    private final StringPalindomeService stringPalindomeService;

    private final SaveToFileService saveToFileService;

    private static final int ERROR_CODE = 100;

    public StringPalindroneController(StringPalindomeService stringPalindomeService, SaveToFileService saveToFileService) {
        this.stringPalindomeService = stringPalindomeService;
        this.saveToFileService = saveToFileService;
    }

    @PostMapping("/checkInputString")
    public PalindromeCheck checkInputString(@RequestHeader("myUsername") @RequestBody String inputString) throws Exception {

        boolean isPalindrome = stringPalindomeService.checkPalindrome(inputString);
        saveToFileService.writeToFile("C:\\Users\\paula\\Desktop\\stringpalindrome\\src\\main\\resources", inputString, isPalindrome);

        if(isPalindrome){
            System.out.println("Input string is a palindrome");
        }
        else{
            System.out.println("Input string is not a palindrome");
        }
        return new PalindromeCheck(inputString, isPalindrome);
    }
}
