package com.inmind.restful.Orgs;

public class OrgBean {
	public long registedAt;
	public long updatedBy;
	public long ownerId;
	public long createdAt;
	public long createdBy;
	public String name;
	public long id;
	public long updatedAt;
	public static class owner{
		public String password;
		public String nickname;
		public String mobile;
		public long id;
		public String email;
		public String username;
	}
	public static class shareholdings{
		public long id;
		public long org_id;
		public long hold_id;
		public double hold_rate;
		public double invest_amount;
		public String invest_detail;
		public long created_by;
		public long updated_by;
		public long created_at;
		public long updated_at;
	}
	
	public static class createdByAccount{
		public String password;
		public String nickname;
		public String mobile;
		public long id;
		public String email;
		public String username;
	}
	
	public static class updatedByAccount{
		public String password;
		public String nickname;
		public String mobile;
		public long id;
		public String email;
		public String username;
	}
	
	public static class shareholders{
		public long id;
		public long org_id;
		public long hold_id;
		public double hold_rate;
		public double invest_amount;
		public String invest_detail;
		public long created_by;
		public long updated_by;
		public long created_at;
		public long updated_at;
		
	}
	
	public static class orgStocks{
		public long id;
		public long org_id;
		public int stock_exchange;
		public String stock_code;
		public long created_by;
		public long updated_by;
		public long created_at;
		public long updated_at;
	}
	
	public static class industrialModeDicts{
		
	}
	
	public static class industryDicts{
		
	}
	
	public static class orgContactWays{
		public long id;
		public long org_id;
		public long address_id;
		public String fax_number;
		public String phone_number;
		public long created_by;
		public long updated_by;
		public long created_at;
		public long updated_at;
		
	}
	
	public static class orgBrands{
		public long id;
		public long org_id;
		public String img_url;
		public String trademark;
		public String title;
		public String site_url;
		public String description;
		public long created_by;
		public long updated_by;
		public long created_at;
		public long updated_at;
		
	}
	
	public static class orgHistories{
		public long id;
		public long org_id;
		public long time_at;
		public String title;
		public String description;
		public String link_url;
		public long created_by;
		public long updated_by;
		public long created_at;
		public long updated_at;
	}
}
