package io.tusted.finance.controllers;

import io.tusted.finance.domain.Bill;
import io.tusted.finance.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class BillController {

    @Autowired
    private BillService billService;

    @RequestMapping("/")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("/bills")
    public String listAll(Model model) {
        model.addAttribute("bills", billService.listBills());
        return "bill/bills";

    }

    @RequestMapping("bill/new")
    public String addBill(Model model) {
        model.addAttribute("bill", new Bill());
        return "bill/billform";
    }

    @RequestMapping(value = "bill", method = RequestMethod.POST)
    public String saveBill(@Valid Bill bill, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()) {
            return "bill/billform";
        }
        billService.saveBill(bill);
        return "redirect:/bills";
    }

    @RequestMapping("bill/edit/{id}")
    public String editBill(@PathVariable Long id, Model model) {
        model.addAttribute("bill", billService.getBillById(id));
        return "bill/billform";
    }

    @RequestMapping("bill/delete/{id}")
    public String deleteBill(@PathVariable Long id) {
        billService.deleteBill(id);
        return "redirect:/bills";
    }

    @RequestMapping("bill/{id}")
    public String showBill(@PathVariable Long id, Model model) {
        model.addAttribute("bill", billService.getBillById(id));
        return "bill/billshow";
    }

}
