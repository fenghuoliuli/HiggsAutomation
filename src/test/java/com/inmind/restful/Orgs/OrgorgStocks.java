package com.inmind.restful.Orgs;

import java.util.concurrent.Exchanger;

public class OrgorgStocks {
	private long id;
	private long org_id;
	private int stock_exchange;
	private String stock_code;
	private long created_by;
	private long updated_by;
	private long created_at;
	private long updated_at;
	
	public long get_id() {
		return id;
	}
	
	public void set_id(long id){
		this.id=id;
	}
	
	public long get_org_id(){
		return org_id;
	}
	
	public void set_org_id(long org_id){
		this.org_id=org_id;
	}
	
	public int get_stock_exchange()
	{
		return stock_exchange;
	}
	
	public void set_stock_exchange(int stock_exchange)
	{
		this.stock_exchange=stock_exchange;
	}
	
	public String get_stock_code(){
		return stock_code;		
	}
	public void set_stock_code(String stock_code){
		this.stock_code=stock_code;
	}
	
	public long get_created_by(){
		return created_by;		
	}
	
	public void set_created_by(long created_by){
		this.created_by=created_by;
	}
	
	public long get_updated_by(){
		return updated_by;
	}
	
	public void set_updated_by(long updated_by){
		this.updated_by=updated_by;
	}
	
	public long get_created_at()
	{
		return created_at;
	}
	
	public void set_created_at(long created_at){
		this.created_at=created_at;
	}
	
	public long get_updated_at(){
		return updated_at;
	}
	
	public void set_updated_at(long updated_at){
		this.updated_at=updated_at;
	}

}