package org.kuldeep.modeling.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessagePrinter {

  public static final String RESOURCE_BUNDLE = "messages";

  public static void printForKey(String key) {
    String language = System.getProperty("user.language");
    String country = System.getProperty("user.country");

    Locale locale = new Locale(language, country);

    ResourceBundle res = ResourceBundle.getBundle(RESOURCE_BUNDLE, locale);
    System.out.println(res.getString(key));
  }
}
