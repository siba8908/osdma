package com.sunjray.osdma.SMserviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunjray.osdma.SMdao.DistrictWarehouseDao;
import com.sunjray.osdma.SMservice.DistrictWarehouseService;

@Service
public class DistrictWarehouseServiceImpl implements DistrictWarehouseService {
	
	@Resource
	DistrictWarehouseDao districtWarehouseDao;

}
