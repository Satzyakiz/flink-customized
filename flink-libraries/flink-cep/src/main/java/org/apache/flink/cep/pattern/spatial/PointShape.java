package org.apache.flink.cep.pattern.spatial;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;

/** Point class. */
public class PointShape extends BaseShape {
    private double x;
    private double y;

    PointShape(double x, double y) {
        super(ShapeType.POINT, new GeometryFactory().createPoint(new Coordinate(x, y)));
        this.x = x;
        this.y = y;
    }

    double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }
}
