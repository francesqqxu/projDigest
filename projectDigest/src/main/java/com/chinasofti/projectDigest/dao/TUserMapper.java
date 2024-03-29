package com.chinasofti.projectDigest.dao;

import com.chinasofti.projectDigest.pojo.TUser;
import com.chinasofti.projectDigest.pojo.TUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TUserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user
	 * @mbg.generated
	 */
	long countByExample(TUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user
	 * @mbg.generated
	 */
	int deleteByExample(TUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user
	 * @mbg.generated
	 */
	int insert(TUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user
	 * @mbg.generated
	 */
	int insertSelective(TUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user
	 * @mbg.generated
	 */
	List<TUser> selectByExample(TUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user
	 * @mbg.generated
	 */
	TUser selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(TUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_user
	 * @mbg.generated
	 */
	int updateByPrimaryKey(TUser record);
}