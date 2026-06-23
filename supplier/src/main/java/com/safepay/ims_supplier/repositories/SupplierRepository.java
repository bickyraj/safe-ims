package com.safepay.ims_supplier.repositories;

import java.util.Set;

import com.safepay.ims_supplier.entity.Supplier;

public interface SupplierRepository {
	void create(Supplier supplier);
	Set<Supplier> list();
}
