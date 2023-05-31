package guilhermeGarrio.clientes.util;

import org.springframework.stereotype.Component;

import java.io.StringBufferInputStream;
import java.math.BigDecimal;

@Component
public class BigDecimalConverter {


    public BigDecimal converter(String value){
        if(value == null){
        return null;
    }
        value = value.replace(".", "").replace(",", "." );
        return new BigDecimal(value);
    }
}
