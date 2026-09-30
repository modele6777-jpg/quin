package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h7f {
    public final boolean a;
    public final boolean b;
    public final r8f c;
    public final kj0 d;
    public final rs0 e;
    public int f;
    public ArrayDeque g;
    public dqd h;

    public h7f(boolean z, boolean z2, boolean z3, r8f r8fVar, kj0 kj0Var, rs0 rs0Var) {
        r8fVar.getClass();
        this.a = z;
        this.b = z2;
        this.c = r8fVar;
        this.d = kj0Var;
        this.e = rs0Var;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        arrayDeque.getClass();
        arrayDeque.clear();
        dqd dqdVar = this.h;
        dqdVar.getClass();
        dqdVar.clear();
    }

    public final void b() {
        if (this.g == null) {
            this.g = new ArrayDeque(4);
        }
        if (this.h == null) {
            this.h = new dqd();
        }
    }
}
