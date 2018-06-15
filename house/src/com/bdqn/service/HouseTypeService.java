/**  
 * house_type  
 * @author Mr.yang
 *  
 */
package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.HouseType;


public interface HouseTypeService {
	int addHouseType(HouseType HouseType);
	int modifyHouseType(HouseType HouseType);
	int delHouseType(HouseType HouseType);
	List<HouseType> getHouseTypeList();
	HouseType getHouseTypeInfo(int id);   
}