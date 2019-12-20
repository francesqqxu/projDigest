package com.chinasofti.projectDigest.dao;

import com.chinasofti.projectDigest.pojo.TPermission;
import com.chinasofti.projectDigest.pojo.TPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPermissionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_permission
	 * @mbg.generated
	 */
	long countByExample(TPermissionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_permission
	 * @mbg.generated
	 */
	int deleteByExample(TPermissionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_permission
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_permission
	 * @mbg.generated
	 */
	int insert(TPermission record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_permission
	 * @mbg.generated
	 */
	int insertSelective(TPermission record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_permission
	 * @mbg.generated
	 */
	List<TPermission> selectByExample(TPermissionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_permission
	 * @mbg.generated
	 */
	TPermission selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_permission
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") TPermission record, @Param("example") TPermissionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_permission
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") TPermission record, @Param("example") TPermissionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_permission
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(TPermission record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_permission
	 * @mbg.generated
	 */
	int updateByPrimaryKey(TPermission record);
}