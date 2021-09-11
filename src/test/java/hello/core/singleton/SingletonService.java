package hello.core.singleton;

//싱글톤 테스트만을 위한 클래스 생성
public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService(){}

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
