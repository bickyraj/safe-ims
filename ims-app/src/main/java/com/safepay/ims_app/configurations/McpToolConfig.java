package com.safepay.ims_app.configurations;

import com.safepay.ims_app.tools.SupplierTools;
import lombok.RequiredArgsConstructor;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class McpToolConfig {
	private final SupplierTools supplierTools;

	@Bean
	ToolCallbackProvider authorTools() {
		return MethodToolCallbackProvider
				.builder()
				.toolObjects(supplierTools)
				.build();
	}
}
