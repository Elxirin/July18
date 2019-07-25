
public abstract class Item {

	private int uin, noc;
	private String title = new String();

	Item(){
		this.uin=this.noc=0;
		this.title=null;
	}
	
	Item(int uin, String title, int noc) {
		this.uin = uin;
		this.noc = noc;
		this.title = title;
	}

	protected int getUin() {
		return uin;
	}

	protected void setUin(int uin) {
		this.uin = uin;
	}

	protected int getNoc() {
		return noc;
	}

	protected void setNoc(int noc) {
		this.noc = noc;
	}

	protected String getTitle() {
		return title;
	}

	protected void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == this) return true;
		if(obj == null) return false;
		if (! (obj instanceof Item)) return false;
		Item itm = (Item)obj;
		if(!(this.uin==itm.uin && this.noc==itm.noc && this.title.equals(itm.title))){
			return false;
		}
		else
			return true;
		
	}
	
	@Override
	public String toString() {
		return String.format("Uinique Identification Number : %c\nTitle : %s\nNumber of Copies : %c", uin,title,noc);
	}
	
	public void print(){
		System.out.println("Unique Identification Number : "+ uin);
		System.out.println("Title : "+ title);
		System.out.println("Number of copies : "+ noc);
	}
	
	public void addItem(int uin, String title, int noc) {
		this.uin = uin;
		this.noc = noc;
		this.title = title;
	}

}
