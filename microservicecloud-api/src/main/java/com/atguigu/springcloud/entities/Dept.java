 
package com.atguigu.springcloud.entities;
 
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
// 
//@SuppressWarnings("serial")
//@NoArgsConstructor
//@Data
//@Accessors(chain=true)
public class Dept implements Serializable //必须序列化
{
  private Long  deptno;   //主键
  private String  dname;   //部门名称
  private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

  public Dept()
  {
   super();   
  }
//  
  public Dept(String dname)
  {
   super();
   this.dname = dname;
  }
  
//  public Dept(java.lang.Long deptno, java.lang.String dname, java.lang.String db_source)
//  {
//   super();
//   this.deptno = (Long)deptno;
//   this.dname = dname;
//   this.db_source = db_source;
//  }
//  @JsonCreator
//public Dept(@JsonProperty("deptno") java.lang.Long deptno,@JsonProperty("dname")  java.lang.String dname, @JsonProperty("db_source")  java.lang.String db_source)
//{
// super();
// this.deptno = (Long)deptno;
// this.dname = dname;
// this.db_source = db_source;
//}
  
//  
public Long getDeptno() {
	return deptno;
}
public void setDeptno(Long deptno) {
	this.deptno = deptno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getDb_source() {
	return db_source;
}
public void setDb_source(String db_source) {
	this.db_source = db_source;
}
// public static void main(String[] argsv) {
//	 Dept dept = new Dept();
//	 
// }
}
 
 

