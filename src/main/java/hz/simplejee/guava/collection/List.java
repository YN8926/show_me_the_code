package hz.simplejee.guava.collection;


import java.util.ArrayList;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

import hz.simplejee.validation.hibernate.U;

/**
 * Created by wanghui on 6/7/16.
 */
public class List {
    public static void main(String[] args) {
        U u = new U();
        System.out.println(u.hashCode());
        ArrayList<U> list = Lists.newArrayList();
        list.add(u);
        Lists.transform(list, new Function<U, Object>() {
            @Override
            public Object apply(U input) {
                return input;
            }
        });

        for(U uu : list) {
            System.out.println(uu.hashCode());
        }
    }
}
