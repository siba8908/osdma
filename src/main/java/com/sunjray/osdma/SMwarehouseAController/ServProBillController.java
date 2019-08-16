package com.sunjray.osdma.SMwarehouseAController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.SMwarehouseAModel.ServProBill;
import com.sunjray.osdma.SMwarehouseAService.ServProBillService;

@RestController
@RequestMapping("/api")
public class ServProBillController {

	@Autowired
	private ServProBillService servProBillService;

	@PostMapping("/save-service-provider-bill")
	@ResponseStatus(HttpStatus.CREATED)
	public void saveServiceProviderBill(@Valid @RequestBody ServProBill servProBill) {
		servProBillService.save(servProBill);
	}

}
