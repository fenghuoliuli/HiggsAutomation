package com.inmind.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskFaceAssistTaskPOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_face_assist_task
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_face_assist_task
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_face_assist_task
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_assist_task
     *
     * @mbg.generated
     */
    public TaskFaceAssistTaskPOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_assist_task
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_assist_task
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_assist_task
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_assist_task
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_assist_task
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_assist_task
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_assist_task
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
     * This method corresponds to the database table task_face_assist_task
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
     * This method corresponds to the database table task_face_assist_task
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_face_assist_task
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
     * This class corresponds to the database table task_face_assist_task
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

        public Criteria andFaceInterviewIdIsNull() {
            addCriterion("face_interview_id is null");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewIdIsNotNull() {
            addCriterion("face_interview_id is not null");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewIdEqualTo(Long value) {
            addCriterion("face_interview_id =", value, "faceInterviewId");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewIdNotEqualTo(Long value) {
            addCriterion("face_interview_id <>", value, "faceInterviewId");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewIdGreaterThan(Long value) {
            addCriterion("face_interview_id >", value, "faceInterviewId");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewIdGreaterThanOrEqualTo(Long value) {
            addCriterion("face_interview_id >=", value, "faceInterviewId");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewIdLessThan(Long value) {
            addCriterion("face_interview_id <", value, "faceInterviewId");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewIdLessThanOrEqualTo(Long value) {
            addCriterion("face_interview_id <=", value, "faceInterviewId");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewIdIn(List<Long> values) {
            addCriterion("face_interview_id in", values, "faceInterviewId");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewIdNotIn(List<Long> values) {
            addCriterion("face_interview_id not in", values, "faceInterviewId");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewIdBetween(Long value1, Long value2) {
            addCriterion("face_interview_id between", value1, value2, "faceInterviewId");
            return (Criteria) this;
        }

        public Criteria andFaceInterviewIdNotBetween(Long value1, Long value2) {
            addCriterion("face_interview_id not between", value1, value2, "faceInterviewId");
            return (Criteria) this;
        }

        public Criteria andFaceTargetIdIsNull() {
            addCriterion("face_target_id is null");
            return (Criteria) this;
        }

        public Criteria andFaceTargetIdIsNotNull() {
            addCriterion("face_target_id is not null");
            return (Criteria) this;
        }

        public Criteria andFaceTargetIdEqualTo(Long value) {
            addCriterion("face_target_id =", value, "faceTargetId");
            return (Criteria) this;
        }

        public Criteria andFaceTargetIdNotEqualTo(Long value) {
            addCriterion("face_target_id <>", value, "faceTargetId");
            return (Criteria) this;
        }

        public Criteria andFaceTargetIdGreaterThan(Long value) {
            addCriterion("face_target_id >", value, "faceTargetId");
            return (Criteria) this;
        }

        public Criteria andFaceTargetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("face_target_id >=", value, "faceTargetId");
            return (Criteria) this;
        }

        public Criteria andFaceTargetIdLessThan(Long value) {
            addCriterion("face_target_id <", value, "faceTargetId");
            return (Criteria) this;
        }

        public Criteria andFaceTargetIdLessThanOrEqualTo(Long value) {
            addCriterion("face_target_id <=", value, "faceTargetId");
            return (Criteria) this;
        }

        public Criteria andFaceTargetIdIn(List<Long> values) {
            addCriterion("face_target_id in", values, "faceTargetId");
            return (Criteria) this;
        }

        public Criteria andFaceTargetIdNotIn(List<Long> values) {
            addCriterion("face_target_id not in", values, "faceTargetId");
            return (Criteria) this;
        }

        public Criteria andFaceTargetIdBetween(Long value1, Long value2) {
            addCriterion("face_target_id between", value1, value2, "faceTargetId");
            return (Criteria) this;
        }

        public Criteria andFaceTargetIdNotBetween(Long value1, Long value2) {
            addCriterion("face_target_id not between", value1, value2, "faceTargetId");
            return (Criteria) this;
        }

        public Criteria andAssistTaskIdIsNull() {
            addCriterion("assist_task_id is null");
            return (Criteria) this;
        }

        public Criteria andAssistTaskIdIsNotNull() {
            addCriterion("assist_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssistTaskIdEqualTo(Long value) {
            addCriterion("assist_task_id =", value, "assistTaskId");
            return (Criteria) this;
        }

        public Criteria andAssistTaskIdNotEqualTo(Long value) {
            addCriterion("assist_task_id <>", value, "assistTaskId");
            return (Criteria) this;
        }

        public Criteria andAssistTaskIdGreaterThan(Long value) {
            addCriterion("assist_task_id >", value, "assistTaskId");
            return (Criteria) this;
        }

        public Criteria andAssistTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("assist_task_id >=", value, "assistTaskId");
            return (Criteria) this;
        }

        public Criteria andAssistTaskIdLessThan(Long value) {
            addCriterion("assist_task_id <", value, "assistTaskId");
            return (Criteria) this;
        }

        public Criteria andAssistTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("assist_task_id <=", value, "assistTaskId");
            return (Criteria) this;
        }

        public Criteria andAssistTaskIdIn(List<Long> values) {
            addCriterion("assist_task_id in", values, "assistTaskId");
            return (Criteria) this;
        }

        public Criteria andAssistTaskIdNotIn(List<Long> values) {
            addCriterion("assist_task_id not in", values, "assistTaskId");
            return (Criteria) this;
        }

        public Criteria andAssistTaskIdBetween(Long value1, Long value2) {
            addCriterion("assist_task_id between", value1, value2, "assistTaskId");
            return (Criteria) this;
        }

        public Criteria andAssistTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("assist_task_id not between", value1, value2, "assistTaskId");
            return (Criteria) this;
        }

        public Criteria andAssistTargetIdIsNull() {
            addCriterion("assist_target_id is null");
            return (Criteria) this;
        }

        public Criteria andAssistTargetIdIsNotNull() {
            addCriterion("assist_target_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssistTargetIdEqualTo(Long value) {
            addCriterion("assist_target_id =", value, "assistTargetId");
            return (Criteria) this;
        }

        public Criteria andAssistTargetIdNotEqualTo(Long value) {
            addCriterion("assist_target_id <>", value, "assistTargetId");
            return (Criteria) this;
        }

        public Criteria andAssistTargetIdGreaterThan(Long value) {
            addCriterion("assist_target_id >", value, "assistTargetId");
            return (Criteria) this;
        }

        public Criteria andAssistTargetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("assist_target_id >=", value, "assistTargetId");
            return (Criteria) this;
        }

        public Criteria andAssistTargetIdLessThan(Long value) {
            addCriterion("assist_target_id <", value, "assistTargetId");
            return (Criteria) this;
        }

        public Criteria andAssistTargetIdLessThanOrEqualTo(Long value) {
            addCriterion("assist_target_id <=", value, "assistTargetId");
            return (Criteria) this;
        }

        public Criteria andAssistTargetIdIn(List<Long> values) {
            addCriterion("assist_target_id in", values, "assistTargetId");
            return (Criteria) this;
        }

        public Criteria andAssistTargetIdNotIn(List<Long> values) {
            addCriterion("assist_target_id not in", values, "assistTargetId");
            return (Criteria) this;
        }

        public Criteria andAssistTargetIdBetween(Long value1, Long value2) {
            addCriterion("assist_target_id between", value1, value2, "assistTargetId");
            return (Criteria) this;
        }

        public Criteria andAssistTargetIdNotBetween(Long value1, Long value2) {
            addCriterion("assist_target_id not between", value1, value2, "assistTargetId");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task_face_assist_task
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
     * This class corresponds to the database table task_face_assist_task
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