package com.ekwe_hub.budgetSystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "budgets")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private BigDecimal totalLimit;
    @Column(nullable = false)
    private LocalDate startDate;
    @Column(nullable = false)
    private LocalDate endDate;
    @Column(nullable = false)
    private Category category;
    private List<Transaction> transactions = new ArrayList<>();


    public Budget(String name, BigDecimal totalLimit,
                  LocalDate startDate, LocalDate endDate, Category category) {
        this.name = name;
        this.totalLimit = totalLimit;
        this.startDate = startDate;
        this.endDate = endDate;
        this.category = category;
    }

}
