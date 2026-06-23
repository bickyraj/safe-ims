package com.safepay.ims_supplier.services;

import com.safepay.ims_supplier.entity.Supplier;
import com.safepay.ims_supplier.repositories.SupplierRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupplierService {
	private final SupplierRepository supplierRepository;

	public boolean createSupplier(Supplier supplier) {
		supplierRepository.create(supplier);
		return true;
	}
}
