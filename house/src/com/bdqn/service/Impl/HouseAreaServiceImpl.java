/**  
 * house_area  
 * @author Mr.yang
 *  
 */
package com.bdqn.service.Impl;

import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HouseAreaDao;
import com.bdqn.dao.Impl.HouseAreaDaoImpl;
import com.bdqn.entity.HouseArea;


public class HouseAreaServiceImpl extends BaseDao implements HouseAreaDao{
	
	public int addHouseArea(HouseArea HouseArea) {
		// TODO Auto-generated method stub
		HouseAreaDao service=new HouseAreaDaoImpl();
		return service.addHouseArea(HouseArea);
	}

	@Override
	public int modifyHouseArea(HouseArea HouseArea) {
		// TODO Auto-generated method stub
		HouseAreaDao service=new HouseAreaDaoImpl();
		return service.modifyHouseArea(HouseArea);
	}

	@Override
	public int delHouseArea(HouseArea HouseArea) {
		// TODO Auto-generated method stub
		HouseAreaDao service=new HouseAreaDaoImpl();
		return service.delHouseArea(HouseArea);
	}

	@Override
	public List<HouseArea> getHouseAreaList() {
		// TODO Auto-generated method stub
		HouseAreaDao service=new HouseAreaDaoImpl();
		return service.getHouseAreaList();
	}

	@Override
	public HouseArea getHouseAreaInfo(int id) {
		// TODO Auto-generated method stub
		HouseAreaDao service=new HouseAreaDaoImpl();
		return service.getHouseAreaInfo(id);
	}
}