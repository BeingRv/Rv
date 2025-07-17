package com.being.beingRv.controller;


import com.being.beingRv.Model.Trade;
import com.being.beingRv.jpa.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TradeControllerImpl {

    @Autowired
    private TradeRepository tradeRepository;

    @GetMapping("/")
    public String viewTrades(Model model) {
        model.addAttribute("trades", tradeRepository.findAll());
        model.addAttribute("trade", new Trade());
        return "index";
    }

    @PostMapping("/add")
    public String addTrade(@ModelAttribute Trade trade) {
        tradeRepository.save(trade);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTrade(@PathVariable Long id) {
        tradeRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editTrade(@PathVariable Long id, Model model) {
        Trade trade = tradeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid trade Id:" + id));
        model.addAttribute("trade", trade);
        model.addAttribute("trades", tradeRepository.findAll());
        return "index";
    }

    @PostMapping("/update/{id}")
    public String updateTrade(@PathVariable Long id, @ModelAttribute Trade trade) {
        trade.setId(id);
        tradeRepository.save(trade);
        return "redirect:/";
    }
}
