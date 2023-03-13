package com.example.demo;
import java.lang.reflect.Array;

import org.junit.Assert;
import org.junit.Test;

import com.example.demo.models.Apple;


public class GenericFixedSizeListTest {
        
        @Test
        public void addNull() {
            GenericFixedSizeList<Apple> genericFixedSizeList = new GenericFixedSizeList<Apple>(Apple.class, 1);
            
            Assert.assertThrows(NullPointerException.class, () -> {
                genericFixedSizeList.add(null);
                     });
            }
}
