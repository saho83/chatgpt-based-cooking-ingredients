package com.example.chatgptbasedcookingingredients;

import java.util.List;

public record Recipe(
        String title,
        String description,
        List<String> ingredients,
        String instructions


) {
}
