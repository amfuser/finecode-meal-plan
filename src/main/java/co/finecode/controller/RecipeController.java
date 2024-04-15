package co.finecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("api")
public class RecipeController {

    @GetMapping("/{id}")
    public String getId(@PathVariable int id) {
        return "Id is " + id;
    }

    @GetMapping("/recipe")
    ModelAndView recipe() {
        return new ModelAndView("recipe");
    }

//    @PostMapping("/recipe")
//    public Response saveRecipe
}
