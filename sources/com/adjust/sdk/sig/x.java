package com.adjust.sdk.sig;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class x {
    public final o1 a;
    public boolean b = true;

    public x(o1 o1Var) {
        this.a = o1Var;
    }

    public final void a(char c) {
        o1 o1Var = this.a;
        o1Var.a(o1Var.b, 1);
        char[] cArr = o1Var.a;
        int i = o1Var.b;
        o1Var.b = i + 1;
        cArr[i] = c;
    }

    public void a() {
        this.b = false;
    }

    public void b() {
    }

    public void c() {
    }
}
