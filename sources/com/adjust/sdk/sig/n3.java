package com.adjust.sdk.sig;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n3 implements u1, Serializable {
    public g0 a;
    public Object b = l3.a;

    public n3(g0 g0Var) {
        this.a = g0Var;
    }

    @Override // com.adjust.sdk.sig.u1
    public final Object getValue() {
        Object obj = this.b;
        if (obj != l3.a) {
            return obj;
        }
        Object objA = this.a.a();
        this.b = objA;
        this.a = null;
        return objA;
    }

    public final String toString() {
        return this.b != l3.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
