package loweconnex.com.stringpalindrome.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class PopulateCacheServiceImpl implements PopulateCacheService {

    private final ReadFromFileServiceImpl readFromFileService;

    private final Cache cache;

    @Autowired
    public PopulateCacheServiceImpl(ReadFromFileServiceImpl readFromFileService, CacheManager cacheManager) {
        this.readFromFileService = readFromFileService;
        this.cache = cacheManager.getCache("isPalindrome");
    }

    //populates the cache when the application is started
    @Override
    @PostConstruct
    public void populateCache() {
        try{
            List<String> words = readFromFileService.readFromFile("OutputFile.txt");
            cache.put("OutputFile.txt", words);
            System.out.println("Cache populated with words from the output file");
        } catch (IOException e) {
            System.out.println("Error reading from file " + e.getMessage());
        }
    }
}
