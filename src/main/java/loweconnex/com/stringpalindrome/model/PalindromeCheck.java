package loweconnex.com.stringpalindrome.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PalindromeCheck {

    @JsonProperty("inputString")
    private String inputString;

    @JsonProperty("isPalindrome")
    private boolean isPalindrome;

    public PalindromeCheck(String inputString, boolean isPalindrome) {
        this.inputString = inputString;
        this.isPalindrome = isPalindrome;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public boolean isPalindrome() {
        return isPalindrome;
    }

    public void setPalindrome(boolean palindrome) {
        isPalindrome = palindrome;
    }
}
