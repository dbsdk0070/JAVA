package kr.co.bitcamp.wildcard;

public class Course<T> {
    
    private String name;
    private T[] students;
    
    /*
     * 생성자: 아직 T타입이 결정되지 않았기때문에 두번째 파라미터를 size로 정의함.
     */
    
    public Course(String name, int size) {
        this.name = name;
        this.students = (T[])new Object[size];
        }
   
    public void add(T t) {
        for(int i=0; i<this.students.length; i++) {
            if(students[i] == null) {
                students[i] = t;
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public T[] getStudents() {
        return students;
    }
    
    

}
