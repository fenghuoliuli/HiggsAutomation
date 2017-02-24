package com.inmind.common;

import org.apache.poi.ss.formula.functions.Fixed1ArgFunction;

import java.util.List;

/**
 * Created by zhao on 2017/2/23.
 */
public class Pagination<T extends Fixed1ArgFunction> {
  /**
   * The constant DEFAULT_SIZE.
   */
  public static final Integer DEFAULT_SIZE = 10;
  /**
   * The constant FIRST_PAGE.
   */
  public static final Integer FIRST_PAGE = 1;
  private List<T> results;
  private long count;
  private String extraInfo;
  private Integer page = 0;
  private Integer size = 0;

  /**
   * Instantiates a new Pagination.
   *
   * @param page the page
   * @param size the size
   */
  public Pagination(Integer page, Integer size) {
    this.size = size != null && size > 0 ? size : DEFAULT_SIZE;
    this.page = page != null && page > 0 ? page : FIRST_PAGE;
  }

  /**
   * Instantiates a new Pagination.
   *
   * @param results the results
   * @param page    the page
   * @param size    the size
   * @param count   the count
   */
  public Pagination(List<T> results, int page, int size, long count) {
    this.results = results;
    this.page = page;
    this.size = size;
    this.count = count;
    this.extraInfo = "";
  }

  /**
   * Instantiates a new Pagination.
   *
   * @param results   the results
   * @param page      the page
   * @param size      the size
   * @param count     the count
   * @param extraInfo the extra info
   */
  public Pagination(List<T> results, int page, int size, long count,
                    String extraInfo) {
    this.results = results;
    this.page = page;
    this.size = size;
    this.count = count;
    this.extraInfo = extraInfo;
  }

  /**
   * Gets results.
   *
   * @return the results
   */
  public List<T> getResults() {
    return results;
  }

  /**
   * Sets results.
   *
   * @param r the r
   * @return the results
   */
  public Pagination<T> setResults(List<T> r) {
    this.results = r;
    return this;
  }

  /**
   * Gets offset.
   *
   * @return the offset
   */
  public int getOffset() {
    return (getPage() - 1) * getSize();
  }

  /**
   * Gets limit.
   *
   * @return the limit
   */
  public int getLimit() {
    return getSize();
  }

  /**
   * Gets count.
   *
   * @return the count
   */
  public long getCount() {
    return count;
  }

  /**
   * Sets count.
   *
   * @param c the c
   * @return the count
   */
  public Pagination<T> setCount(long c) {
    this.count = c;
    return this;
  }

  /**
   * Gets extra info.
   *
   * @return the extra info
   */
  public String getExtraInfo() {
    return extraInfo;
  }

  /**
   * Gets page.
   *
   * @return the page
   */
  public Integer getPage() {
    return page != null && page > 0 ? page : FIRST_PAGE;
  }

  /**
   * Sets page.
   *
   * @param page the page
   */
  public void setPage(Integer page) {
    this.page = page;
  }

  /**
   * Gets size.
   *
   * @return the size
   */
  public Integer getSize() {
    return size != null && size > 0 ? size : DEFAULT_SIZE;
  }

  /**
   * Sets size.
   *
   * @param size the size
   */
  public void setSize(Integer size) {
    this.size = size;
  }
}
