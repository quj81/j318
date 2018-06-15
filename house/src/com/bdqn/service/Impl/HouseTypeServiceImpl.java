/**  
 * house_type  
 * @author Mr.yang
 *  
 */
package com.bdqn.service.Impl;

import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HouseTypeDao;
import com.bdqn.dao.Impl.HouseTypeDaoImpl;
import com.bdqn.entity.HouseType;


public class HouseTypeServiceImpl extends BaseDao implements HouseTypeDao{
	
	public int addHouseType(HouseType HouseType) {
		// TODO Auto-generated method stub
		HouseTypeDao service=new HouseTypeDaoImpl();
		return service.addHouseType(HouseType);
	}

	@Override
	public int modifyHouseType(HouseType HouseType) {
		// TODO Auto-generated method stub
		HouseTypeDao service=new HouseTypeDaoImpl();
		return service.modifyHouseType(HouseType);
	}

	@Override
	public int delHouseType(HouseType HouseType) {
		// TODO Auto-generated method stub
		HouseTypeDao service=new HouseTypeDaoImpl();
		return service.delHouseType(HouseType);
	}

	@Override
	public List<HouseType> getHouseTypeList() {
		// TODO Auto-generated method stub
		HouseTypeDao service=new HouseTypeDaoImpl();
		return service.getHouseTypeList();
	}

	@Override
	public HouseType getHouseTypeInfo(int id) {
		// TODO Auto-generated method stub
		HouseTypeDao service=new HouseTypeDaoImpl();
		return service.getHouseTypeInfo(id);
	}
}