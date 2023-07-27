package com.jish.arenagame.asset;

import com.badlogic.gdx.assets.AssetManager;
import com.jish.arenagame.Logger;

public class AssetHelper {
    private static AssetHelper instance;

    private final AssetManager manager;

    private AssetHelper() {
        manager = new AssetManager();
    }

    public static void init() {
        Logger.log(AssetHelper.class, "Initializing...");
        instance = new AssetHelper();
        Logger.log(AssetHelper.class, "Successfully initialized.");
    }

    public static void loadInitialAssets() {
        Logger.log(AssetHelper.class, "Loading initial assets...");
        for (Asset a : Asset.values()) {
            if (a.isInitialAsset) {
                instance.manager.load(a.fileName, a.type);
            }
        }
        instance.manager.finishLoading();
        Logger.log(AssetHelper.class, "Successfully loaded initial assets.");
    }

    public static void loadAssets() {
        Logger.log(AssetHelper.class, "Loading remaining assets...");
        for (Asset a : Asset.values()) {
            if (!a.isInitialAsset) {
                instance.manager.load(a.fileName, a.type);
            }
        }
    }

    public static boolean isLoadingAssets() {
        boolean isLoadingAssets = instance.manager.update();
        if (isLoadingAssets) {
            Logger.log(AssetHelper.class, "Successfully loaded all assets.");
        }
        return isLoadingAssets;
    }

    @SuppressWarnings("unchecked")
    public static <T> T get(Asset a) {
        return (T) instance.manager.get(a.fileName, a.type, false);
    }

    public static void dispose() {
        Logger.log(AssetHelper.class, "Disposing resources...");
        instance.manager.dispose();
        Logger.log(AssetHelper.class, "Resources successfully disposed.");
    }

    public static AssetManager getManager() {
        return instance.manager;
    }
}
