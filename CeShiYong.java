package boshi;

public class CeShiYong {
	final static double ShuiLv1 = 0.03,ShuiLv2 = 0.1,ShuiLv3 = 0.2,ShuiLv4 = 0.25,ShuiLv5 = 0.3,ShuiLv6 = 0.35,ShuiLv = 0.45;
	public static void main(String[] args) {
		Boshiyanjiusheng Boshi1 = new Boshiyanjiusheng("л����","��",19);
		Boshi1.chaxuefei(10000);
		Boshi1.jiaxuefei();
		Boshi1.chaxinshui(5000);
		Boshi1.faxinshui();
		Boshi1.JiSuanNianShouRu();
		Boshi1.YingJiaoShui = 3000 * ShuiLv1 + (Boshi1.meiyuexinshui-3000) * ShuiLv2 - 210;
		System.out.println("������"+Boshi1.name);
		System.out.println("�Ա�"+Boshi1.sex);
		System.out.println("���䣺"+Boshi1.age);
		System.out.println("ÿѧ��ѧ�ѣ�"+Boshi1.meixueqixuefei);
		System.out.println("��н��"+Boshi1.NianXin);
		System.out.println("ÿ��Ӧ��˰��"+Boshi1.YingJiaoShui);
		System.out.println('\n');
		
		Boshiyanjiusheng Boshi2 = new Boshiyanjiusheng("��Ȩ��","��",19);
		Boshi2.chaxuefei(10000);
		Boshi2.jiaxuefei();
		Boshi2.chaxinshui(3000);
		Boshi2.faxinshui();
		Boshi2.JiSuanNianShouRu();
		Boshi2.YingJiaoShui = 3000 * ShuiLv1;
		System.out.println("������"+Boshi2.name);
		System.out.println("�Ա�"+Boshi2.sex);
		System.out.println("���䣺"+Boshi2.age);
		System.out.println("ÿѧ��ѧ�ѣ�"+Boshi2.meixueqixuefei);
		System.out.println("��н��"+Boshi2.NianXin);
		System.out.println("ÿ��Ӧ��˰��"+Boshi2.YingJiaoShui);
		
		
		// TODO �Զ����ɵķ������

	}

}
