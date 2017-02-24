package com.inmind.restful.testcases;

import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.inmind.general.APITest;
import com.inmind.http.APIRequest;
import com.inmind.http.APIResponse;
import com.inmind.utils.DBCtrl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import com.inmind.utils.*;

import com.inmind.mybatis.entity.OrgBrandPO;
import com.inmind.mybatis.entity.OrgContactWayPO;
import com.inmind.mybatis.entity.OrgHistoryPO;
import com.inmind.mybatis.entity.OrgShareholderPO;
import com.inmind.mybatis.entity.OrgStockPO;
import com.inmind.mybatis.entity.OrganizationPO;


public class Org {
	public static final Logger LOGGER = LogManager.getLogger(Org.class.getName());
	ArrayList<String> cookies= new ArrayList<String>();
	OrganizationPO organizationPO;
	DBCtrl dbCtrl = new DBCtrl();
	public Connection conn;
	public static long orgid;
	public static long parentorgid;
	public static long location_id;
	CommonUtil commonutil= new CommonUtil();
  @Test
  public void GetOrgsId(){
	  
	  LOGGER.info("*****************Test case: Get Orgs by id List Started*****************");
	  System.out.println("*****************Test case: Get Org by id List Started*****************");
	  try {
		  String uri = APITest.getValue("baseuri");
		  String cookievalue= cookies.get(0);
		  System.out.println(cookievalue);
			APIResponse response=APIRequest.GET(uri).path("/orgs/"+orgid).header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).
		    invoke();
			response.assertBodyContains("200");
			String responsbody=response.getBody();
			JsonObject jsonObject=new JsonParser().parse(responsbody).getAsJsonObject();
			JsonObject body=jsonObject.getAsJsonObject("_body");	
			int type = body.get("type").getAsInt();
			long updatedBy = body.get("updatedBy").getAsLong();
			String description=body.get("description").getAsString();
			long ownerId=body.get("ownerId").getAsLong();
			long createdAt = body.get("createdAt").getAsLong();
			long createdBy = body.get("createdBy").getAsLong();
			String simpleName = body.get("simpleName").getAsString();
			String englishName = body.get("englishName").getAsString();
			int source = body.get("source").getAsInt();
			String aliases = body.get("aliases").getAsString();
			String phoneNo = body.get("phoneNo").getAsString();
			String logoUrl = body.get("logoUrl").getAsString();
			String siteUrl = body.get("siteUrl").getAsString();
			int finacingStatus = body.get("finacingStatus").getAsInt();
			double finacingAmount = body.get("finacingAmount").getAsDouble();
			String legalPerson = body.get("legalPerson").getAsString();
			double registedCapital = body.get("registedCapital").getAsDouble();
			long registedAt=body.get("registedAt").getAsLong();
			double turnover = body.get("turnover").getAsDouble();
			String registedNo = body.get("registedNo").getAsString();
			String registedAuthority = body.get("registedAuthority").getAsString();
			int natureCode = body.get("natureCode").getAsInt();
			int empScale = body.get("empScale").getAsInt();
			int empMeanSalary = body.get("empMeanSalary").getAsInt();
			String wxPublicNo = body.get("wxPublicNo").getAsString();
			String facebookUrl = body.get("facebookUrl").getAsString();
			String linkedinUrl = body.get("linkedinUrl").getAsString();
			String weiboUrl = body.get("weiboUrl").getAsString();
			String twitterUrl = body.get("twitterUrl").getAsString();
			String qccUnique = body.get("qccUnique").getAsString();
			String orgCode = body.get("orgCode").getAsString();
			String licenseNo = body.get("licenseNo").getAsString();
			String imgUrls = body.get("imgUrls").getAsString();
			String finacingDetail = body.get("finacingDetail").getAsString();

			

			
			
			JsonObject createdByAccount = body.getAsJsonObject("createdByAccount");
			//String createdByAccount_password=createdByAccount.get("password").getAsString();
			String createdByAccount_nickname=createdByAccount.get("nickname").getAsString();
			String createdByAccount_mobile=createdByAccount.get("mobile").getAsString();
			long createdByAccount_id=createdByAccount.get("id").getAsLong();
			String createdByAccount_email=createdByAccount.get("email").getAsString();
			String createdByAccount_username=createdByAccount.get("username").getAsString();

			
		  	String createdByAccountsql ="SELECT * FROM account WHERE id"+createdBy+";";
		  	ResultSet createdByAccountResultSet=dbCtrl.query(conn, createdByAccountsql);
		  	commonutil.AssertEqualsCustomize(createdByAccount_nickname, createdByAccountResultSet.getString("nickname"));
		  	commonutil.AssertEqualsCustomize(createdByAccount_email,createdByAccountResultSet.getString("email"));
		  	commonutil.AssertEqualsCustomize(createdByAccount_mobile,createdByAccountResultSet.getString("mobile"));
		  	commonutil.AssertEqualsCustomize(createdByAccount_username, createdByAccountResultSet.getString("username"));
		  	commonutil.AssertEqualsCustomize(createdByAccount_id,createdByAccountResultSet.getLong("id"));

			JsonObject updatedByAccount = body.getAsJsonObject("updatedByAccount");
			//String updatedByAccount_password=updatedByAccount.get("password").getAsString();
			String updatedByAccount_nickname=updatedByAccount.get("nickname").getAsString();
			String updatedByAccount_mobile=updatedByAccount.get("mobile").getAsString();
			long updatedByAccount_id=updatedByAccount.get("id").getAsLong();
			String updatedByAccount_email=updatedByAccount.get("email").getAsString();
			String updatedByAccount_username=updatedByAccount.get("username").getAsString();

			
		  	String updatedByAccountsql ="SELECT * FROM account WHERE id"+createdBy+";";
		  	ResultSet UpdatedByAccountResultSet=dbCtrl.query(conn, updatedByAccountsql);
		  	commonutil.AssertEqualsCustomize(updatedByAccount_nickname, UpdatedByAccountResultSet.getString("nickname"));
		  	commonutil.AssertEqualsCustomize(updatedByAccount_email,UpdatedByAccountResultSet.getString("email"));
		  	commonutil.AssertEqualsCustomize(updatedByAccount_mobile,UpdatedByAccountResultSet.getString("mobile"));
		  	commonutil.AssertEqualsCustomize(updatedByAccount_username, UpdatedByAccountResultSet.getString("username"));
		  	commonutil.AssertEqualsCustomize(updatedByAccount_id,UpdatedByAccountResultSet.getLong("id"));
			
			
			
			JsonObject shareholders = body.getAsJsonObject("shareholders");
			long shareholders_id=shareholders.get("id").getAsLong();
			long shareholders_org_id=shareholders.get("orgId").getAsLong();
			long shareholders_hold_id=shareholders.get("holdId").getAsLong();
			double shareholders_hold_rate=shareholders.get("holdRate").getAsDouble();
			double shareholders_invest_amount=shareholders.get("investAmount").getAsDouble();
			String shareholders_invest_detail=shareholders.get("investDetail").getAsString();
			long shareholders_created_by=shareholders.get("createdBy").getAsLong();
			long shareholders_updated_by=shareholders.get("updatedBy").getAsLong();
			long shareholders_created_at=shareholders.get("createdAt").getAsLong();
			long shareholders_updated_at=shareholders.get("updatedAt").getAsLong();
			
			
			JsonObject orgStocks = body.getAsJsonObject("orgStocks");
			long orgStocks_id = orgStocks.get("id").getAsLong();
			long orgStocks_org_id = orgStocks.get("orgId").getAsLong();
			int orgStocks_stock_exchange = orgStocks.get("stockExchange").getAsInt();
			String orgStocks_stock_code = orgStocks.get("stockCode").getAsString();
			long orgStocks_created_by = orgStocks.get("createdBy").getAsLong();
			long orgStocks_updated_by = orgStocks.get("updatedBy").getAsLong();
			long orgStocks_created_at = orgStocks.get("createdAt").getAsLong();
			long orgStocks_updated_at = orgStocks.get("updatedAt").getAsLong();
			
			JsonArray industrialModeDicts= body.get("industrialModeDicts").getAsJsonArray();
		  for(int i=0;i<industrialModeDicts.size();i++){
			  JsonObject subObject=industrialModeDicts.get(i).getAsJsonObject();
			  String industrialModeDicts_sql ="SELECT * FROM organization WHERE target_id="+orgid+";";
			  ResultSet industrialModeDictsResultSet=dbCtrl.query(conn, industrialModeDicts_sql);
			  commonutil.AssertEqualsCustomize(subObject.get("type").getAsString(),industrialModeDictsResultSet.getString("dict_type"));
			  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),industrialModeDictsResultSet.getString("dict_type"));
			  String dicttype = industrialModeDictsResultSet.getString("dict_type");
			  String dict_code = subObject.get("code").getAsString();
			  ResultSet dictResultSet = dbCtrl.query(conn,"SELECT * FROM dict WHERE type="+dicttype+" AND code="+dict_code+";");
			  Long dict_title = dictResultSet.getLong("title");
			  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),dict_title);
			  commonutil.AssertEqualsCustomize(subObject.get("generated").getAsLong(),industrialModeDictsResultSet.getLong("generated"));
		  }



			JsonArray industryDicts = body.get("industryDicts").getAsJsonArray();
		  for(int i=0;i<industryDicts.size();i++){
			  JsonObject subObject=industryDicts.get(i).getAsJsonObject();
			  String industryDicts_sql ="SELECT * FROM organization WHERE target_id="+orgid+";";
			  ResultSet industryDictsResultSet=dbCtrl.query(conn, industryDicts_sql);
			  commonutil.AssertEqualsCustomize(subObject.get("type").getAsString(),industryDictsResultSet.getString("dict_type"));
			  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),industryDictsResultSet.getString("dict_type"));
			  String dicttype = industryDictsResultSet.getString("dict_type");
			  String dict_code = subObject.get("code").getAsString();
			  ResultSet dictResultSet = dbCtrl.query(conn,"SELECT * FROM dict WHERE type="+dicttype+" AND code="+dict_code+";");
			  Long dict_title = dictResultSet.getLong("title");
			  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),dict_title);
			  commonutil.AssertEqualsCustomize(subObject.get("generated").getAsLong(),industryDictsResultSet.getLong("generated"));
		  }

		  	JsonArray highlightDicts = body.get("highlightDicts").getAsJsonArray();
		  for(int i=0;i<highlightDicts.size();i++) {
			  JsonObject subObject=highlightDicts.get(i).getAsJsonObject();
			  String industryDicts_sql ="SELECT * FROM organization WHERE target_id="+orgid+";";
			  ResultSet highlightDictsResultSet=dbCtrl.query(conn, industryDicts_sql);
			  commonutil.AssertEqualsCustomize(subObject.get("type").getAsString(),highlightDictsResultSet.getString("dict_type"));
			  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),highlightDictsResultSet.getString("dict_type"));
			  String dicttype = highlightDictsResultSet.getString("dict_type");
			  String dict_code = subObject.get("code").getAsString();
			  ResultSet dictResultSet = dbCtrl.query(conn,"SELECT * FROM dict WHERE type="+dicttype+" AND code="+dict_code+";");
			  Long dict_title = dictResultSet.getLong("title");
			  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),dict_title);
			  commonutil.AssertEqualsCustomize(subObject.get("generated").getAsLong(),highlightDictsResultSet.getLong("generated"));

		  }

			JsonObject orgContactWays = body.getAsJsonObject("orgContactWays");

		  	long orgContactWays_id = orgContactWays.get("id").getAsLong();
		  	long orgContactWays_org_id = orgContactWays.get("orgId").getAsLong();
			String orgContactWays_phone_number = orgContactWays.get("phoneNumber").getAsString();
		  	long orgContactWays_created_by = orgContactWays.get("createdBy").getAsLong();
		  	long orgContactWays_updated_by = orgContactWays.get("updatedBy").getAsLong();
		  	long orgContactWays_created_at = orgContactWays.get("createdAt").getAsLong();
		  	long orgContactWays_updated_at = orgContactWays.get("updatedAt").getAsLong();
		  	String orgContactWays_fax_number = orgContactWays.get("faxNumber").getAsString();
		  	long orgContactWays_address_id = orgContactWays.get("addressId").getAsLong();



			String name = body.get("name").getAsString();
			
			JsonObject orgBrands = body.getAsJsonObject("orgBrands");
			int orgBrands_type = orgBrands.get("type").getAsInt();
		  	String orgBrands_description = orgBrands.get("description").getAsString();
		  	String orgBrands_title = orgBrands.get("title").getAsString();
		  	long orgBrands_created_by = orgBrands.get("createdBy").getAsLong();
		  	long orgBrands_updated_by = orgBrands.get("updatedBy").getAsLong();
		  	long orgBrands_id = orgBrands.get("id").getAsLong();
		  	long orgBrands_created_at = orgBrands.get("createdAt").getAsLong();
		  	long orgBrands_updated_at = orgBrands.get("updatedAt").getAsLong();
		    String orgBrands_siteUrl = orgBrands.get("siteUrl").getAsString();
		  	String orgBrands_imgUrl = orgBrands.get("imgUrl").getAsString();
		  	long orgBrands_org_id = orgBrands.get("orgId").getAsLong();


			JsonObject orgHistories = body.getAsJsonObject("orgHistories");
			OrgHistoryPO orgHistoryPO = new OrgHistoryPO();

		  	commonutil.AssertEqualsCustomize(orgHistories.get("description").getAsString(),orgHistoryPO.getDescription());
		  	commonutil.AssertEqualsCustomize(orgHistories.get("title").getAsString(),orgHistoryPO.getTitle());
		    commonutil.AssertEqualsCustomize(orgHistories.get("createdBy").getAsLong(),orgHistoryPO.getCreatedBy().longValue());
		    commonutil.AssertEqualsCustomize(orgHistories.get("createdAt").getAsLong(),orgHistoryPO.getCreatedAt());
		  	commonutil.AssertEqualsCustomize(orgHistories.get("UpdatedAt").getAsLong(),orgHistoryPO.getUpdatedAt());
		    commonutil.AssertEqualsCustomize(orgHistories.get("UpdatedBy").getAsLong(),orgHistoryPO.getUpdatedBy().longValue());
		  	commonutil.AssertEqualsCustomize(orgHistories.get("timeAt").getAsLong(),orgHistoryPO.getTimeAt());
		  	commonutil.AssertEqualsCustomize(orgHistories.get("linkUrl").getAsLong(),orgHistoryPO.getLinkUrl());


			
			long updatedAt = body.get("updatedAt").getAsLong();
			
