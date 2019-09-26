package kr.co.model;

import java.util.ArrayList;

import kr.co.controller.UserForm;

public class UserManager { //여러 개의 DAO를 관리
	private static UserManager manager = new UserManager();
	public static UserManager instance() {
		return manager;
	}
	
	
	private UserDaoModel getUserdaoModel() {
		return new UserDaoModel();
	}
	
	public boolean login(String user_id,String user_passwd) {
		UserDto dto = getUserdaoModel().findUser(user_id);
		if(dto==null) return false;
		if(dto.getPassword().equals(user_passwd)) {
			return true;
		}else
			return false;
	}
	
	public ArrayList<UserDto> getUserAll(){
		return getUserdaoModel().getUserAll();
	}
	
	public int insert(UserForm userForm) {
		return getUserdaoModel().insertData(userForm);
	}
	public int update(UserForm userForm) {
		return getUserdaoModel().updateData(userForm);
	}
	
	public UserDto findUser(String userid) {
		return getUserdaoModel().findUser(userid);
	}
	
	public int delete(String userid) {
		return getUserdaoModel().deleteData(userid);
	}
}
