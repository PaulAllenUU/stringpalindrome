//Class for easy connection to database - commented out temporarily because IntelliJ Community edition cannot connect to DB

//package loweconnex.com.stringpalindrome.service;
//
//import loweconnex.com.stringpalindrome.model.PalindromeCheck;
//import loweconnex.com.stringpalindrome.repository.StringPalindromeRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class SaveToDBServiceImpl implements SaveToDBService {
//
//    private final StringPalindomeService stringPalindomeService;
//
//    private final StringPalindromeRepo stringPalindromeRepo;
//
//    @Autowired
//    public SaveToDBServiceImpl(StringPalindomeService stringPalindomeService, StringPalindromeRepo stringPalindromeRepo) {
//        this.stringPalindomeService = stringPalindomeService;
//        this.stringPalindromeRepo = stringPalindromeRepo;
//    }
//
//    @Override
//    public PalindromeCheck saveToDB(String inputString) throws Exception {
//        boolean isPalindrome = stringPalindomeService.checkPalindrome(inputString);
//
//        PalindromeCheck palindromeCheck = new PalindromeCheck(inputString, isPalindrome);
//        stringPalindromeRepo.save(palindromeCheck);
//
//        return new PalindromeCheck(inputString, isPalindrome);
//
//    }
//}
