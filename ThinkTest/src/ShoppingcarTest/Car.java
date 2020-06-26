package ShoppingcarTest;

import java.util.*;

public class Car {
	
	Map<Product, Integer> productMaps;

	double totalPrice;
	public Car(){
		productMaps = new HashMap<Product,Integer>();
	}
	
	//���1����Ʒ
	public void add(Product p){
		add(p,1);
	}
	
	//���N����Ʒ
	public void add(Product p,int n){
		//�жϸù��ﳵ���Ƿ��и���Ʒ
		if(!productMaps.containsKey(p)){
			productMaps.put(p, n);
		}else{
			//�����и���Ʒ
			int before = productMaps.get(p).intValue();//�����Ʒ֮ǰ�ĸ���Ʒ����
			int after = before + n;
			productMaps.put(p, after);//key�ظ���value����
		}
		totalPrice += p.getPrice()*n;
	}
	
	//ɾ��1����Ʒ
	public void remove(Product p){
		remove(p,1);
	}
	
	//ɾ��n����Ʒ
	public void remove(Product p,int n){
		int before = productMaps.get(p).intValue();//�����Ʒ֮ǰ�ĸ���Ʒ����
		//������ﳵ�е�ĳ��Ʒ������n����ȵģ�����ɾ��������Ŀ
		if(before == n){
			productMaps.remove(p);
			return;
		}else{
			int after = before - n;
			productMaps.put(p, after);
		}

		//�޸��ܼ�
		totalPrice -=p.getPrice()*n;
	}
	
	//��չ��ﳵ
	public void clear(){
		productMaps.clear();
		totalPrice = 0.0;
	}
	
	//������ﳵ�굥
	/*
	 * ��ʽ��
	 * �����굥��
	 *    10  ƻ��  10Ԫ
	 *    3   ����  30Ԫ
	 *    ---------------
	 *            �ܼۣ�40
	 * */

	public void print(){
		StringBuffer sb = new StringBuffer();
		sb.append("�����굥��\n");
		//����Map
		Set<Product> keys = productMaps.keySet();
		Iterator<Product> it = keys.iterator();
		while(it.hasNext()){
			Product k = it.next();
			Integer v = productMaps.get(k);
			sb.append("\t"+v.intValue()+"\t" + k + "\t" + v.intValue()*k.getPrice()+"\n");
		}
		
		sb.append("\t\t\t\t\t\t\t\t�ܼۣ�"+totalPrice+"Ԫ");
		
		System.out.println(sb);
	}
}
