package com.thing.result;

public enum ResultState {

  SUCCESS("0", "成功"),
  FAILAUTH("10001", "用户名或密码错误"),
  NOAUTH("10002", "无权限操作"),
  INVALID("10003", "cookie无效"),
  ERRORPARAM("10004", "参数错误"),
  ERROR("10005", "服务器异常"),
  EXPIREDTOKEN("10006","token过期");

  private String state;
  private String stateInfo;

  ResultState(String state, String stateInfo) {
    this.state = state;
    this.stateInfo = stateInfo;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getStateInfo() {
    return stateInfo;
  }

  public void setStateInfo(String stateInfo) {
    this.stateInfo = stateInfo;
  }
}


