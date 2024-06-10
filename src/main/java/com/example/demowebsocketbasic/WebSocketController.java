package com.example.demowebsocketbasic;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebSocketController {

    @RequestMapping("/websocket")
    public String getWebSocket(HttpServletRequest request, Model model) {
        model.addAttribute("serverName", request.getServerName());
        model.addAttribute("serverPort", request.getServerPort());

        return "ws-broadcast";
    }
}
