package com.gj;

import java.io.File;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Generator {

	
public static 	Properties rep=new Properties();
	public static Properties getRep() {
	return rep;
}

public static void setRep(Properties rep) {
	Generator.rep = rep;
}

	public static List<String> fields=new LinkedList<String>();
	public static List<String> getFields() {
		return fields;
	}

	public static void setFields(List<String> fields) {
		Generator.fields = fields;
	}

	public static Map<String, String> getCodeGenMap() {
		return codeGenMap;
	}

	public static void setCodeGenMap(Map<String, String> codeGenMap) {
		Generator.codeGenMap = codeGenMap;
	}

	public static Map<String, String> codeGenMap=new LinkedHashMap<String,String>();
	public static Map<String, String> originalcodeGenMap=new LinkedHashMap<String,String>();
	
	public static Map<String, String> getOriginalcodeGenMap() {
		return originalcodeGenMap;
	}

	public static void setOriginalcodeGenMap(Map<String, String> originalcodeGenMap) {
		Generator.originalcodeGenMap = originalcodeGenMap;
	}

	public static void main(String[] args) throws Exception{
	}
	
	public static void generate() throws Exception{
	
	
		
		
		Properties pr=DBProcessor.loadProperties("reportprojections.properties",rep);
		
		String className=pr.getProperty("EntityName");
		String projections=pr.getProperty("projections");
		String prefix=pr.getProperty("prefix");
		
		
		String[] props=projections.split(",");
		
		
		for(int i=0;i<props.length;i++)
		{
			
			String prop=props[i];
			if(prop !=null && !prop.trim().equalsIgnoreCase(""))
			{
			if(prop.lastIndexOf(".") !=-1)
			{
				List<String> test=Test.tokens(prop,".");
				String varName=test.get(test.size()-1);
				String finalType=null;
				String cl=className;
				Class finalTypeClass=null;
				for(int j=0;j<test.size();j++)
				{
					finalTypeClass=getReturnType(cl,"get"+initCap(test.get(j)));
					finalType=finalTypeClass.getName() ;
					cl=finalType;
				}
				
				System.out.println(finalTypeClass.getSimpleName() + " " +prefix+varName);
				fields.add(prefix+varName);
				codeGenMap.put(prefix+varName, finalTypeClass.getSimpleName());
				originalcodeGenMap.put(prop,prefix+varName);
				
			}else
			{
				Class cll=getReturnType(className,"get"+initCap(prop));
				System.out.println(cll.getSimpleName() + " " +prefix+prop);
				fields.add(prefix+prop);
				codeGenMap.put(prefix+prop, cll.getSimpleName());
				originalcodeGenMap.put(prop,prefix+prop);
			}
			}
		}
		
		
		
		
	}

	public static String initCap(String o)
	{
		String r=o.substring(1);
		char ch=o.charAt(0);
		String ui=(ch+"").toUpperCase();
		
		return ui+r; 
	}
	
	public static Class  getReturnType(String className,String methodName) throws Exception
	{
		//Object obj=Class.forName(className).newInstance();
		List<Method> li=new LinkedList<Method>();
		li=Test.getAllMethods(li, Class.forName(className));
		Method method =null;
		for(int i=0;i<li.size();i++)
		{
			Method m=li.get(i);
			if(m.getName().equalsIgnoreCase(methodName))
				method=li.get(i);
		}
		
		//Method method = Class.forName(className).getDeclaredMethod(methodName);
		//Object t=method.invoke(obj);
		
		return method.getReturnType();
	}
	
}
