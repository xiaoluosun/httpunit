package com.test;

import java.util.ArrayList;

import pub.test.ConnectInfo;

public class SyncShareTruck extends SimuBaseCopy {
	
	private ConnectInfo conn; 	//接口配置信息
	private String jsons;		//地址运单信息信息，json形式
	private int iEnv;			//环境,1:55/2:demo/3:g7
	
	public SyncShareTruck(){
		conn = new ConnectInfo();
		jsons = "";
		iEnv = 1;
	}
	
	public void funcTest() {
		  String connPath = "";
		  String pathRelaUser = "";
		  
		  iEnv = 2;
		  switch(iEnv){
		  case 1:
			  	connPath = "\\data\\changjiu\\joint.truck.syncShareTruck_65.xml";				
				//读取连接信息
				readXmlSqlConn(conn, connPath);
				pathRelaUser = "\\data\\changjiu\\syncShareTruck_65.xml";
				
			  	break;
		  case 2:
			  	connPath = "\\data\\changjiu\\joint.truck.syncShareTruck_65.xml";				
				//读取连接信息
				readXmlSqlConn(conn, connPath);
				pathRelaUser = "\\data\\changjiu\\syncShareTruck_65.xml";
				
				break;
		  case 3:
			  	connPath = "\\data\\changjiu\\joint.truck.syncShareTruck_65.xml";				
				//读取连接信息
				readXmlSqlConn(conn, connPath);
				pathRelaUser = "\\data\\changjiu\\syncShareTruck_65.xml";
				
				break;
		  default:
			  break;		  
		  }
		  
		//连接接口信息位置
		
		  
		//读取接口字段信息
		  ArrayList <String> params = new ArrayList<String>();
		  
//		  params.add("taskcode");
//		  params.add("shipnumber");
//		  params.add("podnumber");
		jsons = Dom4jXml.parserXmlNew(pathRelaUser, 1, params);
		
		
		System.out.println(jsons);
		
		//模拟接口调用，并输出返回值
//		long sysDateBefore = System.currentTimeMillis();
//		
		resg7sGet(jsons, conn);
//		long sysDateAfter = System.currentTimeMillis();
//		long during = sysDateAfter - sysDateBefore;
//		System.out.println(formatDuring(during));
	  }
	
	public void presureTest() {
		  String connPath = "";
		  String pathRelaUser = "";
		  
		  iEnv = 2;
		  switch(iEnv){
		  case 1:
			  	connPath = "\\data\\changjiu\\joint.truck.syncShareTruck_65.xml";				
				//读取连接信息
				readXmlSqlConn(conn, connPath);
				pathRelaUser = "\\data\\changjiu\\syncShareTruck_65.xml";
				
			  	break;
		  case 2:
			  	connPath = "\\data\\changjiu\\joint.truck.syncShareTruck_65.xml";				
				//读取连接信息
				readXmlSqlConn(conn, connPath);
				pathRelaUser = "\\data\\changjiu\\syncShareTruck_65.xml";
				
				break;
		  case 3:
			  	connPath = "\\data\\changjiu\\joint.truck.syncShareTruck_65.xml";				
				//读取连接信息
				readXmlSqlConn(conn, connPath);
				pathRelaUser = "\\data\\changjiu\\syncShareTruck_65.xml";
				
				break;
		  default:
			  break;		  
		  }
		  
		  //连接接口信息位置
		
		  
		  //读取接口字段信息
		  ArrayList <String> params = new ArrayList<String>();
		  
		  jsons = Dom4jXml.parserXmlNew(pathRelaUser, 1, params);
		
		
		  System.out.println(jsons);
		
		//模拟接口调用，并输出返回值
//		long sysDateBefore = System.currentTimeMillis();
//		
		resg7sGet(jsons, conn);
//		long sysDateAfter = System.currentTimeMillis();
//		long during = sysDateAfter - sysDateBefore;
//		System.out.println(formatDuring(during));
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SyncShareTruck ss =  new SyncShareTruck();
		ss.funcTest();

	}

}
