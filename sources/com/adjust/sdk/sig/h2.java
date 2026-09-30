package com.adjust.sdk.sig;

import defpackage.mob;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h2 {
    public static final i2 a;

    static {
        i2 i2Var;
        try {
            i2Var = (i2) mob.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            i2Var = null;
        }
        if (i2Var == null) {
            i2Var = new i2();
        }
        a = i2Var;
    }
}
