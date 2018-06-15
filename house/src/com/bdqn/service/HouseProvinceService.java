/**  
 * house_province  
 * @author Mr.yang
 *  
 */
package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.HouseProvince;


public interface HouseProvinceService {
	int addHouseProvince(HouseProvince HouseProvince);
	int modifyHouseProvince(HouseProvince HouseProvince);
	int delHouseProvince(HouseProvince HouseProvince);
	List<HouseProvince> getHouseProvinceList();
	HouseProvince getHouseProvinceInfo(int id);   
}