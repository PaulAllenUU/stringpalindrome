package loweconnex.com.stringpalindrome.repository;

import loweconnex.com.stringpalindrome.model.PalindromeCheck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StringPalindromeRepo extends CrudRepository<PalindromeCheck, String> {

}