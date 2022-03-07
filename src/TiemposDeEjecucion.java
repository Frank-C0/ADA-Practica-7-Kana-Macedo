

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TiemposDeEjecucion {

	public static void main(String[] args) throws IOException {
		ObtenerTiemposDeEjecucion();

		graficar();

	}

	static void ObtenerTiemposDeEjecucion() throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese numero: ");
		int num = scan.nextInt();
		System.out.println("Ingrese cantidad de aspirantes: ");		
		tiemposDeEjecucion(num);
	}

	static void tiemposDeEjecucion(int n) throws IOException {
		String a1 = "Contrataciones.txt";
		File file1 = new File(a1);
		BufferedWriter bwA1 = new BufferedWriter(new FileWriter(file1));

		String a2 = "Logaritmo Neperiano.txt";
		File file2 = new File(a2);
		BufferedWriter bwA2 = new BufferedWriter(new FileWriter(file2));


		Main m = new Main();

		for (int i = 2; i <= n; i++) {
			System.out.println(i);
			int[] caso = m.casoPeor(i);
			
			float iteraciones = 20;
			int promedio = 0;
			for (int j = 0; j < iteraciones; j++) {
				promedio += m.algoritmoDeContratacionAleatorio(caso);
			}
			float promedioFinal = promedio/iteraciones;
			double logaritmoN = Math.log(i);

			bwA1.write(i + "\t" + (promedioFinal) + "\n");
			bwA2.write(i + "\t" + (logaritmoN) + "\n");
//			bwA3.write(i + "\t" + (fin3) + "\n");
//			

		}
		bwA1.close();
		bwA2.close();
//		bwA3.close();
		Desktop.getDesktop().edit(file1);
		Desktop.getDesktop().edit(file2);
//		Desktop.getDesktop().edit(file3);
	}

	static void graficar() {
		// Requiere JavaPlot
//		JavaPlot p = new JavaPlot("D:/Programas/gnuplot/bin/gnuplot.exe");
		
//		p.addPlot("\"./Contrataciones.txt\" with lines");
//		p.addPlot("\"./Logaritmo Neperiano.txt\" with lines");
//		p.plot();
	}
}
