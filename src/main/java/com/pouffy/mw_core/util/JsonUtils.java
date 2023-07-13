package com.pouffy.mw_core.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


public class JsonUtils {
   public static String getStringOr(String pKey, JsonObject pJson, String pDefaultValue) {
      JsonElement jsonelement = pJson.get(pKey);
      if (jsonelement != null) {
         return jsonelement.isJsonNull() ? pDefaultValue : jsonelement.getAsString();
      } else {
         return pDefaultValue;
      }
   }

   public static boolean getBooleanOr(String pKey, JsonObject pJson, boolean pDefaultValue) {
      JsonElement jsonelement = pJson.get(pKey);
      if (jsonelement != null) {
         return jsonelement.isJsonNull() ? pDefaultValue : jsonelement.getAsBoolean();
      } else {
         return pDefaultValue;
      }
   }
}