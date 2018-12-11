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
import pojos.Antrian;
import util.NewHibernateUtil;

/**
 *
 * @author Hp
 */
public class AntrianHelper {

    public List<Antrian> bacaSemuaLokasi() {
        List<Antrian> list = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Antrian l");
        list = q.list();
        tx.commit();
        session.close();
        return list;
    }

    public void addNewAntrian(
            Date tanggal,
            String noRm,
            String nama,
            String alamat,
            String namaKlinik
    ) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Antrian antrian = new Antrian(tanggal, noRm, nama, alamat, namaKlinik);
        session.saveOrUpdate(antrian);
        tx.commit();
        session.close();
    }

}
