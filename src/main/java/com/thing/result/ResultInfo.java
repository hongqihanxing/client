package com.thing.result;

/**
 * 接口返回信息
 *
 * @author zhanghongqi21
 * @create 2018-05-20 16:37
 **/
public class ResultInfo {

  private String errCode;
  private String errMessage;
  private Object data;



  public ResultInfo(ResultState resultState, Object data) {
    this.errCode = resultState.getState();
    this.errMessage = resultState.getStateInfo();
    this.data = data;
  }

  public ResultInfo(ResultState resultState) {
    this.errCode = resultState.getState();
    this.errMessage = resultState.getStateInfo();
  }

  public ResultInfo(String code, String info) {
    this.errCode = code;
    this.errMessage = info;
  }

  public String getErrCode() {
    return errCode;
  }

  public void setErrCode(String errCode) {
    this.errCode = errCode;
  }

  public String getErrMessage() {
    return errMessage;
  }

  public void setErrMessage(String errMessage) {
    this.errMessage = errMessage;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
