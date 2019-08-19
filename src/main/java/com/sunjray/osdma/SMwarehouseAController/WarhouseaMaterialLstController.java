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

import com.sunjray.osdma.SMwarehouseAModel.WarhouseaMaterialLst;
import com.sunjray.osdma.SMwarehouseARepository.WarhouseaMaterialLstRepository;

@RestController
@RequestMapping("/api")
public class WarhouseaMaterialLstController {
	@Autowired
	private WarhouseaMaterialLstRepository warhouseaMaterialLstRepository;

	@PostMapping("/save-warehouse-a-material-list")
	@ResponseStatus(HttpStatus.CREATED)
	public void saveWarehouseAMateriallist(@Valid @RequestBody List<WarhouseaMaterialLst> warhouseaMaterialLst) {
		warhouseaMaterialLstRepository.saveAll(warhouseaMaterialLst);
	}
}
