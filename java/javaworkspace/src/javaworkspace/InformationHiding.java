package javaworkspace;

class InfoHiding{
	private int id;
	public InfoHiding(int id2)
	{
		id=id2;
	}
	public int getID()
	{
		return id;
	}
	public void setID(int id2)
	{
		id=id2;
	}
}

public class InformationHiding {
	public static void main(String[] args)
	{
		InfoHiding obj=new InfoHiding(100);
		//obj.setID(200);
		System.out.println(obj.getID());
	}

}
/*��Ϣ����
 * ���������һ��������Ϣ����
 * 		-��ĳ�Ա���ԣ���˽�е�private
 * 		-��ķ����ǹ���public�ģ�ͨ�������޸ĳ�Ա���Ե�ֵ
 * 	
 * ���Ա��˽��private��
 * get��set�����ǹ���public�ģ�ͳ��Ϊgetter��setter
 * �������Ա�Ĳ���ֻ��ͨ��get��set����
 * ������java IDE ��������
 * 
 *  this���������г�Ա����
 *  	-this.add(5,3);//���ñ����add������this���Ժ���
 *  this���Դ��汾��Ĺ��캯��//���ñ����һ���βεĹ��캯��
 *  
 *  this
 *  	-ָ�����г�Ա����
 *  	-ָ�����г�Ա����
 *  	-���Ե������캯��ʹ��
 * */
 