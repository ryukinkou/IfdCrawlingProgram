package cn.liujinhang.paper.ifc.module.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;

@SuppressWarnings("rawtypes")
public abstract class BaseThread implements Callable {

	public String decodeJsonToString(InputStream inputStream) {

		String currentLine = "";
		String outputString = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				inputStream));
		try {
			while ((currentLine = reader.readLine()) != null) {
				outputString += currentLine + "\r\n";
			}
			return outputString;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}

}
