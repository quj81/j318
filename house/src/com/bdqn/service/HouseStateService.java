/**  
 * house_state  
 * @author Mr.yang
 *  
 */
package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.HouseState;


public interface HouseStateService {
	int addHouseState(HouseState HouseState);
	int modifyHouseState(HouseState HouseState);
	int delHouseState(HouseState HouseState);
	List<HouseState> getHouseStateList();
	HouseState getHouseStateInfo(int id);   
}