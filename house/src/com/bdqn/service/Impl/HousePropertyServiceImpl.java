/**  
 * house_property  
 * @author Mr.yang
 *  
 */
package com.bdqn.service.Impl;

import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HousePropertyDao;
import com.bdqn.dao.Impl.HousePropertyDaoImpl;
import com.bdqn.entity.HouseProperty;
import com.bdqn.service.HousePropertyService;


public class HousePropertyServiceImpl extends BaseDao implements HousePropertyService{
	
	public int addHouseProperty(HouseProperty HouseProperty) {
		// TODO Auto-generated method stub
		HousePropertyDao service=new HousePropertyDaoImpl();
		return service.addHouseProperty(HouseProperty);
	}

	@Override
	public int modifyHouseProperty(HouseProperty HouseProperty) {
		// TODO Auto-generated method stub
		HousePropertyDao service=new HousePropertyDaoImpl();
		return service.modifyHouseProperty(HouseProperty);
	}

	@Override
	public int delHouseProperty(HouseProperty HouseProperty) {
		// TODO Auto-generated method stub
		HousePropertyDao service=new HousePropertyDaoImpl();
		return service.delHouseProperty(HouseProperty);
	}

	@Override
	public List<HouseProperty> getHousePropertyList() {
		// TODO Auto-generated method stub
		HousePropertyDao service=new HousePropertyDaoImpl();
		return service.getHousePropertyList();
	}

	@Override
	public HouseProperty getHousePropertyInfo(int id) {
		// TODO Auto-generated method stub
		HousePropertyDao service=new HousePropertyDaoImpl();
		return service.getHousePropertyInfo(id);
	}
}