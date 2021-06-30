package org.fkit.oa.util;

import org.fkit.oa.identity.domain.User;

public class UserHolder {
	/** 定义一个ThreadLocal 存储当前某个请求线程对应的登陆用户   */
	private static ThreadLocal<User> users = new ThreadLocal<>();
	// 添加用户方法 参数是用户
	public static void addCurrentUser(User user){
		// 如果用户为空
		if(users.get()== null){
			// 用户设置用户
			users.set(user);
		}
	}
	// 获取用户方法
	public static User getCurrentUser(){
		return users.get();
	}
        // 移除用户方法
	public static void removeCurrentUser() {
		users.remove();
	}
}
