package com.test;

import org.testng.annotations.Test;

import pub.test.ConnectInfo;

public class Lbstocar extends SimuReqBase  {
	private ConnectInfo conn; 	//接口配置信息
	private String jsons;		//地址运单信息信息，json形式
	private int iEnv;			//环境,1:55/2:demo/3:g7
	
	public Lbstocar() {
		conn = new ConnectInfo();
		jsons = "";
		iEnv = 1;
	}
	
  @Test
  public void f() {
	  String connPath = "";
	  String pathRelaUser = "";
	  
	  iEnv = 1;
	  switch(iEnv){
	  case 1:
		  	connPath = "\\data\\changjiu\\changjiu.api.lbstocar_64.xml";				
			//读取连接信息
			readXmlSqlConn(conn, connPath);				
			pathRelaUser = "\\data\\changjiu\\lbstocar_64.xml";
			
		  	break;
	  case 2:
		  connPath = "\\data\\changjiu\\changjiu.api.lbstocar_64.xml";				
			//读取连接信息
			readXmlSqlConn(conn, connPath);				
			pathRelaUser = "\\data\\changjiu\\lbstocar_64.xml";
			break;
	  case 3:
		  connPath = "\\data\\changjiu\\changjiu.api.lbstocar_64.xml";				
			//读取连接信息
			readXmlSqlConn(conn, connPath);				
			pathRelaUser = "\\data\\changjiu\\lbstocar_64.xml";
			break;
	  default:
		  break;
	  }
	  
	//连接接口信息位置
	

	//读取接口字段信息	
	jsons = Dom4jXml.parserXml(pathRelaUser);
	
	//System.out.println(jsons);
	
	//模拟接口调用，并输出返回值
	resg7sGet(jsons, conn);
  }
}
