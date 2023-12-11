package loweconnex.com.stringpalindrome.service;

public interface SaveToFileService {

    void writeToFile(String filePath, String inputString, boolean isPalindrome) throws Exception;

}
