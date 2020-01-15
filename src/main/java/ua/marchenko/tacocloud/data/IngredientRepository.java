package ua.marchenko.tacocloud.data;

import ua.marchenko.tacocloud.model.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);
}
