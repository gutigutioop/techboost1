package techboost01;

public class FizzBuzz2 {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			return;
		}
		String result = null;
		int max = Integer.parseInt(args[0]);
		
		//result = "";
		for(int i =0; i<max; i++) {
			int num= i + 1;
			result = "";//意味？
			if(num % 3 == 0) {
				result = result + "Fizz";
			}
			if(num %  5== 0) {
				result = result + "Buzz";
			}
			//if(num % 3 == 0 && num % 5 ==0) {        //23~25行目を記入しなくても3と5の共通15,30・・・が来たら"FizzBuzz"と出力される。上から順に処理されるのでresultにFizzとBuzzが合体される。
			//	result = result + "FizzBuzz";
		    //}
			if (result.length() == 0) {    //resultに文字数が入っていない時にnum(数字)を返す?   result + numでnumの整数を文字列に変換してる。
				result = result + num;     //resultに３でも５でも共通（１５等）でもresultに文字（Fizz、Buzz、FizzBuzz)が入ってないときに数字１，２、４、、、を出力する。
			}
			System.out.print(result + " ");

		}
	}



	}


