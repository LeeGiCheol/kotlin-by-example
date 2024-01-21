package org.example.kotlinbyexample.example._01_basic

/**
 * 코틀린은 Null Safety에 대해 ? 를 통해 처리하도록 한다.
 * 자바에서 Optional을 제공한 것과 조금 다르다.
 *
 * 1. 기본적으로 변수 선언 시 nullable 하지 않은 변수가 된다.
 * 2. 변수 선언 시 타입 뒤에 ?를 붙여주면 nullable한 변수가 된다.
 * 3. 타입 추론을 하는 경우 nullable 하지 않은 변수가 된다.
 * 4. 메서드 또한 마찬가지로 파라미터에 ? 여부에 따라 nullable 여부가 결정된다.
 */
fun main() {
    var neverNull: String = "Not Null"
//    neverNull = null

    var nullable: String? = "Nullable"
    nullable = null

    var inferredNonNull = "type inference not null"
//    inferredNonNull = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }
    strLength(neverNull)
//    strLength(nullable)

    fun describeString(maybeString: String?): String {
        if (maybeString != null && maybeString.length > 0) {
            return "문자열 길이 ${maybeString.length}"
        } else {
            return "빈 문자열 또는 null"
        }
    }
}