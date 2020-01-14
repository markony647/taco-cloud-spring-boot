package ua.marchenko.tacocloud.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
public class Taco {
    private String name;
    private List<String> ingredients;
}
