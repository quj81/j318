/**  
 * house_state  
 * @author Mr.yang
 *  
 */
package com.bdqn.service.Impl;

import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HouseStateDao;
import com.bdqn.dao.Impl.HouseStateDaoImpl;
import com.bdqn.entity.HouseState;
import com.bdqn.service.HouseStateService;


public class HouseStateServiceImpl extends BaseDao implements HouseStateService{
	
	public int addHouseState(HouseState HouseState) {
		// TODO Auto-generated method stub
		HouseStateDao service=new HouseStateDaoImpl();
		return service.addHouseState(HouseState);
	}

	@Override
	public int modifyHouseState(HouseState HouseState) {
		// TODO Auto-generated method stub
		HouseStateDao service=new HouseStateDaoImpl();
		return service.modifyHouseState(HouseState);
	}

	@Override
	public int delHouseState(HouseState HouseState) {
		// TODO Auto-generated method stub
		HouseStateDao service=new HouseStateDaoImpl();
		return service.delHouseState(HouseState);
	}

	@Override
	public List<HouseState> getHouseStateList() {
		// TODO Auto-generated method stub
		HouseStateDao service=new HouseStateDaoImpl();
		return service.getHouseStateList();
	}

	@Override
	public HouseState getHouseStateInfo(int id) {
		// TODO Auto-generated method stub
		HouseStateDao service=new HouseStateDaoImpl();
		return service.getHouseStateInfo(id);
	}
}