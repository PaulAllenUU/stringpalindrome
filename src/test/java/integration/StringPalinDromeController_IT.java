package integration;

import loweconnex.com.stringpalindrome.StringpalindromeApplication;
import loweconnex.com.stringpalindrome.controller.StringPalindroneController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest(classes = StringpalindromeApplication.class)
@AutoConfigureMockMvc
public class StringPalinDromeController_IT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testStringPalindromeRequest() throws Exception {
        String header = "user123";
        String requestbody = "civic";

        mockMvc.perform(MockMvcRequestBuilders.post("/stringpalindromeAPI/checkInputString")
                .header("username", header)
                .content(requestbody)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }
}