//
//			String sql ="SELECT * FROM organization WHERE org_id=;"+orgid;
//			ResultSet organization=dbCtrl.query(conn, sql);
//			organizationPO.getName();
			commonutil.AssertEqualsCustomize(orgid, organizationPO.getId().longValue());
			commonutil.AssertEqualsCustomize(name, organizationPO.getName());
			commonutil.AssertEqualsCustomize(createdAt, organizationPO.getCreatedAt());
			commonutil.AssertEqualsCustomize(updatedAt, organizationPO.getUpdatedAt());
			commonutil.AssertEqualsCustomize(body.get("createdBy").getAsLong(), organizationPO.getCreatedBy().longValue());
			commonutil.AssertEqualsCustomize(updatedBy, organizationPO.getUpdatedBy().longValue());
			commonutil.AssertEqualsCustomize(ownerId, organizationPO.getOwnerId().longValue());
			commonutil.AssertEqualsCustomize(registedAt, organizationPO.getRegistedAt());
			commonutil.AssertEqualsCustomize(source, organizationPO.getSource().longValue());
			//commonutil.AssertEqualsCustomize(description, organizationPO.get);
			commonutil.AssertEqualsCustomize(englishName, organizationPO.getEnglishName());
			commonutil.AssertEqualsCustomize(Integer.valueOf(type), organizationPO.getType());
			commonutil.AssertEqualsCustomize(phoneNo, organizationPO.getPhoneNo());
			commonutil.AssertEqualsCustomize(simpleName, organizationPO.getSimpleName());
			//commonutil.AssertEqualsCustomize(aliases, organizationPO.getal);
			commonutil.AssertEqualsCustomize(logoUrl, organizationPO.getLogoUrl());
			commonutil.AssertEqualsCustomize(siteUrl, organizationPO.getSiteUrl());
			//commonutil.AssertEqualsCustomize(finacingDetail, organizationPO.getf);
			commonutil.AssertEqualsCustomize(finacingAmount, organizationPO.getFinancingAmount());
		    commonutil.AssertEqualsCustomize(legalPerson, organizationPO.getLegalPerson());
		    commonutil.AssertEqualsCustomize(registedCapital,organizationPO.getRegistedCapital());
		    commonutil.AssertEqualsCustomize(registedAt,organizationPO.getRegistedAt());
		  	commonutil.AssertEqualsCustomize(turnover, organizationPO.getTurnover());
		  	commonutil.AssertEqualsCustomize(registedNo,organizationPO.getRegistedNo());
		  	commonutil.AssertEqualsCustomize(registedAuthority, organizationPO.getRegistedAuthority());
		  	commonutil.AssertEqualsCustomize(natureCode,organizationPO.getNatureCode().longValue());
		  	commonutil.AssertEqualsCustomize(empScale, organizationPO.getEmpScale().longValue());
		  	commonutil.AssertEqualsCustomize(empMeanSalary,organizationPO.getEmpMeanSalary().longValue());
		  	commonutil.AssertEqualsCustomize(wxPublicNo,organizationPO.getWxPublicNo());
		  	//commonutil.AssertEqualsCustomize(facebookUrl,organizationPO.getfa);
		  	commonutil.AssertEqualsCustomize(linkedinUrl,organizationPO.getLinkedinUrl());
		  	commonutil.AssertEqualsCustomize(weiboUrl,organizationPO.getWeiboUrl());
		  	//commonutil.AssertEqualsCustomize(twitterUrl,organizationPO.gett);
		  	commonutil.AssertEqualsCustomize(qccUnique,organizationPO.getQccUnique());
		  	commonutil.AssertEqualsCustomize(orgCode,organizationPO.getOrgCode());
		  	commonutil.AssertEqualsCustomize(licenseNo,organizationPO.getLicenseNo());
		  	//commonutil.AssertEqualsCustomize(imgUrls,organizationPO.get);
		  	//commonutil.AssertEqualsCustomize(finacingDetail,organizationPO.getf);
		  	commonutil.AssertEqualsCustomize(finacingStatus,organizationPO.getFinancingStatus().intValue());
			

			OrgShareholderPO orgShareholderPO = new OrgShareholderPO();
		
			commonutil.AssertEqualsCustomize(shareholders_id, orgShareholderPO.getId().longValue());
			commonutil.AssertEqualsCustomize(shareholders_org_id, orgShareholderPO.getOrgId().longValue());
			commonutil.AssertEqualsCustomize(shareholders_hold_id, orgShareholderPO.getHolderId().longValue());
			commonutil.AssertEqualsCustomize(shareholders_hold_rate, orgShareholderPO.getHoldRate());
			commonutil.AssertEqualsCustomize(shareholders_invest_amount, orgShareholderPO.getInvestAmount());
			commonutil.AssertEqualsCustomize(shareholders_invest_detail, orgShareholderPO.getInvestDetail());
			commonutil.AssertEqualsCustomize(shareholders_created_at, orgShareholderPO.getCreatedAt());
			commonutil.AssertEqualsCustomize(shareholders_created_by, orgShareholderPO.getCreatedBy().longValue());
			commonutil.AssertEqualsCustomize(shareholders_updated_by, orgShareholderPO.getUpdatedBy().longValue());
			commonutil.AssertEqualsCustomize(shareholders_updated_at, orgShareholderPO.getUpdatedAt());

