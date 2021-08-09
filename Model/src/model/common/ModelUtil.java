package model.common;

import java.math.BigDecimal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import java.util.Date;

import oracle.jbo.server.DBTransaction;
import oracle.jbo.server.SequenceImpl;

public class ModelUtil {
    public ModelUtil() {
        super();
    }

    public static BigDecimal getSequenceNextVal(String SeqName, DBTransaction transaction) {
        SequenceImpl seqImpl = new SequenceImpl(SeqName, transaction);
        return new BigDecimal(seqImpl.getSequenceNumber().toString());
    }

    public static Timestamp getCurrentDate() {
        Date today = new Date();
        return new Timestamp(today.getTime());
    }

    public static String getSqlDescription(String sql, DBTransaction trans) {
        PreparedStatement stat = null;
        ResultSet rs = null;
        try {
            stat = trans.createPreparedStatement(sql, 1);
            rs = stat.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally {
            try {
                rs.close();
                stat.close();
            } catch (Exception e) {
                System.out.println("Error Closing the result set");
            }
        }
        return "";
    }
}
