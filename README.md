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
> 学生接口中创建的两个方法，分别实现**查学费**和**交学费**
```java
public interface Studentjiekou {
	double jiaxuefei();  //交学费
	void chaxuefei(double xuefei);  //查学费

}
```
> 助教接口(Teacherjiekou)同样也创建两个方法，分别实现**查薪资**和**发放薪水**
```java
public interface Teacherjiekou {
	double faxinshui();  //发薪水
	void chaxinshui(double xinshui);  //查薪资

}
```
> 博士研究生类中将实现以上两个接口
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
-------------------------------------------------------------------------------
根据图片，将税率分别定义为：
```java
final static double ShuiLv1 = 0.03,ShuiLv2 = 0.1,ShuiLv3 = 0.2,ShuiLv4 = 0.25,ShuiLv5 = 0.3,ShuiLv6 = 0.35,ShuiLv = 0.45;
//ShuiLv1等等按图中从上到下排列
```
通过Scanner来实现交互式输入的时候，会遇到判断输入内容的情况，若是编写如下图所示的代码，将不会进行判断而是直接走else的结果
```java
·······
Scanner in = new Scanner(System.in);
		String name = in.next();
		
		if(name == "谢宇翔") {
·······
}
·······
```
后面发现在判断字符串的时候应该使用.equals()比较，这样能避免上面那种情况的发生，如下：
```java
Scanner in = new Scanner(System.in);
		String name = in.next();
		
		if("谢宇翔".equals(name)) {
			Boshiyanjiusheng Boshi1 = new Boshiyanjiusheng("谢宇翔","男",19);
			Boshi1.chaxuefei(10000);
			Boshi1.jiaxuefei();
			Boshi1.chaxinshui(5000);
			Boshi1.faxinshui();
			Boshi1.JiSuanNianShouRu();
			Boshi1.YingJiaoShui = 3000 * ShuiLv1 + (Boshi1.meiyuexinshui-3000) * ShuiLv2 - 210;
			System.out.println("姓名："+Boshi1.name);
			System.out.println("性别："+Boshi1.sex);
			System.out.println("年龄："+Boshi1.age);
			System.out.println("每学期学费："+Boshi1.meixueqixuefei);
			System.out.println("年薪："+Boshi1.NianXin);
			System.out.println("每月应交税："+Boshi1.YingJiaoShui);
			System.out.println('\n');
		}
```
## 运行结果(输入"谢宇翔")：
```
姓名：谢宇翔
性别：男
年龄：19
每学期学费：10000.0
年薪：60000.0
每月应交税：80.0
```
## 实验感想
> 这次并没有使用异常类，因为我还不太明白这个(/▽＼)，后面会尝试添加进去
> 最大的收获是知道了:
1. Scanner类在输入了int类型后接着输入String类型的数据时出错的解决方案
[解决方法](https://bigsai.blog.csdn.net/article/details/79734456?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-3.add_param_isCf&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-3.add_param_isCf)
2. 比较字符串时应该使用.equals()进行比较
[if语句可以用来比较字符串内容吗？](https://bbs.csdn.net/topics/392691584)














