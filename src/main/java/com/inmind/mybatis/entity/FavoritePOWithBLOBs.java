package com.inmind.mybatis.entity;

public class FavoritePOWithBLOBs extends FavoritePO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favorite.tags
     *
     * @mbg.generated
     */
    private String tags;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favorite.query
     *
     * @mbg.generated
     */
    private String query;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite.tags
     *
     * @return the value of favorite.tags
     *
     * @mbg.generated
     */
    public String getTags() {
        return tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite.tags
     *
     * @param tags the value for favorite.tags
     *
     * @mbg.generated
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorite.query
     *
     * @return the value of favorite.query
     *
     * @mbg.generated
     */
    public String getQuery() {
        return query;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorite.query
     *
     * @param query the value for favorite.query
     *
     * @mbg.generated
     */
    public void setQuery(String query) {
        this.query = query == null ? null : query.trim();
    }
}