package com.restfulapi.test.testdata;


import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.inmind.utils.XmlUtil;

public class Oppermission {
	private static Object[][] obj;
    private static List parList=new ArrayList();
    private static List sonList=new ArrayList();

    //@DataProvider(name="PostOppermission")
    @DataProvider()
    public static Object[][] PostOppermission(Method method) throws FileNotFoundException {
        System.out.println("@DataProvider(name='PostOppermission')");
        System.out.println("dataProvider"+method.getName());
        //读取xml内容
			parList = XmlUtil.getXmlComent("src/test/resources/Oppermission.xml");
        for (int i=0;i< parList.size();i++) {
            Map map = (Map)parList.get(i);
            if (map.containsKey(method.getName())) {
                Map<String,String> submap = (Map<String,String>) map.get(method.getName());
                sonList.add(submap);
                System.out.println(submap);

            }
        }

        if (sonList.size() > 0) {

            obj = new Object[sonList.size()][];
            for (int i = 0; i < sonList.size(); i++) {
                obj[i] = new Object[] { sonList.get(i) };
            }
            return obj;
        }else{
            Assert.assertTrue(sonList.size()!=0,parList+"为空，找不到属性值："+method.getName() );
            return null;
        }
    }
    @DataProvider()
    public static Object[][] GetOppermission(Method method) throws FileNotFoundException {
        System.out.println("@DataProvider(name='PostOppermission')");
        System.out.println("dataProvider"+method.getName());
        //读取xml内容
			parList = XmlUtil.getXmlComent("src/test/resources/Oppermission.xml");
        for (int i=0;i< parList.size();i++) {
            Map map = (Map)parList.get(i);
            if (map.containsKey(method.getName())) {
                Map<String,String> submap = (Map<String,String>) map.get(method.getName());
                sonList.add(submap);
                System.out.println(submap);

            }
        }

        if (sonList.size() > 0) {

            obj = new Object[sonList.size()][];
            for (int i = 0; i < sonList.size(); i++) {
                obj[i] = new Object[] { sonList.get(i) };
            }
            return obj;
        }else{
            Assert.assertTrue(sonList.size()!=0,parList+"为空，找不到属性值："+method.getName() );
            return null;
        }
    }
}
