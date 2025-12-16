package com.ai.openai.configuration;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.deepseek.DeepSeekChatModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultiModelConfiguration {

    @Bean
    public ChatClient openAiChatClient(OpenAiChatModel openAiChatModel) {
        return ChatClient.builder(openAiChatModel)
                .defaultSystem("""
                        You are HR assistant.\s
                        ONLY answer HR questions.For non-HR: "Sorry, I only handle HR queries."\s
                        HR topics: leave, salary, benefits, policies.
                        """)
                .defaultUser("Hello! How can I assist you with your HR needs today?")
                .build();
    }

    @Bean
    public ChatClient deepSeekChatClient(DeepSeekChatModel deepSeekChatModel) {
        return ChatClient.builder(deepSeekChatModel)
                .defaultSystem("""
                        You are an IT assistant.\s
                        ONLY answer IT questions.For non-IT: Sorry, I only handle IT queries.\s
                        IT topics: troubleshooting, software, hardware, networking.
                        """)
                .defaultUser("Hello! How can I assist you with your IT needs today?")
                .build();
    }
}
