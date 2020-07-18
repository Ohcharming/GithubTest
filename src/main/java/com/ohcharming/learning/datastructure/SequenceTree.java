package learning.datastructure;
   
public class SequenceTree{
	int[] data;
	public SequenceTree(int[] data) {
		this.data=data;
	}
	public void frontshow() {
		frontshow(0);
	}
	 //前序遍历
	public void frontshow(int index) {
		if(data==null||data.length==0) {
			return;
		}
		System.out.print(data[index]+"");
		if(2*index+1<data.length) {
			frontshow(2*index+1);
		}//左子树
		if(2*index+2<data.length) {
			frontshow(2*index+2);
		}//右子树
	}
	//中序遍历
	public void midshow(int index) {
		if(data==null||data.length==0) {
			return;
		}
		if(2*index+1<data.length) {
			midshow(2*index+1);
		}//左子树
		System.out.print(data[index]+"");
		//根节点
		if(2*index+2<data.length) {
			midshow(2*index+2);
		}//右子树
	}
	
	//后后序遍历
	public void aftershow(int index) {
		if(data==null||data.length==0) {
			return;
		}
		if(2*index+1<data.length) {
			aftershow(2*index+1);
		}//左子树
			if(2*index+2<data.length) {
				aftershow(2*index+2);
			}//右子树
			System.out.print(data[index]+"");//根节点
		
	}
	public static  class TestSequenceTree{
		public static void main(String[] args) {
			int[] data =new int[] {1,2,3,4,5,6,7,8};
			SequenceTree  tree=new SequenceTree(data);
			System.out.print("先序遍历：");
	        tree.frontshow();
	        System.out.println();
	        System.out.print("中序遍历：");
	        tree.midshow(0);
	        System.out.println();
			System.out.print("后续遍历");
			tree.aftershow(0);
		}
   }
}