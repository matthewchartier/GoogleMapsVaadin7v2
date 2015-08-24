package com.vaadin.tapio.googlemaps.client.events;

import com.vaadin.tapio.googlemaps.client.overlays.GoogleMapPolyline;

import java.io.Serializable;

/**
 * Created by mattc on 4/3/14.
 */
public interface PolylineClickListener extends Serializable
{
    /**
     * Handle a PolylineClickEvent.
     *
     * @param clickedPolyline
     *            The polyline that was clicked.
     */
    public void polylineClicked(GoogleMapPolyline clickedPolyline);
}