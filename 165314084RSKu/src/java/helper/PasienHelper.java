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
import pojos.Location;
import pojos.Pasien;
import util.NewHibernateUtil;

/**
 *
 * @author Yoseph
 */
public class PasienHelper {
    
public List<Pasien> bacaSemuaPasien() {
        List<Pasien> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Pasien l");
        list = q.list();
        tx.commit();
        session.close();
        return list;

    }
    public void addNewPasien(
            String noRm,
            String nama,
            String alamat,
            String nik,
            Date tanggalLahir,
            String kelamin
    ) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Pasien pasien = new Pasien(noRm, nama, alamat, nik, tanggalLahir, kelamin);
        session.saveOrUpdate(pasien);
        tx.commit();
        session.close();
    }

}
     
