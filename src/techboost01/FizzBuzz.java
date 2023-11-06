package techboost01;

public class FizzBuzz {

	public static void main(String[] args) {
		if(args.length == 0) {
			return;
		}
		String result = null;
		int max = Integer.parseInt(args[0]);
		
		//result = "";
		for(int i =0; i<max; i++) {
			int num= i + 1;
			result = "";
			 if(num % 3 == 0) {        //2
				result = result + "Fizz";
			}
			 else if(num % 5 == 0) {      //3
				result = result + "Buzz";
			}
			 else if(num % 3 == 0 && num % 5 ==0) {   //1
				result = result + "FizzBuzz";
			}
			//resultはString型で定義してるのでresult =　num;で記入したらエラーになる？
			else { result =result + num;
			}
			System.out.print(result + " ");

		}
	}

}
