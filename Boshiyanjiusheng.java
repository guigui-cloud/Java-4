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
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void chaxuefei(double xuefei) {
		meixueqixuefei = xuefei;
		// TODO �Զ����ɵķ������
	}

	@Override
	public double faxinshui() {
		// TODO �Զ����ɵķ������
		return meiyuexinshui;
	}

	@Override
	public void chaxinshui(double xinshui) {
		meiyuexinshui = xinshui;
		// TODO �Զ����ɵķ������
	}
	
	public double JiSuanNianShouRu() {
		NianXin = 12*meiyuexinshui;
		return NianXin;
	}
}
