package com.vaadin.tapio.googlemaps.client.rpcs;

import com.vaadin.shared.communication.ServerRpc;

/**
 * Created by mattc on 4/3/14.
 */
public interface PolylineClickedRpc extends ServerRpc
{
    public void polylineClicked(long polyId);
}