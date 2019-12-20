package lab1;
public class myclass {
    public static void main(String[] args) {
        int NumBook = 0x4656; //number of my stud book in 16th system (18006 in 10th)
        System.out.println("Номер моей зачетки в шестнадцатеричной системе: " + NumBook);
        long PhoneNumber = 380992282703L;
        System.out.println("Мой сотовый номер : "+ PhoneNumber);
        int TwoLastNum = 0b100101; // 37, showed in 2th system
        System.out.println("Две последние ненулевые цифры моего телефона: " + TwoLastNum);
        int TwoLastNum1 = 07220; //3728 in 8th system
        System.out.println("Четыре последние ненулевые цифры моего телефона: " +  TwoLastNum1);
        int NumList = 8; //my number in studylist
        System.out.println("NumList mod 26 = " + ((NumList - 1 % 26)-1)); 
        System.out.println("Символ верхнего регистра: \u0046");
    	System.out.println("Кол-во парных и непарных чисел в номере зачетки: ");
        Par_Nepar(NumBook);
        System.out.println("Кол-во парных и непарных чисел в номере телефона: ");
        Par_Nepar_Long(PhoneNumber);
        System.out.println("Кол-во парных и непарных чисел в последний двух ненулевых цифрах тф номера : ");
        Par_Nepar(TwoLastNum);
        System.out.println("Кол-во парных и непарных чисел в последний четырех ненулевых цифрах тф номера : ");
        Par_Nepar(TwoLastNum1);
        System.out.println("Кол-во парных и непарных чисел в номере списка  : ");
        Par_Nepar(NumList);
        System.out.println("Кол-во единиц в номере зачетки в двоичной системе: ");
        Par_Nepar_Bin(NumBook);
        System.out.println("Кол-во единиц в номере телефона в двоичной системе: ");
        Par_Nepar_Bin_Long(PhoneNumber);
        System.out.println("Кол-во единиц в последний двух ненулевых цифрах тф номера в двоичной системе: ");
        Par_Nepar_Bin(TwoLastNum);
        System.out.println("Кол-во единиц в последний четырех ненулевых цифрах тф номера в двоичной системе: ");
        Par_Nepar_Bin(TwoLastNum1);
        System.out.println("Кол-во единиц в номере списка в двоичной системе : ");
        Par_Nepar_Bin(NumList);
        
    }

public static void Par_Nepar(int k)
{
	String res = Integer.toString(k,10); // перевод 16. числа в 10 
	int count_par = 0; 
	int count_nepar = 0;
	for (int i=0;i< res.length();i++)
	{
		int x = res.charAt(i) - '0'; // функция для перевода в int
		if (x%2==0) {
			count_par++;
		}
		else {
		count_nepar++;	
		}
	}
	System.out.println(count_par);
	System.out.println(count_nepar);
}


public static void Par_Nepar_Long(long k)
{
	String res = Long.toString(k,10); // перевод 16. числа в 10 
	int count_par = 0; 
	int count_nepar = 0;
	for (int i=0;i< res.length();i++)
	{
		int x = res.charAt(i) - '0'; // функция для перевода в int
		if (x%2==0) {
			count_par ++;
		}
		else {
		count_nepar++;	
		}
	}
	System.out.println(count_par);
	System.out.println(count_nepar);
}

public static void Par_Nepar_Bin(int k)
{
	String res = Integer.toBinaryString(k); // перевод 16. числа в 10 
	int count_odin = 0; 
	for (int i=0;i< res.length();i++)
	{
		int x = res.charAt(i) - '0'; // функция для перевода в int
		if (x%2==1) {
			count_odin ++;
		}
	}
	System.out.println(count_odin);
}
public static void Par_Nepar_Bin_Long(long k)
{
	String res = Long.toBinaryString(k); // перевод 16. числа в 10 
	int count_odin = 0; 
	for (int i=0;i< res.length();i++)
	{
		int x = res.charAt(i) - '0'; // функция для перевода в int
		if (x%2==1) {
			count_odin ++;
		}
	}
	System.out.println(count_odin);
}

}

