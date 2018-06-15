/**  
 * house_province  
 * @author Mr.yang
 *  
 */
package com.bdqn.service.Impl;

import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HouseProvinceDao;
import com.bdqn.dao.Impl.HouseProvinceDaoImpl;
import com.bdqn.entity.HouseProvince;


public class HouseProvinceServiceImpl extends BaseDao implements HouseProvinceDao{
	
	public int addHouseProvince(HouseProvince HouseProvince) {
		// TODO Auto-generated method stub
		HouseProvinceDao service=new HouseProvinceDaoImpl();
		return service.addHouseProvince(HouseProvince);
	}

	@Override
	public int modifyHouseProvince(HouseProvince HouseProvince) {
		// TODO Auto-generated method stub
		HouseProvinceDao service=new HouseProvinceDaoImpl();
		return service.modifyHouseProvince(HouseProvince);
	}

	@Override
	public int delHouseProvince(HouseProvince HouseProvince) {
		// TODO Auto-generated method stub
		HouseProvinceDao service=new HouseProvinceDaoImpl();
		return service.delHouseProvince(HouseProvince);
	}

	@Override
	public List<HouseProvince> getHouseProvinceList() {
		// TODO Auto-generated method stub
		HouseProvinceDao service=new HouseProvinceDaoImpl();
		return service.getHouseProvinceList();
	}

	@Override
	public HouseProvince getHouseProvinceInfo(int id) {
		// TODO Auto-generated method stub
		HouseProvinceDao service=new HouseProvinceDaoImpl();
		return service.getHouseProvinceInfo(id);
	}
}