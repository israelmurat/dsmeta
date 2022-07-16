package com.devsuperior.dsmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;

	@GetMapping	// GET - Um dos Verbos HTTP
	// Page e Pageable, retorna os resultados paginados em 20
	public Page<Sale> findSales(Pageable pageable, 
			@RequestParam(value = "minDate", defaultValue = "") String minDate, // Se valor na requisicao veio vazio, informa vazio
			@RequestParam(value = "maxDate", defaultValue = "")String maxDate) {
		return service.findSales(pageable, minDate, maxDate);
	}
	
}
