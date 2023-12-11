package loweconnex.com.stringpalindrome.service;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;

public interface PopulateCacheService {

    void populateCache();
}
