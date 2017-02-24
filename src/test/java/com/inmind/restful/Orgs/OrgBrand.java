package com.inmind.restful.Orgs;

public class OrgBrand {
	private long id;
	private long org_id;
	private String img_url;
	private String trademark;
	private String title;
	private String site_url;
	private String description;
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
	
	public String get_img_url(){
		return img_url;
	}
	public void set_imp_url(String img_url){
		this.img_url=img_url;
	}
	
	public String get_trademark(){
		return trademark;
	}
	public void set_trademark(String trademark){
		this.trademark=trademark;
	}
	
	public String get_title(){
		return title;
	}
	public void set_title(String title){
		this.title=title;
	}
	
	public String get_site_url() {
		return site_url;		
	}
	public void set_site_url(String site_url){
		this.site_url=site_url;
	}
	
	public String get_description() {
		return description;		
	}
	
	public void set_description(String description){
		this.description=description;
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
