package projetoJava.ProjetoJAVA.food;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<FoodModel> getAll() {
        return foodService.getAll();
    }

    @PostMapping
    public FoodModel create(@RequestBody FoodModel foodModel) {
        return foodService.save(foodModel);
    }
}