package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockCalculation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long stockId;
private String stockName;
private Double price;
private Double amountToPay;
}
