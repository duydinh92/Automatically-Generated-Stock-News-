package main;


import java.io.File;
import java.util.*;
import csvparsers.*;
import data.*;
import gui.GUI;
import pattern.*;
/**
 * lớp chạy chính của chương trình
 * @author Lê Ngọc Anh
 */

public class Run {
	public static void run() {
		String date = GUI.getDay();
		String filePath = new File("").getAbsolutePath();
		String path1 = filePath+"\\data\\"+ date.replace("/", "-") + ".csv";
		List<Input> inputs = (ArrayList<Input>) ReadFile.readInput(path1);
		String path2 = filePath+"\\data\\Vn-Index.csv";
		Vinput[] todays = Vinput.todays(date, (ArrayList<Vinput>) ReadFile.readVinput(path2));
		Data data = new Data(inputs,todays);
		Output.printPaper(data);
		
	}
}
