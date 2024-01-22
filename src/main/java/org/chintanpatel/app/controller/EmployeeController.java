package org.chintanpatel.app.controller;

import jakarta.validation.Valid;
import org.chintanpatel.app.domain.Employee;
import org.chintanpatel.app.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/home")
    public String homePage() {
        return "index";
    }

    @GetMapping("/listEmployee")
    public String listEmployee(Model model) {
        model.addAttribute("employee",new Employee());
        model.addAttribute("employeeList",employeeService.getAllEmployeeList());
        return "employee-form";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@Valid @ModelAttribute("employee")Employee employee, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("employeeList",employeeService.getAllEmployeeList());
            return "employee-form";
        }
        employeeService.addEmployee(employee);
        return "redirect:/employees/listEmployee";
    }

    @GetMapping("/manageEmployee")
    public String manageEmployee(@RequestParam("employeeId")int employeeId, Model model) {
        if (employeeId > 0) {
            model.addAttribute("employee",employeeService.findEmployeeById(employeeId));
            model.addAttribute("employeeList",employeeService.getAllEmployeeList());
        }
        return "employee-form";
    }

    @GetMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("employeeId")int employeeId) {
        employeeService.deleteEmployeeById(employeeId);
        return "redirect:/employees/listEmployee";
    }
}
