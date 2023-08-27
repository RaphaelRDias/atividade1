package com.example.tarefa1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("grupoDescricao", "Raphael Rodrigues Dias, Desenvolvimento Web III, Desenvolvimento de Software Multiplataforma");
        return "home";
    }

    @GetMapping("/rota_um/{var1}/{var2}")
    public String rotaUm(@PathVariable String var1, @PathVariable String var2, Model model) {
        // Processar variáveis e realizar lógica específica para Rota Um
        model.addAttribute("var1", var1);
        model.addAttribute("var2", var2);
        return "rota_um";
    }

    @GetMapping("/rota_dois/{var3}/{var4}")
    public String rotaDois(@PathVariable String var3, @PathVariable String var4, Model model) {
        // Processar variáveis e realizar lógica específica para Rota Dois
        model.addAttribute("var3", var3);
        model.addAttribute("var4", var4);
        return "rota_dois";
    }

    @GetMapping("/rota_tres/{var5}/{var6}")
    public String rotaTres(@PathVariable String var5, @PathVariable String var6, Model model) {
        // Processar variáveis e realizar lógica específica para Rota Três
        model.addAttribute("var5", var5);
        model.addAttribute("var6", var6);
        return "rota_tres";
    }
}
