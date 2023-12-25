package com.cgvsu.affineTransformation;

import com.cgvsu.affineTransformation.affineComposite.*;
import com.cgvsu.math.Vector3f;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AffineTransformationTest {

    @Test
    public void testScale() {
        Vector3f v = new Vector3f(5, 6, 7);
        Affine a = new AffineBuilder().scale(4, 3, 2).build();
        Affine a1 = new Affine();
        a1.add(new Scale(4, 3, 2));
        Vector3f result = a.applyAffineToVector(v);
        Vector3f result1 = a1.applyAffineToVector(v);
        Vector3f expectedResult = new Vector3f(20, 18, 14);
        Assertions.assertTrue(result.equals(expectedResult) && result1.equals(expectedResult));
    }

    @Test
    public void rotationTest0() {
        Vector3f v = new Vector3f(5, 6, 7);
        Affine a1 = new Affine();
        a1.add(new RotateX(Math.PI/2));
        Affine a2 = new AffineBuilder().rotateX(Math.PI/2).build();
        Vector3f result = a1.applyAffineToVector(v);
        Vector3f result1 = a2.applyAffineToVector(v);
        Vector3f expectedResult = new Vector3f(5, 7, -6);
        Assertions.assertTrue(result.equals(expectedResult) && result1.equals(expectedResult));
    }

    @Test
    public void rotationTest1() {
        Vector3f v = new Vector3f(5, 6, 7);
        Affine a1 = new Affine();
        a1.add(new RotateY(Math.PI/2));
        Affine a2 = new AffineBuilder().rotateY(Math.PI/2).build();
        Vector3f result = a1.applyAffineToVector(v);
        Vector3f result1 = a2.applyAffineToVector(v);
        Vector3f expectedResult = new Vector3f(7, 6, -5);
        Assertions.assertTrue(result.equals(expectedResult) && result1.equals(expectedResult));
    }

    @Test
    public void rotationTest2() {
        Vector3f v = new Vector3f(5, 6, 7);
        Affine a1 = new Affine();
        a1.add(new RotateZ(Math.PI/2));
        Affine a2 = new AffineBuilder().rotateZ(Math.PI/2).build();
        Vector3f result = a1.applyAffineToVector(v);
        Vector3f result1 = a2.applyAffineToVector(v);
        Vector3f expectedResult = new Vector3f(6, -5, 7);
        Assertions.assertTrue(result.equals(expectedResult) && result1.equals(expectedResult));
    }

    @Test
    public void rotationTest3() {
        Vector3f v = new Vector3f(5, 6, 7);
        Affine a1 = new Affine();
        a1.add(new RotateX(0));
        a1.add(new RotateY(0));
        a1.add(new RotateZ(0));
        Affine a2 = new AffineBuilder().rotateX(0).rotateY(0).rotateZ(0).build();
        Vector3f result = a1.applyAffineToVector(v);
        Vector3f result1 = a2.applyAffineToVector(v);
        Vector3f expectedResult = new Vector3f(5, 6, 7);
        Assertions.assertTrue(result.equals(expectedResult) && result1.equals(expectedResult));
    }

    @Test
    public void rotationTest4() {
        Vector3f v = new Vector3f(5, 6, 7);
        Affine a1 = new Affine();
        a1.add(new RotateX(Math.PI/2));
        a1.add(new RotateY(Math.PI/2));
        a1.add(new RotateZ(Math.PI/2));
        Affine a2 = new AffineBuilder().rotateX(Math.PI/2).rotateY(Math.PI/2).rotateZ(Math.PI/2).build();
        Vector3f result = a1.applyAffineToVector(v);
        Vector3f result1 = a2.applyAffineToVector(v);
        Vector3f expectedResult = new Vector3f(7, 6, -5);
        Assertions.assertTrue(result.equals(expectedResult) && result1.equals(expectedResult));
    }

    @Test
    public void translationTest0() {
        Vector3f v = new Vector3f(5, 6, 7);
        Affine a1 = new Affine();
        a1.add(new Translate(5, 5, 5));
        Affine a2 = new AffineBuilder().move(5, 5, 5).build();
        Vector3f result = a1.applyAffineToVector(v);
        Vector3f result1 = a2.applyAffineToVector(v);
        Vector3f expectedResult = new Vector3f(10, 11, 12);
        Assertions.assertTrue(result.equals(expectedResult) && result1.equals(expectedResult));
    }

    @Test
    public void translationTest1() {
        Vector3f v = new Vector3f(5, 6, 7);
        Affine a1 = new Affine();
        a1.add(new Translate(0, 0, 0));
        Affine a2 = new AffineBuilder().move(0, 0, 0).build();
        Vector3f result = a1.applyAffineToVector(v);
        Vector3f result1 = a2.applyAffineToVector(v);
        Vector3f expectedResult = new Vector3f(5, 6, 7);
        Assertions.assertTrue(result.equals(expectedResult) && result1.equals(expectedResult));
    }

    @Test
    public void translationTest2() {
        Vector3f v = new Vector3f(5, 6, 7);
        Affine a1 = new Affine();
        a1.add(new Translate(-5, -5, -5));
        Affine a2 = new AffineBuilder().move(-5, -5, -5).build();
        Vector3f result = a1.applyAffineToVector(v);
        Vector3f result1 = a2.applyAffineToVector(v);
        Vector3f expectedResult = new Vector3f(0, 1, 2);
        Assertions.assertTrue(result.equals(expectedResult) && result1.equals(expectedResult));
    }

    @Test
    public void translationTest3() {
        Vector3f v = new Vector3f(5, 6, 7);
        Affine a1 = new Affine();
        a1.add(new Translate(0, 0, 5));
        Affine a2 = new AffineBuilder().move(0, 0, 5).build();
        Vector3f result = a1.applyAffineToVector(v);
        Vector3f result1 = a2.applyAffineToVector(v);
        Vector3f expectedResult = new Vector3f(5, 6, 12);
        Assertions.assertTrue(result.equals(expectedResult) && result1.equals(expectedResult));
    }

    @Test
    public void translationTest4() {
        Vector3f v = new Vector3f(5, 6, 7);
        Affine a1 = new Affine();
        a1.add(new Translate(0, 5, 0));
        Affine a2 = new AffineBuilder().move(0, 5, 0).build();
        Vector3f result = a1.applyAffineToVector(v);
        Vector3f result1 = a2.applyAffineToVector(v);
        Vector3f expectedResult = new Vector3f(5, 11, 7);
        Assertions.assertTrue(result.equals(expectedResult) && result1.equals(expectedResult));
    }

    @Test
    public void translationTest5() {
        Vector3f v = new Vector3f(5, 6, 7);
        Affine a1 = new Affine();
        a1.add(new Translate(5, 0, 0));
        Affine a2 = new AffineBuilder().move(5, 0, 0).build();
        Vector3f result = a1.applyAffineToVector(v);
        Vector3f result1 = a2.applyAffineToVector(v);
        Vector3f expectedResult = new Vector3f(10, 6, 7);
        Assertions.assertTrue(result.equals(expectedResult) && result1.equals(expectedResult));
    }
}
