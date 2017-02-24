package com.inmind.utils;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.node.JsonNodeFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.Map;
import  java.util.Set;
import java.util.Iterator;

/**
 * Created by zhao on 2017/2/22.
 */
public class JsonUtil {
  private JsonGenerator jsonGenerator = null;
  private ObjectMapper objectMapper = null;
  //private AccountBean bean = null;
  public void readJson2Map(String json){

    try{
      Map<String,Map<String,Object>> maps=objectMapper.readValue(json,Map.class);
      System.out.println(maps.size());
      Set<String> key = maps.keySet();
      Iterator<String> iter = key.iterator();
      while (iter.hasNext()) {
        String field = iter.next();
        System.out.println(field + ":" + maps.get(field));
      }
    }catch (JsonParseException e) {
      e.printStackTrace();
    } catch (JsonMappingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
  public static Type type = new TypeToken<Map<String, Map<String, String>>>() {
  }.getType();

  public static Type MapString_type = new TypeToken<Map<String, String>>() {
  }.getType();


  /**
   * Convert object to Json
   *
   * @param obj
   * @return
   */
  public static String toJson(Object obj) {
    Gson gson = new Gson();
    return gson.toJson(obj);
  }

  /**
   * Covert Json String to Object
   *
   * @param str
   * @param type
   * @return
   */
  public static <T> T fromJson(String str, Type type) {
    Gson gson = new Gson();
    return gson.fromJson(str, type);
  }

  /**
   * Convert Json String to Object
   *
   * @param str
   * @param type
   * @return
   */
  public static <T> T fromJson(String str, Class<T> type) {
    Gson gson = new Gson();
    return gson.fromJson(str, type);
  }



}