package com.safepay.ims_supplier.repositories;

import java.util.Set;
import java.util.stream.Collectors;

import com.safepay.ims_supplier.entity.Supplier;
import com.safepay.ims_supplier.models.SupplierModel;
import com.safepay.ims_supplier.repositories.jpa.JpaSupplierRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PostgreSqlSupplierRepository implements SupplierRepository {

	private final JpaSupplierRepository jpaSupplierRepository;
	private final ModelMapper modelMapper;

	@Override
	public void create(Supplier supplier) {
		SupplierModel supplierModel = modelMapper.map(supplier, SupplierModel.class);
		jpaSupplierRepository.save(supplierModel);
	}

	@Override
	public Set<Supplier> list() {
		return jpaSupplierRepository.findAll()
				.stream()
				.map(supplierModel -> modelMapper.map(supplierModel, Supplier.class))
				.collect(Collectors.toSet());
	}
}
