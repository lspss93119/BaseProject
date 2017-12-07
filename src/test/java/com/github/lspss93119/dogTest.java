package com.github.lspss93119;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class dogTest {
    @Test
    public void getType() throws Exception {

        // Arrange
        dog triangle = new dog(5, 10, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);


    }

}
