
public class JournalPaper extends WrittenItem{
	
	private int publishYear;
	
	public JournalPaper(int uin, String title, int noc, String author,int publishYear){
		super(uin, title, noc, author);
		this.publishYear=publishYear;

	}

	protected int getPublishYear() {
		return publishYear;
	}

	protected void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
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
		return super.toString()+"Published Year : "+publishYear;
	}
	
	@Override
	public void print(){
		super.print();
		System.out.println("Published Year : "+publishYear);
	}
	
	public void addItem(int uin, String title, int noc,String author,int publishYear) {
		super.addItem(uin, title, noc, author);
		this.publishYear=publishYear;
		
	}

}
