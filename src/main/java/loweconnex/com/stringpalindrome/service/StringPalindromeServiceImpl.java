package loweconnex.com.stringpalindrome.service;

import org.springframework.stereotype.Service;

@Service
public class StringPalindromeServiceImpl implements StringPalindomeService {


    @Override
    public boolean checkPalindrome(String inputString) {

        int leftPointer = 0, rightPointer = inputString.length()-1;
        String stringAllLower = inputString.toLowerCase();

        checkInputStringNotNull(inputString);
        characterValidation(inputString);

        while(leftPointer < rightPointer){
            if(stringAllLower.charAt(leftPointer) != stringAllLower.charAt(rightPointer)){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }

    //helper method to validate that the input string is not null
    private void checkInputStringNotNull(String inputString) throws IllegalArgumentException {
        if(inputString == null){
            throw new IllegalArgumentException("Invalid input, input string cannot be null");
        }
    }

    //helper method to validate that the input does not contain any space, punctuation or special character
    private void characterValidation(String inputString) throws IllegalArgumentException {
        for(int i = 0; i< inputString.length(); i++){
            if(!Character.isLetter(inputString.charAt(i)))
                throw new IllegalArgumentException("Invalid input, string cannot contain numbers, spaces or punctuation");
        }
    }
}
