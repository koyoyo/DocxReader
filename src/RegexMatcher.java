
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;


public class RegexMatcher {
	public static Pattern patternGen13Address =
			Pattern.compile("๑.๓\\s+\\S*\\s+เลขที่\\s+(\\S*)\\s+" +
					"หมู่ที่\\s+(\\S*)\\s+" +
					"ตรอก/ซอย\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"ถนน\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"แขวง/ตำบล\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"เขต/อำเภอ\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"จังหวัด\\s+(\\S*)\\s+" +
					"รหัสไปรษณีย์\\s+(\\S*)\\s+" +
					"โทรศัพท์\\s+([\\d|-]*[\\s+[\\d|-]+]*)\\s+" +
					"โทรสาร\\s+([\\d|-]*[\\s+[\\d|-]+]*)\\s+" +
					"อีเมล์/ เว็บไซด์\\s+(\\S*)\\s+");

	public static List<String> gen13Address = Arrays.asList(
			"gen_1_3_house_no", "gen_1_3_village_no","gen_1_3_lane",  
			"gen_1_3_road", "gen_1_3_subdistrict", "gen_1_3_district", 
			"gen_1_3_province", "gen_1_3_zipcode", "gen_1_3_tel",
			"gen_1_3_fax", "gen_1_3_email");
	
	public static Pattern patternGen14Place =
			Pattern.compile("๑.๔\\s+\\S*\\s+เลขที่\\s+(\\S*)\\s+" +
					"หมู่ที่\\s+(\\S*)\\s+" +
					"ตรอก/ซอย\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"ถนน\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"แขวง/ตำบล\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"เขต/อำเภอ\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"จังหวัด\\s+(\\S*)\\s+" +
					"รหัสไปรษณีย์\\s+(\\S*)\\s+" +
					"โทรศัพท์\\s+([\\d|-]*[\\s+[\\d|-]+]*)\\s+" +
					"โทรสาร\\s+([\\d|-]*[\\s+[\\d|-]+]*)\\s+");

	public static List<String> gen14Place = Arrays.asList(
			"gen_1_4_house_no", "gen_1_4_village_no","gen_1_4_lane",  
			"gen_1_4_road", "gen_1_4_subdistrict", "gen_1_4_district", 
			"gen_1_4_province", "gen_1_4_zipcode", "gen_1_4_tel",
			"gen_1_4_fax");
	
	public static Pattern patternGen15Owner =
			Pattern.compile("๑.๕\\s+\\S*\\s+ชื่อ-นามสกุล\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"ตำแหน่ง\\s+(\\S*)\\s+" +
					"โทรศัพท์\\s+([\\d|-]*[\\s+[\\d|-]+]*)\\s+" +
					"โทรสาร\\s+([\\d|-]*[\\s+[\\d|-]+]*)\\s+" +
					"อีเมล์\\s+(\\S*)\\s+"+
					"อายุ\\s+(\\S*)\\s+ปี\\s+" +
					"สัญชาติ\\s+(\\S*)\\s+" +
					"บัตรประจำตัวประชาชนหรือบัตรอื่นๆ \\(ระบุ\\)\\s+(\\S*)\\s+" +
					"เลขที่\\s+([\\d|-]*[\\s+[\\d|-]+]*)\\s+" +
					"ออกให้โดย\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"จังหวัด\\s+(\\S*)\\s+" +
					"อยู่บ้านเลขที่\\s+(\\S*)\\s+" +
					"หมู่ที่\\s+(\\S*)\\s+" +
					"ตรอก/ซอย\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"ถนน\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"ตำบล/แขวง\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"อำเภอ/เขต\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"จังหวัด\\s+(\\S*)\\s+" +
					"รหัสไปรษณีย์\\s+(\\S*)\\s+๑.๖");

	public static List<String> gen15Owner = Arrays.asList(
			"gen_1_5_name", "gen_1_5_position", "gen_1_5_tel",
			"gen_1_5_fax", "gen_1_5_email", "gen_1_5_age",
			"gen_1_5_nationality", "gen_1_5_id_card_type", "gen_1_5_id_card_no", 
			"gen_1_5_id_published_by", "gen_1_5_id_published_place", 
			"gen_1_5_house_no", "gen_1_5_village_no","gen_1_5_lane",  
			"gen_1_5_road", "gen_1_5_subdistrict", "gen_1_5_district", 
			"gen_1_5_province", "gen_1_5_zipcode");
	
