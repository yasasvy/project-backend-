package com.iboarding.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iboarding.demo.model.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Integer>{

}
