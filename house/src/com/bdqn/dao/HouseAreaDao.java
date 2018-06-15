/**  
 * house_area  
 * @author Doc.zhen
 *  
 */
package com.bdqn.dao;
import java.util.List;
import com.bdqn.entity.HouseArea;
public interface HouseAreaDao{  
	int addHouseArea(HouseArea HouseArea);
	int modifyHouseArea(HouseArea HouseArea);
	int delHouseArea(HouseArea HouseArea);
	List<HouseArea> getHouseAreaList();
	HouseArea getHouseAreaInfo(int id);   
}