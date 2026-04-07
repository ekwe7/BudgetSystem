package com.ekwe_hub.budgetSystem.dto.request;

import com.ekwe_hub.budgetSystem.model.Category;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateBudgetRequest {
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    private String name;

    @DecimalMin(value = "0.01", message = "Total limit must be greater than 0")
    private BigDecimal totalLimit;

    private LocalDate startDate;
    private LocalDate endDate;
    private Category category;
}
