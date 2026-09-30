package com.adjust.sdk.sig;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k3 {
    public static Map a(Map map) {
        if (map instanceof q1) {
            throw ((ClassCastException) g1.a((RuntimeException) new ClassCastException(map.getClass().getName().concat(" cannot be cast to kotlin.collections.MutableMap")), k3.class.getName()));
        }
        return map;
    }
}
