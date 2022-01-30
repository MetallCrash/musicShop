package by.tms.musicshop.controller;

import by.tms.musicshop.entity.product.ProductType;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/product/find")
public class ProductSearchController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String findPage() {
        return "/find";
    }

    @GetMapping("/electric_guitar")
    public String findElectricGuitar() {
        return "/findElectricGuitar";
    }

    @PostMapping("/electric_guitar")
    public String findElectricGuitar(@RequestParam String modelName, Model model) {
        List<ElectricGuitar> electricGuitarList = productService.findProductByModelName(modelName, ProductType.ELECTRIC_GUITAR);
        model.addAttribute("electricGuitarList", electricGuitarList);
        return "/findElectricGuitar";
    }

    @GetMapping("/acoustic_guitar")
    public String findAcousticGuitar() {
        return "/findAcousticGuitar";
    }

    @PostMapping("/acoustic_guitar")
    public String findAcousticGuitar(@RequestParam String modelName, Model model) {
        List<AcousticGuitar> acousticGuitarList = productService.findProductByModelName(modelName, ProductType.ACOUSTIC_GUITAR);
        model.addAttribute("acousticGuitarList", acousticGuitarList);
        return "/findAcousticGuitar";
    }

    @GetMapping("/bass_guitar")
    public String findBassGuitar() {
        return "/findBassGuitar";
    }

    @PostMapping("/bass_guitar")
    public String findBassGuitar(@RequestParam String modelName, Model model) {
        List<BassGuitar> bassGuitarList = productService.findProductByModelName(modelName, ProductType.BASS_GUITAR);
        model.addAttribute("bassGuitarList", bassGuitarList);
        return "/findBassGuitar";
    }

    @GetMapping("/drums")
    public String findDrums() {
        return "/findDrums";
    }

    @PostMapping("/drums")
    public String findDrums(@RequestParam String modelName, Model model) {
        List<Drums> drumsList = productService.findProductByModelName(modelName, ProductType.DRUMS);
        model.addAttribute("drumsList", drumsList);
        return "/findDrums";
    }

    @GetMapping("/synthesizer")
    public String findSynthesizer() {
        return "/findSynthesizer";
    }

    @PostMapping("/synthesizer")
    public String findSynthesizer(@RequestParam String modelName, Model model) {
        List<Synthesizer> synthesizerList = productService.findProductByModelName(modelName, ProductType.SYNTHESIZER);
        model.addAttribute("synthesizerList", synthesizerList);
        return "/findSynthesizer";
    }

    @GetMapping("/microphone")
    public String findMicrophone() {
        return "/findMicrophone";
    }

    @PostMapping("/microphone")
    public String findMicrophone(@RequestParam String modelName, Model model) {
        List<Microphone> microphoneList = productService.findProductByModelName(modelName, ProductType.MICROPHONE);
        model.addAttribute("microphoneList", microphoneList);
        return "/findMicrophone";
    }

    @GetMapping("/headphones")
    public String findHeadphones() {
        return "/findHeadphones";
    }

    @PostMapping("/headphones")
    public String findHeadphones(@RequestParam String modelName, Model model) {
        List<Headphones> headphonesList = productService.findProductByModelName(modelName, ProductType.HEADPHONES);
        model.addAttribute("headphonesList", headphonesList);
        return "/findHeadphones";
    }
}
