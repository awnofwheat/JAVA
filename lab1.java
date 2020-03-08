package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class lab1 {
	public static void main(String[] args) {
		// 输入的单词
		Scanner scanner=new Scanner(System.in);
		boolean continueLoop=ture;
		do{
			try{
				String input=scanner.next();
				// 这里是存储最终分割的单词
				ArrayList<String> outputStrs = new ArrayList<String>();
				// 这里列出一些分隔符
				char[] seps = {'-', '\"', ':', ',', '(', ')', '[', ']', '{', '}', ' '};
				// 定义分割的单词
				StringBuffer sb = new StringBuffer();
				boolean isSingleWord = true;
				for(int i = 0; i < input.length(); ++i) {
					char s = input.charAt(i);
					// 这里定义字符s是否分隔符
					boolean isSep = false;
					for(char sep:seps) {
						if(sep == s) {
							isSep = true;
							isSingleWord = false;
							break;
						}
					}
					// 如果不是分隔符，则加入sb
					// 否则，sb就是一个分割字符串，写入outputStrs
					if(!isSep)
						sb.append(s);
					else {
						if(sb.length() > 0) {
							outputStrs.add(sb.toString());
							sb.delete(0, sb.length());
						}
					}
				}
				System.out.println(isSingleWord);
				for(String outputStr:outputStrs)
					System.out.println(outputStr);
				continueLoop=flase;
			}catch(InputMismatchException inputMismatchException){
				System.err.printf();
			}
		}

	}
}
