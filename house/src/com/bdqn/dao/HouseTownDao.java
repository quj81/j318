/**  
 * house_town  
 * @author Doc.zhen
 *  
 */
package com.bdqn.dao;
import java.util.List;
import com.bdqn.entity.HouseTown;
public interface HouseTownDao{  
	int addHouseTown(HouseTown HouseTown);
	int modifyHouseTown(HouseTown HouseTown);
	int delHouseTown(HouseTown HouseTown);
	List<HouseTown> getHouseTownList();
	List<HouseTown> getHouseTownListId(int id);
	HouseTown getHouseTownInfo(int id);   
}