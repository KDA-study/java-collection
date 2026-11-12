package lambda;

// 함수형 인터페이스 (화살표함수(->)를 사용하는 규칙)
// 자바스크립트 : 화살표함수(=>), 자바 : 람다표현식
@FunctionalInterface
public interface Calc {
    int calc(int x, int y);
}
