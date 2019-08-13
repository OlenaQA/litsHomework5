import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class HarURLEntriesParser {
        public static void main(String[] args) throws IOException {
            FileInputStream fis = new FileInputStream("InformationAboutSchool.json");

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
            TypeFactory typeFactory = TypeFactory.defaultInstance();
            final List<SportSchoolModel> SportTeamModelList = objectMapper.readValue(fis, typeFactory.constructCollectionType(ArrayList.class, SportSchoolList.class));
            System.out.println(SportTeamModelList);
                 Collections.sort(SportTeamModelList, new Comparator<SportSchoolModel>() {
                     @Override
                     public int compare(SportSchoolModel o1, SportSchoolModel o2) {
                         return o2.getYear() - o1.getYear();
                     }
                 });
            System.out.println(SportTeamModelList);

            HashSet noDubl = new HashSet();
            noDubl.add(SportTeamModelList);
            noDubl.size();
            System.out.println(noDubl);
        }
    }





