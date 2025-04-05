import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProfileController {

    private List<Profile> profiles = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("profiles", profiles);
        return "index";
    }

    @PostMapping("/addProfile")
    public String addProfile(@RequestParam String name,
                             @RequestParam String gender,
                             @RequestParam String favoriteColor,
                             @RequestParam String fontSize) {
        Profile profile = new Profile(name, gender, favoriteColor, fontSize);
        profiles.add(profile);
        return "redirect:/";
    }

    @PostMapping("/deleteProfile")
    public String deleteProfile(@RequestParam int index) {
        profiles.remove(index);
        return "redirect:/";
    }
}
