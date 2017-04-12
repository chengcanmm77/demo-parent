package com.bucket.demo.hessian;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.HessianOutput;

public class HessianUtil {

	public static byte[] serialize(Object object) throws IOException{
	/*	ByteArrayOutputStream bos = new ByteArrayOutputStream();
		Hessian2Output out = new Hessian2Output(bos);
		out.writeObject(object);
		byte[] tt = bos.toByteArray();
		bos.close();
		return tt;
		*/
		  ByteArrayOutputStream os = new ByteArrayOutputStream();
	        HessianOutput ho = new HessianOutput(os);
	        ho.writeObject(object);
	        return os.toByteArray();
	}
	
	public static Object deSerialize(byte[] data) throws IOException{
		if(data==null){
			System.out.println("===");
		}
		ByteArrayInputStream bis = new ByteArrayInputStream(data);
		Hessian2Input input = new Hessian2Input(bis);
		Object o =  input.readObject();
		bis.close();
		return o;
	}
}
