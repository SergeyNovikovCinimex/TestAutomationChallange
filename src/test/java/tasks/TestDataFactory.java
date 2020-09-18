package tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDataFactory {
    public final static String BASE_URL = "https://reqres.in/api";
    public final static String ENDPOIN_USER = "users";
    public final static String PARAM_PAGE_1 = "page=1";
    public final static String CREATE_JSON = "{\n" +
            "    \"name\": \"morpheus\",\n" +
            "    \"job\": \"leader\"\n" +
            "}";
    public static void getRuDateToConsole(String a) throws Exception{
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        Date date = formatter.parse(a);
        SimpleDateFormat formatterRu = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(formatterRu.format(date));
    }
}
