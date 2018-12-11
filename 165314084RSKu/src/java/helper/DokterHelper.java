/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Dokter;

import util.NewHibernateUtil;

/**
 *
 * @author Yoseph
 */
public class DokterHelper {

    public List<Dokter> bacaSemuaLokasi() {
        List<Dokter> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Dokter l");
        list = q.list();
        tx.commit();
        session.close();
        return list;

    }
     public void addNewDokter(
            Integer id,
            String nama,
            String spesialis
          
    ) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Dokter dokter = new Dokter( nama, spesialis);
        session.saveOrUpdate(dokter);
        tx.commit();
        session.close();
    }

}