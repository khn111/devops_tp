package com.example.tp_devops;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class WebController {
    @GetMapping("/index")
    public String getIndex(Model model){
        //apres taper l'url "localhost:8080/index", vous devez taper les informations du systeme dans la partie console, avant de recevoir le resultat dans la page web
        SystemeLineaire sysLin = new SystemeLineaire();
        float s1[] = sysLin.getSolutions();
        float s2[] = {s1[1], s1[2], s1[3]};
        String strSolutions = Arrays.toString(s2);
        model.addAttribute("solutions", strSolutions);
        return "index";
    }
}
