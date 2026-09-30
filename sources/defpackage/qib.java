package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qib {
    public final xj0 a;
    public final sug b;
    public final Object c = new Object();

    public qib(xj0 xj0Var, sug sugVar) {
        this.a = xj0Var;
        this.b = sugVar;
    }

    public final void a() {
        synchronized (this.c) {
            ((y21) this.a.c).m(-1L);
            sug sugVar = this.b;
            sugVar.b = 0;
            ((LinkedHashMap) sugVar.c).clear();
        }
    }

    public final void b(long j) {
        synchronized (this.c) {
            y21 y21Var = (y21) this.a.c;
            y21Var.a = j;
            y21Var.m(j);
        }
    }
}
