package pl.sda.zdjavapol4.moviesrentalwebapp.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.CopyService;


@Slf4j
@RequestMapping("/copy")
@RequiredArgsConstructor
@Controller
public class CopyController {
private CopyService copyService;



}