//
//		  	String shareholdings_sql ="SELECT * FROM org_shareholder WHERE org_id=;"+orgid;
//		  	ResultSet shareholdingsResultSet = dbCtrl.query(conn, shareholdings_sql);
//		  	Orgshareholdings
//		  	commonutil.AssertEqualsCustomize(shareholdings_created_at,shareholdings.get("created_at").getAsLong());
//		  	commonutil.AssertEqualsCustomize(shareholdings_created_by,shareholdings.get("created_by").getAsLong());
//		  	commonutil.AssertEqualsCustomize(shareholdings_id, shareholdingsResultSet.getLong("id"));
//		  	commonutil.AssertEqualsCustomize(shareholdings_org_id, shareholdingsResultSet.getLong("org_id"));
//		  	commonutil.AssertEqualsCustomize(shareholdings_hold_id, shareholdingsResultSet.getLong("hold_id"));
//		  	commonutil.AssertEqualsCustomize(shareholdings_hold_rate, shareholdingsResultSet.getDouble("hold_rate"));
//		  	commonutil.AssertEqualsCustomize(shareholdings_invest_amount, shareholdingsResultSet.getInt("invest_amount"));
//		  	commonutil.AssertEqualsCustomize(shareholdings_invest_detail, shareholdingsResultSet.getString("invest_detail"));
//		  	commonutil.AssertEqualsCustomize(shareholdings_updated_by,shareholdingsResultSet.getLong("updated_by"));
//		  	commonutil.AssertEqualsCustomize(shareholdings_updated_at, shareholdingsResultSet.getLong("updated_at"));




			OrgStockPO orgStockPO = new OrgStockPO();
			commonutil.AssertEqualsCustomize(orgStocks_id,orgStockPO.getId().longValue());
			commonutil.AssertEqualsCustomize(orgStocks_org_id, orgStockPO.getOrgId().longValue());
			commonutil.AssertEqualsCustomize(orgStocks_stock_code, orgStockPO.getStockCode());
			commonutil.AssertEqualsCustomize(orgStocks_stock_exchange, orgStockPO.getStockExchange().intValue());
			commonutil.AssertEqualsCustomize(orgStocks_created_at, orgStockPO.getCreatedAt());
			commonutil.AssertEqualsCustomize(orgStocks_created_by, orgStockPO.getCreatedBy().longValue());
			commonutil.AssertEqualsCustomize(orgStocks_updated_at, orgStockPO.getUpdatedAt());
			commonutil.AssertEqualsCustomize(orgStocks_updated_by, orgStockPO.getUpdatedBy().longValue());

			
			OrgBrandPO orgBrandPO = new OrgBrandPO();
		  	commonutil.AssertEqualsCustomize(orgBrands_type, orgBrandPO.getType().intValue());
		  	commonutil.AssertEqualsCustomize(orgBrands_id, orgBrandPO.getId().longValue());
		  	commonutil.AssertEqualsCustomize(orgBrands_description, orgBrandPO.getDescription());
		  	commonutil.AssertEqualsCustomize(orgBrands_created_by, orgBrandPO.getCreatedBy().longValue());
		  	commonutil.AssertEqualsCustomize(orgBrands_created_at, orgBrandPO.getCreatedAt());
		  	commonutil.AssertEqualsCustomize(orgBrands_updated_at, orgBrandPO.getUpdatedAt());
		  	commonutil.AssertEqualsCustomize(orgBrands_updated_by, orgBrandPO.getUpdatedBy().longValue());
		  	commonutil.AssertEqualsCustomize(orgBrands_imgUrl,  orgBrandPO.getImgUrl());
		  	commonutil.AssertEqualsCustomize(orgBrands_siteUrl, orgBrandPO.getSiteUrl());
		  	commonutil.AssertEqualsCustomize(orgBrands_title,orgBrandPO.getTitle());
		  	commonutil.AssertEqualsCustomize(orgBrands_org_id,orgBrandPO.getOrgId().longValue());

		 
		  	OrgContactWayPO orgContactWayPO = new OrgContactWayPO();
		  	commonutil.AssertEqualsCustomize(orgContactWays_id,orgContactWayPO.getId().longValue());
		  	commonutil.AssertEqualsCustomize(orgContactWays_created_at, orgContactWayPO.getCreatedAt());
		  	commonutil.AssertEqualsCustomize(orgContactWays_created_by, orgContactWayPO.getCreatedBy().longValue());
		  	commonutil.AssertEqualsCustomize(orgContactWays_address_id,orgContactWayPO.getAddressId().longValue());
		  	commonutil.AssertEqualsCustomize(orgContactWays_fax_number, orgContactWayPO.getFaxNumber());
		  	commonutil.AssertEqualsCustomize(orgContactWays_org_id, orgContactWayPO.getOrgId().longValue());
		  	commonutil.AssertEqualsCustomize(orgContactWays_phone_number, orgContactWayPO.getPhoneNumber());
		  	commonutil.AssertEqualsCustomize(orgContactWays_updated_at,orgContactWayPO.getUpdatedAt());
		  	commonutil.AssertEqualsCustomize(orgContactWays_updated_by, orgContactWayPO.getUpdatedBy().longValue());
			
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	  finally {
		  LOGGER.info("*****************Test case: Get Orgs by id List Ended*****************");
	}
  }
  

 @Test
 public void PostOrg(){
	 LOGGER.info("*****************Test case: Post Organization add Started*****************");
	  try
	  {
		  ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM organization WHERE name=\"Test company\";");
			while (resultSet.next()) {
				long id=resultSet.getLong("id");
				 String sqlstatement="DELETE FROM  organization WHERE id="+id;
				 dbCtrl.executeSql(conn,sqlstatement);	
				 String brand="DELETE FROM org_brand WHERE org_id="+id;
				 dbCtrl.executeSql(conn, brand);
				 String ContactWay="DELETE FROM org_contact_way WHERE org_id="+id;
				 dbCtrl.executeSql(conn,ContactWay);
				 String dept = "DELETE FROM org_dept WHERE org_id="+id;
				 dbCtrl.executeSql(conn, dept);
				 String history = "DELETE FROM org_history WHERE org_id="+id;
				 dbCtrl.executeSql(conn,history);
				 String shareholder = "DELETE FROM org_shareholder WHERE org_id="+id;
				 dbCtrl.executeSql(conn,shareholder);
				 String stock = "DELETE FROM org_stock WHERE org_id="+id;
				 dbCtrl.executeSql(conn, stock);
				}
	 String uri = APITest.getValue("baseuri");
	  String cookievalue= cookies.get(0);
	  String payload= String.format(APITest.loadFile("Post_Org_Add.json"));
	  System.out.println(cookievalue);
	  LOGGER.info("Post request body is:"+payload);
	  APIResponse postresponse=APIRequest.POST(uri).path("/orgs").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
	  postresponse.assertBodyContains("200");
	  ResultSet getorgid=dbCtrl.query(conn, "SELECT id FROM organization WHERE name=\"Test company\";");
	  getorgid.next();
	  
	  APIResponse response=APIRequest.GET(uri).path("/orgs/"+getorgid.getString("id")).header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).
			    invoke();
				response.assertBodyContains("200");
				String responsbody=response.getBody();
				LOGGER.info("The response body is: /n ");
				LOGGER.info(responsbody);
				JsonObject jsonObject=new JsonParser().parse(responsbody).getAsJsonObject();
				
				JsonObject body=jsonObject.getAsJsonObject("_body").getAsJsonObject("basic");	
				
				int type = body.get("type").getAsInt();
				long updatedBy = body.get("updatedBy").getAsLong();
				String description=body.get("description").getAsString();
				long ownerId=body.get("ownerId").getAsLong();
				long createdAt = body.get("createdAt").getAsLong();
				long createdBy = body.get("createdBy").getAsLong();
				String simpleName = body.get("simpleName").getAsString();
				String englishName = body.get("englishName").getAsString();
				int source = body.get("source").getAsInt();
				String aliases = body.get("aliases").getAsString();
				String phoneNo = body.get("phoneNo").getAsString();
				String logoUrl = body.get("logoUrl").getAsString();
				String siteUrl = body.get("siteUrl").getAsString();
				int finacingStatus = body.get("finacingStatus").getAsInt();
				double finacingAmount = body.get("finacingAmount").getAsDouble();
				String legalPerson = body.get("legalPerson").getAsString();
				double registedCapital = body.get("registedCapital").getAsDouble();
				long registedAt=body.get("registedAt").getAsLong();
				double turnover = body.get("turnover").getAsDouble();
				String registedNo = body.get("registedNo").getAsString();
				String registedAuthority = body.get("registedAuthority").getAsString();
				int natureCode = body.get("natureCode").getAsInt();
				int empScale = body.get("empScale").getAsInt();
				int empMeanSalary = body.get("empMeanSalary").getAsInt();
				String wxPublicNo = body.get("wxPublicNo").getAsString();
				String facebookUrl = body.get("facebookUrl").getAsString();
				String linkedinUrl = body.get("linkedinUrl").getAsString();
				String weiboUrl = body.get("weiboUrl").getAsString();
				String twitterUrl = body.get("twitterUrl").getAsString();
				String qccUnique = body.get("qccUnique").getAsString();
				String orgCode = body.get("orgCode").getAsString();
				String licenseNo = body.get("licenseNo").getAsString();
				String imgUrls = body.get("imgUrls").getAsString();
				String finacingDetail = body.get("finacingDetail").getAsString();
			  long id = body.get("id").getAsLong();

				
				JsonObject shareholdings = body.getAsJsonObject("shareholdings");
				long shareholdings_id=shareholdings.get("id").getAsLong();
				long shareholdings_org_id= shareholdings.get("orgId").getAsLong();
				long shareholdings_hold_id=shareholdings.get("holdId").getAsLong();
				double shareholdings_hold_rate=shareholdings.get("holdRate").getAsDouble();
				double shareholdings_invest_amount=shareholdings.get("investMount").getAsDouble();
				String shareholdings_invest_detail=shareholdings.get("investDetail").getAsString();
				long shareholdings_created_by=shareholdings.get("createdBy").getAsLong();
				long shareholdings_updated_by=shareholdings.get("updatedBy").getAsLong();
				long shareholdings_created_at=shareholdings.get("createdAt").getAsLong();;
				long shareholdings_updated_at=shareholdings.get("updatedAt").getAsLong();
				
				
				JsonObject createdByAccount = body.getAsJsonObject("createdByAccount");
				//String createdByAccount_password=createdByAccount.get("password").getAsString();
				String createdByAccount_nickname=createdByAccount.get("nickname").getAsString();
				String createdByAccount_mobile=createdByAccount.get("mobile").getAsString();
				long createdByAccount_id=createdByAccount.get("id").getAsLong();
				String createdByAccount_email=createdByAccount.get("email").getAsString();
				String createdByAccount_username=createdByAccount.get("username").getAsString();

			  	String createdByAccountsql ="SELECT * FROM account WHERE id"+createdBy+";";
			  	ResultSet createdByAccountResultSet=dbCtrl.query(conn, createdByAccountsql);
			  	commonutil.AssertEqualsCustomize(createdByAccount_nickname, createdByAccountResultSet.getString("nickname"));
			  	commonutil.AssertEqualsCustomize(createdByAccount_email,createdByAccountResultSet.getString("email"));
			  	commonutil.AssertEqualsCustomize(createdByAccount_mobile,createdByAccountResultSet.getString("mobile"));
			  	commonutil.AssertEqualsCustomize(createdByAccount_username, createdByAccountResultSet.getString("username"));
			  	commonutil.AssertEqualsCustomize(createdByAccount_id,createdByAccountResultSet.getLong("id"));

				JsonObject updatedByAccount = body.getAsJsonObject("updatedByAccount");
				//String updatedByAccount_password=updatedByAccount.get("password").getAsString();
				String updatedByAccount_nickname=updatedByAccount.get("nickname").getAsString();
				String updatedByAccount_mobile=updatedByAccount.get("mobile").getAsString();
				long updatedByAccount_id=updatedByAccount.get("id").getAsLong();
				String updatedByAccount_email=updatedByAccount.get("email").getAsString();
				String updatedByAccount_username=updatedByAccount.get("username").getAsString();

			  	String updatedByAccountsql ="SELECT * FROM account WHERE id"+createdBy+";";
			  	ResultSet UpdatedByAccountResultSet=dbCtrl.query(conn, updatedByAccountsql);
			  	commonutil.AssertEqualsCustomize(updatedByAccount_nickname, UpdatedByAccountResultSet.getString("nickname"));
			  	commonutil.AssertEqualsCustomize(updatedByAccount_email,UpdatedByAccountResultSet.getString("email"));
			  	commonutil.AssertEqualsCustomize(updatedByAccount_mobile,UpdatedByAccountResultSet.getString("mobile"));
			  	commonutil.AssertEqualsCustomize(updatedByAccount_username, UpdatedByAccountResultSet.getString("username"));
			  	commonutil.AssertEqualsCustomize(updatedByAccount_id,UpdatedByAccountResultSet.getLong("id"));
				
				
				
				JsonObject shareholders = body.getAsJsonObject("shareholders");
				long shareholders_id=shareholders.get("id").getAsLong();
				long shareholders_org_id=shareholders.get("orgId").getAsLong();
				long shareholders_hold_id=shareholders.get("holdId").getAsLong();
				double shareholders_hold_rate=shareholders.get("holdRate").getAsDouble();
				double shareholders_invest_amount=shareholders.get("investAmount").getAsDouble();
				String shareholders_invest_detail=shareholders.get("investDetail").getAsString();
				long shareholders_created_by=shareholders.get("createdBy").getAsLong();
				long shareholders_updated_by=shareholders.get("updatedBy").getAsLong();
				long shareholders_created_at=shareholders.get("createdAt").getAsLong();
				long shareholders_updated_at=shareholders.get("updatedAt").getAsLong();
				
				
				JsonObject orgStocks = body.getAsJsonObject("orgStocks");
				long orgStocks_id = orgStocks.get("id").getAsLong();
				long orgStocks_org_id = orgStocks.get("orgId").getAsLong();
				int orgStocks_stock_exchange = orgStocks.get("stockExchange").getAsInt();
				String orgStocks_stock_code = orgStocks.get("stockCode").getAsString();
				long orgStocks_created_by = orgStocks.get("createdBy").getAsLong();
				long orgStocks_updated_by = orgStocks.get("updatedBy").getAsLong();
				long orgStocks_created_at = orgStocks.get("createdAt").getAsLong();
				long orgStocks_updated_at = orgStocks.get("updatedAt").getAsLong();
				
				JsonArray industrialModeDicts= body.get("industrialModeDicts").getAsJsonArray();
			  for(int i=0;i<industrialModeDicts.size();i++){
				  JsonObject subObject=industrialModeDicts.get(i).getAsJsonObject();
				  String industrialModeDicts_sql ="SELECT * FROM organization WHERE target_id="+id+";";
				  ResultSet industrialModeDictsResultSet=dbCtrl.query(conn, industrialModeDicts_sql);
				  commonutil.AssertEqualsCustomize(subObject.get("type").getAsString(),industrialModeDictsResultSet.getString("dict_type"));
				  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),industrialModeDictsResultSet.getString("dict_type"));
				  String dicttype = industrialModeDictsResultSet.getString("dict_type");
				  String dict_code = subObject.get("code").getAsString();
				  ResultSet dictResultSet = dbCtrl.query(conn,"SELECT * FROM dict WHERE type="+dicttype+" AND code="+dict_code+";");
				  Long dict_title = dictResultSet.getLong("title");
				  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),dict_title);
				  commonutil.AssertEqualsCustomize(subObject.get("generated").getAsLong(),industrialModeDictsResultSet.getLong("generated"));
			  }



				JsonArray industryDicts = body.get("industryDicts").getAsJsonArray();
			  for(int i=0;i<industryDicts.size();i++){
				  JsonObject subObject=industryDicts.get(i).getAsJsonObject();
				  String industryDicts_sql ="SELECT * FROM organization WHERE target_id="+id+";";
				  ResultSet industryDictsResultSet=dbCtrl.query(conn, industryDicts_sql);
				  commonutil.AssertEqualsCustomize(subObject.get("type").getAsString(),industryDictsResultSet.getString("dict_type"));
				  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),industryDictsResultSet.getString("dict_type"));
				  String dicttype = industryDictsResultSet.getString("dict_type");
				  String dict_code = subObject.get("code").getAsString();
				  ResultSet dictResultSet = dbCtrl.query(conn,"SELECT * FROM dict WHERE type="+dicttype+" AND code="+dict_code+";");
				  Long dict_title = dictResultSet.getLong("title");
				  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),dict_title);
				  commonutil.AssertEqualsCustomize(subObject.get("generated").getAsLong(),industryDictsResultSet.getLong("generated"));
			  }

			  	JsonArray highlightDicts = body.get("highlightDicts").getAsJsonArray();
			  for(int i=0;i<highlightDicts.size();i++) {
				  JsonObject subObject=highlightDicts.get(i).getAsJsonObject();
				  String industryDicts_sql ="SELECT * FROM organization WHERE target_id="+id+";";
				  ResultSet highlightDictsResultSet=dbCtrl.query(conn, industryDicts_sql);
				  commonutil.AssertEqualsCustomize(subObject.get("type").getAsString(),highlightDictsResultSet.getString("dict_type"));
				  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),highlightDictsResultSet.getString("dict_type"));
				  String dicttype = highlightDictsResultSet.getString("dict_type");
				  String dict_code = subObject.get("code").getAsString();
				  ResultSet dictResultSet = dbCtrl.query(conn,"SELECT * FROM dict WHERE type="+dicttype+" AND code="+dict_code+";");
				  Long dict_title = dictResultSet.getLong("title");
				  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),dict_title);
				  commonutil.AssertEqualsCustomize(subObject.get("generated").getAsLong(),highlightDictsResultSet.getLong("generated"));
			  }

				JsonObject orgContactWays = body.getAsJsonObject("orgContactWays");

			  	long orgContactWays_id = orgContactWays.get("id").getAsLong();
			  	long orgContactWays_org_id = orgContactWays.get("orgId").getAsLong();
				String orgContactWays_phone_number = orgContactWays.get("phoneNumber").getAsString();
			  	long orgContactWays_created_by = orgContactWays.get("createdBy").getAsLong();
			  	long orgContactWays_updated_by = orgContactWays.get("updatedBy").getAsLong();
			  	long orgContactWays_created_at = orgContactWays.get("createdAt").getAsLong();
			  	long orgContactWays_updated_at = orgContactWays.get("updatedAt").getAsLong();
			  	String orgContactWays_fax_number = orgContactWays.get("faxNumber").getAsString();
			  	long orgContactWays_address_id = orgContactWays.get("addressId").getAsLong();



				String name = body.get("name").getAsString();
				
				JsonObject orgBrands = body.getAsJsonObject("orgBrands");
				int orgBrands_type = orgBrands.get("type").getAsInt();
			  	String orgBrands_description = orgBrands.get("description").getAsString();
			  	String orgBrands_title = orgBrands.get("title").getAsString();
			  	long orgBrands_created_by = orgBrands.get("createdBy").getAsLong();
			  	long orgBrands_updated_by = orgBrands.get("updatedBy").getAsLong();
			  	long orgBrands_id = orgBrands.get("id").getAsLong();
			  	long orgBrands_created_at = orgBrands.get("createdAt").getAsLong();
			  	long orgBrands_updated_at = orgBrands.get("updatedAt").getAsLong();
			    String orgBrands_siteUrl = orgBrands.get("siteUrl").getAsString();
			  	String orgBrands_imgUrl = orgBrands.get("imgUrl").getAsString();
			  	long orgBrands_org_id = orgBrands.get("orgId").getAsLong();

				


			  	String orgHistories_sql ="SELECT * FROM automind_test.organization WHERE org_id="+id+";";
			  	ResultSet orghHistoriesResultSet=dbCtrl.query(conn, orgHistories_sql);
				JsonObject orgHistories = body.getAsJsonObject("orgHistories");

			  	commonutil.AssertEqualsCustomize(orgHistories.get("description").getAsString(),orghHistoriesResultSet.getString("description"));
			  	commonutil.AssertEqualsCustomize(orgHistories.get("title").getAsString(),orghHistoriesResultSet.getString("title"));
			    commonutil.AssertEqualsCustomize(orgHistories.get("createdBy").getAsLong(),orghHistoriesResultSet.getLong("created_by"));
			    commonutil.AssertEqualsCustomize(orgHistories.get("createdAt").getAsLong(),orghHistoriesResultSet.getLong("created_at"));
			  	commonutil.AssertEqualsCustomize(orgHistories.get("UpdatedAt").getAsLong(),orghHistoriesResultSet.getLong("updated_at"));
			    commonutil.AssertEqualsCustomize(orgHistories.get("UpdatedBy").getAsLong(),orghHistoriesResultSet.getLong("updated_by"));
			  	commonutil.AssertEqualsCustomize(orgHistories.get("timeAt").getAsLong(),orghHistoriesResultSet.getLong("time_at"));
			  	commonutil.AssertEqualsCustomize(orgHistories.get("linkUrl").getAsLong(),orghHistoriesResultSet.getLong("link_url"));


				
				long updatedAt = body.get("updatedAt").getAsLong();
				

				String sql ="SELECT * FROM automind_test.organization WHERE org_id=;"+id;
				ResultSet organization=dbCtrl.query(conn, sql);
				
				commonutil.AssertEqualsCustomize(id, organization.getLong("id"));
				commonutil.AssertEqualsCustomize(name, organization.getString("name"));
				commonutil.AssertEqualsCustomize(createdAt, organization.getLong("created_at"));
				commonutil.AssertEqualsCustomize(updatedAt, organization.getLong("updated_at"));
				commonutil.AssertEqualsCustomize(createdBy, organization.getLong("created_by"));
				commonutil.AssertEqualsCustomize(updatedBy, organization.getLong("updated_by"));
				commonutil.AssertEqualsCustomize(ownerId, organization.getLong("owner_id"));
				commonutil.AssertEqualsCustomize(registedAt, organization.getLong("registed_at"));
				commonutil.AssertEqualsCustomize(source, organization.getInt("source"));
				commonutil.AssertEqualsCustomize(description, organization.getString("description"));
				commonutil.AssertEqualsCustomize(englishName, organization.getString("english_name"));
				commonutil.AssertEqualsCustomize(type, organization.getInt("type"));
				commonutil.AssertEqualsCustomize(phoneNo, organization.getString("phone_no"));
				commonutil.AssertEqualsCustomize(simpleName, organization.getString("simple_name"));
				commonutil.AssertEqualsCustomize(aliases, organization.getString("aliases"));
				commonutil.AssertEqualsCustomize(logoUrl, organization.getString("logo_url"));
				commonutil.AssertEqualsCustomize(siteUrl, organization.getString("site_url"));
				commonutil.AssertEqualsCustomize(finacingDetail, organization.getString("finacing_detail"));
				commonutil.AssertEqualsCustomize(finacingAmount, organization.getDouble("finacing_amount"));
			    commonutil.AssertEqualsCustomize(legalPerson, organization.getString("legal_person"));
			    commonutil.AssertEqualsCustomize(registedCapital,organization.getString("registed_capital"));
			    commonutil.AssertEqualsCustomize(registedAt,organization.getString("registed_at"));
			  	commonutil.AssertEqualsCustomize(turnover, organization.getDouble("turnover"));
			  	commonutil.AssertEqualsCustomize(registedNo,organization.getString("registedNo"));
			  	commonutil.AssertEqualsCustomize(registedAuthority, organization.getString("registed_authority"));
			  	commonutil.AssertEqualsCustomize(natureCode,organization.getInt("natureCode"));
			  	commonutil.AssertEqualsCustomize(empScale, organization.getInt("empScale"));
			  	commonutil.AssertEqualsCustomize(empMeanSalary,organization.getInt("empMean_salary"));
			  	commonutil.AssertEqualsCustomize(wxPublicNo,organization.getString("wxPublic_no"));
			  	commonutil.AssertEqualsCustomize(facebookUrl,organization.getString("facebook_url"));
			  	commonutil.AssertEqualsCustomize(linkedinUrl,organization.getString("linkedin_url"));
			  	commonutil.AssertEqualsCustomize(weiboUrl,organization.getString("weibo_url"));
			  	commonutil.AssertEqualsCustomize(twitterUrl,organization.getString("twitter_url"));
			  	commonutil.AssertEqualsCustomize(qccUnique,organization.getString("qcc_unique"));
			  	commonutil.AssertEqualsCustomize(orgCode,organization.getString("org_code"));
			  	commonutil.AssertEqualsCustomize(licenseNo,organization.getString("license_no"));
			  	commonutil.AssertEqualsCustomize(imgUrls,organization.getString("img_urls"));
			  	commonutil.AssertEqualsCustomize(finacingDetail,organization.getString("finacing_detail"));
			  	commonutil.AssertEqualsCustomize(finacingStatus,organization.getString("finacing_status"));
				
				String shareholders_sql ="SELECT * FROM automind_test.org_shareholder WHERE org_id=;"+id; 
				ResultSet shareholdersResultSet = dbCtrl.query(conn, shareholders_sql);
				commonutil.AssertEqualsCustomize(shareholders_id, shareholdersResultSet.getLong("id"));
				commonutil.AssertEqualsCustomize(shareholders_org_id, shareholdersResultSet.getLong("org_id"));
				commonutil.AssertEqualsCustomize(shareholders_hold_id, shareholdersResultSet.getLong("hold_id"));
				commonutil.AssertEqualsCustomize(shareholders_hold_rate, shareholdersResultSet.getDouble("hold_rate"));
				commonutil.AssertEqualsCustomize(shareholders_invest_amount, shareholdersResultSet.getInt("invest_amount"));
				commonutil.AssertEqualsCustomize(shareholders_invest_detail, shareholdersResultSet.getString("invest_detail"));
				commonutil.AssertEqualsCustomize(shareholders_created_at, shareholdersResultSet.getLong("created_at"));
				commonutil.AssertEqualsCustomize(shareholders_created_by, shareholdersResultSet.getLong("created_by"));
				commonutil.AssertEqualsCustomize(shareholders_updated_by, shareholdersResultSet.getLong("updated_by"));
				commonutil.AssertEqualsCustomize(shareholders_updated_at, shareholdersResultSet.getLong("updated_at"));


			  	String shareholdings_sql ="SELECT * FROM automind_test.org_shareholder WHERE org_id=;"+id;

			  	ResultSet shareholdingsResultSet = dbCtrl.query(conn, shareholdings_sql);
			  	commonutil.AssertEqualsCustomize(shareholdings_created_at,shareholdings.get("created_at").getAsLong());
			  	commonutil.AssertEqualsCustomize(shareholdings_created_by,shareholdings.get("created_by").getAsLong());
			  	commonutil.AssertEqualsCustomize(shareholdings_id, shareholdingsResultSet.getLong("id"));
			  	commonutil.AssertEqualsCustomize(shareholdings_org_id, shareholdingsResultSet.getLong("org_id"));
			  	commonutil.AssertEqualsCustomize(shareholdings_hold_id, shareholdingsResultSet.getLong("hold_id"));
			  	commonutil.AssertEqualsCustomize(shareholdings_hold_rate, shareholdingsResultSet.getDouble("hold_rate"));
			  	commonutil.AssertEqualsCustomize(shareholdings_invest_amount, shareholdingsResultSet.getInt("invest_amount"));
			  	commonutil.AssertEqualsCustomize(shareholdings_invest_detail, shareholdingsResultSet.getString("invest_detail"));
			  	commonutil.AssertEqualsCustomize(shareholdings_updated_by,shareholdingsResultSet.getLong("updated_by"));
			  	commonutil.AssertEqualsCustomize(shareholdings_updated_at, shareholdingsResultSet.getLong("updated_at"));



			  String stock_sql ="SELECT * FROM automind_test.org_stock WHERE org_id=;"+id;
				ResultSet stockResultSet = dbCtrl.query(conn, stock_sql);
				commonutil.AssertEqualsCustomize(orgStocks_id,stockResultSet.getLong("id"));
				commonutil.AssertEqualsCustomize(orgStocks_org_id, stockResultSet.getLong("org_id"));
				commonutil.AssertEqualsCustomize(orgStocks_stock_code, stockResultSet.getString("stock_code"));
				commonutil.AssertEqualsCustomize(orgStocks_stock_exchange, stockResultSet.getInt("stock_exchange"));
				commonutil.AssertEqualsCustomize(orgStocks_created_at, stockResultSet.getLong("created_at"));
				commonutil.AssertEqualsCustomize(orgStocks_created_by, stockResultSet.getLong("created_by"));
				commonutil.AssertEqualsCustomize(orgStocks_updated_at, stockResultSet.getLong("updated_at"));
				commonutil.AssertEqualsCustomize(orgStocks_updated_by, stockResultSet.getLong("updated_by"));
				
				String brand_sql ="SELECT * FROM automind_test.org_brand WHERE org_id=;"+id; 
				ResultSet brandResultSet = dbCtrl.query(conn, brand_sql);
			  	commonutil.AssertEqualsCustomize(orgBrands_type, brandResultSet.getInt("type"));
			  	commonutil.AssertEqualsCustomize(orgBrands_id, brandResultSet.getLong("id"));
			  	commonutil.AssertEqualsCustomize(orgBrands_description, brandResultSet.getString("description"));
			  	commonutil.AssertEqualsCustomize(orgBrands_created_by, brandResultSet.getLong("created_by"));
			  	commonutil.AssertEqualsCustomize(orgBrands_created_at, brandResultSet.getLong("created_at"));
			  	commonutil.AssertEqualsCustomize(orgBrands_updated_at, brandResultSet.getLong("updated_at"));
			  	commonutil.AssertEqualsCustomize(orgBrands_updated_by, brandResultSet.getLong("updated_by"));
			  	commonutil.AssertEqualsCustomize(orgBrands_imgUrl,  brandResultSet.getString("img_Url"));
			  	commonutil.AssertEqualsCustomize(orgBrands_siteUrl, brandResultSet.getString("site_Url"));
			  	commonutil.AssertEqualsCustomize(orgBrands_title,brandResultSet.getString("title"));
			  	commonutil.AssertEqualsCustomize(orgBrands_org_id,brandResultSet.getLong("org_id"));

			  	String contacWays_sql ="SELECT * FROM automind_test.org_brand WHERE org_id=;"+id;
			  	ResultSet contactWaysResultSet = dbCtrl.query(conn, contacWays_sql);
			  	commonutil.AssertEqualsCustomize(orgContactWays_id,contactWaysResultSet.getInt("id"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_created_at, contactWaysResultSet.getLong("created_at"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_created_by, contactWaysResultSet.getLong("created_by"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_address_id,contactWaysResultSet.getLong("address_id"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_fax_number, contactWaysResultSet.getString("fax_number"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_org_id, contactWaysResultSet.getLong("org_id"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_phone_number, contactWaysResultSet.getString("phone_number"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_updated_at,contactWaysResultSet.getLong("updated_at"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_updated_by, contactWaysResultSet.getLong("updated_by"));
				
	  
	  } 
	  catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  finally {		 
			 LOGGER.info("*****************Test case: Post Organization add Started*****************");
	}
 }
 
 @Test (dependsOnMethods={"PostOrg"})
 public void PostOrgDuplicate(){
	 try {
		LOGGER.info("*****************Test case: Post Organization add duplicate Started*****************");
		String uri = APITest.getValue("baseuri");
		String cookievalue= cookies.get(0);
		String payload= String.format(APITest.loadFile("Post_Org_Add.json"));
		System.out.println(cookievalue);
		LOGGER.info("Post request body is:"+payload);
		APIResponse postresponse=APIRequest.POST(uri).path("/orgs").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
		postresponse.assertBodyContains("500");
		postresponse.assertBodyContains("Duplicate entry");
	} finally {
		 ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM organization WHERE name=\"Test company\";");
			try {
				while (resultSet.next()) {
					long id=resultSet.getLong("id");
					 String sqlstatement="DELETE FROM  organization WHERE id="+id;
					 dbCtrl.executeSql(conn,sqlstatement);	
					 String brand="DELETE FROM org_brand WHERE org_id="+id;
					 dbCtrl.executeSql(conn, brand);
					 String ContactWay="DELETE FROM org_contact_way WHERE org_id="+id;
					 dbCtrl.executeSql(conn,ContactWay);
					 String dept = "DELETE FROM org_dept WHERE org_id="+id;
					 dbCtrl.executeSql(conn, dept);
					 String history = "DELETE FROM org_history WHERE org_id="+id;
					 dbCtrl.executeSql(conn,history);
					 String shareholder = "DELETE FROM org_shareholder WHERE org_id="+id;
					 dbCtrl.executeSql(conn,shareholder);
					 String stock = "DELETE FROM org_stock WHERE org_id="+id;
					 dbCtrl.executeSql(conn, stock);
					}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		 LOGGER.info("*****************Test case: Post Organization add duplicate Started*****************");
	}
 }
 
 
 @Test
 public void PostOrgMissElement() {
	try {
		LOGGER.info("*****************Test case: Post Organization add Miss Element Started*****************");
		String uri = APITest.getValue("baseuri");
		String cookievalue= cookies.get(0);
		String value = "{\"description\": \"Test for automation\",\"source\": 0,\"type\": 0,\"reason\": \"Test for Automation\",\"simpleName\": \"TC\"}";
		System.out.println(cookievalue);
		APIResponse postresponse=APIRequest.POST(uri).path("/orgs").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(value).invoke();
		postresponse.assertBodyContains("500");
		postresponse.assertBodyContains("公司名字不能为空");
	} catch (Exception e) {
		LOGGER.info("*****************Test case: Post Organization add Miss Element Ended*****************");
	}
}
 
 @Test
 public void PostOrgUpdateWithWrongId(){
		try {
			LOGGER.info("*****************Test case: Post Organization update with Wrong id Started*****************");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0);
			String value = "{\"id\":-1,\"description\": \"Test for automation\",\"name\": \"Test for automation\",\"source\": 0,\"type\": 0,\"reason\": \"Test for Automation\",\"simpleName\": \"TC\"}";
			System.out.println(cookievalue);
			APIResponse postresponse=APIRequest.POST(uri).path("/orgs").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(value).invoke();
			postresponse.assertBodyContains("500");
			postresponse.assertBodyContains("公司-1不存在");

		} finally {			
			LOGGER.info("*****************Test case: Post Organization add Miss Element Ended*****************");
		}
 }
 
 @Test
 public void PostOrgAddWithEmptyName(){
		try {
			LOGGER.info("*****************Test case: Post Organization Add with Empty Name Started*****************");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0);
			String value = "{\"description\": \"Test for automation\",\"name\": \"\",\"source\": 0,\"type\": 0,\"reason\": \"Test for Automation\",\"simpleName\": \"TC\"}";
			System.out.println(cookievalue);
			APIResponse postresponse=APIRequest.POST(uri).path("/orgs").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(value).invoke();
			postresponse.assertBodyContains("500");
		} finally {			
			LOGGER.info("*****************Test case: Post Organization add Miss Element Ended*****************");
		}
 }
 
 @Test
 public void PATCHOrgBasic(){
	 try {
		LOGGER.info("*****************Test case: Post Organization Basic Started*****************");
		String uri = APITest.getValue("baseuri");
		String cookievalue= cookies.get(0);
		String payload= String.format(APITest.loadFile("Post_Org_Basic.json"));
		APIResponse postresponse=APIRequest.PATCH(uri).path("/orgs/basic").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
		postresponse.assertBodyContains("200");

	} catch (Exception e) {
		LOGGER.error(e);
	}
 }

 @Test
 public void PostOrgBrand(){
	 try {
		 LOGGER.info("*****************Test case: Post Organization Brands Started*****************");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0); 

			//String payload= String.format(APITest.loadFile("Post_Org_Brands.json"));
		 	String payload="{\n" +
					"      \"description\": \"Automation Testing\",\n" +
					"      \"title\": \"Testing for Automation\",     \n" +
					"      \"orgId\": "+orgid+",\n" +
					"      \"siteUrl\": \"string\",\n" +
					"      \"imgUrl\": \"string\",\n" +
					"      \"trademark\": \"string\"\n" +
					"    }";
			APIResponse postresponse=APIRequest.POST(uri).path("/orgs/brands").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
			postresponse.assertBodyContains("200");
			ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM org_brand WHERE title=\"Testing for Automation\";");
			while (resultSet.next())
			{
				commonutil.AssertEqualsCustomize(resultSet.getString("description"), "Automation Testing");
				commonutil.AssertEqualsCustomize(resultSet.getString("siteUrl"), "string");
				commonutil.AssertEqualsCustomize(resultSet.getString("imgUrl"), "string");
				commonutil.AssertEqualsCustomize(resultSet.getString("trademark"), "string");
			}
			
		} catch (Exception e) {
	} finally {
		 LOGGER.info("*****************Test case: Post Organization Brands Ended*****************");
		dbCtrl.executeSql(conn, "DELETE FROM org_brand WHERE org_id="+orgid+"AND title=\"Testing for Automation\";");
	}
 }

 @Test
 public void PostOrgBrandFull(){
	 try {
		 LOGGER.info("*****************Test case: Post Organization Brands Started*****************");
		 String uri = APITest.getValue("baseuri");
		 String cookievalue= cookies.get(0);

		 //String payload= String.format(APITest.loadFile("Post_Org_Brands.json"));
		 String payload="{\n" +
				 "  \"orgId\": "+orgid+",\n" +
				 "  \"imgUrl\": \"2016-11-21T03:55:04.018Z\",\n" +
				 "  \"siteUrl\": \"http://xxxxxx.comx\",\n" +
				 "\t\"title\": \"这是测试品牌名称\",\n" +
				 "\t\"type\": \"2\",\n" +
				 "\t\"description\": \"这是测试历程简述\",\n" +
				 "      \"trademark\": \"这是测试交易信息\"\n" +
				 "}";
		 APIResponse postresponse=APIRequest.POST(uri).path("/orgs/brands").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
		 postresponse.assertBodyContains("200");
		 ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM org_brand WHERE title=\"这是测试品牌名称\";");
		 while (resultSet.next())
		 {
			 commonutil.AssertEqualsCustomize(resultSet.getString("description"), "这是测试历程简述");
			 commonutil.AssertEqualsCustomize(resultSet.getString("siteUrl"), "http://xxxxxx.comx");
			 commonutil.AssertEqualsCustomize(resultSet.getString("imgUrl"), "2016-11-21T03:55:04.018Z");
			 commonutil.AssertEqualsCustomize(resultSet.getString("trademark"), "这是测试交易信息");
			 commonutil.AssertEqualsCustomize(resultSet.getString("title"),"这是测试品牌名称");
		 }

	 } catch (Exception e) {
	 } finally {
		 LOGGER.info("*****************Test case: Post Organization Brands Ended*****************");
		 dbCtrl.executeSql(conn, "DELETE FROM org_brand WHERE org_id="+orgid+"AND title=\"这是测试品牌名称\";");
	 }
 }
 
 @Test
 public void PostOrgBrandwithWrongOrgId(){
	 try {
		 LOGGER.info("*****************Test case: Post Organization Brands with Wrong Org Id Started*****************");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0); 
			String value ="{\"description\": \"Automation Testing\",\"title\": \"Testing for Automation\", \"orgId\": -1,\"siteUrl\": \"string\",\"imgUrl\": \"string\",\"trademark\": \"string\"}";
			APIResponse postresponse=APIRequest.POST(uri).path("/orgs/brands").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(value).invoke();
			postresponse.assertBodyContains("500");
		 	postresponse.assertBodyContains("公司-1不存在");
	 }
	 finally {
		 	LOGGER.info("*****************Test case: Post Organization Brands with Wrong Org Id Ended*****************");
	}
 }
 
 @Test
 public void PostOrgBrandwithNoOrgId(){
	 try {
		 LOGGER.info("*****************Test case: Post Organization Brands with No Org Id Started*****************");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0); 
			String value ="{\"description\": \"Automation Testing\",\"title\": \"Testing for Automation\", \"siteUrl\": \"string\",\"imgUrl\": \"string\",\"trademark\": \"string\"}";
			APIResponse postresponse=APIRequest.POST(uri).path("/orgs/brands").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(value).invoke();
			postresponse.assertBodyContains("450");
		 	postresponse.assertBodyContains("orgId不能为空");
	 }
	 finally {
		 dbCtrl.executeSql(conn, "DELETE FROM org_contact_way WHERE name=\"Testing for Automation\";");
		 	LOGGER.info("*****************Test case: Post Organization Brands with No Org Id Ended*****************");
	} 
 }
 
 @Test
 public void PostBrandwithNoCookie(){
   LOGGER.info("*****************Test case: Post Organization Brands with No Cookie Started*****************");
   try{
     String uri = APITest.getValue("baseuri");
     String cookievalue= cookies.get(0);
     System.out.println(cookievalue);
     String payload= String.format(APITest.loadFile("Post_Org_Brand.json"));
     APIResponse response=APIRequest.POST(uri).path("/orgs/brand").type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
     response.assertBodyContains("401");
   }
   catch (Exception e)
   {}
   finally {
     System.out.println("*****************Test case:Post Organization Brands with No Cookie Ended*****************");
   }

 }

 @Test 
 public void PostBrandwithBadCookie(){
	   LOGGER.info("*****************Test case: Post Organization Brands with Bad Cookie Started*****************");
	   try{
	     String uri = APITest.getValue("baseuri");
	     String cookievalue= cookies.get(0);
	     System.out.println(cookievalue);
	     String payload= String.format(APITest.loadFile("Post_Org_Brand.json"));
	     APIResponse response=APIRequest.POST(uri).path("/orgs/brand").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue+"1").body(payload).invoke();
	     response.assertBodyContains("403");
	   }
	   catch (Exception e)
	   {}
	   finally {
	     System.out.println("*****************Test case:Post Organization Brands with Bad Cookie Ended*****************");
	   }
 }
 
 
 @Test
 public void DeleteOrgsBrands() throws SQLException
 {
	 try {
		   LOGGER.info("*****************Test case: Delete Organization Brands Started*****************");
		 String command="INSERT INTO org_brand(id, org_id, `type`, img_url, trademark, title, site_url, description, created_by, updated_by, created_at, updated_at) VALUES(0, "+orgid+", '1', '', '', '', '', 'Test for Automation', 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
		 dbCtrl.executeSql(conn, command);
		 String uri = APITest.getValue("baseuri");
		 ResultSet resultSet=dbCtrl.query(conn, "SELECT id from org_brand WHERE org_id="+orgid+" AND description=\"Test for Automation\";");
		 resultSet.next();
		 long id=resultSet.getLong("id");
		 LOGGER.info("Get the id"+id);
	     String cookievalue= cookies.get(0);
	     APIResponse response=APIRequest.DELETE(uri).path("/orgs/brands/"+id).type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).invoke();
	     response.assertBodyContains("200");
	     ResultSet result=dbCtrl.query(conn, "SELECT id from org_brand WHERE org_id="+orgid+" AND description=\"Test for Automation\";");
	     result.last();
	     commonutil.AssertEqualsCustomize(result.getRow(), 0);
	}  finally {
		dbCtrl.executeSql(conn, "DELETE from org_brand WHERE org_id="+orgid+" AND description=\"Test for Automation\";");
		LOGGER.info("*****************Test case: Delete Organization Brands Ended*****************");
	}
 }
 
 @Test
 public void DeleteOrgsBrandsWithWrongId() {
	 try {
		 LOGGER.info("*****************Test case: Delete Organization Brands with Wrong Id Started*****************");
		 String uri = APITest.getValue("baseuri");
		 String cookievalue = cookies.get(0);
		 APIResponse response = APIRequest.DELETE(uri).path("/orgs/brands/" + -2).type(MediaType.APPLICATION_JSON_TYPE).header("cookie", cookievalue).invoke();
		 response.assertBodyContains("500");
		 response.assertBodyContains("对象-2不存在");
	 } finally {
		 LOGGER.info("*****************Test case: Delete Organization Brands with Wrong Id Ended*****************");
	 }
 }

 
 
 @Test
 public void PostOrgContactWays(){
	 try {
		 	LOGGER.info("*****************Test case: Post Organization Contact Ways Started*****************");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0);
		 	ResultSet location = dbCtrl.query(conn,"SELECT * FROM location");
		 	location.next();
		 	Long location_id = location.getLong("location_id");
			//String payload= String.format(APITest.loadFile("Post_Org_ContactWays.json"));
		 	String payload = "{\n" +
					"  \"orgId\":"+orgid+",\n" +
					"  \"faxNumber\": \"传真\",\n" +
					"  \"phoneNumber\": \"电话\",\n" +
					"\t\"email\": \"TestAutomation@test.com\",\n" +
					"\t\"address\": {\n" +
					"\t  \"detail\":\"测试详细地址\",\n" +
					"\t\t\"locationId\": "+location_id+"\n" +
					"\t}\n" +
					"}";
			APIResponse postresponse=APIRequest.POST(uri).path("/orgs/contactWays").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
			postresponse.assertBodyContains("200");
			ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM org_contact_way WHERE org_id="+orgid+" AND email=\"TestAutomation@test.com\";");
			resultSet.last();
			commonutil.AssertEqualsCustomize(resultSet.getRow(), 1);
		 	ResultSet address = dbCtrl.query(conn,"SELECT * FROM address WHERE location_id="+location_id+" AND detail=\"测试详细地址\";");
		 	address.last();
		 	System.out.println(address.next());
		 	commonutil.AssertEqualsCustomize(address.getRow(),1);
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		dbCtrl.executeSql(conn, "DELETE FROM org_contact_way WHERE org_id="+orgid+" AND email=\"TestAutomation@test.com\";");
		LOGGER.info("*****************Test case: Post Organization Contact Ways Ended*****************");
	}
 }

 @Test
 public void PostOrgContacWaysUpdate(){
	 try {
		 LOGGER.info("*****************Test case: Post Organization Contact Ways Update Started*****************");
		 String uri = APITest.getValue("baseuri");
		 String cookievalue= cookies.get(0);
		 ResultSet location = dbCtrl.query(conn,"SELECT * FROM location");
		 location.next();
		 Long location_id = location.getLong("id");
		 String sql = "INSERT INTO org_contact_way\n" +
				 "(id, org_id, address_id, email, fax_number, phone_number, created_by, updated_by, created_at, updated_at)\n" +
				 "VALUES(0, "+orgid+", 82, 'test_automation@rest.com', '12374127412', '', 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);\n";
		 dbCtrl.executeSql(conn,sql);
		 ResultSet query = dbCtrl.query(conn,"SELECT * FROM org_contact_way WHERE org_id="+orgid+" AND email=\"test_automation@rest.com\";");
		 Long id;
		query.next();
		id=query.getLong("id");
		 String payload = "{\n" +
				 "  \"orgId\":"+orgid+",\n" +
				 "  \"id\":"+id+",\n" +
				 "  \"faxNumber\": \"12312312312\",\n" +
				 "  \"phoneNumber\": \"13513513521\",\n" +
				 "\t\"email\": \"TestAutomation@test.com\",\n" +
				 "\t\"address\": {\n" +
				 "\t  \"detail\":\"详细地址\",\n" +
				 "\t\t\"locationId\": "+location_id+"\n" +
				 "\t}\n" +
				 "}";
		 APIResponse postresponse=APIRequest.POST(uri).path("/orgs/contactWays").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
		 postresponse.assertBodyContains("200");
		 ResultSet resultSet=dbCtrl.query(conn, "SELECT id FROM org_contact_way WHERE org_id="+orgid+" AND email=\"TestAutomation@test.com\";");
		 resultSet.last();
		 commonutil.AssertEqualsCustomize(resultSet.getRow(), 1);
		 commonutil.AssertEqualsCustomize(resultSet.getString("fax_number"),"12312312312");
		 commonutil.AssertEqualsCustomize(resultSet.getString("phone_number"),"13513513521");
	 } catch (SQLException e) {
		 e.printStackTrace();
	 } finally {
		 dbCtrl.executeSql(conn, "DELETE FROM org_contact_way WHERE org_id="+orgid+" AND email=\"TestAutomation@test.com\";");
		 dbCtrl.executeSql(conn,"DELETE FROM address WHERE location_id="+location_id);
		 LOGGER.info("*****************Test case: Post Organization Contact Ways Update Ended*****************");
	 }
 }
 

 @Test
 public void PostOrgContacWayswithNoOrgId(){
	 try {
		 LOGGER.info("*****************Test case: Post Organization Contact Ways with no Org Id Started*****************");
		 String uri = APITest.getValue("baseuri");
		 String cookievalue= cookies.get(0);
		 //String payload= String.format(APITest.loadFile("Post_Org_ContactWays.json"));
		 String payload = "{\n" +
				 "  \"faxNumber\": \"传真\",\n" +
				 "  \"phoneNumber\": \"电话\",\n" +
				 "\t\"email\": \"TestAutomation@test.com\",\n" +
				 "\t\"address\": {\n" +
				 "\t  \"detail\":\"详细地址\",\n" +
				 "\t\t\"locationId\": 111\n" +
				 "\t}\n" +
				 "}";
		 APIResponse postresponse=APIRequest.POST(uri).path("/orgs/contactWays").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
		 postresponse.assertBodyContains("450");
		 postresponse.assertBodyContains("orgId不能为空");
	 }  finally {
		 LOGGER.info("*****************Test case: Post Organization Contact Ways  with no Org Id Ended*****************");
	 }
 }
 

 @Test
 public void PostOrgDepts(){
	 try {
		 	LOGGER.info("*****************Test case: Post Organization Depts Started*****************");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0);
			String payload = "{\n" +
					"  \"orgId\": "+orgid+",\n" +
					"  \"name\": \"Test for Automation\",\n" +
					"  \"telNo\": \"18883488888\"\n" +
					"}";
			APIResponse postresponse=APIRequest.POST(uri).path("/orgs/depts").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
			postresponse.assertBodyContains("200");
		 	ResultSet resultSet = dbCtrl.query(conn,"SELECT * FROM org_dept WHERE org_id="+orgid+" AND tel_no=\"18883488888\";");
		 	resultSet.next();
		 	commonutil.AssertEqualsCustomize(resultSet.getLong("org_id"), orgid);
		 	commonutil.AssertEqualsCustomize(resultSet.getString("name"), "Test for Automation");
		 	commonutil.AssertEqualsCustomize(resultSet.getString("tel_no"), "18883488888");

			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {	 	
		 LOGGER.info("*****************Test case: Post Organization Depts Ended*****************");
	}
 }
 
 @Test(dependsOnMethods={"PostOrgDepts"})
 public void PostOrgDeptDuplicated(){
	 try {
		 	LOGGER.info("*****************Test case: Post Organization Depts Duplicated Started*****************");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0);
			String payload = "{\n" +
					"  \"orgId\": "+orgid+",\n" +
					"  \"name\": \"Test for Automation\",\n" +
					"  \"telNo\": \"18883488888\"\n" +
					"}";
			APIResponse postresponse=APIRequest.POST(uri).path("/orgs/depts").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
			ResultSet resultSet = dbCtrl.query(conn,"SELECT * FROM org_dept WHERE org_id="+orgid+" AND tel_no=\"18883488888\";");
		 	resultSet.next();
		 	commonutil.AssertEqualsCustomize(resultSet.getLong("org_id"), orgid);
		 	commonutil.AssertEqualsCustomize(resultSet.getString("name"), "Test for Automation");
		 	commonutil.AssertEqualsCustomize(resultSet.getString("tel_no"), "18883488888");
		 	resultSet.last();
		 	commonutil.AssertEqualsCustomize(resultSet.getRow(), 1);
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		ResultSet resultSet = dbCtrl.query(conn,"SELECT * FROM org_dept WHERE org_id="+orgid+" AND tel_no=\"18883488888\";");
	 	try {
			while(resultSet.next()){
				long id = resultSet.getLong("id");
				dbCtrl.executeSql(conn, "DELETE FROM org_dept WHERE id="+id+";");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 LOGGER.info("*****************Test case: Post Organization Duplicated Ended*****************");
	}
 }
 
 @Test
 public void PostOrgDeptModifyName(){
	 try {
		 	LOGGER.info("*****************Test case: Post Organization Depts Modify Name Started*****************");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0);
			String sql = "INSERT org_dept\n" +
					"(id, org_id, name, tel_no, created_by, updated_by, created_at, updated_at)\n" +
					"VALUES(0, "+orgid+", 'Test for Automation modification', '12345678933', 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);\n";
		 	dbCtrl.executeSql(conn,sql);
		 	ResultSet queryresult=dbCtrl.query(conn,"SELECT * FROM org_dept where org_id="+orgid+" AND name=\"Test for automation modification\"");
		 	queryresult.next();
		 	long id=queryresult.getLong("id");
			String payload = "{\n" +
					"  \"id\": "+id+",\n" +
					"  \"orgId\": "+orgid+",\n" +
					"  \"name\": \"Test for Automation New\",\n" +
					"  \"telNo\": \"18883488888\"\n" +
					"}";
			APIResponse postresponse=APIRequest.POST(uri).path("/orgs/depts").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
			ResultSet resultSet = dbCtrl.query(conn,"SELECT * FROM org_dept WHERE id="+id+" AND name=\"Test for Automation New\";");
		 	resultSet.next();
		 	commonutil.AssertEqualsCustomize(resultSet.getLong("org_id"), orgid);
		 	commonutil.AssertEqualsCustomize(resultSet.getString("name"), "Test for Automation New");
		 	commonutil.AssertEqualsCustomize(resultSet.getString("tel_no"), "18883488888");
		 	resultSet.last();
		 	commonutil.AssertEqualsCustomize(resultSet.getRow(), 1);
			
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {		
	 	try {
	 		ResultSet resultSet = dbCtrl.query(conn,"SELECT * FROM org_dept WHERE org_id="+orgid+" AND name=\"Test for Automation New\";");
			while(resultSet.next()){
				long id = resultSet.getLong("id");
				dbCtrl.executeSql(conn, "DELETE FROM org_dept WHERE id="+id+";");
			}
			ResultSet resultSet2 = dbCtrl.query(conn,"SELECT * FROM org_dept WHERE org_id="+orgid+" AND name=\"Test for automation modification\";");
			while(resultSet2.next()){
				long id = resultSet.getLong("id");
				dbCtrl.executeSql(conn, "DELETE FROM org_dept WHERE id="+id+";");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 LOGGER.info("*****************Test case: Post Organization Modify Name Ended*****************");
	}
 }

	@Test
	public void PostOrgDeptModifyNamewithExistedName(){
		try {
			LOGGER.info("*****************Test case: Post Organization Depts Modify Name with Existed Name Started*****************");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0);
			String sql = "INSERT org_dept\n" +
					"(id, org_id, name, tel_no, created_by, updated_by, created_at, updated_at)\n" +
					"VALUES(0, "+orgid+", 'Test for Automation modification', '12345678933', 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);\n";
			dbCtrl.executeSql(conn,sql);
			ResultSet queryresult=dbCtrl.query(conn,"SELECT * FROM org_dept WHERE org_id="+orgid+" AND name=\"Test for automation modification\"");
			queryresult.next();
			long id=queryresult.getLong("id");
			String sql1 = "INSERT org_dept\n" +
					"(id, org_id, name, tel_no, created_by, updated_by, created_at, updated_at)\n" +
					"VALUES(0, "+orgid+", 'Test for Automation Duplicated', '12345678933', 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);\n";
			dbCtrl.executeSql(conn,sql1);
			String payload = "{\n" +
					"  \"id\": "+id+",\n" +
					"  \"orgId\": "+orgid+",\n" +
					"  \"name\": \"Test for Automation Duplicated\",\n" +
					"  \"telNo\": \"18883488888\"\n" +
					"}";
			APIResponse postresponse=APIRequest.POST(uri).path("/orgs/depts").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
			postresponse.assertBodyContains("部门Test for Automation Duplicated已存在");
			postresponse.assertBodyContains("500");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ResultSet resultSet = dbCtrl.query(conn,"SELECT * FROM org_dept WHERE org_id="+orgid+" AND name=\"Test for Automation New\";");
			try {
				while(resultSet.next()){
					long id = resultSet.getLong("id");
					dbCtrl.executeSql(conn, "DELETE FROM org_dept WHERE id="+id+";");
				}
				ResultSet resultSetduplicated = dbCtrl.query(conn,"SELECT * FROM org_dept WHERE org_id="+orgid+" AND name=\"Test for Automation Duplicated\";");
				while(resultSetduplicated.next())
				{
					long id = resultSetduplicated.getLong("id");
					dbCtrl.executeSql(conn, "DELETE FROM org_dept WHERE id="+id+";");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			LOGGER.info("*****************Test case: Post Organization Modify Name with Existed Name Ended*****************");
		}
	}
 @Test
 public void PostOrgDeptswithNoExistedOrgId(){
	 try {
		 	LOGGER.info("*****************Test case: Post Organization Depts with No Existed Org Started*****************");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0);
			String payload = "{\n" +
					"  \"orgId\": -1,\n" +
					"  \"name\": \"Test for Automation\",\n" +
					"  \"telNo\": \"18883488888\"\n" +
					"}";
			APIResponse postresponse=APIRequest.POST(uri).path("/orgs/depts").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
			postresponse.assertBodyContains("公司-1不存在");

			
	} finally {
		
		 LOGGER.info("*****************Test case: Post Organization No Existed Org Ended*****************");
	}
 }

 @Test
 public void PostOrgDeptsWithNoOrgId(){
	 try {
		 LOGGER.info("*****************Test case: Post Organization Depts with No Org ID Started*****************");
		 String uri = APITest.getValue("baseuri");
		 String cookievalue= cookies.get(0);
		 String payload = "{\n" +
				 "  \"name\": \"Test for Automation\",\n" +
				 "  \"telNo\": \"18883488888\"\n" +
				 "}";
		 APIResponse postresponse=APIRequest.POST(uri).path("/orgs/depts").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
		 postresponse.assertBodyContains("450");
		 postresponse.assertBodyContains("orgId不能为空");


	 } finally {

		 LOGGER.info("*****************Test case: Post Organization Depts with No Org ID Ended*****************");
	 }
 }



 @Test
 public void PostOrgDeptWithSpeciallName(){
	 try {
		 LOGGER.info("*****************Test case: Post Organization Depts with Special Name Started*****************");
		 String uri = APITest.getValue("baseuri");
		 String cookievalue= cookies.get(0);
		 String payload = "{\n" +
				 "  \"orgId\": "+orgid+",\n" +
				 "  \"name\": \"！@#￥%……&*~\"\n" +
				 "}";
		 APIResponse postresponse=APIRequest.POST(uri).path("/orgs/depts").header("cookie",cookievalue).type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
		 postresponse.assertBodyContains("200");
		 ResultSet resultSet = dbCtrl.query(conn,"SELECT * FROM org_dept WHERE org_id="+orgid+" AND name=\"！@#￥%……&*~\";");
		 resultSet.next();
		 commonutil.AssertEqualsCustomize(resultSet.getLong("org_id"), orgid);
		 commonutil.AssertEqualsCustomize(resultSet.getString("name"), "！@#￥%……&*~");
	 } catch (SQLException e) {
		 e.printStackTrace();
	 } finally {
		 ResultSet resultSet = dbCtrl.query(conn,"SELECT * FROM org_dept WHERE org_id="+orgid+" AND name=\"！@#￥%……&*~\";");
		 try {
			 while(resultSet.next()){
				 long id = resultSet.getLong("id");
				 dbCtrl.executeSql(conn, "DELETE FROM org_dept WHERE id="+id+";");
			 }
		 } catch (SQLException e) {
			 e.printStackTrace();
		 }
		 LOGGER.info("*****************Test case: Post Organization Depts with Special Name Ended*****************");
	 }
 }
 
 @Test
 public void DeleteOrgsContacWays() {
	try {
		 LOGGER.info("*****************Test case: Delete Organization Contact Ways Started*****************");
		String uri = APITest.getValue("baseuri");
		String cookievalue= cookies.get(0);
		String sql ="INSERT INTO org_contact_way(id, org_id, address_id, email, fax_number, phone_number, created_by, updated_by, created_at, updated_at)VALUES(0, "+orgid+", 0, 'testautomation@email.com', '13654521544', '', 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
		ResultSet result =dbCtrl.query(conn, "SELECT id FROM org_contact_way WHERE  address_id=\"testautomation@email.com\"");
		result.next();
		long id = result.getLong("id");
	     APIResponse response=APIRequest.DELETE(uri).path("/orgs/contactWays/"+id).type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).invoke();
	     response.assertBodyContains("200");
	     ResultSet result2=dbCtrl.query(conn, "SELECT id FROM org_contact_way WHERE  address_id=\"testautomation@email.com\"");
	     result2.last();
	     commonutil.AssertEqualsCustomize(result2.getRow(), 0);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		 LOGGER.info("*****************Test case: Delete Organization Contact Ways Ended*****************");
	}
}
 
 @Test
 public void DeleteOrgsContactWayswithWrongId() {
	try {
		 LOGGER.info("*****************Test case: Delete Organization Contact Ways with Wrong id Started*****************");

			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0);
		     APIResponse response=APIRequest.DELETE(uri).path("/orgs/contactways/"+-2).type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).invoke();
		     response.assertBodyContains("500");
	} finally {
		 LOGGER.info("*****************Test case: Delete Organization Contact Ways with Wrong id Ended*****************");
	}

}
 
