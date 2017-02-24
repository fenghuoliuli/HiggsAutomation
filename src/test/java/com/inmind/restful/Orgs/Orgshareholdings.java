package com.inmind.restful.Orgs;


public class Orgshareholdings {
	private long id;
	private long org_id;
	private long hold_id;
	private double hold_rate;
	private double invest_amount;
	private String invest_detail;
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
	public long get_org_id()
	{
		return org_id;
	}
	
	public void set_org_id(long org_id){
		this.org_id=org_id;
	}
	public long get_hold_id() {
		return hold_id;		
	}
	
	public void set_hold_rate(double hold_rate){
		this.hold_rate=hold_rate;
	}
	
	public double get_hold_rate(){
		return hold_rate;
	}
	
	public void set_invest_detail(String invest_detail){
		this.invest_detail=invest_detail;
	}
	public String get_invest_detail(){
		return invest_detail;
	}
	
	public void set_invest_mount(double invest_amount){
		this.invest_amount=invest_amount;
	}
	public double get_invest_mount(){
		return invest_amount;
	}
	
	public void set_created_by(long created_by){
		this.created_by=created_by;
	}
	public long get_created_by(){
		return created_by;
	}
	
	public void set_updated_by(long updated_by){
		this.updated_by=updated_by;
	}
	
	public long get_updated_by() {
		return updated_by;		
	}
	
	public void set_created_at(long created_at){
		this.created_at=created_at;
	}
	public long get_created_at(){
		return created_at;
	}
	
	public void set_updated_at(long updated_at){
		this.updated_at=updated_at;
	}
	public long get_updated_at(){
		return updated_at;
	}
}
