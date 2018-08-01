package ex1_16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class MyUtilities {
	
	public double[] getDataSet(String setName)
		throws BadDataSetException
	{
			String file = setName + ".dset";
			FileInputStream in = null;
			try {
				in = new FileInputStream(file);
				return readDataSet(in);
			}
			catch(IOException e) {
				throw new BadDataSetException();
			}
			finally {
				try {
					if(in!=null)
						in.close();
				} catch(IOException e) {
					;	// 無視 : データの読み込みは成功しているか、あるいは、
						// BadDataSetException をスローしようとしている
				}
			}
	}
	
	public double[] readDataSet(FileInputStream in) throws UnsupportedEncodingException {
		
		InputStreamReader reader = new InputStreamReader(in, "UTF-8");
		double[] dataSet = new double[100];
		
		/* 一度Listに入れてからdouble[]に入れ替え  */
		/* 1行読み込んでdataSetに格納 */
		
		return dataSet;
	}
	
}
