package kr.co.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.co.controller.UserForm;

public class UserDaoModel {
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
	
	public UserDaoModel() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	public UserDto findUser(String userid) {
		UserDto dto = null;
		SqlSession session = factory.openSession();
		try {
			dto = session.selectOne("findUser",userid);
		} catch (Exception e) {
			System.out.println("findUser");
		}finally {
			if(session != null) session.close();  //close = 가비지컬렉션
		}
		return dto;
	}
	
	public ArrayList<UserDto> getUserAll(){
		List<UserDto> list = null;
		SqlSession session = factory.openSession();
		try {
			list = session.selectList("selectDataAll");
		} catch (Exception e) {
			System.out.println("findUser");
		}finally {
			if(session != null) session.close();  //close = 가비지컬렉션
		}
		return (ArrayList<UserDto>) list;
	}
	
	public int insertData(UserForm userForm) {
		int re = 0;
		SqlSession session = factory.openSession();
		try {
			re = session.insert("insertData",userForm);
			session.commit();
		} catch (Exception e) {
			System.out.println("inserdata error" + e);
			session.rollback();
		}finally {
			if(session != null) session.close();  //close = 가비지컬렉션
		}
		return re;
	}
	public int updateData(UserForm userForm) {
		int re = 0;
		SqlSession session = factory.openSession();
		try {
			re = session.update("updateData",userForm);
			session.commit();
		} catch (Exception e) {
			System.out.println("updata error" + e);
			session.rollback();
		}finally {
			if(session != null) session.close();  //close = 가비지컬렉션
		}
		return re;
	}
	public int deleteData(String userid) {
		int re = 0;
		SqlSession session = factory.openSession();
		try {
			re = session.delete("deleteData",userid);
			session.commit();
		} catch (Exception e) {
			System.out.println("deleteData error " + e);
			session.rollback();
		}finally {
			if(session != null) session.close();  //close = 가비지컬렉션
		}
		return re;
	}
	
}

