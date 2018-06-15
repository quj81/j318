/**  
 * house_picturetype  
 * @author Doc.zhen
 *  
 */
package com.bdqn.dao;
import java.util.List;
import com.bdqn.entity.HousePicturetype;
public interface HousePicturetypeDao{  
	int addHousePicturetype(HousePicturetype HousePicturetype);
	int modifyHousePicturetype(HousePicturetype HousePicturetype);
	int delHousePicturetype(HousePicturetype HousePicturetype);
	List<HousePicturetype> getHousePicturetypeList();
	HousePicturetype getHousePicturetypeInfo(int id);   
}