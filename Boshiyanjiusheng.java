package boshi;

public class Boshiyanjiusheng implements Studentjiekou,Teacherjiekou{
	String name,sex;
	int age; 
	double meixueqixuefei,meiyuexinshui,NianXin,YingJiaoShui;
	
	public Boshiyanjiusheng(String XueShengName,String Sex,int Age) {
		name = XueShengName;
		sex = Sex;
		age = Age;
	}

	@Override
	public double jiaxuefei() {
		return meixueqixuefei;
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void chaxuefei(double xuefei) {
		meixueqixuefei = xuefei;
		// TODO 自动生成的方法存根
	}

	@Override
	public double faxinshui() {
		// TODO 自动生成的方法存根
		return meiyuexinshui;
	}

	@Override
	public void chaxinshui(double xinshui) {
		meiyuexinshui = xinshui;
		// TODO 自动生成的方法存根
	}
	
	public double JiSuanNianShouRu() {
		NianXin = 12*meiyuexinshui;
		return NianXin;
	}
}
