package techboost01;

public class ArgsLastPrinter {

	public static void main(String[] args) {
		boolean ok = args.length>0;
		int i = args.length-1;
		//int i = args.length-2;   最後に入力した文字から２番目の文字が出力される。
		//int i = args.length;　　　　　iは１始まり、srgsは0始まりなのでiの数字そのままだしたらargsにはないのでエラーなる。　　
		if(ok) {
			System.out.println(args[i]);
		
				
		}else
		System.out.println("なし");
	}
	
	
	
}	