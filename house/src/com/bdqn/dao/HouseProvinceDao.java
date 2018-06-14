/**  
 * house_province  
 * @author Doc.zhen
 *  
 */
package com.bdqn.dao;
import java.util.List;
import com.bdqn.entity.HouseProvince;
public interface HouseProvinceDao{  
	int addHouseProvince(HouseProvince HouseProvince);
	int modifyHouseProvince(HouseProvince HouseProvince);
	int delHouseProvince(HouseProvince HouseProvince);
	List<HouseProvince> getHouseProvinceList();
	HouseProvince getHouseProvinceInfo(int id);   
}