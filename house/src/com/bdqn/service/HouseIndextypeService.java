/**  
 * house_indextype  
 * @author Mr.yang
 *  
 */
package com.bdqn.service;

import java.util.List;


import com.bdqn.entity.HouseIndextype;


public interface HouseIndextypeService {
	int addHouseIndextype(HouseIndextype HouseIndextype);
	int modifyHouseIndextype(HouseIndextype HouseIndextype);
	int delHouseIndextype(HouseIndextype HouseIndextype);
	List<HouseIndextype> getHouseIndextypeList();
	HouseIndextype getHouseIndextypeInfo(int id);   
}