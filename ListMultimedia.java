package multimd;

import java.util.ArrayList;

public class ListMultimedia {
	
	private ArrayList<Multimedia> ListMM;
	private int size;
	
	public ListMultimedia(int size) {
		this.size = size;
	}
	
	public ListMultimedia() {
		this(0);
	}
	
	public int Size() {
		return ListMM.size();
	}
	
	public boolean addMM(Multimedia M) {
		return ListMM.add(M);
	}
	
	public Multimedia get(int pos) {
		return ListMM.get(pos);
	}

	@Override
	public String toString() {
		return "ListMultimedia [ListMM=" + ListMM + ", size=" + size + "]";
	}
	
	

}
