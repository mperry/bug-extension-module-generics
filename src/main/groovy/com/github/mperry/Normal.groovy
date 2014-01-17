package com.github.mperry

import groovy.transform.TypeChecked

/**
 * Created by MarkPerry on 17/01/14.
 */
@TypeChecked
class Normal {


    static <A, B> List<B> to(List<A> list, B b) {
        list.collect { A a -> b }
    }


}
