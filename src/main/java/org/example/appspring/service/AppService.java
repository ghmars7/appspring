package org.example.appspring.service;

import org.example.appspring.model.Message;
import org.example.appspring.model.Quote;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class AppService {

    private final RestTemplate restTemplate = new RestTemplate();


    public Quote getQuote() {
        return restTemplate.getForObject("http://localhost:8090/getQuote", Quote.class);
    }

    public List<Message> getMessages() {
        Message[] messages = restTemplate.getForObject("http://localhost:8090/getAllMessages", Message[].class);
        return Arrays.asList(messages);
    }


    public void setMessage(Message message) {
        restTemplate.postForObject("http://localhost:8090/setMessage", message, Message.class);
    }

    public List<Message> findByUsername(String username) {
        Message[] messages = restTemplate.getForObject("http://localhost:8090/findByUsername /{username}",Message[].class, username);
        return Arrays.asList(messages);
    }

}
