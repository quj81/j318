/**  
 * house_indextype  
 * @author Mr.yang
 *  
 */
package com.bdqn.service.Impl;

import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HouseIndextypeDao;
import com.bdqn.dao.Impl.HouseIndextypeDaoImpl;
import com.bdqn.entity.HouseIndextype;


public class HouseIndextypeServiceImpl extends BaseDao implements HouseIndextypeDao{
	
	public int addHouseIndextype(HouseIndextype HouseIndextype) {
		// TODO Auto-generated method stub
		HouseIndextypeDao service=new HouseIndextypeDaoImpl();
		return service.addHouseIndextype(HouseIndextype);
	}

	@Override
	public int modifyHouseIndextype(HouseIndextype HouseIndextype) {
		// TODO Auto-generated method stub
		HouseIndextypeDao service=new HouseIndextypeDaoImpl();
		return service.modifyHouseIndextype(HouseIndextype);
	}

	@Override
	public int delHouseIndextype(HouseIndextype HouseIndextype) {
		// TODO Auto-generated method stub
		HouseIndextypeDao service=new HouseIndextypeDaoImpl();
		return service.delHouseIndextype(HouseIndextype);
	}

	@Override
	public List<HouseIndextype> getHouseIndextypeList() {
		// TODO Auto-generated method stub
		HouseIndextypeDao service=new HouseIndextypeDaoImpl();
		return service.getHouseIndextypeList();
	}

	@Override
	public HouseIndextype getHouseIndextypeInfo(int id) {
		// TODO Auto-generated method stub
		HouseIndextypeDao service=new HouseIndextypeDaoImpl();
		return service.getHouseIndextypeInfo(id);
	}
}