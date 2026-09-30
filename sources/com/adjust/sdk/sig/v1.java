package com.adjust.sdk.sig;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v1 {
    public static u1 a(g0 g0Var) {
        int iA = w1.a(2);
        if (iA == 0) {
            return new j3(g0Var);
        }
        if (iA == 1) {
            return new k2(g0Var);
        }
        if (iA == 2) {
            return new n3(g0Var);
        }
        throw new y1();
    }
}
