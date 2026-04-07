package com.ekwe_hub.budgetSystem.dto.response;

import com.ekwe_hub.budgetSystem.model.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BudgetSummaryResponse {
    private Long id;
    private String name;
    private BigDecimal totalLimit;
    private BigDecimal spentAmount;
    private BigDecimal remainingAmount;
    private Category category;
    private double percentUsed;
}
