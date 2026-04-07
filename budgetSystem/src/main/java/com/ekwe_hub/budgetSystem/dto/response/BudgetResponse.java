package com.ekwe_hub.budgetSystem.dto.response;

import com.ekwe_hub.budgetSystem.model.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BudgetResponse {
    private Long id;
    private String name;
    private BigDecimal totalLimit;
    private BigDecimal spentAmount;
    private BigDecimal remainingAmount;
    private LocalDate startDate;
    private LocalDate endDate;
    private Category category;
    private List<TransactionResponse> transactions;
}
