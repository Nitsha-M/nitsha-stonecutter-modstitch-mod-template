package com.nitsha.skinema;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static final String MOD_ID = "nitsha_skinema";

    //? if >=1.17 {
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    //?} else {
    /*public static final Logger LOGGER = LogManager.getLogger(MOD_ID);*/
    //?}

    public static void init() {
        System.out.println("Hello World!");
    }

    //? if >=1.21 {
    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
    //?} else if >=1.20 {
    /*public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
    *///?} else {
    /*public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
    *///?}

    public static ResourceLocation idSprite(String path) {
        //? if >=1.20.2 {
        return id(path);
        //?} else {
        /*return id("textures/gui/sprites/" + path + ".png");*/
        //?}
    }
}
