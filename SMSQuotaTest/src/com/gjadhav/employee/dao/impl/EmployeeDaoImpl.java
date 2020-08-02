package com.gjadhav.employee.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.gjadhav.employee.dao.EmployeeDao;
import com.gjadhav.employee.model.Employee;


public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao{
	
	public void save(Employee stock){
		getHibernateTemplate().save(stock);
	}
	
	public void update(Employee stock){
		getHibernateTemplate().update(stock);
	}
	
	public void delete(Employee stock){
		getHibernateTemplate().delete(stock);
	}
	
	public Employee findByEmployeeCode(final int employeecd){
		//List list = (List)getHibernateTemplate().find("from Employee where id=?",employeecd);
		List list=(List)getHibernateTemplate().execute(new HibernateCallback() {
			
			@Override
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				
				List<Employee> r= session.createQuery("from Employee where id=:idd").setParameter("idd", employeecd).list();
				Employee w= (Employee)r.get(0);
				Set<Employee> d=w.getCertificates();
				System.out.println(d);
				r.get(0).setCertificates(d);
				
				
				return r;
			}
		});
		return (Employee)list.get(0);
	}

	@Override
	public Employee findBySalary(int salary) {
		
List list=(List)getHibernateTemplate().execute(new HibernateCallback() {
			
			@Override
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				
				
				Criteria cr = session.createCriteria(Employee.class);
				cr.add(Restrictions.eq("salary", 1234));
				List<Employee> r = cr.list();
				//= null;
					//	session.createQuery("from Employee where id=:idd").setParameter("idd", employeecd).list();
				Employee w= (Employee)r.get(0);
				Set<Employee> d=w.getCertificates();
				System.out.println(d);
				r.get(0).setCertificates(d);
				
				
				Criteria cr1=session.createCriteria(Employee.class);
				cr1.setProjection(Projections.rowCount());
				System.out.println("list :" +cr1.list().get(0));
				
				Criteria cr2=session.createCriteria(Employee.class);
				cr2.add(Restrictions.ge("salary", 2000));
				cr2.setProjection(Projections.rowCount());
				System.out.println(cr2.uniqueResult());
				
				
				return r;
			}
		});
		return (Employee)list.get(0);
	}

}
