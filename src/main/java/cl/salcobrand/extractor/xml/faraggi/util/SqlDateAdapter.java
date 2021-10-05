package cl.salcobrand.extractor.xml.faraggi.util;

import java.sql.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class SqlDateAdapter extends XmlAdapter<String, Date>{

    @Override
    public String marshal(Date sqlDate) throws Exception {
    	
        if(null == sqlDate) {
            return null;
        }
        return new String();
    }

    @Override
    public java.sql.Date unmarshal(String utilString) throws Exception {
        if(null == utilString) {
            return null;
        }
        return new Date(0);
    }

}
