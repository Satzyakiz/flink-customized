package org.apache.flink.cep.pattern.spatial;

import org.locationtech.jts.geom.Geometry;

/** Base class for all shapes. */
public abstract class BaseShape {

    private ShapeType type;
    private Geometry geometry;

    public BaseShape(ShapeType type, Geometry geometry) {
        this.type = type;
        this.geometry = geometry;
    }

    public ShapeType getType() {
        return type;
    }

    public Geometry getGeometry() {
        return this.geometry;
    }
}
