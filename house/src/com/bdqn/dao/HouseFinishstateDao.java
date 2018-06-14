/**  
 * house_finishstate  
 * @author Doc.zhen
 *  
 */
package com.bdqn.dao;
import java.util.List;
import com.bdqn.entity.HouseFinishstate;
public interface HouseFinishstateDao{  
	int addHouseFinishstate(HouseFinishstate HouseFinishstate);
	int modifyHouseFinishstate(HouseFinishstate HouseFinishstate);
	int delHouseFinishstate(HouseFinishstate HouseFinishstate);
	List<HouseFinishstate> getHouseFinishstateList();
	HouseFinishstate getHouseFinishstateInfo(int id);   
}