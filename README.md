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
1. 学生接口中创建的两个方法，分别实现$\color{red}{查学费}$和$\color{bule}{交学费}$
```java
public interface Studentjiekou {
	double jiaxuefei();
	void chaxuefei(double xuefei);

}
```
2. 助教接口(Teacherjiekou)同样也创建两个方法，分别实现查薪资和发放薪水
```java
public interface Teacherjiekou {
	double faxinshui();
	void chaxinshui(double xinshui);

}
```
3. 
