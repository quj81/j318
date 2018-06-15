/**  
 * house_finishstate  
 * @author Mr.yang
 *  
 */
package com.bdqn.service.Impl;

import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HouseFinishstateDao;
import com.bdqn.dao.Impl.HouseFinishstateDaoImpl;
import com.bdqn.entity.HouseFinishstate;


public class HouseFinishstateServiceImpl extends BaseDao implements HouseFinishstateDao{
	
	public int addHouseFinishstate(HouseFinishstate HouseFinishstate) {
		// TODO Auto-generated method stub
		HouseFinishstateDao service=new HouseFinishstateDaoImpl();
		return service.addHouseFinishstate(HouseFinishstate);
	}

	@Override
	public int modifyHouseFinishstate(HouseFinishstate HouseFinishstate) {
		// TODO Auto-generated method stub
		HouseFinishstateDao service=new HouseFinishstateDaoImpl();
		return service.modifyHouseFinishstate(HouseFinishstate);
	}

	@Override
	public int delHouseFinishstate(HouseFinishstate HouseFinishstate) {
		// TODO Auto-generated method stub
		HouseFinishstateDao service=new HouseFinishstateDaoImpl();
		return service.delHouseFinishstate(HouseFinishstate);
	}

	@Override
	public List<HouseFinishstate> getHouseFinishstateList() {
		// TODO Auto-generated method stub
		HouseFinishstateDao service=new HouseFinishstateDaoImpl();
		return service.getHouseFinishstateList();
	}

	@Override
	public HouseFinishstate getHouseFinishstateInfo(int id) {
		// TODO Auto-generated method stub
		HouseFinishstateDao service=new HouseFinishstateDaoImpl();
		return service.getHouseFinishstateInfo(id);
	}
}