package com.inmind.restful.Orgs;

public class OrgContactWay {
	private long id;
	private long org_id;
	private long address_id;
	private String fax_number;
	private String phone_number;
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
	
	public long get_address_id(){
		return address_id;
	}
	public void set_address_id(long address_id){
		this.address_id=address_id;
	}
	
	public String get_fax_number(){
		return fax_number;
	}
	public void set_fax_number(String fax_number){
		this.fax_number=fax_number;
	}
	
	public String get_phone_number(){
		return phone_number;
	}
	
	public void set_phone_number(String phone_number){
		this.phone_number=phone_number;
	}
	public long get_created_by(){
		return created_by;
	}
	public void set_created_by(long created_by){
		this.created_by=created_by;
	}


	public long get_updated_by() {
		return updated_by;		
	}
	public void set_updated_by(long updated_by){
		this.updated_by=updated_by;
	}
	public long get_created_at(){
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
