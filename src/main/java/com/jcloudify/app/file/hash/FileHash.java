package com.jcloudify.app.file.hash;

import com.jcloudify.app.PojaGenerated;

@PojaGenerated
@SuppressWarnings("all")
public record FileHash(FileHashAlgorithm algorithm, String value) {}
