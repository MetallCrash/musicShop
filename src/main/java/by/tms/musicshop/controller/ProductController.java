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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/electric_guitar/{id}")
    public String electricGuitar(@PathVariable Long id, Model model) {
        ElectricGuitar electricGuitar = (ElectricGuitar) productService.findProductById(id);
        model.addAttribute("electricGuitar", electricGuitar);
        return "/electricGuitar";
    }

    @GetMapping("/acoustic_guitar/{id}")
    public String acousticGuitar(@PathVariable Long id, Model model) {
        AcousticGuitar acousticGuitar = (AcousticGuitar) productService.findProductById(id);
        model.addAttribute("acousticGuitar", acousticGuitar);
        return "/acousticGuitar";
    }

    @GetMapping("/bass_guitar/{id}")
    public String bassGuitar(@PathVariable Long id, Model model) {
        BassGuitar bassGuitar = (BassGuitar) productService.findProductById(id);
        model.addAttribute("bassGuitar", bassGuitar);
        return "/bassGuitar";
    }

    @GetMapping("/drums/{id}")
    public String drums(@PathVariable Long id, Model model) {
        Drums drums = (Drums) productService.findProductById(id);
        model.addAttribute("drums", drums);
        return "/drums";
    }

    @GetMapping("/synthesizer/{id}")
    public String synthesizer(@PathVariable Long id, Model model) {
        Synthesizer synthesizer = (Synthesizer) productService.findProductById(id);
        model.addAttribute("synthesizer", synthesizer);
        return "/synthesizer";
    }

    @GetMapping("/microphone/{id}")
    public String microphone(@PathVariable Long id, Model model) {
        Microphone microphone = (Microphone) productService.findProductById(id);
        model.addAttribute("microphone", microphone);
        return "/microphone";
    }

    @GetMapping("/headphones/{id}")
    public String headphones(@PathVariable Long id, Model model) {
        Headphones headphones = (Headphones) productService.findProductById(id);
        model.addAttribute("headphones", headphones);
        return "/headphones";
    }
}
