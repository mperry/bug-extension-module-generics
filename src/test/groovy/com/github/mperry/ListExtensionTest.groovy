package com.github.mperry

import groovy.transform.TypeChecked
import org.junit.Test

/**
 * Created by MarkPerry on 17/01/14.
 */
@TypeChecked
class ListExtensionTest {

    @Test
    void test() {
        def list = [1, 2, 3]
        def s = "abc"
        list.to(s) == [s, s, s]

    }

}
