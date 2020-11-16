# Java-4
谢宇翔 物191 2019311448
Java课程作业仓库4

# 阅读程序

## 实验过程
1. 定义接口
2. 实现接口
3. 查找《国家工资纳税标准》
4. 编写并测试主类

-----------------------------------------------------------
## 核心方法
接口中的方法：
> 1. 学生接口中创建的两个方法，分别实现**查学费**和**交学费**
```java
public interface Studentjiekou {
	double jiaxuefei();  //交学费
	void chaxuefei(double xuefei);  //查学费

}
```
> 2. 助教接口(Teacherjiekou)同样也创建两个方法，分别实现**查薪资**和**发放薪水**
```java
public interface Teacherjiekou {
	double faxinshui();  //发薪水
	void chaxinshui(double xinshui);  //查薪资

}
```
> 3. 博士研究生类中将实现以上两个接口
>> 创建构造方法：
```java
public Boshiyanjiusheng(String XueShengName,String Sex,int Age) {
		name = XueShengName;
		sex = Sex;
		age = Age;
	}
```
>> 重写接口方法（这里只写出学生接口的重写，助教接口同）：
```java
	public double jiaxuefei() {
		return meixueqixuefei;
		
	}
	
	public void chaxuefei(double xuefei) {
		meixueqixuefei = xuefei;
		
	}
```
>> 计算年薪：
```java
public double JiSuanNianShouRu() {
		NianXin = 12*meiyuexinshui;
		return NianXin;
	}
```

## 测试主类（CeShiYong）
在编写这个类之前，先去查找了一下国家最新的工资纳税标准，如下图：
![工资纳税标准](http://t.860816.com/uploads/allimg/180920/1-1P9201S1231B.jpg)

















