package com.safepay.ims_supplier.api.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class CreateSupplierDTO {

	@NotBlank(message = "Name is required")
	@Size(max = 100)
	String name;

	@NotBlank(message = "Address is required")
	String address;

	@NotBlank(message = "Email is required")
	@Email(message = "Valid email required")
	String email;

	String phone;
}
