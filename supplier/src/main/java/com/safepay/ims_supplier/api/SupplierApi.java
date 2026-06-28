package com.safepay.ims_supplier.api;

import com.safepay.ims_supplier.api.dtos.CreateSupplierDTO;
import com.safepay.ims_supplier.entity.Supplier;
import com.safepay.ims_supplier.services.SupplierService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@RequiredArgsConstructor
@Validated
@Component
public class SupplierApi {

	private final SupplierService supplierService;
	private final ModelMapper modelMapper;

	public void createSupplier(@Valid CreateSupplierDTO createSupplierDTO) {
		Supplier supplier = modelMapper.map(createSupplierDTO, Supplier.class);
		supplierService.createSupplier(supplier);
	}

	public void deleteSupplier(Long id) {
		supplierService.deleteSupplierById(id);
	}
}
