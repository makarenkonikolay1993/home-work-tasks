package com.hillel.lecture_14;

import java.util.List;
import java.util.StringJoiner;

/**
 * Create json converter. User object should be present in key-value pair, all field should be like Map;
 * F.E:
 * public class User {
 *
 *     private String name;
 *
 * }
 *
 * Should be present as json {"name": "bob"}
 * @see <a href="https://www.w3schools.com/whatis/whatis_json.asp">JSON</a>
 */
public class JsonConverter {

    public String convertToJsonString(List<User> users) {

//        TODO implements result
        StringJoiner jsonString = new StringJoiner(",{", "\"[{", "]\"");
        for (int i = 0; i < users.size(); i++) {
            jsonString.add(users.get(i).toString());
        }
        //String result = "";

        return String.valueOf(jsonString);

    }

    public String convertToJsonString(User users) {

//        TODO implements result
        String jsonString = "\"{" + users.toString() + "\"";


        return jsonString;
    }




}
