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
/*信息隐藏
 * 面向对象有一个法则：信息隐藏
 * 		-类的成员属性，是私有的private
 * 		-类的方法是公有public的，通过方法修改成员属性的值
 * 	
 * 类成员是私有private的
 * get和set方法是公有public的，统称为getter和setter
 * 外界对类成员的操作只能通过get和set方法
 * 可以用java IDE 快速生成
 * */
 