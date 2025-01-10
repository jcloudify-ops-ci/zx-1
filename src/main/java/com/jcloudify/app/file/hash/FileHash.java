package com.jcloudify.app.file.hash;

import com.jcloudify.app.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
