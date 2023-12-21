package hello.core.singleton;

public class StatefulService {

    /*
     * 싱글톤 방식의 주의점
     * 싱글톤 패턴이든, 스프링 같은 싱글톤 컨테이너를 사용하든 객체 인스턴스를 하나만 생성해서 공유하는 싱글톤 방식은 여러 클라이언트가 하나의 같은 객체 인스턴스를 공유하기 때문에 싱글톤 객체는 상태를 유지하게 설계하면 안된다.
     * 무상태(Stateless)로 설계해야 한다.
     * 1. 특정 클라이언트에 의존적인 필드가 있으면 안된다.
     * 2. 특정 클라이언트가 값을 변경할 수 있는 필드가 있으면 안된다.
     * 3. 가급적 읽기만 가능해야 한다.
     * 4. 필드 대신에 자바에서 공유되지 않는 지역변수, 파라미터, 스레드로컬 등을 사용해야 한다.
     * 스프링 빈의 필드에 공유값을 설정하면 정말 큰 장애가 발생할 수 있다.
     *
     * !!스프링은 항상 무상태로 설계해야 한다!!
     *  */

    /*private int price; // 상태를 유지하는 필드, 사용자A가 10000 넣고 금액 확인하려는 사이 사용자 B가 20000을 넣음 -> 그럼 최종 20000이 반환되면서 서비스 꼬임...*/

    public int order(String name, int price) {
        System.out.println("name = " + name + " , price = " + price);
//        this.price = price;
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
