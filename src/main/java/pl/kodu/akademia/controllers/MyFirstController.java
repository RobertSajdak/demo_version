package pl.kodu.akademia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.kodu.akademia.model.Company;
import pl.kodu.akademia.repository.CompaniesReposytory;

import java.util.List;
import java.util.Random;

@Controller
public class MyFirstController {
    @RequestMapping("/index")
    public String hello() {
        return "index";
    }

    @RequestMapping(value = "/nip", method = RequestMethod.GET)
    //@GetMapping("/nip") - drugi sposób zapisu / wywołania metody
    public String nipForm() {
        return "nip";
    }

    @RequestMapping(value = "/nip", method = RequestMethod.POST)
    public String nipFormSubmit(@RequestParam() String nipParameter, Model model) {
        List<Company> wyszukaneFirmy = CompaniesReposytory.getCompaniesByNip(nipParameter);
        model.addAttribute("mojaListaFirm", wyszukaneFirmy);
        return "result";
    }

    @RequestMapping(value = "/regon", method = RequestMethod.GET)
    //@GetMapping("/nip") - drugi sposób zapisu / wywołania metody
    public String regonForm() {
        return "regon";
    }

    @RequestMapping(value = "/regon", method = RequestMethod.POST)
    public String regonFormSubmit(@RequestParam() String regonParameter) {
        System.out.println(regonParameter);
        return "result";
    }

    @RequestMapping(value = "/newCompany", method = RequestMethod.GET)
    //@GetMapping("/nip") - drugi sposób zapisu / wywołania metody
    public String krsForm() {
        return "krs";
    }

    @RequestMapping(value = "/newCompany", method = RequestMethod.POST)
    public String krsFormSubmit(@RequestParam() String newCompanyName,
                                @RequestParam() String newCompanyKrs,
                                @RequestParam() String newCompanyNip,
                                @RequestParam() String newCompanyRegon) {
        Random random = new Random();
        int id = random.nextInt(8999) + 1000;
        Company newCompany = new Company (id, newCompanyNip, newCompanyRegon, newCompanyKrs, newCompanyName);

        CompaniesReposytory.addNewCompany(newCompany);
        return "result";
    }

    @RequestMapping(value = "/nazwa", method = RequestMethod.GET)
    //@GetMapping("/nip") - drugi sposób zapisu / wywołania metody
    public String nazwaForm() {
        return "nazwa";
    }

    @RequestMapping(value = "/nazwa", method = RequestMethod.POST)
    public String nazwaFormSubmit(@RequestParam() String nazwaParameter, Model model) {
        List<Company>wyszukaneFirmy = CompaniesReposytory.getCompaniesByName(nazwaParameter);
        model.addAttribute("mojaListaFirm", wyszukaneFirmy);
        return "result";
    }
}