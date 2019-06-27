package com.chinasofti.projectDigest.pojo;

import java.util.ArrayList;
import java.util.List;

public class TApplicationExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_application
	 * @mbg.generated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_application
	 * @mbg.generated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_application
	 * @mbg.generated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_application
	 * @mbg.generated
	 */
	public TApplicationExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_application
	 * @mbg.generated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_application
	 * @mbg.generated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_application
	 * @mbg.generated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_application
	 * @mbg.generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_application
	 * @mbg.generated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_application
	 * @mbg.generated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_application
	 * @mbg.generated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_application
	 * @mbg.generated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_application
	 * @mbg.generated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_application
	 * @mbg.generated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_application
	 * @mbg.generated
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andFieldIdIsNull() {
			addCriterion("field_id is null");
			return (Criteria) this;
		}

		public Criteria andFieldIdIsNotNull() {
			addCriterion("field_id is not null");
			return (Criteria) this;
		}

		public Criteria andFieldIdEqualTo(Integer value) {
			addCriterion("field_id =", value, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdNotEqualTo(Integer value) {
			addCriterion("field_id <>", value, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdGreaterThan(Integer value) {
			addCriterion("field_id >", value, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("field_id >=", value, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdLessThan(Integer value) {
			addCriterion("field_id <", value, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdLessThanOrEqualTo(Integer value) {
			addCriterion("field_id <=", value, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdIn(List<Integer> values) {
			addCriterion("field_id in", values, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdNotIn(List<Integer> values) {
			addCriterion("field_id not in", values, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdBetween(Integer value1, Integer value2) {
			addCriterion("field_id between", value1, value2, "fieldId");
			return (Criteria) this;
		}

		public Criteria andFieldIdNotBetween(Integer value1, Integer value2) {
			addCriterion("field_id not between", value1, value2, "fieldId");
			return (Criteria) this;
		}

		public Criteria andApplicationIsNull() {
			addCriterion("application is null");
			return (Criteria) this;
		}

		public Criteria andApplicationIsNotNull() {
			addCriterion("application is not null");
			return (Criteria) this;
		}

		public Criteria andApplicationEqualTo(String value) {
			addCriterion("application =", value, "application");
			return (Criteria) this;
		}

		public Criteria andApplicationNotEqualTo(String value) {
			addCriterion("application <>", value, "application");
			return (Criteria) this;
		}

		public Criteria andApplicationGreaterThan(String value) {
			addCriterion("application >", value, "application");
			return (Criteria) this;
		}

		public Criteria andApplicationGreaterThanOrEqualTo(String value) {
			addCriterion("application >=", value, "application");
			return (Criteria) this;
		}

		public Criteria andApplicationLessThan(String value) {
			addCriterion("application <", value, "application");
			return (Criteria) this;
		}

		public Criteria andApplicationLessThanOrEqualTo(String value) {
			addCriterion("application <=", value, "application");
			return (Criteria) this;
		}

		public Criteria andApplicationLike(String value) {
			addCriterion("application like", value, "application");
			return (Criteria) this;
		}

		public Criteria andApplicationNotLike(String value) {
			addCriterion("application not like", value, "application");
			return (Criteria) this;
		}

		public Criteria andApplicationIn(List<String> values) {
			addCriterion("application in", values, "application");
			return (Criteria) this;
		}

		public Criteria andApplicationNotIn(List<String> values) {
			addCriterion("application not in", values, "application");
			return (Criteria) this;
		}

		public Criteria andApplicationBetween(String value1, String value2) {
			addCriterion("application between", value1, value2, "application");
			return (Criteria) this;
		}

		public Criteria andApplicationNotBetween(String value1, String value2) {
			addCriterion("application not between", value1, value2, "application");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_application
	 * @mbg.generated
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_application
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}