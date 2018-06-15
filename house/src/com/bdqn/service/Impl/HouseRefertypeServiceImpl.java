/**  
 * house_refertype  
 * @author Mr.yang
 *  
 */
package com.bdqn.service.Impl;

import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HouseRefertypeDao;
import com.bdqn.dao.Impl.HouseRefertypeDaoImpl;
import com.bdqn.entity.HouseRefertype;
import com.bdqn.service.HouseRefertypeService;


public class HouseRefertypeServiceImpl extends BaseDao implements HouseRefertypeService{
	
	public int addHouseRefertype(HouseRefertype HouseRefertype) {
		// TODO Auto-generated method stub
		HouseRefertypeDao service=new HouseRefertypeDaoImpl();
		return service.addHouseRefertype(HouseRefertype);
	}

	@Override
	public int modifyHouseRefertype(HouseRefertype HouseRefertype) {
		// TODO Auto-generated method stub
		HouseRefertypeDao service=new HouseRefertypeDaoImpl();
		return service.modifyHouseRefertype(HouseRefertype);
	}

	@Override
	public int delHouseRefertype(HouseRefertype HouseRefertype) {
		// TODO Auto-generated method stub
		HouseRefertypeDao service=new HouseRefertypeDaoImpl();
		return service.delHouseRefertype(HouseRefertype);
	}

	@Override
	public List<HouseRefertype> getHouseRefertypeList() {
		// TODO Auto-generated method stub
		HouseRefertypeDao service=new HouseRefertypeDaoImpl();
		return service.getHouseRefertypeList();
	}

	@Override
	public HouseRefertype getHouseRefertypeInfo(int id) {
		// TODO Auto-generated method stub
		HouseRefertypeDao service=new HouseRefertypeDaoImpl();
		return service.getHouseRefertypeInfo(id);
	}
}