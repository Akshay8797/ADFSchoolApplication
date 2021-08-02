package model.common;

import java.math.BigDecimal;

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
}
