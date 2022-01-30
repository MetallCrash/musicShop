package by.tms.musicshop.controller;

import by.tms.musicshop.entity.product.equipment.headphones.Headphones;
import by.tms.musicshop.entity.product.equipment.microphone.Microphone;
import by.tms.musicshop.entity.product.instrument.drums.Drums;
import by.tms.musicshop.entity.product.instrument.guitar.AcousticGuitar;
import by.tms.musicshop.entity.product.instrument.guitar.BassGuitar;
import by.tms.musicshop.entity.product.instrument.guitar.ElectricGuitar;
import by.tms.musicshop.entity.product.instrument.piano.Synthesizer;
import by.tms.musicshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product/add")
public class ProductAddController {

    @Autowired
    private ProductService productService;



    @GetMapping
    public String productPage() {
        return "/product";
    }

    @GetMapping("/electric_guitar")
    public String addElectricGuitar(Model model) {
        model.addAttribute("newElectricGuitar", new ElectricGuitar());
        return "/newElectricGuitar";
    }

    @PostMapping("/electric_guitar")
    public String addElectricGuitar(@ModelAttribute("newElectricGuitar") ElectricGuitar electricGuitar) {
        productService.saveProduct(electricGuitar);
        return "/index";
    }

    @GetMapping("/acoustic_guitar")
    public String addAcousticGuitar(Model model) {
        model.addAttribute("newAcousticGuitar", new AcousticGuitar());
        return "/newAcousticGuitar";
    }

    @PostMapping("/acoustic_guitar")
    public String addAcousticGuitar(@ModelAttribute("newAcousticGuitar") AcousticGuitar acousticGuitar) {
        productService.saveProduct(acousticGuitar);
        return "/index";
    }

    @GetMapping("/bass_guitar")
    public String addBassGuitar(Model model) {
        model.addAttribute("newBassGuitar", new BassGuitar());
        return "/newBassGuitar";
    }

    @PostMapping("/bass_guitar")
    public String addBassGuitar(@ModelAttribute("newBassGuitar") BassGuitar bassGuitar) {
        productService.saveProduct(bassGuitar);
        return "/index";
    }

    @GetMapping("/synthesizer")
    public String addSynthesizer(Model model) {
        model.addAttribute("newSynthesizer", new Synthesizer());
        return "/newSynthesizer";
    }

    @PostMapping("/synthesizer")
    public String addSynthesizer(@ModelAttribute("newSynthesizer") Synthesizer synthesizer) {
        productService.saveProduct(synthesizer);
        return "/index";
    }

    @GetMapping("/drums")
    public String addDrums(Model model) {
        model.addAttribute("newDrums", new Drums());
        return "/newDrums";
    }

    @PostMapping("/drums")
    public String addDrums(@ModelAttribute("newDrums") Drums drums) {
        productService.saveProduct(drums);
        return "/index";
    }

    @GetMapping("/headphones")
    public String addHeadphones(Model model) {
        model.addAttribute("newHeadphones", new Headphones());
        return "/newHeadphones";
    }

    @PostMapping("/headphones")
    public String addHeadphones(@ModelAttribute("newHeadphones") Headphones headphones) {
        productService.saveProduct(headphones);
        return "/index";
    }

    @GetMapping("/microphone")
    public String addMicrophone(Model model) {
        model.addAttribute("newMicrophone", new Microphone());
        return "/newMicrophone";
    }

    @PostMapping("/microphone")
    public String addMicrophone(@ModelAttribute("newMicrophone") Microphone microphone) {
        productService.saveProduct(microphone);
        return "/index";
    }
}
