package com.chinasofti.projectDigest.pojo;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_role
 */
public class TRole {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_role.id
	 * @mbg.generated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_role.name
	 * @mbg.generated
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_role.type
	 * @mbg.generated
	 */
	private String type;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_role.id
	 * @return  the value of t_role.id
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_role.id
	 * @param id  the value for t_role.id
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_role.name
	 * @return  the value of t_role.name
	 * @mbg.generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_role.name
	 * @param name  the value for t_role.name
	 * @mbg.generated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_role.type
	 * @return  the value of t_role.type
	 * @mbg.generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_role.type
	 * @param type  the value for t_role.type
	 * @mbg.generated
	 */
	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}
}