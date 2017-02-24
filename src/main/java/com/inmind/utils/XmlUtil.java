package com.inmind.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.tools.ant.taskdefs.Input;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
public class XmlUtil {

    public static List getXmlComent(String fname) throws FileNotFoundException{
        
       // String path=CommonFunction.getAbsolutionPath(fname);
        //System.out.println("xml·path"+path);
    	
    	FileInputStream file = new FileInputStream(fname);

        List contList=new ArrayList();
       
        SAXReader saxR=new SAXReader();
        try {
            Document doc=saxR.read(file);
            
            Element eleroot=doc.getRootElement();
            
            Map parMap=new HashMap();
            Map sonMap=new HashMap();
            for(Iterator i=eleroot.elementIterator();i.hasNext();){
                

                Element elepar=(Element)i.next();
                for(Iterator j=elepar.elementIterator();j.hasNext();){
                    Element eleSon=(Element)j.next();
                    System.out.println("+++++"+eleSon.getName()+"    "+ eleSon.getText());
                    sonMap.put(eleSon.getName(), eleSon.getText());
                }

                parMap.put(elepar.getName(),sonMap);
                System.out.println("*****"+elepar.getName());
                contList.add(parMap);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        return contList;
    }
}
