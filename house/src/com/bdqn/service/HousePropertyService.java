/**  
 * house_property  
 * @author Mr.yang
 *  
 */
package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.HouseProperty;


public interface HousePropertyService {
	int addHouseProperty(HouseProperty HouseProperty);
	int modifyHouseProperty(HouseProperty HouseProperty);
	int delHouseProperty(HouseProperty HouseProperty);
	List<HouseProperty> getHousePropertyList();
	HouseProperty getHousePropertyInfo(int id);   
}