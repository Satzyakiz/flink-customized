package org.apache.flink.cep.pattern.spatial;

import org.locationtech.jts.geom.Geometry;

import java.util.Optional;

/** Base class for all shapes. */
public abstract class GeometryEvent {

    private Optional<Geometry> geometry;

    public GeometryEvent(Optional<Geometry> geometry) {
        this.geometry = geometry;
    }

    public Optional<Geometry> getGeometry() {
        return this.geometry;
    }
}
