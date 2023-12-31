package com.cgvsu;

import com.cgvsu.affineTransformation.AffineApplier;
import com.cgvsu.affineTransformation.AffineBuilder;
import com.cgvsu.affineTransformation.affineComposite.Affine;
import com.cgvsu.affineTransformation.affineComposite.RotateX;
import com.cgvsu.affineTransformation.affineComposite.Scale;
import com.cgvsu.affineTransformation.affineComposite.Translate;
import com.cgvsu.model.Model;
import com.cgvsu.objreader.ObjReader;
import com.cgvsu.objwriter.ObjWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {

        Path fileName = Path.of("3DModels/Faceform/WrapHead.obj");
        String fileContent = Files.readString(fileName);

        System.out.println("Loading model ...");
        Model model = ObjReader.read(fileContent);

        System.out.println("Vertices: " + model.getVertices().size());
        System.out.println("Texture vertices: " + model.getTextureVertices().size());
        System.out.println("Normals: " + model.getNormals().size());
        System.out.println("Polygons: " + model.getPolygons().size());


        //Пример использования
        Affine a = new Affine();
        //a.add(new Translate(0, 20, 0));
        a.add(new Scale(4, 4, 4));
        a.add(new RotateX(Math.PI/2));

        Affine a1 = new AffineBuilder().apply(a).build();

        a1.createApplier().apply(model);

        String file = "file.obj";
        ObjWriter.write(file, model);
    }
}
