/**
 * 1. package를 쓰지 않으면 default package로 설정되어 정상적으로 컴파일 된다.
 * 2. main 메서드에 String[] args 매개변수를 받지 않는다.
 *     -> 컴파일이 시점에 코틀린이 만들어준 별개의 main 메서드에서 내가 작성한 main 메서드를 호출하는 형태로 보인다.
 *        byte code: public static synthetic main([Ljava/lang/String;)V 부분 참조
 * 3. 접근제어자가 없다. 기본적으로 public 이다.
 * 4. 기본적으로 final static 이다.
 *     -> byte code: public final static main()V
 * 5. 메서드를 지칭하는 키워드가 fun 이다.
 * 6. 반환하는 타입이 가장 마지막 부분에 온다.
 * 7. Void를 반환하는 경우 Void 대신 Unit을 사용하며, 생략 가능하다.
 *     -> ex) fun main(): String {}
 * 8. println 메서드는 내부적으로 System.out.println을 재호출한다.
 *     -> 이미 static 한 System 객체와 out (PrintStream) 조차 제거하고 사용할 수 있어 간편하다.
 *
 *
 *
 * // ================org/example/kotlinbyexample/example/_01_basic/HelloWorldKt.class =================
 * // class version 52.0 (52)
 * // access flags 0x31
 * public final class org/example/kotlinbyexample/example/_01_basic/HelloWorldKt {
 *
 *   // compiled from: _01_HelloWorld.kt
 *
 *   @Lkotlin/Metadata;(mv={1, 9, 0}, k=2, d1={"\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"}, d2={"main", "", "kotlin-by-example.main"})
 *
 *   // access flags 0x19
 *   public final static main()V
 *    L0
 *     LINENUMBER 8 L0
 *     LDC "Hello, World!"
 *     ASTORE 0
 *     GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
 *     ALOAD 0
 *     INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/Object;)V
 *    L1
 *     LINENUMBER 9 L1
 *     RETURN
 *     MAXSTACK = 2
 *     MAXLOCALS = 1
 *
 *   // access flags 0x1009
 *   public static synthetic main([Ljava/lang/String;)V
 *     INVOKESTATIC org/example/kotlinbyexample/example/_01_basic/HelloWorldKt.main ()V
 *     RETURN
 *     MAXSTACK = 0
 *     MAXLOCALS = 1
 * }
 */
package org.example.kotlinbyexample.example._01_basic

fun main() {
    println("Hello, World!")
}