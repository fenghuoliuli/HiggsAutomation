package com.inmind.restful.Orgs;

import java.awt.List;
import java.security.acl.Owner;
import java.util.ArrayList;

public class Orgs_Json_Util {
	private ArrayList<OrghighlightDicts> highlightDicts;
	private long registeredAt;
	private int updatedBy;
	private int ownerId;
	private long createdAt;
	private int createdBy;
	private String name;
	private int id;
	private long updatedAt;
	
	private ArrayList<OrgOwner> owner= new ArrayList<OrgOwner>();
	
	
	public long get_registeredAt()
	{
		return registeredAt;
	}
	
	public int get_ownerId()
	{
		return ownerId;
	}
	
	public long get_createdAt()
	{
		return createdAt;
	}
	
	public int get_updateBy()
	{
		return updatedBy;
	}
	
	public int get_createdBy()
	{
		return createdBy;
	}
	
	public String get_name()
	{
		return name;
	}
	
	public int get_id()
	{
		return id;
	}
	
	public long get_updatedAt()
	{
		return updatedAt;
	}
	
	public ArrayList<OrgOwner> get_Owner()
	{
		return owner;
	}

}
