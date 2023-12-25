package com.cgvsu.model;


import com.cgvsu.affineTransformation.affineComposite.Affine;
import com.cgvsu.math.Vector2f;
import com.cgvsu.math.Vector3f;

import java.util.*;

public class Model {

    private ArrayList<Vector3f> vertices = new ArrayList<Vector3f>();
    private ArrayList<Vector2f> textureVertices = new ArrayList<Vector2f>();
    private ArrayList<Vector3f> normals = new ArrayList<Vector3f>();
    private ArrayList<Polygon> polygons = new ArrayList<Polygon>();

    public ArrayList<Vector3f> getVertices() {
        return new ArrayList<>(vertices);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Objects.equals(vertices, model.vertices) && Objects.equals(textureVertices, model.textureVertices) && Objects.equals(normals, model.normals) && Objects.equals(polygons, model.polygons);
    }

    public void setVertices(ArrayList<Vector3f> vertices) {
        this.vertices = vertices;
    }

    public void addVertex(Vector3f vertex) {
        this.vertices.add(vertex);
    }

    public ArrayList<Vector2f> getTextureVertices() {
        return new ArrayList<>(textureVertices);
    }

    public void addTextureVertex(Vector2f textureVertex) {
        this.textureVertices.add(textureVertex);
    }

    public ArrayList<Vector3f> getNormals() {
        return new ArrayList<>(normals);
    }

    public void addNormal(Vector3f normal) {
        this.normals.add(normal);
    }

    public ArrayList<Polygon> getPolygons() {
        return new ArrayList<>(polygons);
    }

    public void addPolygon(Polygon polygon) {
        this.polygons.add(polygon);
    }

    public boolean isEmpty() {
        return vertices.isEmpty();
    }

}
