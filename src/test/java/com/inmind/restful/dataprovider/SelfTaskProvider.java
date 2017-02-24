package com.inmind.restful.dataprovider;

import java.io.FileNotFoundException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class SelfTaskProvider {
    /*
	 // 从XML文本文件中获得数据
    @DataProvider(name = "SelfTaskProvider")
    public static Object[][] getTestDataFromXml(Method m) throws FileNotFoundException {

        // 通过反射获得函数名称，可以为多个测试方法提供数据驱动
        Object[][] o = new Object[][] {};

        // 取用例数据集d1Test的全部数据(excel数据源)
        if (m.getName().equals("test1")) {
            return new BaseExcelData().getData("testA", "DataProvider.xls",2,5);
        }
        
        if (m.getName().equals("test2")) {
            return new BaseExcelData().getData("testB", "DataProvider.xls",2,5);
        }
        
        //取用例数据集d2Test的全部数据(excel数据源)
        /*if (m.getName().equals("test1")) {
            return new BaseExcelData.getData("d1Test","caipiaoTest.xls")
        }*/
        
        
       // return o;
    }

