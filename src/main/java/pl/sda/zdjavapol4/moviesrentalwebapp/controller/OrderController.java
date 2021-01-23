package pl.sda.zdjavapol4.moviesrentalwebapp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.DefaultOrderService;

import java.util.Collections;

@Slf4j
@Controller
@RequiredArgsConstructor
public class OrderController {
    private final DefaultOrderService orderService;

    @GetMapping({"/order"})
    public String getOrder(Model model){
        model.addAllAttributes(Collections.singleton("Order"));
        return "order";
    }
}
