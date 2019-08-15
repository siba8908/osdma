package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.qaqcModel.Component;
import com.sunjray.osdma.qaqcModel.MaterialCode;
import com.sunjray.osdma.qaqcModel.QaqcItem;



public class ComponentRowMapper implements RowMapper<MaterialCode> {

	@Override
	public MaterialCode mapRow(ResultSet rs, int num) throws SQLException {
		
		MaterialCode mc=null;
		mc=new MaterialCode();
		Component com = new Component();
		mc.setMaterial_code_id(rs.getLong(1));
		mc.setItem_id(rs.getInt(2));
		com.setComponent_name(rs.getString(3));
		mc.setComponent(com);
		QaqcItem qi=new QaqcItem();
		qi.setProduct_code(rs.getString(4));
		mc.setQaqcItem(qi);
		return mc;
	}

}
