package com.safepay.ims_supplier.repositories.jpa;

import com.safepay.ims_supplier.models.SupplierModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaSupplierRepository extends JpaRepository<SupplierModel, Long> {
}
