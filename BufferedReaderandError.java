package BufferedReader;

//������ ������ �ִ� Ŭ������ ����ϰڴٰ� ����(��������)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//java.lang ��Ű��
// - JDK ��ü �� ������ �⺻ ��Ű��(���� �⺻�� + ���� �߿��� Ŭ������ ��Ƴ��� ��Ű��)
// - java.lang ��Ű���� import�� ���� �ʾƵ� �ڵ����� import�� �ȴ�.
// - import java.lang.String; // ������δ� ��Ʈ���� �����;��� ������ ���� ������ �� �۾��� ���ʿ�

public class BufferedReaderandError {
	
	public static void main(String[] args) throws IOException {
		
		//[BufferedReader]
		
		//�ܼ������
		// - print(), println(), printf()
		// - read(), BufferedReader, Scanner
		
		//Ŭ���� ����
		// - Ŭ���� = �ڷ���
		
		//�ڷ��� ������;
		//int n;
		//String str;
		//BufferedReader reader;
		
		//String, BufferedReader > Ŭ����
		//String > �׻� ������ �� �ִ� ������ ����ִ� Ŭ����
		//BufferedReader > ���� �����س��� ������ ����ִ� Ŭ����
		
		int sum = 10 + 20;
		
		//���� > ����� > �ֺ��ε鿡�� ����
		//1. ����� ������ ���� > x > �ҽ� ��ü ����
		//2. �ϼ��� ����� ��ü ���� > o >  Ŭ���� ����(������ ���, *.class) ����
		
		//Ŭ���� > �ڵ��� ���� > ������ ����� ���� > �����ڰ� Ư�� ��ɵ��� ����� ���� ����(Ŭ����) 
		//	> �ٸ� �����ڵ鿡�� ����϶�� ���� ����!! (Ŭ���� ������ �ְ� �޴´�.)
		
		//������ > ������ Ŭ������ ����(JDK - 8õ����) > �� �� �� �� 1������ ����ִ� Ŭ������ �ٷ� ����� �����ϰ�, 
		//������ ������ ����ִ� Ŭ������ �������� �ൿ�� �ʿ��ϴ�.
		
		
		//�䱸����] ���� 1���� �Է¹޾� �״�� ����Ͻÿ�.
		//System.in.read();
		
		int n = 10;
		String str = "���ڿ�";
		
		//System.in.read() -> ���� �� -> ���� -> Wrapper Class
		BufferedReader reader 
		= new BufferedReader(new InputStreamReader(System.in)); //���� ����
		System.out.print("�����Է�: ");
		int code = reader.read();
		System.out.println(code);
		System.out.printf("%c\r\n", code); //int -> code
		
		//���� ���۾ȿ� \r\n�� �����ִ�. > ����!!!
		reader.readLine(); // ��ȸ�� > \r\n�� ����� ���ؼ�
		
		//code = reader.read();		
		//System.out.println(code);
		//System.out.printf("%c\n", code);
				
		//code = reader.read();		
		//System.out.println(code);
		//System.out.printf("%c\n", code);
		
		//��(44032) ~ �R(55203) -> 11,172��
		
		//------------------------------------
		
		//�䱸����] ����ڿ��� �̸�(3����)�� �Է¹޾� �λ縦 �Ͻÿ�.
		// -> reader() x 3ȸ
		
		System.out.print("�̸� �Է�: ");
		
		//reader.read() > 1�����Է� > �����ڵ�(int) ��ȯ
		//reader.readLine() > N����(���ڿ�) �Է� > ���ڿ�(String) ��ȯ
		//reader.readLine() > �Է� ���۾ȿ��� ���Ͱ��� ������ �������� ���ڿ��� ��ȯ + �����ִ� \r\n�� ����������.
		
		String name = reader.readLine();
		System.out.printf("�ȳ��ϼ���. %s��. \n", name);
		
		System.out.print("���� �Է�: ");
		String age = reader.readLine();
		System.out.printf("����� ���̴� %s���̱���. \n", age);
		
		
		//======================================================================
		
		//�䱸����] ���� 2���� �Է¹޾� �� ���� ���� ���Ͻÿ�.
		
		//��ü import ����Ű
		//Ctrl + Shift + o

		// �ڵ� ����
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���� �Է�: ");
		String input1 = reader.readLine();

		System.out.print("���� �Է�: ");
		String input2 = reader.readLine();

		System.out.println(input1 + input2); // String + String

		// BufferedReader�� ��� �Է°��� *String*���� ��ȯ�Ѵ�.
		// �Է¹��� String�� ���ϴ� �ٸ� �ڷ������� ��ȯ�ؾ� �Ѵ�.
		
		
		//��ƿ Ŭ���� ���
		//String -> int
		//String -> double
		//String -> boolean
		
		//"100" : ���ڿ� -> 100 : �ڷ���
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.println(num1 + num2);
		
		
		//"100" -> 100   : Integer.parseInt()
		//                 Byte.parseByte()
		//                 Short.parseShort()
		//                 Long.parseLong()
		//"3.14" -> 3.14 : Double.parseDouble() 
		//                 Float.parseFloat()
		//"true" -> true : Boolean.parseBoolean()
		
		
		
		//======================================================
		
		//[Error]
		/*
		  ����, Error
		 - ����, ����(Bug), ����(Exception) ��...
		 
		  1. ������ ����
		  - ������ �۾��߿� �߻��ϴ� ����
		  - �����Ϸ� �߰� > ������ Ʋ�ȴ�!!
		  - ��Ŭ���� �������� ������
		  - ������ �۾� �ߴ� > ���� �ߴ� > ���α׷� ���� �Ұ� > �ݵ�� �ذ�!!!
		  - ���̵� ���� ���� > �߰��� ���� > ��ġ�� ����.
		  - �����Ϸ��� ģ���ϰ� ��Ȳ�� �˷��ش�.(���� �޽���)
		  - ��Ÿ!!
		  - �ذ� ��� > ���� �޽��� Ȯ�� > ����
		  
		  
		  2. ��Ÿ�� ����
		  - �����϶��� �߰��� �ȵƴµ�, ���� �߿� �߰ߵǴ� ����
		  - �������� ������ ���µ� �ٸ��������� �߻��ϴ� ����
		  - ����(Exception)
		  - ���̵� �߰� > �߰� �߰� > ���Һ� > �׽�Ʈ �߰�o -> ��ġo, �׽�Ʈ �߰�x ->��ġx
		  - ��Ÿ��(=���α׷��� ������)
		  - �������� ��κ� ���α׷��� ��Ÿ�� ������ ������ �ִ�.
		  - ��ġ ��� > �ð� + ��(�η�, �ڵ�ȭ �׽�Ʈ ���α׷�)
		  - ���� ��� > RPG > �Ҽ��� ������ ��� ��� �׽�Ʈ �Ұ��� > Ŭ����� ����, Ŭ����� ��Ÿ, ���� ����, ���� ��Ÿ > ��Ÿ �׽��� 
		  > ��Ÿ�� ���� �߰��ϴ� �����!! > ���� �߰� -> ��ġ, ���׷��̵�
		  
		  
		  3. �� ����
		  - ������ Ʋ������ ����, ���൵ �ߵǴµ�...? > ����� �̻���;;
		  - �߰� �־�, ���� �־� > ã�Ⱑ �ʹ� ���� > ����Ʋ����x, ����o
		  - �ذ� ��� > ���� ���� ���� ������ Ȯ��
		  
		  ������ ���� + ��Ÿ�� ����
		  - ���� ��Ʈ �����
		  - ����, ����Ʈ, ���, �޸��� �� �� �����ϱ�
		  
		 
		 */
		
		// ����ڿ��� ���ڸ� 1�� �Է� > ���� ��� ���
		// - ������O, ����O, �׽�ƮO > ���!!! > ����!!
		
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at com.test.java.Ex09_BufferedReader.main(Ex09_BufferedReader.java:135)
		
		//divide by zero
		
		//����ڰ� �Է��ϴ� ���� > ����� ��? > 42�ﰡ�� > �� �߿� �� 1����(0)�� �Է½� ���� 
		//int num = 0; //Ű���� �Է�
		//System.out.println(100 / num);
		
		
	}//main

}
