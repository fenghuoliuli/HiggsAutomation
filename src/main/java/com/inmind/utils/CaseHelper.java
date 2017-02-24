package com.inmind.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CaseHelper {
	/**
	* Convert the excel map to the array
	* 
	* @param b true 表示显示，false 表示隐藏
	* @return testcase object
	*/
    public static Object[] getObjArrByMap(Map<String,String> caseExcelMap){
        Map<String,String> caseParam = new HashMap<String,String>();
        Map<String,String> caseDesc = new HashMap<String,String>();
        Map<String,String> casePreset =new HashMap<String,String>();
        CaseInfo ci = new CaseInfo();
         for (String key : caseExcelMap.keySet()) {
             if (key.indexOf("{$d}")== 0){
                 caseDesc.put(key.replace("{$d}", ""), caseExcelMap.get(key));
             }
             else if(key.indexOf("{$p}") == 0){
                 casePreset.put(key.replace("{$p}", ""), caseExcelMap.get(key));
             }
             else {
                 String strValue = caseExcelMap.get(key);
                 if (!strValue.equals("")){
                     caseParam.put(key, strValue);
                 }
             }  
         }
         ci.setCaseDesc(caseDesc);
         ci.setCaseParam(caseParam);
         ci.setCasePreset(casePreset);
        

         return new Object[]{ci};
    }
    ///Convert list to Object[][]
    public static Object[][] getObjArrByList(List<Map<String,String>> caseExcelList){
        List<Map<String,String>> caseExcuteList = getExcuteList(caseExcelList);
        Object[][] objArray = new Object[caseExcuteList.size()][];
        for(int i = 0;i<caseExcuteList.size();i++){
            objArray[i]=getObjArrByMap(caseExcuteList.get(i));
        }
        return objArray;
        
    }
    ///Get the test cases which need to be executed
    private static List<Map<String,String>> getExcuteList(List<Map<String,String>> caseExcelList){
        List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        for( Map<String,String> m : caseExcelList){
        String teststr=m.get("IsExecuted");
        String str = teststr.trim().toLowerCase();
        if (str.equals("y")){ 
                list.add(m);
            }
        }
        return list;
    }


}
