package com.sunjray.osdma.SMwarehouseAController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.SMwarehouseAModel.WarhouseaStockOut;
import com.sunjray.osdma.SMwarehouseARepository.WarhouseaStockOutRepository;

@RestController
@RequestMapping("/api")
public class WarhouseaStockOutController {

	@Autowired
	private WarhouseaStockOutRepository warhouseaStockOutRepository;

	@PostMapping("/save-stock-out-items")
	@ResponseStatus(HttpStatus.CREATED)
	public void saveStockOutItems(@Valid @RequestBody List<WarhouseaStockOut> warhouseaStockOut) {
		warhouseaStockOutRepository.saveAll(warhouseaStockOut);
	}

}
