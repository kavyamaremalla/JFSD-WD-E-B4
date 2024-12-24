package com.example.thymeleaf.controller;

import com.example.thymeleaf.dto.EmployeeDto;
import com.example.thymeleaf.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
//@AllArgsConstructor
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("allemplist", employeeService.getAllEmployees());
        return "index";
    }

    @GetMapping("/addnew")
    public String addNewEmployee(Model model){
        EmployeeDto employee = new EmployeeDto();
        model.addAttribute("employee", employee);
        return "newemployee";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") EmployeeDto employeeDto){
        employeeService.save(employeeDto);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") Long id, Model model){
        EmployeeDto employee = employeeService.getById(id);
        model.addAttribute("employee", employee);
        return "update";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteById(@PathVariable(value = "id") Long id, Model model){
        employeeService.deleteById(id);
        return "redirect:/";
    }

}
