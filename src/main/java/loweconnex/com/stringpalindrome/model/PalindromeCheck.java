package loweconnex.com.stringpalindrome.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class PalindromeCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonProperty("inputString")
    private String inputString;

    @JsonProperty("isPalindrome")
    private boolean isPalindrome;

    public PalindromeCheck() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
