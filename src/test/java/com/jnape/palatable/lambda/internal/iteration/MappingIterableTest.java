package com.jnape.palatable.lambda.internal.iteration;

import com.jnape.palatable.lambda.functions.Fn1;
import com.jnape.palatable.traitor.annotations.TestTraits;
import com.jnape.palatable.traitor.runners.Traits;
import org.junit.runner.RunWith;
import testsupport.traits.Deforesting;

import static com.jnape.palatable.lambda.functions.builtin.fn1.Id.id;
import static com.jnape.palatable.lambda.functions.builtin.fn2.Map.map;

@RunWith(Traits.class)
public class MappingIterableTest {

    @TestTraits({Deforesting.class})
    public Fn1<Iterable<Object>, Iterable<Object>> testSubject() {
        return map(id());
    }
}