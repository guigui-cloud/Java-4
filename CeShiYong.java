package boshi;

public class CeShiYong {
	final static double ShuiLv1 = 0.03,ShuiLv2 = 0.1,ShuiLv3 = 0.2,ShuiLv4 = 0.25,ShuiLv5 = 0.3,ShuiLv6 = 0.35,ShuiLv = 0.45;
	public static void main(String[] args) {
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
		
		Boshiyanjiusheng Boshi2 = new Boshiyanjiusheng("陈权宏","男",19);
		Boshi2.chaxuefei(10000);
		Boshi2.jiaxuefei();
		Boshi2.chaxinshui(3000);
		Boshi2.faxinshui();
		Boshi2.JiSuanNianShouRu();
		Boshi2.YingJiaoShui = 3000 * ShuiLv1;
		System.out.println("姓名："+Boshi2.name);
		System.out.println("性别："+Boshi2.sex);
		System.out.println("年龄："+Boshi2.age);
		System.out.println("每学期学费："+Boshi2.meixueqixuefei);
		System.out.println("年薪："+Boshi2.NianXin);
		System.out.println("每月应交税："+Boshi2.YingJiaoShui);
		
		
		// TODO 自动生成的方法存根

	}

}
