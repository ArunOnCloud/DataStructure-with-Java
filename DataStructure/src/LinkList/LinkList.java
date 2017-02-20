package LinkList;

public class LinkList<T> {
	private LinkListNode<T> head;
	private LinkListNode<T> tail;
	private int size;

	public void add(T data)
	{
		if(head==null)
		{
			head=new LinkListNode<T>();
			head.setData(data);
			tail=head;
			size++;
			
		}else
		{
			LinkListNode<T> linkListNode=new LinkListNode<T>();
			linkListNode.setData(data);
			tail.setNext(linkListNode);
			tail=linkListNode;
			size++;
		}
	}
	public String toString()
	{
		String str="[";
		if(head!=null)
		{
			LinkListNode<T> temp=head;
			int count=0;
			while(temp!=null)
			{
				if(count!=0 && count!=size)
				{
					str+="->";
				}
				str+=temp.getData().toString();
				temp=temp.getNext();
				count++;
			}
		}
		str+="]";
		return str;
		
	}
	
}
