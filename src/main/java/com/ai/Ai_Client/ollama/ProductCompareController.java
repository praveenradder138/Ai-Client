package com.ai.Ai_Client.ollama;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chatgpt/product")
public class ProductCompareController {



    private final ChatClient chatClient;

    public ProductCompareController(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @GetMapping("/demo/{prompt}")
    public String demo(@PathVariable String prompt){

          return this.chatClient.prompt()
                .user("TELL A JOKE")
                .call()
                .content();
    }
}
