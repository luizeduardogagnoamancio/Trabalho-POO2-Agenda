package agenda.files;
import java.io.*;

public class WriteFile {
	public void write(String palavra)
	{
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\BSI\\SextoPeriodo\\DOO\\Trabalho-POO2-Agenda\\cadastro.txt"));
			bw.write(palavra+"\n");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
