package org.example.appspring.controller;

import org.example.appspring.model.Message;
import org.example.appspring.service.AppService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    AppService appService;

    public AppController(AppService appService) {
        this.appService = appService;
    }

    @GetMapping("discuter")
    public String discuter(Model model) {
        model.addAttribute("message", new Message()); // 🔹 Ajout de l'objet message
        return "discussion";
    }

    @PostMapping("discuter")
    public String postMessage(@ModelAttribute Message message, Model model) {
        appService.setMessage(message);
        model.addAttribute("data", appService.getQuote());
        return "discussion";
    }

    @GetMapping("messages")
    public String messages(Model model) {
        model.addAttribute("data", appService.getMessages());
        System.out.println(appService.getMessages().get(2).getCreated_at());
        return "messages";
    }


}
