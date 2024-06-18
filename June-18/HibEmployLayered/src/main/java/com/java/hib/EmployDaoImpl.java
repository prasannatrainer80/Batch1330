package com.java.hib;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployDaoImpl implements EmployDao {

	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public List<Employ> showEmployDao() {
		sessionFactory = ConnectionHelper.getConnection();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Employ");
		List<Employ> employList = query.list();
		return employList;
	}

	@Override
	public Employ searchEmployDao(int empno) {
		sessionFactory = ConnectionHelper.getConnection();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Employ where empno = " +empno);
		Employ employ = (Employ) query.uniqueResult();
		return employ;
	}

	@Override
	public String addEmployDao(Employ employ) {
		sessionFactory = ConnectionHelper.getConnection();
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(employ);
		trans.commit();
		return "Employ Record Inserted...";
	}

	@Override
	public String deleteEmployDao(int empno) {
		Employ employFound = searchEmployDao(empno);
		if (employFound !=null) {
			sessionFactory = ConnectionHelper.getConnection();
			session = sessionFactory.openSession();
			Transaction trans = session.beginTransaction();
			session.delete(employFound);
			trans.commit();
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String updateEmployDao(Employ employNew) {
		Employ employFound = searchEmployDao(employNew.getEmpno());
		if (employFound !=null) {
			sessionFactory = ConnectionHelper.getConnection();
			session = sessionFactory.openSession();
			Transaction trans = session.beginTransaction();
			session.saveOrUpdate(employNew);
			trans.commit();
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}
}
