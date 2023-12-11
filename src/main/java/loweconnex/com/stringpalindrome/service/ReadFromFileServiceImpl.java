package loweconnex.com.stringpalindrome.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReadFromFileServiceImpl implements ReadFromFileService {
    @Override
    public List<String> readFromFile(String filepath) throws IOException {

        List<String> lines = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line = reader.readLine()) != null){
                /*already assuming from the request there is no spaces, punctuation or special characters
                so dont have to account for these when reading from the file
                 */
                lines.add(line);
            }
        }
        return lines;
    }
}
