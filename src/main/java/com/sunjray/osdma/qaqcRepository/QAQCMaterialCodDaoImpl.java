package com.sunjray.osdma.qaqcRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.mapper.MasterProductMapper;
import com.sunjray.osdma.mapper.QaqcItemsMapper;
import com.sunjray.osdma.qaqcModel.MasterProduct;
import com.sunjray.osdma.qaqcModel.MaterialCode;
import com.sunjray.osdma.qaqcModel.QaqcItem;
import com.sunjray.osdma.util.QueryConstant;


@Repository("QAQCMaterialCodDao")
public class QAQCMaterialCodDaoImpl implements QAQCMaterialCodDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private JdbcTemplate jt;
	
	/*
	 * @Override public List<QAQCMaterialCod> showMaterial() {
	 * 
	 * return jdbcTemplate.query(QueryConstant.GET_USER, new QAQCExtractor());
	 * 
	 * }
	 */
	
	 @Override public int save(MaterialCode qaqcMaterialCod) { 
		 // TODO Auto-generated method stub 
	 int count=0; 
	 //java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
	  count=jt.update(QueryConstant.Insert_material,qaqcMaterialCod.getMaterial_code_id(),qaqcMaterialCod.getProduct_id(),qaqcMaterialCod.getComponent_id(),qaqcMaterialCod.getItem_id(),qaqcMaterialCod.getSim_provider(),qaqcMaterialCod.getPhone_no(),qaqcMaterialCod.getImei_no());
	  return count;
	  }
	 
	 
	 @Override
		public List<QaqcItem> findAllProduct_Code() {
			return jdbcTemplate.query(QueryConstant.DISPLAY_Product_Code,new QaqcItemsMapper());
		}
	 
	 @Override
		public List<MasterProduct> findAllProduct_Name() {
			return jdbcTemplate.query(QueryConstant.DISPLAY_Product_Name,new MasterProductMapper());
		}
}


