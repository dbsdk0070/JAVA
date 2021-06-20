package kr.co.bitcamp.wildcard;

import java.util.Arrays;

public class WildCardTest {
    
    //정적메서드 -- "?"는 어떠한 객체도 다 받겠다.(프리패스)
    public static void registerCourse(Course<?>course) {      // "?" 물음표: 와일드카드
        System.out.println(course.getName()+"수강생: " + 
                            Arrays.toString(course.getStudents()));
    }
    
    //WildCard타입
    //Student를 상속받는 클래스(상위타입제한)
    public static void registerCourseStudent(Course <? extends Student> course) {
        System.out.println(course.getName()+"수강생: " + 
                Arrays.toString(course.getStudents()));
}
    //Worker크래스이거나 그 상위클래스들만 들어올 수 있다.(하위타입제한)
    public static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println(course.getName()+"수강생: " + 
                Arrays.toString(course.getStudents()));
    }
    
    public static void main(String[] args) {
        registerCourse(new Course<Person>("일반인 과정", 5));
        registerCourse(new Course<Student>("학생 과정", 10));
        registerCourse(new Course<Worker>("직장인 과정",8));
        registerCourse(new Course<HightStudent>("고등학생 과정", 7));
      //registerCourse(new Object());                                    //Course타입만 생성 가능함.
        System.out.println();

      //하위타입만 가능
      //registerCourseStudent(new Course<Person>("일반인 과정", 5));
        registerCourseStudent(new Course<Student>("학생 과정", 10));
      //registerCourseStudent(new Course<Woker>("직장인 과정", 8));
        registerCourseStudent(new Course<HightStudent>("고등학생 과정", 7));
        System.out.println();
        
      //상위타입만 가능
        registerCourseWorker(new Course<Person>("일반인 과정",5));
      //registerCourseWorker(new Course<Student>("학생 과정",5));
        registerCourseWorker(new Course<Worker>("직장인 과정",8));
      //registerCourseWorker(new Course<HightStudent>("고등학생 과정", 7));
    
      //직접 Course 생성해서 확인
        Course<Person> pCourse = new Course<Person>("일반인 과정", 3);
        pCourse.add(new Person("일반인"));
        pCourse.add(new Person("직장인"));
        pCourse.add(new Person("학생"));
        pCourse.add(new Person("고등학생"));
        
        registerCourse(pCourse);
        registerCourseWorker(pCourse);
      //registerCourseStudent(pCourse);             //Student 상속받는 클래스만 파라미터로 올수가 있는데 조상타입으로 에러가난다.
    
        System.out.println();
        
        Course<Worker> wCourse = new Course<Worker>("직장인 과정", 3);
        wCourse.add(new Worker("김대리"));
        wCourse.add(new Worker("박과장"));
        wCourse.add(new Worker("김차장"));
    
        registerCourse(wCourse);
        registerCourseWorker(wCourse);
      //registerCourseStudent(wCourse);             //Student 상속받는 클래스만 올 수 있는데 Woker는
                                                    //아무런 관계가 없는 클래스이므로 에러가 난다.
        Course<Student> sCourse = new Course<>("학생 과정", 3);
        sCourse.add(new Student("이순신"));
        sCourse.add(new Student("이방원"));
        sCourse.add(new Student("이도"));
        
        registerCourse(sCourse);
        registerCourseStudent(sCourse);
      //registerCourseWorker(sCourse);              
    
    }
        
}

