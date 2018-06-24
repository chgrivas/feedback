package com.chgrivas.feedback.core.collections.builder;

public class MoStringBuilder {

  private String[] strings;
  // Keep the index of the next array element to-be-added
  private int index;

  public MoStringBuilder() {
    this.strings = new String[12];
    index = 0;
  }

  public MoStringBuilder(int i) {
    this.strings = new String[i];
    index = 0;
  }

  public MoStringBuilder append(String string) {
    if (index <= strings.length -1) {
      strings[index] = string;
      index++;
      return this;
    }

    String[] newStrings = new String[strings.length * 2];
    for (int i=0; i< strings.length; i++) {
      newStrings[i] = strings[i];
    }
    strings = newStrings;
    strings[index] = string;
    index++;
    return this;
  }

  public String toString() {
    String result = "";

    for (int i=0; i< strings.length; i++) {
      if (strings[i] == null) {
        break;
      }
      result += strings[i];
    }
    return result;
  }
}