	public static Pattern patternGen16Attorney =
			Pattern.compile("๑.๖\\s+\\S*\\s+ชื่อ-นามสกุล\\s+(\\S*[\\s\\S+]*)\\s+" +
					"ตำแหน่ง\\s+(\\S*)\\s+" +
					"โทรศัพท์\\s+([\\d|-]*[\\s+[\\d|-]+]*)\\s+" +
					"โทรสาร\\s+([\\d|-]*[\\s+[\\d|-]+]*)\\s+" +
					"อีเมล์\\s+(\\S*)\\s+"+
					"อายุ\\s+(\\S*)\\s+ปี\\s+" +
					"สัญชาติ\\s+(\\S*)\\s+" +
					"บัตรประจำตัวประชาชนหรือบัตรอื่นๆ \\(ระบุ\\)\\s+(\\S*)\\s+" +
					"เลขที่\\s+([\\d|-]*[\\s+[\\d|-]+]*)\\s+" +
					"ออกให้โดย\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"จังหวัด\\s+(\\S*)\\s+" +
					"อยู่บ้านเลขที่\\s+(\\S*)\\s+" +
					"หมู่ที่\\s+(\\S*)\\s+" +
					"ตรอก/ซอย\\s+(\\S*)\\s+" +
					"ถนน\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"ตำบล/แขวง\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"อำเภอ/เขต\\s+(\\S*[\\s\\S+]*?)\\s+" +
					"จังหวัด\\s+(\\S*)\\s+" +
					"รหัสไปรษณีย์\\s+(\\S*)\\s+");

	public static List<String> gen16Attorney = Arrays.asList(
			"gen_1_6_name", "gen_1_6_position", "gen_1_6_tel",
			"gen_1_6_fax", "gen_1_6_email", "gen_1_6_age",
			"gen_1_6_nationality", "gen_1_6_id_card_type", "gen_1_6_id_card_no", 
			"gen_1_6_id_published_by", "gen_1_6_id_published_place", 
			"gen_1_6_house_no", "gen_1_6_village_no","gen_1_6_lane",  
			"gen_1_6_road", "gen_1_6_subdistrict", "gen_1_6_district", 
			"gen_1_6_province", "gen_1_6_zipcode");
	
	public static Pattern patternGen17ContactPerson =
			Pattern.compile("๑.๗\\s+[\\S*\\s+]+ชื่อ-นามสกุล\\s+(\\S*[\\s\\S+]*)\\s+" +
					"ตำแหน่ง\\s+(\\S*)\\s+" +
					"โทรศัพท์\\s+([\\d|-]*[\\s+[\\d|-]+]*)\\s+" +
					"โทรสาร\\s+([\\d|-]*[\\s+[\\d|-]+]*)\\s+" +
					"อีเมล์\\s+(\\S*)\\s+");

	public static List<String> gen17ContactPerson = Arrays.asList(
			"gen_1_7_name", "gen_1_7_position", "gen_1_7_tel",
			"gen_1_7_fax", "gen_1_7_email");
	
	public static Pattern patternName =
			Pattern.compile("๒.๑\\s+ชื่อโครงการ\\s+(\\S*[\\s\\S+]*)\\s+๒.๒");

	public static List<String> genName = Arrays.asList("gen_1_7_name");
	
	public static Map<String, Object> allData = new HashMap<String, Object>();
	
	public static void extractAllData(String text){
		extractData(patternGen13Address, text, gen13Address, "gen_1_3_address");
		extractData(patternGen14Place, text, gen14Place, "gen_1_4_place");
		extractData(patternGen15Owner, text, gen15Owner, "gen_1_5_owner");
		extractData(patternGen16Attorney, text, gen16Attorney, "gen_1_6_attorney");
		extractData(patternGen17ContactPerson, text, gen17ContactPerson, "gen_1_7_contact_person");
		
		extractSingleData(patternName, text, "name");
		
		convertMapToJson(allData);
	}
	
	public static void convertMapToJson(Map<String, Object> map) {
		Gson gson = new Gson(); 
        String json = gson.toJson(map); 
        System.out.println(json);
	}
	
    public static void extractData(Pattern pattern, String text, List<String> columnDict, String fieldName) {
    	Map<String, Object> map = new HashMap<String, Object>();
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("address found");
            System.out.println("All: " + matcher.group());
            for(int i=0; i<columnDict.size(); i++){
            	map.put(columnDict.get(i), matcher.group(i+1));
            }
        }
        
        allData.put(fieldName, map);
        System.out.println(map);
        System.out.println("=============");
    }
    
    public static void extractSingleData(Pattern pattern, String text, String fieldName) {
    	String singleData = "";
    	Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("address found");
            System.out.println("All: " + matcher.group());
            singleData = matcher.group(1);
        }
        
        allData.put(fieldName, singleData);
        System.out.println(singleData);
        System.out.println("=============");
    }
}
