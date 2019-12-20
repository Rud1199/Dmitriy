package lab8;




import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.crypto.spec.DESedeKeySpec;


public class Info {
	public static void main(String[] args) throws IOException
	{
		Guest off = new Guest("Леонова", "Валерия", "Константиновна");
		data freedom = new data();
		freedom.setDateOfenter("1876-08-09");
		freedom.setDateOfexit("1876-08-09");
		while(true)
		{
			System.out.println("1)информация о госте\n" +
		                       "2)закодировать\n" +
					           "3)декодировать\n" +  
		                       "4)выход");
			Scanner sc = new Scanner(System.in);
			int input = Integer.parseInt(sc.nextLine());
			switch (input) {
			case 1:
				freedom.Show(off);
				break;
			case 2:
				System.out.println(freedom);
				serializeToXML(freedom);
				break;
			case 3:
				data l = deserializeFromXML();
				System.out.println(l);
				break;
			case 4: 
				return;
			default:
				break;
			}
		}
		
		

	}


private static void serializeToXML (data settings) throws IOException
{
    FileOutputStream fos = new FileOutputStream("c:\\temp\\Test.txt");
    XMLEncoder encoder = new XMLEncoder(fos);
    encoder.writeObject(settings);
    encoder.close();
    fos.close();
}
 
private static data deserializeFromXML() throws IOException {
    FileInputStream fis = new FileInputStream("c:\\temp\\Test.txt");
    XMLDecoder decoder = new XMLDecoder(fis);
    data decodedSettings = (data) decoder.readObject();
    decoder.close();
    fis.close();
    return decodedSettings;
}
}