@Test
public void GetOrgsDeptsList(){
	try {
		 LOGGER.info("*****************Test case: Get Orgs Depts List Started*****************");
		 String uri = APITest.getValue("baseuri");
		 String cookievalue= cookies.get(0);
		 APIResponse response=APIRequest.GET(uri).path("/orgs/depts/list").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).param("orgId", String.valueOf(orgid)).param("text","Test for automation").invoke();
		 response.assertBodyContains("200");
		 String responsbody=response.getBody();
		 JsonObject jsonObject=new JsonParser().parse(responsbody).getAsJsonObject();
		 JsonArray body=jsonObject.getAsJsonArray("_body");
		 ResultSet resultSet = dbCtrl.query(conn, "SELECT * FROM org_dept WHERE org_id="+orgid+" AND name = \"Test for Automation\";");
		for (int i=0;i<body.size();i++)
		{
			resultSet.next();
			JsonObject object= body.get(i).getAsJsonObject();
			commonutil.AssertEqualsCustomize(object.get("createdBy").getAsLong(), resultSet.getLong("created_by"));
			commonutil.AssertEqualsCustomize(object.get("updatedBy").getAsLong(), resultSet.getLong("updated_by"));
			commonutil.AssertEqualsCustomize(object.get("id").getAsLong(), resultSet.getLong("id"));
			commonutil.AssertEqualsCustomize(object.get("orgId").getAsLong(), resultSet.getLong("org_id"));
			commonutil.AssertEqualsCustomize(object.get("telNo").getAsString(), resultSet.getString("tel_no"));
			commonutil.AssertEqualsCustomize(object.get("name").getAsString(), resultSet.getString("name"));
			//commonutil.AssertEqualsCustomize(object.get("createdAt").getAsString(), resultSet.getString("created_at"));
			//commonutil.AssertEqualsCustomize(object.get("updatedAt").getAsString(), resultSet.getString("updated_at"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		LOGGER.info("*****************Test case: Get Orgs Depts List Ended*****************");
	}
}

