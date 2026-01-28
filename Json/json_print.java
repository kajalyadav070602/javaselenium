package Json;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class json_print {
//how many type method in JSON;
	//5 type---getnumber();,getString();,getboolean();getJSONArry();,getJSONobject();
	public static void main(String[] args) throws IOException, InterruptedException {

//byte[]path =Files.readAllBytes(Paths.get("C:\\Users\\PC\\Desktop\\Hky.json"));
//	
//	String obj=new String(bytearr);
//	//System.out.println(obj);
	
//	  JSONObject arry = new JSONObject(obj);
//	  
//	
//	Number idvalue = objjson.getNumber("id");
//	idvalue.
//	System.out.println(idvalue);
	
	byte[] bytearr = Files.readAllBytes(Paths.get("C:\\Users\\PC\\Desktop\\Hky.json"));
	String strobj = new String(bytearr);
	System.out.println(strobj);
	Thread.sleep(3000);
	JSONObject rootjson = new JSONObject(strobj);
	 String typevalue = rootjson.getString("type");
	System.out.println(typevalue);
	
	JSONArray jsonTagsarry = rootjson.getJSONArray("tags");
	jsonTagsarry.getString(0);
	JSONArray jsontagswithtimearry = rootjson.getJSONArray("tagsWithTime");
	
	JSONObject jsontagsWithTimeobject = jsontagswithtimearry.getJSONObject(1);
	System.out.println(jsontagsWithTimeobject);
String tagValue=jsontagsWithTimeobject.getString("tag");
	System.out.println(tagValue);
String	entity_value= jsontagsWithTimeobject.getString("entity_type");
	System.out.println(entity_value);
	
	JSONArray proArr = rootjson .getJSONArray("type");
	proArr.getString(0);
	JSONObject proObj = rootjson.getJSONObject("properties");
	System.out.println(proObj);
	
	}

}
