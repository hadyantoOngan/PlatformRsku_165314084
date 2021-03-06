/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.User;
import util.NewHibernateUtil;

/**
 *
 * @author basisa02
 */
public class UserHelper {

    public UserHelper() {

    }

    public User cariUser(String email) {
        // Create session
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        // Create String query
        String query = "from User u where u.email=:email";
        Query q = session.createQuery(query);
        q.setParameter("email", email);
        // siapkan list,hasil pencarian dan panggil pencarian
        List<User> list = q.list();
        // tutuup session
        session.close();

        if (list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    public User login(String email, String password) {
        User user = this.cariUser(email);
        if (user != null) {
            //user ada
            if (user.getPassword().equals(password)) {
                //password sama
                return user;
            } else {
                //password berbeda
                return null;
            }
        } else {
            return null;
        }
    }
}