@Test
public void GetOrgsDeptsListwithWrongOrgId(){
	try {
		LOGGER.info("*****************Test case: Get Orgs Depts List with Wrong OrgId Started*****************");
		 String uri = APITest.getValue("baseuri");
		 String cookievalue= cookies.get(0);
		 APIResponse response=APIRequest.GET(uri).path("/orgs/depts/list").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).param("orgId", "-2").param("text","test for automation").invoke();
		 response.assertBodyContains("200");
	} finally {
		LOGGER.info("*****************Test case: Get Orgs Depts List with Wrong OrgId Ended*****************");
	}
}
 

@Test
public void GetOrgsDeptsListwithWrongtext(){
	try {
		LOGGER.info("*****************Test case: Get Orgs Depts List with Wrong text Started*****************");
	} finally {
		LOGGER.info("*****************Test case: Get Orgs Depts List with Wrong text Ended*****************");
	}
}

	@Test
	public void DeleteOrgsDepts(){
		try {
			LOGGER.info("*****************Test case: Delete Orgs Depts Started*****************");
			String sql = "INSERT INTO org_dept (id, org_id, name, tel_no, created_by, updated_by, created_at, updated_at) VALUES(0,"+ orgid+", 'Test for Deleting', '', 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
			dbCtrl.executeSql(conn,sql);
			ResultSet resultSet = dbCtrl.query(conn,"SELECT id FROM org_dept WHERE name=\"Test for Deleting\" AND org_id ="+orgid);
			resultSet.next();
			long id = resultSet.getLong("id");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0);
			APIResponse response=APIRequest.DELETE(uri).path("/orgs/depts/"+id).type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).invoke();
			response.assertBodyContains("200");
			ResultSet deleteresult = dbCtrl.query(conn,"SELECT id FROM org_dept WHERE name=\"Test for Deleting\" AND org_id ="+orgid);
			Thread.sleep(200);
			deleteresult.next();
			Thread.sleep(200);
			commonutil.AssertEqualsCustomize(deleteresult.getRow(),0);

		} catch (SQLException e) {

			e.printStackTrace();} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			LOGGER.info("*****************Test case: Delete Orgs Depts Ended*****************");
		}
	}

	@Test
	public void DeleteOrgsDeptswithWrongId(){
		try {
			LOGGER.info("*****************Test case: Delete Orgs Depts with Wrong Id Started*****************");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0);
			APIResponse response=APIRequest.DELETE(uri).path("/orgs/depts/"+"string").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).invoke();
			response.assertBodyContains("500");
		}
		finally {
			LOGGER.info("*****************Test case: Delete Orgs Depts with Wrong Id Ended*****************");
		}
	}

	@Test
	public void DeleteOrgsDeptswithNotExistedId(){
		try {
			LOGGER.info("*****************Test case: Delete Orgs Depts with Not Existed Id Started*****************");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0);
			APIResponse response=APIRequest.DELETE(uri).path("/orgs/depts/"+"string").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).invoke();
			response.assertBodyContains("500");
		}
		finally {
			LOGGER.info("*****************Test case:  Delete Orgs Depts with Not Existed  Id Ended*****************");
		}
	}

	@Test
	public void DeleteOrgsDeptswithBadCookie(){
		try {
			LOGGER.info("*****************Test case: Delete Orgs Depts with Bad Cookie Started*****************");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0);
			APIResponse response=APIRequest.DELETE(uri).path("/orgs/depts/"+"string").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue+1).invoke();
			response.assertBodyContains("403");
		}
		finally {
			LOGGER.info("*****************Test case: Delete Orgs Depts with Bad Cookie Ended*****************");
		}
	}



	@Test
	public void DeleteOrgsDeptswithNoCookie(){
		try {
			LOGGER.info("*****************Test case: Delete Orgs Depts with No Cookie Started*****************");
			String uri = APITest.getValue("baseuri");
			APIResponse response=APIRequest.DELETE(uri).path("/orgs/depts/"+"string").type(MediaType.APPLICATION_JSON_TYPE).invoke();
			response.assertBodyContains("401");
		}
		finally {
			LOGGER.info("*****************Test case: Delete Orgs Depts with No Cookie Ended*****************");
		}
	}

	@Test
	public void  PostOrgsExternaljobs(){
	try{
		LOGGER.info("*****************Test case: Post Orgs External Jobs Started*****************");
		String uri = APITest.getValue("baseuri");
		String cookievalue= cookies.get(0);
		//String payload= String.format(APITest.loadFile("Post_Orgs_External_Jobs.json"));
		String payload = "{\n" +
				"  \"orgId\": "+orgid+ ",\n" +
				"  \"salaryLower\": 15000,\n" +
				"  \"salaryUpper\": 25000,\n" +
				"  \"sourceUrl\": \"http://www.lagou.com/jobs/2611255.html?utm_source=m_cf_seo_ald_zhw\",\n" +
				"  \"source\": \"Test for Automation\",\n" +
				"  \"title\": [\"Test Automation\"]\n" +
				"}";
		APIResponse response=APIRequest.POST(uri).path("/orgs/external_jobs/").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(payload).invoke();
		response.assertBodyContains("200");
		ResultSet resultSet = dbCtrl.query(conn,"SELECT * From external_job WHERE org_id="+orgid+" AND title=\"Test for Automation\"");
		String responsbody=response.getBody();
		JsonObject jsonObject=new JsonParser().parse(responsbody).getAsJsonObject();
		JsonArray body=jsonObject.getAsJsonArray("_body");
		for (int i=0;i<body.size();i++)
		{
			resultSet.next();
			JsonObject subObject=body.get(i).getAsJsonObject();
			commonutil.AssertEqualsCustomize(subObject.get("source").getAsString(),resultSet.getString("source"));
			commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),resultSet.getString("title"));
			commonutil.AssertEqualsCustomize(subObject.get("id").getAsLong(), resultSet.getLong("id"));
			commonutil.AssertEqualsCustomize(subObject.get("sourceUrl").getAsString(),resultSet.getString("source_url"));
			commonutil.AssertEqualsCustomize(subObject.get("salaryLower").getAsBigDecimal(), resultSet.getBigDecimal("salary_lower"));
			commonutil.AssertEqualsCustomize(subObject.get("salaryUpper").getAsBigDecimal(), resultSet.getBigDecimal("salary_Upper"));
		}
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	finally {
		LOGGER.info("*****************Test case: Post Orgs External Jobs Ended*****************");
	}
	}

	@Test
	public void PostOrgExternalJobswithWrongOrgId(){
		try{
			LOGGER.info("*****************Test case: Post Orgs External Jobs with Wrong Org Id Started*****************");
			String uri = APITest.getValue("baseuri");
			String cookievalue= cookies.get(0);
			//String payload= String.format(APITest.loadFile("Post_Orgs_External_Jobs.json"));
			String payload = "{\n" +
					"  \"id\": 241,\n" +
					"  \"orgId\": -1,\n" +
					"  \"salaryLower\": 15000,\n" +
					"  \"salaryUpper\": 25000,\n" +
					"  \"sourceUrl\": \"http://www.lagou.com/jobs/2611255.html?utm_source=m_cf_seo_ald_zhw\",\n" +
					"  \"source\": \"Test for Automation\",\n" +
					"  \"title\": [\"Test Automation\"]\n" +
					"}";
			LOGGER.info("The request body is: \n");
			LOGGER.info(payload);
			APIResponse response=APIRequest.POST(uri).path("/orgs/external_jobs/").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(payload).invoke();
			response.assertBodyContains("200");
			String responsbody=response.getBody();
			LOGGER.info("The response body is:\n");
			LOGGER.info(responsbody);
			JsonObject jsonObject=new JsonParser().parse(responsbody).getAsJsonObject();
			commonutil.AssertEqualsCustomize(jsonObject.get("_body").getAsJsonNull(),null);
		}
		finally {
			LOGGER.info("*****************Test case: Post Orgs External Jobs with Wrong Org Id Ended*****************");
		}
	}

		@Test
		public void PostOrgsHistories(){
			try{
				LOGGER.info("*****************Test case: Post Orgs Histories Started*****************");
				String uri = APITest.getValue("baseuri");
				String cookievalue= cookies.get(0);
				String payload = "{\n" +
						"  \"orgId\": "+orgid+",\n" +
						"  \"timeAt\": \"2016-11-21T03:55:04.018Z\",\n" +
						"  \"linkUrl\": \"http://xxxxxxx\",\n" +
						"\t\"title\": \"Test for Automation title\",\n" +
						"\t\"description\": \"Automation description\"\n" +
						"}";
				APIResponse response=APIRequest.POST(uri).path("/orgs/histories/").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(payload).invoke();
				response.assertBodyContains("200");
				ResultSet resultSet= dbCtrl.query(conn,"SELECT * FROM org_history WHERE org_id="+orgid+" AND title=\"Test for Automation title\" ;");
				resultSet.last();
				commonutil.AssertEqualsCustomize(resultSet.getRow(),1);
			}catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				LOGGER.info("*****************Test case: Post Orgs Histories Ended*****************");
			}
		}
		@Test
		public void PostOrgsHistorieswithNoOrgId(){
			try{
				LOGGER.info("*****************Test case: Post Orgs Histories with no Org Id Started*****************");
				String uri = APITest.getValue("baseuri");
				String cookievalue= cookies.get(0);
				String payload = "{\n" +
						"  \"timeAt\": \"2016-11-21T03:55:04.018Z\",\n" +
						"  \"linkUrl\": \"http://xxxxxxx\",\n" +
						"\t\"title\": \"Test for Automation\",\n" +
						"\t\"description\": \"Automation description\"\n" +
						"}";
				APIResponse response=APIRequest.POST(uri).path("/orgs/histories/").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(payload).invoke();
				response.assertBodyContains("450");
				response.assertBodyContains("orgId不能为空");
			}
			finally {
				LOGGER.info("*****************Test case: Post Orgs Histories with no Org Id Ended*****************");
			}
		}

		@Test
		public void PostOrgsHistorieswithWrongOrgId(){
			try{
				LOGGER.info("*****************Test case: Post Orgs Histories with Wrong Org Id Started*****************");
				String uri = APITest.getValue("baseuri");
				String cookievalue= cookies.get(0);
				String payload = "{\n" +
						"  \"orgId\": -1,\n" +
						"  \"timeAt\": \"2016-11-21T03:55:04.018Z\",\n" +
						"  \"linkUrl\": \"http://xxxxxxx\",\n" +
						"\t\"title\": \"Test for Automation\",\n" +
						"\t\"description\": \"Automation description\"\n" +
						"}";
				APIResponse response=APIRequest.POST(uri).path("/orgs/histories/").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(payload).invoke();
				response.assertBodyContains("公司-1不存在");
			}
			finally {
				LOGGER.info("*****************Test case: Post Orgs Histories with Wrong Org Id Ended*****************");
			}
		}

		@Test
		public void PostOrgsHistoriesWithBadCookie(){
			try {
				LOGGER.info("*****************Test case: Post Orgs Histories with bad Cookie Started*****************");
				String uri = APITest.getValue("baseuri");
				String cookievalue = cookies.get(0);
				String payload = "{\n" +
						"  \"orgId\": " + orgid + ",\n" +
						"  \"timeAt\": \"2016-11-21T03:55:04.018Z\",\n" +
						"  \"linkUrl\": \"http://xxxxxxx\",\n" +
						"\t\"title\": \"Test for Automation\",\n" +
						"\t\"description\": \"Automation description\"\n" +
						"}";
				APIResponse response = APIRequest.POST(uri).path("/orgs/histories/").type(MediaType.APPLICATION_JSON_TYPE).header("cookie", cookievalue + 1).body(payload).invoke();
				response.assertBodyContains("403");
			}
			finally {
				LOGGER.info("*****************Test case: Post Orgs Histories with Bad Cookie Ended*****************");
			}
		}

		@Test
		public void PostOrgistoriesWithNoCookie(){
			try {
				LOGGER.info("*****************Test case: Post Orgs Histories with No Cookie Started*****************");
				String uri = APITest.getValue("baseuri");
				String payload = "{\n" +
						"  \"orgId\": " + orgid + ",\n" +
						"  \"timeAt\": \"2016-11-21T03:55:04.018Z\",\n" +
						"  \"linkUrl\": \"http://xxxxxxx\",\n" +
						"\t\"title\": \"Test for Automation\",\n" +
						"\t\"description\": \"Automation description\"\n" +
						"}";
				APIResponse response = APIRequest.POST(uri).path("/orgs/histories/").type(MediaType.APPLICATION_JSON_TYPE).body(payload).invoke();
				response.assertBodyContains("401");
			}
			finally {
				LOGGER.info("*****************Test case: Post Orgs Histories with No Cookie Ended*****************");
			}
		}

		@Test
		public void DeleteOrgsHistories(){
			try {
				LOGGER.info("*****************Test case: Delete Orgs Histories Started*****************");
				String uri = APITest.getValue("baseuri");
				String cookievalue = cookies.get(0);
				String sql="INSERT INTO org_history\n" +
						"(id, org_id, time_at, title, description, link_url, created_by, updated_by, created_at, updated_at)\n" +
						"VALUES(0, "+orgid+", CURRENT_TIMESTAMP, 'Test for Automation', 'Automation description', '', 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);\n";
				dbCtrl.executeSql(conn, sql);
				ResultSet resultSet=dbCtrl.query(conn,"SELECT * FROM org_history WHERE org_id="+orgid+" AND title=\"Test for Automation\" AND description=\"Automation description\"");
				resultSet.next();
				long id= resultSet.getLong("id");
				APIResponse response = APIRequest.DELETE(uri).path("/orgs/histories/"+id).type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).invoke();
				response.assertBodyContains("200");
				ResultSet deleteresult=dbCtrl.query(conn,"SELECT * FROM org_history WHERE org_id="+orgid+" AND title=\"Test for Automation\" AND description=\"Automation description\"");
				deleteresult.next();
				commonutil.AssertEqualsCustomize(deleteresult.getRow(), 0);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				LOGGER.info("*****************Test case: Delete Orgs Histories  Ended*****************");
			}
		}

		@Test
		public void DeleteOrgsHistorieswithWrongId() {
			try {
				LOGGER.info("*****************Test case: Delete Orgs Histories with Wrong Id Started*****************");
				String uri = APITest.getValue("baseuri");
				String cookievalue = cookies.get(0);

				APIResponse response = APIRequest.DELETE(uri).path("/orgs/histories/"+"-1").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).invoke();
				response.assertBodyContains("500");
				response.assertBodyContains("对象-1不存在");
			}
			finally {
				LOGGER.info("*****************Test case: Delete Orgs Histories with Wrong Id Ended*****************");
			}
		}

		@Test
		public void DeleteOrgsHistorieswithBadId(){
			try {
				LOGGER.info("*****************Test case: Delete Orgs Histories with Bad Id Started*****************");
				String uri = APITest.getValue("baseuri");
				String cookievalue = cookies.get(0);

				APIResponse response = APIRequest.DELETE(uri).path("/orgs/histories/"+"test").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).invoke();
				response.assertBodyContains("500");
			}
			finally {
				LOGGER.info("*****************Test case: Delete Orgs Histories with Bad Id Ended*****************");
			}
		}
		
		@Test
		public void DeleteOrgsHistorieswithBadCookie(){
			try {
				LOGGER.info("*****************Test case: Delete Orgs Histories with Bad Cookie Started*****************");
				String uri = APITest.getValue("baseuri");
				String cookievalue = cookies.get(0);

				APIResponse response = APIRequest.DELETE(uri).path("/orgs/histories/"+"test").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue+1).invoke();
				response.assertBodyContains("403");
			}
			finally {
				LOGGER.info("*****************Test case: Delete Orgs Histories with Bad Cookie Ended*****************");
			}
		}
		
		@Test
		public void DeleteOrgsHistorieswithNoCookie(){
			try {
				LOGGER.info("*****************Test case: Delete Orgs Histories with No Cookie Started*****************");
				String uri = APITest.getValue("baseuri");
				APIResponse response = APIRequest.DELETE(uri).path("/orgs/histories/"+"test").type(MediaType.APPLICATION_JSON_TYPE).invoke();
				response.assertBodyContains("401");
			}
			finally {
				LOGGER.info("*****************Test case: Delete Orgs Histories with No Cookie Ended*****************");
			}
		}
		
		@Test
		public void PostOrgsList(){
			try {
				LOGGER.info("*****************Test case: Post Orgs List Started*****************");
				String uri = APITest.getValue("baseuri");
				String cookievalue = cookies.get(0);
				String payload="{\"orgName\":\"Test for Automation\"}";
				APIResponse response = APIRequest.POST(uri).path("/orgs/list/").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(payload).invoke();
				response.assertBodyContains("200");
				String responsbody=response.getBody();
				JsonObject jsonObject=new JsonParser().parse(responsbody).getAsJsonObject();
				
				JsonObject body=jsonObject.getAsJsonObject("_body");	
				int type = body.get("type").getAsInt();
				long updatedBy = body.get("updatedBy").getAsLong();
				String description=body.get("description").getAsString();
				long ownerId=body.get("ownerId").getAsLong();
				long createdAt = body.get("createdAt").getAsLong();
				long createdBy = body.get("createdBy").getAsLong();
				String simpleName = body.get("simpleName").getAsString();
				String englishName = body.get("englishName").getAsString();
				int source = body.get("source").getAsInt();
				String aliases = body.get("aliases").getAsString();
				String phoneNo = body.get("phoneNo").getAsString();
				String logoUrl = body.get("logoUrl").getAsString();
				String siteUrl = body.get("siteUrl").getAsString();
				int finacingStatus = body.get("finacingStatus").getAsInt();
				double finacingAmount = body.get("finacingAmount").getAsDouble();
				String legalPerson = body.get("legalPerson").getAsString();
				double registedCapital = body.get("registedCapital").getAsDouble();
				long registedAt=body.get("registedAt").getAsLong();
				double turnover = body.get("turnover").getAsDouble();
				String registedNo = body.get("registedNo").getAsString();
				String registedAuthority = body.get("registedAuthority").getAsString();
				int natureCode = body.get("natureCode").getAsInt();
				int empScale = body.get("empScale").getAsInt();
				int empMeanSalary = body.get("empMeanSalary").getAsInt();
				String wxPublicNo = body.get("wxPublicNo").getAsString();
				String facebookUrl = body.get("facebookUrl").getAsString();
				String linkedinUrl = body.get("linkedinUrl").getAsString();
				String weiboUrl = body.get("weiboUrl").getAsString();
				String twitterUrl = body.get("twitterUrl").getAsString();
				String qccUnique = body.get("qccUnique").getAsString();
				String orgCode = body.get("orgCode").getAsString();
				String licenseNo = body.get("licenseNo").getAsString();
				String imgUrls = body.get("imgUrls").getAsString();
				String finacingDetail = body.get("finacingDetail").getAsString();

				
				JsonObject shareholdings = body.getAsJsonObject("shareholdings");
				long shareholdings_id=shareholdings.get("id").getAsLong();
				long shareholdings_org_id= shareholdings.get("orgId").getAsLong();
				long shareholdings_hold_id=shareholdings.get("holdId").getAsLong();
				double shareholdings_hold_rate=shareholdings.get("holdRate").getAsDouble();
				double shareholdings_invest_amount=shareholdings.get("investMount").getAsDouble();
				String shareholdings_invest_detail=shareholdings.get("investDetail").getAsString();
				long shareholdings_created_by=shareholdings.get("createdBy").getAsLong();
				long shareholdings_updated_by=shareholdings.get("updatedBy").getAsLong();
				long shareholdings_created_at=shareholdings.get("createdAt").getAsLong();;
				long shareholdings_updated_at=shareholdings.get("updatedAt").getAsLong();
				
				
				JsonObject createdByAccount = body.getAsJsonObject("createdByAccount");
				//String createdByAccount_password=createdByAccount.get("password").getAsString();
				String createdByAccount_nickname=createdByAccount.get("nickname").getAsString();
				String createdByAccount_mobile=createdByAccount.get("mobile").getAsString();
				long createdByAccount_id=createdByAccount.get("id").getAsLong();
				String createdByAccount_email=createdByAccount.get("email").getAsString();
				String createdByAccount_username=createdByAccount.get("username").getAsString();

			  	String createdByAccountsql ="SELECT * FROM account WHERE id"+createdBy+";";
			  	ResultSet createdByAccountResultSet=dbCtrl.query(conn, createdByAccountsql);
			  	commonutil.AssertEqualsCustomize(createdByAccount_nickname, createdByAccountResultSet.getString("nickname"));
			  	commonutil.AssertEqualsCustomize(createdByAccount_email,createdByAccountResultSet.getString("email"));
			  	commonutil.AssertEqualsCustomize(createdByAccount_mobile,createdByAccountResultSet.getString("mobile"));
			  	commonutil.AssertEqualsCustomize(createdByAccount_username, createdByAccountResultSet.getString("username"));
			  	commonutil.AssertEqualsCustomize(createdByAccount_id,createdByAccountResultSet.getLong("id"));

				JsonObject updatedByAccount = body.getAsJsonObject("updatedByAccount");
				//String updatedByAccount_password=updatedByAccount.get("password").getAsString();
				String updatedByAccount_nickname=updatedByAccount.get("nickname").getAsString();
				String updatedByAccount_mobile=updatedByAccount.get("mobile").getAsString();
				long updatedByAccount_id=updatedByAccount.get("id").getAsLong();
				String updatedByAccount_email=updatedByAccount.get("email").getAsString();
				String updatedByAccount_username=updatedByAccount.get("username").getAsString();

			  	String updatedByAccountsql ="SELECT * FROM account WHERE id"+createdBy+";";
			  	ResultSet UpdatedByAccountResultSet=dbCtrl.query(conn, updatedByAccountsql);
			  	commonutil.AssertEqualsCustomize(updatedByAccount_nickname, UpdatedByAccountResultSet.getString("nickname"));
			  	commonutil.AssertEqualsCustomize(updatedByAccount_email,UpdatedByAccountResultSet.getString("email"));
			  	commonutil.AssertEqualsCustomize(updatedByAccount_mobile,UpdatedByAccountResultSet.getString("mobile"));
			  	commonutil.AssertEqualsCustomize(updatedByAccount_username, UpdatedByAccountResultSet.getString("username"));
			  	commonutil.AssertEqualsCustomize(updatedByAccount_id,UpdatedByAccountResultSet.getLong("id"));
				
				
				
				JsonObject shareholders = body.getAsJsonObject("shareholders");
				long shareholders_id=shareholders.get("id").getAsLong();
				long shareholders_org_id=shareholders.get("orgId").getAsLong();
				long shareholders_hold_id=shareholders.get("holdId").getAsLong();
				double shareholders_hold_rate=shareholders.get("holdRate").getAsDouble();
				double shareholders_invest_amount=shareholders.get("investAmount").getAsDouble();
				String shareholders_invest_detail=shareholders.get("investDetail").getAsString();
				long shareholders_created_by=shareholders.get("createdBy").getAsLong();
				long shareholders_updated_by=shareholders.get("updatedBy").getAsLong();
				long shareholders_created_at=shareholders.get("createdAt").getAsLong();
				long shareholders_updated_at=shareholders.get("updatedAt").getAsLong();
				
				
				JsonObject orgStocks = body.getAsJsonObject("orgStocks");
				long orgStocks_id = orgStocks.get("id").getAsLong();
				long orgStocks_org_id = orgStocks.get("orgId").getAsLong();
				int orgStocks_stock_exchange = orgStocks.get("stockExchange").getAsInt();
				String orgStocks_stock_code = orgStocks.get("stockCode").getAsString();
				long orgStocks_created_by = orgStocks.get("createdBy").getAsLong();
				long orgStocks_updated_by = orgStocks.get("updatedBy").getAsLong();
				long orgStocks_created_at = orgStocks.get("createdAt").getAsLong();
				long orgStocks_updated_at = orgStocks.get("updatedAt").getAsLong();
				
				JsonArray industrialModeDicts= body.get("industrialModeDicts").getAsJsonArray();
			  for(int i=0;i<industrialModeDicts.size();i++){
				  JsonObject subObject=industrialModeDicts.get(i).getAsJsonObject();
				  String industrialModeDicts_sql ="SELECT * FROM organization WHERE target_id="+orgid+";";
				  ResultSet industrialModeDictsResultSet=dbCtrl.query(conn, industrialModeDicts_sql);
				  commonutil.AssertEqualsCustomize(subObject.get("type").getAsString(),industrialModeDictsResultSet.getString("dict_type"));
				  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),industrialModeDictsResultSet.getString("dict_type"));
				  String dicttype = industrialModeDictsResultSet.getString("dict_type");
				  String dict_code = subObject.get("code").getAsString();
				  ResultSet dictResultSet = dbCtrl.query(conn,"SELECT * FROM dict WHERE type="+dicttype+" AND code="+dict_code+";");
				  Long dict_title = dictResultSet.getLong("title");
				  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),dict_title);
				  commonutil.AssertEqualsCustomize(subObject.get("generated").getAsLong(),industrialModeDictsResultSet.getLong("generated"));
			  }



				JsonArray industryDicts = body.get("industryDicts").getAsJsonArray();
			  for(int i=0;i<industryDicts.size();i++){
				  JsonObject subObject=industryDicts.get(i).getAsJsonObject();
				  String industryDicts_sql ="SELECT * FROM organization WHERE target_id="+orgid+";";
				  ResultSet industryDictsResultSet=dbCtrl.query(conn, industryDicts_sql);
				  commonutil.AssertEqualsCustomize(subObject.get("type").getAsString(),industryDictsResultSet.getString("dict_type"));
				  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),industryDictsResultSet.getString("dict_type"));
				  String dicttype = industryDictsResultSet.getString("dict_type");
				  String dict_code = subObject.get("code").getAsString();
				  ResultSet dictResultSet = dbCtrl.query(conn,"SELECT * FROM dict WHERE type="+dicttype+" AND code="+dict_code+";");
				  Long dict_title = dictResultSet.getLong("title");
				  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),dict_title);
				  commonutil.AssertEqualsCustomize(subObject.get("generated").getAsLong(),industryDictsResultSet.getLong("generated"));
			  }

			  	JsonArray highlightDicts = body.get("highlightDicts").getAsJsonArray();
			  for(int i=0;i<highlightDicts.size();i++) {
				  JsonObject subObject=highlightDicts.get(i).getAsJsonObject();
				  String industryDicts_sql ="SELECT * FROM organization WHERE target_id="+orgid+";";
				  ResultSet highlightDictsResultSet=dbCtrl.query(conn, industryDicts_sql);
				  commonutil.AssertEqualsCustomize(subObject.get("type").getAsString(),highlightDictsResultSet.getString("dict_type"));
				  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),highlightDictsResultSet.getString("dict_type"));
				  String dicttype = highlightDictsResultSet.getString("dict_type");
				  String dict_code = subObject.get("code").getAsString();
				  ResultSet dictResultSet = dbCtrl.query(conn,"SELECT * FROM dict WHERE type="+dicttype+" AND code="+dict_code+";");
				  Long dict_title = dictResultSet.getLong("title");
				  commonutil.AssertEqualsCustomize(subObject.get("title").getAsString(),dict_title);
				  commonutil.AssertEqualsCustomize(subObject.get("generated").getAsLong(),highlightDictsResultSet.getLong("generated"));

			  }

				JsonObject orgContactWays = body.getAsJsonObject("orgContactWays");

			  	long orgContactWays_id = orgContactWays.get("id").getAsLong();
			  	long orgContactWays_org_id = orgContactWays.get("orgId").getAsLong();
				String orgContactWays_phone_number = orgContactWays.get("phoneNumber").getAsString();
			  	long orgContactWays_created_by = orgContactWays.get("createdBy").getAsLong();
			  	long orgContactWays_updated_by = orgContactWays.get("updatedBy").getAsLong();
			  	long orgContactWays_created_at = orgContactWays.get("createdAt").getAsLong();
			  	long orgContactWays_updated_at = orgContactWays.get("updatedAt").getAsLong();
			  	String orgContactWays_fax_number = orgContactWays.get("faxNumber").getAsString();
			  	long orgContactWays_address_id = orgContactWays.get("addressId").getAsLong();



				String name = body.get("name").getAsString();
				
				JsonObject orgBrands = body.getAsJsonObject("orgBrands");
				int orgBrands_type = orgBrands.get("type").getAsInt();
			  	String orgBrands_description = orgBrands.get("description").getAsString();
			  	String orgBrands_title = orgBrands.get("title").getAsString();
			  	long orgBrands_created_by = orgBrands.get("createdBy").getAsLong();
			  	long orgBrands_updated_by = orgBrands.get("updatedBy").getAsLong();
			  	long orgBrands_id = orgBrands.get("id").getAsLong();
			  	long orgBrands_created_at = orgBrands.get("createdAt").getAsLong();
			  	long orgBrands_updated_at = orgBrands.get("updatedAt").getAsLong();
			    String orgBrands_siteUrl = orgBrands.get("siteUrl").getAsString();
			  	String orgBrands_imgUrl = orgBrands.get("imgUrl").getAsString();
			  	long orgBrands_org_id = orgBrands.get("orgId").getAsLong();

				


			  	String orgHistories_sql ="SELECT * FROM organization WHERE org_id="+orgid+";";
			  	ResultSet orghHistoriesResultSet=dbCtrl.query(conn, orgHistories_sql);
				JsonObject orgHistories = body.getAsJsonObject("orgHistories");

			  	commonutil.AssertEqualsCustomize(orgHistories.get("description").getAsString(),orghHistoriesResultSet.getString("description"));
			  	commonutil.AssertEqualsCustomize(orgHistories.get("title").getAsString(),orghHistoriesResultSet.getString("title"));
			    commonutil.AssertEqualsCustomize(orgHistories.get("createdBy").getAsLong(),orghHistoriesResultSet.getLong("created_by"));
			    commonutil.AssertEqualsCustomize(orgHistories.get("createdAt").getAsLong(),orghHistoriesResultSet.getLong("created_at"));
			  	commonutil.AssertEqualsCustomize(orgHistories.get("UpdatedAt").getAsLong(),orghHistoriesResultSet.getLong("updated_at"));
			    commonutil.AssertEqualsCustomize(orgHistories.get("UpdatedBy").getAsLong(),orghHistoriesResultSet.getLong("updated_by"));
			  	commonutil.AssertEqualsCustomize(orgHistories.get("timeAt").getAsLong(),orghHistoriesResultSet.getLong("time_at"));
			  	commonutil.AssertEqualsCustomize(orgHistories.get("linkUrl").getAsLong(),orghHistoriesResultSet.getLong("link_url"));


				
				long updatedAt = body.get("updatedAt").getAsLong();
				

				String sql ="SELECT * FROM organization WHERE org_id=;"+orgid;
				ResultSet organization=dbCtrl.query(conn, sql);
				
				commonutil.AssertEqualsCustomize(orgid, organization.getLong("id"));
				commonutil.AssertEqualsCustomize(name, organization.getString("name"));
				commonutil.AssertEqualsCustomize(createdAt, organization.getLong("created_at"));
				commonutil.AssertEqualsCustomize(updatedAt, organization.getLong("updated_at"));
				commonutil.AssertEqualsCustomize(createdBy, organization.getLong("created_by"));
				commonutil.AssertEqualsCustomize(updatedBy, organization.getLong("updated_by"));
				commonutil.AssertEqualsCustomize(ownerId, organization.getLong("owner_id"));
				commonutil.AssertEqualsCustomize(registedAt, organization.getLong("registed_at"));
				commonutil.AssertEqualsCustomize(source, organization.getInt("source"));
				commonutil.AssertEqualsCustomize(description, organization.getString("description"));
				commonutil.AssertEqualsCustomize(englishName, organization.getString("english_name"));
				commonutil.AssertEqualsCustomize(type, organization.getInt("type"));
				commonutil.AssertEqualsCustomize(phoneNo, organization.getString("phone_no"));
				commonutil.AssertEqualsCustomize(simpleName, organization.getString("simple_name"));
				commonutil.AssertEqualsCustomize(aliases, organization.getString("aliases"));
				commonutil.AssertEqualsCustomize(logoUrl, organization.getString("logo_url"));
				commonutil.AssertEqualsCustomize(siteUrl, organization.getString("site_url"));
				commonutil.AssertEqualsCustomize(finacingDetail, organization.getString("finacing_detail"));
				commonutil.AssertEqualsCustomize(finacingAmount, organization.getDouble("finacing_amount"));
			    commonutil.AssertEqualsCustomize(legalPerson, organization.getString("legal_person"));
			    commonutil.AssertEqualsCustomize(registedCapital,organization.getString("registed_capital"));
			    commonutil.AssertEqualsCustomize(registedAt,organization.getString("registed_at"));
			  	commonutil.AssertEqualsCustomize(turnover, organization.getDouble("turnover"));
			  	commonutil.AssertEqualsCustomize(registedNo,organization.getString("registedNo"));
			  	commonutil.AssertEqualsCustomize(registedAuthority, organization.getString("registed_authority"));
			  	commonutil.AssertEqualsCustomize(natureCode,organization.getInt("natureCode"));
			  	commonutil.AssertEqualsCustomize(empScale, organization.getInt("empScale"));
			  	commonutil.AssertEqualsCustomize(empMeanSalary,organization.getInt("empMean_salary"));
			  	commonutil.AssertEqualsCustomize(wxPublicNo,organization.getString("wxPublic_no"));
			  	commonutil.AssertEqualsCustomize(facebookUrl,organization.getString("facebook_url"));
			  	commonutil.AssertEqualsCustomize(linkedinUrl,organization.getString("linkedin_url"));
			  	commonutil.AssertEqualsCustomize(weiboUrl,organization.getString("weibo_url"));
			  	commonutil.AssertEqualsCustomize(twitterUrl,organization.getString("twitter_url"));
			  	commonutil.AssertEqualsCustomize(qccUnique,organization.getString("qcc_unique"));
			  	commonutil.AssertEqualsCustomize(orgCode,organization.getString("org_code"));
			  	commonutil.AssertEqualsCustomize(licenseNo,organization.getString("license_no"));
			  	commonutil.AssertEqualsCustomize(imgUrls,organization.getString("img_urls"));
			  	commonutil.AssertEqualsCustomize(finacingDetail,organization.getString("finacing_detail"));
			  	commonutil.AssertEqualsCustomize(finacingStatus,organization.getString("finacing_status"));
				
				String shareholders_sql ="SELECT * FROM automind_test.org_shareholder WHERE org_id=;"+orgid; 
				ResultSet shareholdersResultSet = dbCtrl.query(conn, shareholders_sql);
				commonutil.AssertEqualsCustomize(shareholders_id, shareholdersResultSet.getLong("id"));
				commonutil.AssertEqualsCustomize(shareholders_org_id, shareholdersResultSet.getLong("org_id"));
				commonutil.AssertEqualsCustomize(shareholders_hold_id, shareholdersResultSet.getLong("hold_id"));
				commonutil.AssertEqualsCustomize(shareholders_hold_rate, shareholdersResultSet.getDouble("hold_rate"));
				commonutil.AssertEqualsCustomize(shareholders_invest_amount, shareholdersResultSet.getInt("invest_amount"));
				commonutil.AssertEqualsCustomize(shareholders_invest_detail, shareholdersResultSet.getString("invest_detail"));
				commonutil.AssertEqualsCustomize(shareholders_created_at, shareholdersResultSet.getLong("created_at"));
				commonutil.AssertEqualsCustomize(shareholders_created_by, shareholdersResultSet.getLong("created_by"));
				commonutil.AssertEqualsCustomize(shareholders_updated_by, shareholdersResultSet.getLong("updated_by"));
				commonutil.AssertEqualsCustomize(shareholders_updated_at, shareholdersResultSet.getLong("updated_at"));


			  	String shareholdings_sql ="SELECT * FROM org_shareholder WHERE org_id=;"+orgid;

			  	ResultSet shareholdingsResultSet = dbCtrl.query(conn, shareholdings_sql);
			  	commonutil.AssertEqualsCustomize(shareholdings_created_at,shareholdings.get("created_at").getAsLong());
			  	commonutil.AssertEqualsCustomize(shareholdings_created_by,shareholdings.get("created_by").getAsLong());
			  	commonutil.AssertEqualsCustomize(shareholdings_id, shareholdingsResultSet.getLong("id"));
			  	commonutil.AssertEqualsCustomize(shareholdings_org_id, shareholdingsResultSet.getLong("org_id"));
			  	commonutil.AssertEqualsCustomize(shareholdings_hold_id, shareholdingsResultSet.getLong("hold_id"));
			  	commonutil.AssertEqualsCustomize(shareholdings_hold_rate, shareholdingsResultSet.getDouble("hold_rate"));
			  	commonutil.AssertEqualsCustomize(shareholdings_invest_amount, shareholdingsResultSet.getInt("invest_amount"));
			  	commonutil.AssertEqualsCustomize(shareholdings_invest_detail, shareholdingsResultSet.getString("invest_detail"));
			  	commonutil.AssertEqualsCustomize(shareholdings_updated_by,shareholdingsResultSet.getLong("updated_by"));
			  	commonutil.AssertEqualsCustomize(shareholdings_updated_at, shareholdingsResultSet.getLong("updated_at"));



			  String stock_sql ="SELECT * FROM org_stock WHERE org_id=;"+orgid;
				ResultSet stockResultSet = dbCtrl.query(conn, stock_sql);
				commonutil.AssertEqualsCustomize(orgStocks_id,stockResultSet.getLong("id"));
				commonutil.AssertEqualsCustomize(orgStocks_org_id, stockResultSet.getLong("org_id"));
				commonutil.AssertEqualsCustomize(orgStocks_stock_code, stockResultSet.getString("stock_code"));
				commonutil.AssertEqualsCustomize(orgStocks_stock_exchange, stockResultSet.getInt("stock_exchange"));
				commonutil.AssertEqualsCustomize(orgStocks_created_at, stockResultSet.getLong("created_at"));
				commonutil.AssertEqualsCustomize(orgStocks_created_by, stockResultSet.getLong("created_by"));
				commonutil.AssertEqualsCustomize(orgStocks_updated_at, stockResultSet.getLong("updated_at"));
				commonutil.AssertEqualsCustomize(orgStocks_updated_by, stockResultSet.getLong("updated_by"));
				
				String brand_sql ="SELECT * FROM org_brand WHERE org_id=;"+orgid; 
				ResultSet brandResultSet = dbCtrl.query(conn, brand_sql);
			  	commonutil.AssertEqualsCustomize(orgBrands_type, brandResultSet.getInt("type"));
			  	commonutil.AssertEqualsCustomize(orgBrands_id, brandResultSet.getLong("id"));
			  	commonutil.AssertEqualsCustomize(orgBrands_description, brandResultSet.getString("description"));
			  	commonutil.AssertEqualsCustomize(orgBrands_created_by, brandResultSet.getLong("created_by"));
			  	commonutil.AssertEqualsCustomize(orgBrands_created_at, brandResultSet.getLong("created_at"));
			  	commonutil.AssertEqualsCustomize(orgBrands_updated_at, brandResultSet.getLong("updated_at"));
			  	commonutil.AssertEqualsCustomize(orgBrands_updated_by, brandResultSet.getLong("updated_by"));
			  	commonutil.AssertEqualsCustomize(orgBrands_imgUrl,  brandResultSet.getString("img_Url"));
			  	commonutil.AssertEqualsCustomize(orgBrands_siteUrl, brandResultSet.getString("site_Url"));
			  	commonutil.AssertEqualsCustomize(orgBrands_title,brandResultSet.getString("title"));
			  	commonutil.AssertEqualsCustomize(orgBrands_org_id,brandResultSet.getLong("org_id"));

			  	String contacWays_sql ="SELECT * FROM org_brand WHERE org_id=;"+orgid;
			  	ResultSet contactWaysResultSet = dbCtrl.query(conn, contacWays_sql);
			  	commonutil.AssertEqualsCustomize(orgContactWays_id,contactWaysResultSet.getInt("id"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_created_at, contactWaysResultSet.getLong("created_at"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_created_by, contactWaysResultSet.getLong("created_by"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_address_id,contactWaysResultSet.getLong("address_id"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_fax_number, contactWaysResultSet.getString("fax_number"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_org_id, contactWaysResultSet.getLong("org_id"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_phone_number, contactWaysResultSet.getString("phone_number"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_updated_at,contactWaysResultSet.getLong("updated_at"));
			  	commonutil.AssertEqualsCustomize(orgContactWays_updated_by, contactWaysResultSet.getLong("updated_by"));
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				LOGGER.info("*****************Test case: Post Orgs List Ended*****************");
			}
		}
		
		@Test
		public  void PostOrgListwithWrongName(){
			try {
				LOGGER.info("*****************Test case: Post Orgs List with Wrong Name Started*****************");
				String uri = APITest.getValue("baseuri");
				String cookievalue = cookies.get(0);
				String payload="{\"orgName\":\"Test1234\"}";
				APIResponse response = APIRequest.POST(uri).path("/orgs/list/").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(payload).invoke();
				response.assertBodyContains("200");
				String responsbody=response.getBody();
				JsonObject jsonObject=new JsonParser().parse(responsbody).getAsJsonObject();
				JsonArray body=jsonObject.get("_body").getAsJsonArray();
				commonutil.AssertEqualsCustomize(body.size(),0);
				
			} finally {
				LOGGER.info("*****************Test case: Post Orgs List with Wrong Name Ended*****************");
			}
		}
		
		@Test
		public void PostOrgsShareholderswithNoName(){
			try {
				LOGGER.info("*****************Test case: Post Orgs Shareholders with Id Started*****************");
				String uri = APITest.getValue("baseuri");
				String cookievalue = cookies.get(0);
				String payload="{\n" +
						"  \"orgId\": "+orgid+",\n" +
						"\t\"org\":{\n" +
						"\t  \"id\":"+parentorgid+"\n" +
						"\t},\n" +
						"  \"holdRate\": \"20\",\n" +
						"\t\"investAmount\": \"2000\"\n" +
						"}";
				APIResponse response = APIRequest.POST(uri).path("/orgs/shareholders").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(payload).invoke();
				response.assertBodyContains("500");
				response.assertBodyContains("公司名字不能为空");
				
			} finally {
				LOGGER.info("*****************Test case: Post Orgs Shareholders with Id Ended*****************");
			}        
		}

		@Test
		public void PostOrgsShareholderswithName(){
			try {
				LOGGER.info("*****************Test case: Post Orgs Shareholders with Name Started*****************");
				String uri = APITest.getValue("baseuri");
				String cookievalue = cookies.get(0);
				String payload="{\n" +
						"  \"orgId\": "+orgid+",\n" +
						"\t\"org\":{\n" +
						"\t  \"id\":"+parentorgid+",\n" +
						"\t},\n" +
						"  \"holdRate\": \"20\",\n" +
						"\t\"investAmount\": \"2000\"\n" +
						"}";
				APIResponse response = APIRequest.POST(uri).path("/orgs/shareholders").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(payload).invoke();
				response.assertBodyContains("200");
				ResultSet resultSet = dbCtrl.query(conn,"SELECT * FROM org_shareholder WHERE org_id="+orgid+" AND holder_id="+parentorgid+";");
				while(resultSet.next())
				{
					commonutil.AssertEqualsCustomize(resultSet.getBigDecimal("hold_rate"),20);
					commonutil.AssertEqualsCustomize(resultSet.getBigDecimal("hold_amount"),2000);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				LOGGER.info("*****************Test case: Post Orgs Shareholders with Name Ended*****************");
			}
		}
		
		@Test
		public void DeleteOrgsShareholders(){
			try {
				LOGGER.info("*****************Test case: Delete Orgs Shareholders Started*****************");
				String sql = "INSERT INTO org_shareholder\n" +
						"(id, org_id, holder_id, hold_rate, invest_amount, invest_detail, created_by, updated_by, created_at, updated_at)\n" +
						"VALUES(0, "+orgid+", "+parentorgid+", 0, 0, ?, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);\n";
				dbCtrl.executeSql(conn,sql);
				ResultSet resultSet = dbCtrl.query(conn,"SELECT * FROM org_shareholder WHERE org_id="+orgid+" AND holder_id="+parentorgid+";");
				resultSet.next();
				long id = resultSet.getLong("id");
				String uri = APITest.getValue("baseuri");
				String cookievalue = cookies.get(0);
				APIResponse response = APIRequest.DELETE(uri).path("/orgs/shareholders/"+id).type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).invoke();
				response.assertBodyContains("200");
				ResultSet deleteresult = dbCtrl.query(conn,"SELECT * FROM org_shareholder WHERE org_id="+orgid+" AND holder_id="+parentorgid+";");
				deleteresult.last();
				commonutil.AssertEqualsCustomize(deleteresult.getRow(),0);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				dbCtrl.executeSql(conn,"DELETE FROM org_shareholder WHERE org_id="+orgid+" AND holder_id="+parentorgid+";");
				LOGGER.info("*****************Test case: Post Orgs Shareholders Ended*****************");
			} 
		}

		@Test
		public void DeleteOrgsShareholderswithWrongId(){
			try {
				LOGGER.info("*****************Test case: Delete Orgs Shareholders with Wrong Id Started*****************");

				String uri = APITest.getValue("baseuri");
				String cookievalue = cookies.get(0);
				APIResponse response = APIRequest.DELETE(uri).path("/orgs/shareholders/-1").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).invoke();
				response.assertBodyContains("500");
			} finally {
				LOGGER.info("*****************Test case: Post Orgs Shareholders with Wrong Id Ended*****************");
			}
		}

		@Test
		public void DeleteOrgsShareholderswithBadId(){
			try {
				LOGGER.info("*****************Test case: Delete Orgs Shareholders with Bad Id Started*****************");

				String uri = APITest.getValue("baseuri");
				String cookievalue = cookies.get(0);
				APIResponse response = APIRequest.DELETE(uri).path("/orgs/shareholders/-1").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).invoke();
				response.assertBodyContains("500");
				response.assertBodyContains("对象-1不存在");
			} finally {
				LOGGER.info("*****************Test case: Post Orgs Shareholders with Wrong Id Ended*****************");
			}
		}

		@Test
		public void PostOrgsShareholdings(){
			try {
				LOGGER.info("*****************Test case: Post Orgs Shareholdings Started*****************");
				String uri = APITest.getValue("baseuri");
				String cookievalue = cookies.get(0);
				String payload="{\n" +
						"  \"orgId\": "+orgid+",\n" +
						"\t\"org\":{\n" +
						"\t  \"id\":"+parentorgid+",\n" +
						"\t\t\"displayName\":\"Parent for Automation\",\n" +
						"\t\t\"reasonType\":1,\n" +
						"\t\t\"reason\":\"\",\n" +
						"\t\t\"unique\":\"\"\n" +
						"\t},\n" +
						"  \"holdRate\": \"20\",\n" +
						"\t\"investAmount\": \"2000\"\n" +
						"}";
				APIResponse response = APIRequest.POST(uri).path("/orgs/shareholders").type(MediaType.APPLICATION_JSON_TYPE).header("cookie",cookievalue).body(payload).invoke();
				response.assertBodyContains("200");
			} finally {
				LOGGER.info("*****************Test case: Post Orgs Shareholdings Ended*****************");
			}
		}

		public void PostOrgsSearch(){

		}
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	try {
		System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.LogManager");
		String sql="INSERT INTO organization(id, name, simple_name, english_name, aliases, `type`, phone_no, logo_url, site_url, img_urls, financing_status, financing_amount, financing_detail, description, legal_person, registed_capital, registed_at, turnover, registed_no, registed_authority, parent_id, nature_code, emp_scale, emp_mean_salary, wx_public_no, linkedin_url, weibo_url, `source`, qcc_unique, org_code, license_no, reason_type, reason, owner_id, created_by, updated_by, created_at, updated_at)VALUES(0, 'Test for Automation ', 'test', 'test', '', 0, '', '', '', '', 0, 0, '{}', '', '', 0, CURRENT_TIMESTAMP, 0, '', '', 0, 0, 0, 0, '', '', '', 0, '', '', '', 0, '', 0, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
		dbCtrl.executeSql(conn, sql);
		ResultSet resultSet = dbCtrl.query(conn, "SELECT * FROM organization WHERE name=\"Test for Automation \"");
		resultSet.next();
		orgid=resultSet.getLong("id");
		System.out.println(orgid);
		String sql2="INSERT INTO organization(id, name, simple_name, english_name, aliases, `type`, phone_no, logo_url, site_url, img_urls, financing_status, financing_amount, financing_detail, description, legal_person, registed_capital, registed_at, turnover, registed_no, registed_authority, parent_id, nature_code, emp_scale, emp_mean_salary, wx_public_no, linkedin_url, weibo_url, `source`, qcc_unique, org_code, license_no, reason_type, reason, owner_id, created_by, updated_by, created_at, updated_at)VALUES(0, 'Parent for Automation ', 'test', 'test', '', 0, '', '', '', '', 0, 0, '{}', '', '', 0, CURRENT_TIMESTAMP, 0, '', '', 0, 0, 0, 0, '', '', '', 0, '', '', '', 0, '', 0, 0, 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
		dbCtrl.executeSql(conn, sql2);
		ResultSet resultSet2 = dbCtrl.query(conn, "SELECT * FROM organization WHERE name=\"Parent for Automation \"");
		resultSet2.next();
		parentorgid=resultSet.getLong("id");
	} catch (SQLException e) {
		
		e.printStackTrace();
		LOGGER.error(e);
	}	  
  }

  @AfterClass
  public void afterClass() {
	  dbCtrl.executeSql(conn, "DELETE FROM organization where name = \"Test for Automation \"");
	  dbCtrl.executeSql(conn,"DELETE FROM organization where name = \"Parent for Automation \"");
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void setup() throws SQLException {
	  LOGGER.info("*****************Test suit: Org*****************");
		String uri = APITest.getValue("baseuri");
		String path = APITest.getValue("login.path");
		//String payload = String.format(APITest.loadFile("jsonfile.json"), "62ab92bab49692ea813c99b3d2b4ebbdb3aa99ffede992762b5edc612f162814", "f57405304f15cba90c214252f85b925407704d3bb67b598bb49ada0460161b63");		
		APIResponse response=APIRequest.POST(uri+path).type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).body("name=koth&password=1").invoke();

		final Map<String,NewCookie> cookie=response.getcookie();
	    for (String name : cookie.keySet()) {
	        Cookie cookievalue = cookie.get(name);
	        System.out.println("Cookie: " + name + "=" + cookievalue.getValue());
	        cookies.add(name + "=" + cookievalue.getValue());
	    }
		response.assertStatus(200);
		conn=dbCtrl.set_connection();
  }

  @AfterSuite
  public void afterSuite() {
  }

}
