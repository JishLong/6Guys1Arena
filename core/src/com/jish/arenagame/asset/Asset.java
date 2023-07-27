package com.jish.arenagame.asset;

import com.badlogic.gdx.graphics.Texture;

public enum Asset {
    TEST("badlogic.jpg", Texture.class, true);

    final String fileName;
    final Class<?> type;
    final boolean isInitialAsset;

    Asset(String fileName, Class<?> type, boolean isInitialAsset) {
        this.fileName = fileName;
        this.type = type;
        this.isInitialAsset = isInitialAsset;
    }
}
