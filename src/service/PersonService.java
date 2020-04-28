package service;

import domain.Person;

import dao.PersonDAO;

/**
 * 业务层一个程序
 * */
public class PersonService {
	/**
     * 根据用户名 和 密码查询其它信息 
     * @param user
     * @return 如果返回null证明 用户名或者密码错误
     */
    public Person login(Person user) {       
        PersonDAO userDAO = new PersonDAO(); //查询， 将 user对象传递 DAO
        return userDAO.login(user);
    }
}
