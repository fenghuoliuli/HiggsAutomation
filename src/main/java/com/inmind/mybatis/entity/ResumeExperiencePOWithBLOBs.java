package com.inmind.mybatis.entity;

public class ResumeExperiencePOWithBLOBs extends ResumeExperiencePO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_experience.org_description
     *
     * @mbg.generated
     */
    private String orgDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_experience.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_experience.salary_detail
     *
     * @mbg.generated
     */
    private String salaryDetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_experience.performance
     *
     * @mbg.generated
     */
    private String performance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_experience.left_reason
     *
     * @mbg.generated
     */
    private String leftReason;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_experience.org_description
     *
     * @return the value of resume_experience.org_description
     *
     * @mbg.generated
     */
    public String getOrgDescription() {
        return orgDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_experience.org_description
     *
     * @param orgDescription the value for resume_experience.org_description
     *
     * @mbg.generated
     */
    public void setOrgDescription(String orgDescription) {
        this.orgDescription = orgDescription == null ? null : orgDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_experience.description
     *
     * @return the value of resume_experience.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_experience.description
     *
     * @param description the value for resume_experience.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_experience.salary_detail
     *
     * @return the value of resume_experience.salary_detail
     *
     * @mbg.generated
     */
    public String getSalaryDetail() {
        return salaryDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_experience.salary_detail
     *
     * @param salaryDetail the value for resume_experience.salary_detail
     *
     * @mbg.generated
     */
    public void setSalaryDetail(String salaryDetail) {
        this.salaryDetail = salaryDetail == null ? null : salaryDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_experience.performance
     *
     * @return the value of resume_experience.performance
     *
     * @mbg.generated
     */
    public String getPerformance() {
        return performance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_experience.performance
     *
     * @param performance the value for resume_experience.performance
     *
     * @mbg.generated
     */
    public void setPerformance(String performance) {
        this.performance = performance == null ? null : performance.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_experience.left_reason
     *
     * @return the value of resume_experience.left_reason
     *
     * @mbg.generated
     */
    public String getLeftReason() {
        return leftReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_experience.left_reason
     *
     * @param leftReason the value for resume_experience.left_reason
     *
     * @mbg.generated
     */
    public void setLeftReason(String leftReason) {
        this.leftReason = leftReason == null ? null : leftReason.trim();
    }
}