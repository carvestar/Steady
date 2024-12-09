package ch02.sec01;

public class ByteExample {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		int var6 = 128;
		//byte 타임의 범위는 -128 ~ 127까지라서 128의 값을 넣을 수 없다. int나 short 같은 더 큰 데이터 타입을 이용해야 한다.1111111
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}

}
