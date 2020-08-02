package com.gjadhav.common;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gjadhav.employee.bo.EmployeeBo;
import com.gjadhav.employee.model.Certificate;
import com.gjadhav.employee.model.Employee;
import com.gjadhav.sms.bo.impl.SMSServiceImpl;
import com.gjadhav.sms.model.SMSQuotaConfig;
import com.gjadhav.stock.bo.StockBo;
import com.gjadhav.stock.model.Stock;

public class App implements Runnable {
	public static void main(String[] args) throws Exception {

		Thread t[] = new Thread[25];

		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(new App());
			t[i].setName("Thread"+i);
			t[i].start();
		}

		/*
		 * ApplicationContext appContext = new
		 * ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		 * 
		 * StockBo stockBo = (StockBo)appContext.getBean("stockBo"); EmployeeBo
		 * empbo=(EmployeeBo)appContext.getBean("empployeeBo"); SMSServiceImpl
		 * smsService=(SMSServiceImpl)appContext.getBean("smsService");
		 * 
		 * System.out.println(smsService.getSMSQuotaConfig().getVersion());
		 * 
		 * SMSQuotaConfig smsQConfig=smsService.getSMSQuotaConfig();
		 * smsQConfig.setBalance(smsQConfig.getBalance()-1);
		 * smsService.persistSMSQuotaConfig(smsQConfig);
		 * System.out.println(smsQConfig.getVersion());
		 * System.out.println(smsService.getSMSQuotaConfig().getVersion());
		 */
		/*
		 * for(int i=0;i<25;i++) { Employee e=new Employee();
		 * e.setFirstName("Ganesh"+i); e.setLastName("jadhav1"+i); if(i%2==0)
		 * e.setSalary(3000+(i*37)); else e.setSalary(3000-(i*43));
		 * 
		 * Certificate cer1=new Certificate(); cer1.setName("ME"+i);
		 * 
		 * Certificate cer2=new Certificate(); cer2.setName("MEEs"+i);
		 * 
		 * Set st=new HashSet(); st.add(cer1); st.add(cer2);
		 * 
		 * e.setCertificates(st);
		 * 
		 * // empbo.persistEmployee(e); }
		 */

		// Employee f=empbo.findByEmployeeCode(1);
		// System.out.println(f.getFirstName());
		// System.out.println(f.getCertificates());
		// System.out.println(empbo.findBySalary(1234));

		/*	*//** insert **/
		/*
		 * Stock stock = new Stock(); stock.setStockCode("7668");
		 * stock.setStockName("HAIO"); stockBo.save(stock);
		 *//** select **/
		/*
		 * Stock stock2 = stockBo.findByStockCode("7668");
		 * System.out.println(stock2);
		 *//** update **/
		/*
		 * stock2.setStockName("HAIO-1"); stockBo.update(stock2);
		 */

		/** delete **/
		// stockBo.delete(stock2);

		System.out.println("Done");
	}

	@Override
	public void run() {

		System.out.println("Start :" +Thread.currentThread().getName());
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

		SMSServiceImpl smsService = (SMSServiceImpl) appContext.getBean("smsService");

		try {

			smsService.sendSMS();

		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Problem :"+Thread.currentThread().getName() + " error:"+e.getMessage());
		}
		System.out.println("End :" +Thread.currentThread().getName());
	}

}
