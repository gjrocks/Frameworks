package com.gj;

import java.util.Iterator;
import java.util.Set;

public class EnumTester {
public static void main(String[] args){
	Set<FrequencyType> st=FrequencyType.getStageTypeSet();
	Iterator<FrequencyType> itr=st.iterator();
	while(itr.hasNext()){
		FrequencyType t=itr.next();
		System.out.println(t.getDescription());
		System.out.println(t.getValue());
	}
}
}
 