package com.imooc;

public class Student {
    private int stuId;
    private String name;
    private float score;

    public Student(int stuId, String name, float score) {
        this.setName(name);
        this.setScore(score);
        this.setStuId(stuId);
    }

    public int getStuId() {

        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime* result + stuId;
        result = prime * result + (int)score;
        result = prime * result + ((name == null) ? 0 : name.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj.getClass() == Student.class){
            Student student = (Student)obj;
            if(student.getName() == this.getName() && student.getScore() == this.getScore() && student.getStuId() == this.getStuId()){
                return true;
            }
        }
        return false;
    }
}
