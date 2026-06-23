package com.safepay.ims_app.controller;

import com.safepay.ims_supplier.api.SupplierApi;
import com.safepay.ims_supplier.api.dtos.CreateSupplierDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
@RequiredArgsConstructor
@Validated
public class AppController {

	private final SupplierApi supplierApi;

	@GetMapping
	public ResponseEntity<String> home() {
		return ResponseEntity.ok("hello man");
	}

	@PostMapping("/supplier/create")
	public ResponseEntity<Boolean> createSupplier(@Valid @RequestBody CreateSupplierDTO createSupplierDTO) {
		supplierApi.createSupplier(createSupplierDTO);
		return ResponseEntity.ok(true);
	}
}
