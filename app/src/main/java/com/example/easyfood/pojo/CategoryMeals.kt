package com.example.easyfood.pojo


import com.google.gson.annotations.SerializedName

data class CategoryMeals(
    @SerializedName("idMeal")
    val idMeal: String,
    @SerializedName("strMeal")
    val strMeal: String,
    @SerializedName("strMealThumb")
    val strMealThumb: String
)