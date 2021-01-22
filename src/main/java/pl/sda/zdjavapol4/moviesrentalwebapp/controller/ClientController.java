package pl.sda.zdjavapol4.moviesrentalwebapp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.zdjavapol4.moviesrentalwebapp.models.Client;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.ClientService;

@Slf4j
@Controller
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping({"/client"})
    public String getClient(Model model) {
//        model.addAttribute("clients", ClientService.getAll());
        return "clients/index";
    }

    @GetMapping({"/addNewClient"})
    public String newClient(Model model) {
        model.addAttribute("client", new Client());
        return "users/add";
    }

}


