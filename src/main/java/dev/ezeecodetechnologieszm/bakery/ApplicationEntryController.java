package dev.ezeecodetechnologieszm.bakery;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationEntryController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Kaunda's Bakery!";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "Greetings";
    }
}
