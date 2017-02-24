package com.inmind.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskFaceInterviewPOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    public TaskFaceInterviewPOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
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
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_interview
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task_face_interview
     *
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTargetIdIsNull() {
            addCriterion("target_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetIdIsNotNull() {
            addCriterion("target_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetIdEqualTo(Long value) {
            addCriterion("target_id =", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotEqualTo(Long value) {
            addCriterion("target_id <>", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThan(Long value) {
            addCriterion("target_id >", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("target_id >=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThan(Long value) {
            addCriterion("target_id <", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThanOrEqualTo(Long value) {
            addCriterion("target_id <=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdIn(List<Long> values) {
            addCriterion("target_id in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotIn(List<Long> values) {
            addCriterion("target_id not in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdBetween(Long value1, Long value2) {
            addCriterion("target_id between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotBetween(Long value1, Long value2) {
            addCriterion("target_id not between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andRelateIdIsNull() {
            addCriterion("relate_id is null");
            return (Criteria) this;
        }

        public Criteria andRelateIdIsNotNull() {
            addCriterion("relate_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelateIdEqualTo(Long value) {
            addCriterion("relate_id =", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdNotEqualTo(Long value) {
            addCriterion("relate_id <>", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdGreaterThan(Long value) {
            addCriterion("relate_id >", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("relate_id >=", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdLessThan(Long value) {
            addCriterion("relate_id <", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdLessThanOrEqualTo(Long value) {
            addCriterion("relate_id <=", value, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdIn(List<Long> values) {
            addCriterion("relate_id in", values, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdNotIn(List<Long> values) {
            addCriterion("relate_id not in", values, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdBetween(Long value1, Long value2) {
            addCriterion("relate_id between", value1, value2, "relateId");
            return (Criteria) this;
        }

        public Criteria andRelateIdNotBetween(Long value1, Long value2) {
            addCriterion("relate_id not between", value1, value2, "relateId");
            return (Criteria) this;
        }

        public Criteria andRemindAtIsNull() {
            addCriterion("remind_at is null");
            return (Criteria) this;
        }

        public Criteria andRemindAtIsNotNull() {
            addCriterion("remind_at is not null");
            return (Criteria) this;
        }

        public Criteria andRemindAtEqualTo(Date value) {
            addCriterion("remind_at =", value, "remindAt");
            return (Criteria) this;
        }

        public Criteria andRemindAtNotEqualTo(Date value) {
            addCriterion("remind_at <>", value, "remindAt");
            return (Criteria) this;
        }

        public Criteria andRemindAtGreaterThan(Date value) {
            addCriterion("remind_at >", value, "remindAt");
            return (Criteria) this;
        }

        public Criteria andRemindAtGreaterThanOrEqualTo(Date value) {
            addCriterion("remind_at >=", value, "remindAt");
            return (Criteria) this;
        }

        public Criteria andRemindAtLessThan(Date value) {
            addCriterion("remind_at <", value, "remindAt");
            return (Criteria) this;
        }

        public Criteria andRemindAtLessThanOrEqualTo(Date value) {
            addCriterion("remind_at <=", value, "remindAt");
            return (Criteria) this;
        }

        public Criteria andRemindAtIn(List<Date> values) {
            addCriterion("remind_at in", values, "remindAt");
            return (Criteria) this;
        }

        public Criteria andRemindAtNotIn(List<Date> values) {
            addCriterion("remind_at not in", values, "remindAt");
            return (Criteria) this;
        }

        public Criteria andRemindAtBetween(Date value1, Date value2) {
            addCriterion("remind_at between", value1, value2, "remindAt");
            return (Criteria) this;
        }

        public Criteria andRemindAtNotBetween(Date value1, Date value2) {
            addCriterion("remind_at not between", value1, value2, "remindAt");
            return (Criteria) this;
        }

        public Criteria andRemindExecuteStatusIsNull() {
            addCriterion("remind_execute_status is null");
            return (Criteria) this;
        }

        public Criteria andRemindExecuteStatusIsNotNull() {
            addCriterion("remind_execute_status is not null");
            return (Criteria) this;
        }

        public Criteria andRemindExecuteStatusEqualTo(Integer value) {
            addCriterion("remind_execute_status =", value, "remindExecuteStatus");
            return (Criteria) this;
        }

        public Criteria andRemindExecuteStatusNotEqualTo(Integer value) {
            addCriterion("remind_execute_status <>", value, "remindExecuteStatus");
            return (Criteria) this;
        }

        public Criteria andRemindExecuteStatusGreaterThan(Integer value) {
            addCriterion("remind_execute_status >", value, "remindExecuteStatus");
            return (Criteria) this;
        }

        public Criteria andRemindExecuteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("remind_execute_status >=", value, "remindExecuteStatus");
            return (Criteria) this;
        }

        public Criteria andRemindExecuteStatusLessThan(Integer value) {
            addCriterion("remind_execute_status <", value, "remindExecuteStatus");
            return (Criteria) this;
        }

        public Criteria andRemindExecuteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("remind_execute_status <=", value, "remindExecuteStatus");
            return (Criteria) this;
        }

        public Criteria andRemindExecuteStatusIn(List<Integer> values) {
            addCriterion("remind_execute_status in", values, "remindExecuteStatus");
            return (Criteria) this;
        }

        public Criteria andRemindExecuteStatusNotIn(List<Integer> values) {
            addCriterion("remind_execute_status not in", values, "remindExecuteStatus");
            return (Criteria) this;
        }

        public Criteria andRemindExecuteStatusBetween(Integer value1, Integer value2) {
            addCriterion("remind_execute_status between", value1, value2, "remindExecuteStatus");
            return (Criteria) this;
        }

        public Criteria andRemindExecuteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("remind_execute_status not between", value1, value2, "remindExecuteStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewAtIsNull() {
            addCriterion("interview_at is null");
            return (Criteria) this;
        }

        public Criteria andInterviewAtIsNotNull() {
            addCriterion("interview_at is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewAtEqualTo(Date value) {
            addCriterion("interview_at =", value, "interviewAt");
            return (Criteria) this;
        }

        public Criteria andInterviewAtNotEqualTo(Date value) {
            addCriterion("interview_at <>", value, "interviewAt");
            return (Criteria) this;
        }

        public Criteria andInterviewAtGreaterThan(Date value) {
            addCriterion("interview_at >", value, "interviewAt");
            return (Criteria) this;
        }

        public Criteria andInterviewAtGreaterThanOrEqualTo(Date value) {
            addCriterion("interview_at >=", value, "interviewAt");
            return (Criteria) this;
        }

        public Criteria andInterviewAtLessThan(Date value) {
            addCriterion("interview_at <", value, "interviewAt");
            return (Criteria) this;
        }

        public Criteria andInterviewAtLessThanOrEqualTo(Date value) {
            addCriterion("interview_at <=", value, "interviewAt");
            return (Criteria) this;
        }

        public Criteria andInterviewAtIn(List<Date> values) {
            addCriterion("interview_at in", values, "interviewAt");
            return (Criteria) this;
        }

        public Criteria andInterviewAtNotIn(List<Date> values) {
            addCriterion("interview_at not in", values, "interviewAt");
            return (Criteria) this;
        }

        public Criteria andInterviewAtBetween(Date value1, Date value2) {
            addCriterion("interview_at between", value1, value2, "interviewAt");
            return (Criteria) this;
        }

        public Criteria andInterviewAtNotBetween(Date value1, Date value2) {
            addCriterion("interview_at not between", value1, value2, "interviewAt");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andRemindBeforeIsNull() {
            addCriterion("remind_before is null");
            return (Criteria) this;
        }

        public Criteria andRemindBeforeIsNotNull() {
            addCriterion("remind_before is not null");
            return (Criteria) this;
        }

        public Criteria andRemindBeforeEqualTo(String value) {
            addCriterion("remind_before =", value, "remindBefore");
            return (Criteria) this;
        }

        public Criteria andRemindBeforeNotEqualTo(String value) {
            addCriterion("remind_before <>", value, "remindBefore");
            return (Criteria) this;
        }

        public Criteria andRemindBeforeGreaterThan(String value) {
            addCriterion("remind_before >", value, "remindBefore");
            return (Criteria) this;
        }

        public Criteria andRemindBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("remind_before >=", value, "remindBefore");
            return (Criteria) this;
        }

        public Criteria andRemindBeforeLessThan(String value) {
            addCriterion("remind_before <", value, "remindBefore");
            return (Criteria) this;
        }

        public Criteria andRemindBeforeLessThanOrEqualTo(String value) {
            addCriterion("remind_before <=", value, "remindBefore");
            return (Criteria) this;
        }

        public Criteria andRemindBeforeLike(String value) {
            addCriterion("remind_before like", value, "remindBefore");
            return (Criteria) this;
        }

        public Criteria andRemindBeforeNotLike(String value) {
            addCriterion("remind_before not like", value, "remindBefore");
            return (Criteria) this;
        }

        public Criteria andRemindBeforeIn(List<String> values) {
            addCriterion("remind_before in", values, "remindBefore");
            return (Criteria) this;
        }

        public Criteria andRemindBeforeNotIn(List<String> values) {
            addCriterion("remind_before not in", values, "remindBefore");
            return (Criteria) this;
        }

        public Criteria andRemindBeforeBetween(String value1, String value2) {
            addCriterion("remind_before between", value1, value2, "remindBefore");
            return (Criteria) this;
        }

        public Criteria andRemindBeforeNotBetween(String value1, String value2) {
            addCriterion("remind_before not between", value1, value2, "remindBefore");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Long value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Long value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Long value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Long value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Long value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Long> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Long> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Long value1, Long value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Long value1, Long value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(Long value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(Long value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(Long value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(Long value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(Long value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<Long> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<Long> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(Long value1, Long value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(Long value1, Long value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewStatusIsNull() {
            addCriterion("face_interview_status is null");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewStatusIsNotNull() {
            addCriterion("face_interview_status is not null");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewStatusEqualTo(Integer value) {
            addCriterion("face_interview_status =", value, "faceInterviewStatus");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewStatusNotEqualTo(Integer value) {
            addCriterion("face_interview_status <>", value, "faceInterviewStatus");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewStatusGreaterThan(Integer value) {
            addCriterion("face_interview_status >", value, "faceInterviewStatus");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("face_interview_status >=", value, "faceInterviewStatus");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewStatusLessThan(Integer value) {
            addCriterion("face_interview_status <", value, "faceInterviewStatus");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewStatusLessThanOrEqualTo(Integer value) {
            addCriterion("face_interview_status <=", value, "faceInterviewStatus");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewStatusIn(List<Integer> values) {
            addCriterion("face_interview_status in", values, "faceInterviewStatus");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewStatusNotIn(List<Integer> values) {
            addCriterion("face_interview_status not in", values, "faceInterviewStatus");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewStatusBetween(Integer value1, Integer value2) {
            addCriterion("face_interview_status between", value1, value2, "faceInterviewStatus");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("face_interview_status not between", value1, value2, "faceInterviewStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task_face_interview
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task_face_interview
     *
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
}