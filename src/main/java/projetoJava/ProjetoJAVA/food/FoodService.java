package projetoJava.ProjetoJAVA.food;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<FoodModel> getAll() {
        return foodRepository.findAll();
    }

    public FoodModel save(FoodModel food) {
        return foodRepository.save(food);
    }

    public void delite(long id) {
        foodRepository.deleteById(id);


    }

}