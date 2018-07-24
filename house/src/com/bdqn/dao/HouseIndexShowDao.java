/**  
 * house_index_show  
 * @author Doc.zhen
 *  
 */
package com.bdqn.dao;
import java.util.List;
import com.bdqn.entity.HouseIndexShow;
import com.bdqn.entity.HouseMessage;
public interface HouseIndexShowDao{  
	int addHouseIndexShow(HouseIndexShow HouseIndexShow);
	int modifyHouseIndexShow(HouseIndexShow HouseIndexShow);
	int delHouseIndexShow(HouseIndexShow HouseIndexShow);
	List<HouseIndexShow> getHouseIndexShowList();
	HouseIndexShow getHouseIndexShowInfo(int id);  
	int deletehouseIndexShow(int indextype,int showtype);
}