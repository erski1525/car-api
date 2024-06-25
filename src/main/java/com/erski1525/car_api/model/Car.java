package com.erski1525.car_api.model;

public record Car(
        int id,
        String make,
        String model,
        int prodYearStart,
        int prodYearEnd,
        int price
) {}
