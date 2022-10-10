package Create.Builder;

/**
 * @author : Woods
 * @ClassName : Course
 * @date : 2022/9/7  10:14 下午
 * @Version ：1.0
 */
public class Course {

    private String name;
    private String ppt;
    private String video;
    private String note;
    private String homework;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }

    /**
     * 增加一个静态内部类, 可以直接类名.Builder来调用,
     */
    public static class Builder {
        //内部类里面就对这个空的对象进行建造
        Course course = new Course();

        public Builder addName(String name) {
            course.setName(name);
            return this;
        }
        public Builder addPPt(String ppt) {
            course.setPpt(ppt);
            return this;
        }
        public Builder addVideo(String video) {
            course.setVideo(video);
            return this;
        }
        public Builder addNote(String note) {
            course.setNote(note);
            return this;
        }
        public Builder addHomework(String homework) {
            course.setHomework(homework);
            return this;
        }

        //建造完成之后调用这个方法返回对象
        public Course build() {
            return course;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Course{");
        sb.append("name='").append(name).append('\'');
        sb.append(", ppt='").append(ppt).append('\'');
        sb.append(", video='").append(video).append('\'');
        sb.append(", note='").append(note).append('\'');
        sb.append(", homework='").append(homework).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
