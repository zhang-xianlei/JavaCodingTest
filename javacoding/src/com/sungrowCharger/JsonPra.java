package com.sungrowCharger;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonPra {
  public static void main(String[] args) {
    try {
      JSONObject jsonObject = new JSONObject();
      jsonObject.put("name", "John");
      JSONArray jsonArray = new JSONArray();
      jsonArray.put(1).put(3);
      jsonObject.put("hasNum", jsonArray);
      System.out.println(jsonObject.toString());
    } catch (JSONException e) {
      e.printStackTrace();
    }
  }
}
