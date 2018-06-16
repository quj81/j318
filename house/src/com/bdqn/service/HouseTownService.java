/**  
 * house_town  
 * @author Mr.yang
 *  
 */
package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.HouseTown;


public interface HouseTownService {
	int addHouseTown(HouseTown HouseTown);
	int modifyHouseTown(HouseTown HouseTown);
	int delHouseTown(HouseTown HouseTown);
	List<HouseTown> getHouseTownList();
	List<HouseTown> getHouseTownListId(int id);
	HouseTown getHouseTownInfo(int id);   
}