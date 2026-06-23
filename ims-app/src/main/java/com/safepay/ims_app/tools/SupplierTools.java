package com.safepay.ims_app.tools;

import com.safepay.ims_supplier.api.SupplierApi;
import com.safepay.ims_supplier.api.dtos.CreateSupplierDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SupplierTools {

	private final SupplierApi supplierApi;
	private final ModelMapper modelMapper;

	@Tool(
			name = "create_supplier",
			description = "Creates a new supplier in the IMS system"
	)
	public String createSupplier(CreateSupplierDTO createSupplierDTO) {
		supplierApi.createSupplier(createSupplierDTO);
		return """
                Supplier created successfully.
                Supplier ID: %s
                Supplier Name: %s
                """;
	}
}
