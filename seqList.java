package HelloWorld;

public class seqList<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static final int MAXSIZE = 20;//20个存储空间
	private T[] data;//数组存储数据
	private int Length;//顺序表的长度
	
	//插入元素
	public boolean insertElem(int i,T t){//i表示要插入的位置,t表示待插入的元素
		if (Length==MAXSIZE) {
			System.out.println("线性表已经满");
			return false;
		}
		if (i<1 || i>Length+1) {
			return false;
		}
		if (i<=Length) {
			for(int j=Length-1;j>=i-1;j--){
				data[j+1] = data[j];//前面的值赋值到后面
			}
		}
		
		data[i-1] = t;//
		Length++;
		return true;
		
	}
	
	//删除元素
	public boolean deleteElem(int i){
		if(Length==0){
			System.out.println("此线性表为空");
			return false;
		}
		
		if (i<1 || i>Length) {
			System.out.println("删除的位置不在范围内");
			return false;
		}
		
		@SuppressWarnings("unused")
		T t = data[i-1];
		if (i<Length) {
			for (int j = i-1; j < Length; j++) {
				data[j] = data[j+1];
		}
		return true;
	}
	
   }

}
