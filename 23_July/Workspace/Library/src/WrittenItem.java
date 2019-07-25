
public class WrittenItem extends Item{
	protected String author = new String();
	
	public WrittenItem(){
		author=null;
	}
	
	public WrittenItem(int uin, String title, int noc, String author){
		super(uin,title,noc);
		this.author=author;
	}

	protected String getAuthor() {
		return author;
	}

	protected void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == this) return true;
		if(obj == null) return false;
		if (! (obj instanceof WrittenItem)) return false;
		WrittenItem itm = (WrittenItem)obj;
		if(!(this.author==itm.author))
			return false;
		else
			return super.equals(obj);
		
	}
	
	@Override
	public String toString() {
		return super.toString()+"Author : "+this.author;
	}
	
	public void print(){
		super.print();
		System.out.println("Authorm : "+author);
	}
	
	public void addItem(int uin, String title, int noc,String author) {
		super.addItem(uin, title, noc);
		this.author=author;
	}

}
