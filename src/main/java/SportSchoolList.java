import java.util.List;

public class SportSchoolList{

    private List<SportSchoolModel> info;

    public List<SportSchoolModel> getInfo() {
        return info;
    }

    public void setInfo(List<SportSchoolModel> info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "SportSchoolList{" +
                "info=" + info +
                '}';
    }


}
