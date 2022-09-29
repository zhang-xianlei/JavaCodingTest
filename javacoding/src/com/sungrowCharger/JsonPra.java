package com.sungrowCharger;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonPra {
  public static String jsonStr = "{\"name\":\"John\",\"hasNum\":[1,3]}";
  public static void main(String[] args) {
    try {
      JSONObject jsonObject = new JSONObject();
      jsonObject.put("name", "John");
      JSONArray jsonArray = new JSONArray();
      jsonArray.put(1).put(3);
      jsonObject.put("hasNum", jsonArray);
      System.out.println(jsonObject.toString());
      JSONObject jsonObject2 = new JSONObject(jsonStr);
      String name = jsonObject2.getString("name");
      JSONArray hasNum = jsonObject2.getJSONArray("hasNum");
      int n1 = hasNum.getInt(0);
      int n2 = hasNum.getInt(1);
      System.out.println("name: " + name);
      System.out.printf("%d is the first item , %d is the second item \n", n1, n2);
    } catch (JSONException e) {
      e.printStackTrace();
    }
  }
}
