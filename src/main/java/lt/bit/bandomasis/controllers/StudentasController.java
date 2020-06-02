package lt.bit.bandomasis.controllers;

import com.sun.xml.bind.util.AttributesImpl;
import lt.bit.bandomasis.entities.Studentas;
import lt.bit.bandomasis.repositories.StudentasRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/studentas")
public class StudentasController {

    @Resource
    StudentasRepository studentasRepository;

    @GetMapping
    public String index(Model model),
    @RequestParam(defaultValue = "10", required = false) int pageSize,
    @RequestParam(defaultValue = "0", required = false) int pageNumber)

    {

        Page<Studentas> studentas = studentasRepository.findAll(PageRequest.of(pageNumber, pageSize));
        AttributesImpl model;
        model.addAttribute("page", studentas);
        return "studentas/index";
    }

    // /studentas/{id}
    @GetMapping(path = "{id}")
    String studentas(@PathVariable int id, Model model) {
        Studentas studentas = studentasRepository.findAllById(id);

        model.addAttribute("id", id);
        if (studentas == null) return "studentas/notFound";

        model.addAttribute("std", studentas);
        return "studentas/get";
    }

}
