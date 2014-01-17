package com.github.mperry

import groovy.transform.TypeChecked
import groovy.transform.TypeCheckingMode
import org.junit.Test

/**
 * Created by MarkPerry on 17/01/14.
 */
@TypeChecked
class ListExtensionTest {

    @Test
//    @TypeChecked(TypeCheckingMode.SKIP)
    void test() {
        def list = [1, 2, 3]
        def s = "abc"
        list.to(s) == [s, s, s]

    }

    @Test
    void normal() {
        def s = "abc"
        Normal.to([1, 2, 3], s)
    }

}
