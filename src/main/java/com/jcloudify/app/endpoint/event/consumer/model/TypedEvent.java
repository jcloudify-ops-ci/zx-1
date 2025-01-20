package com.jcloudify.app.endpoint.event.consumer.model;

import com.jcloudify.app.PojaGenerated;
import com.jcloudify.app.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
