package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aq4 {
    public final int a;
    public final zp8 b;
    public final CopyOnWriteArrayList c;

    public /* synthetic */ aq4(CopyOnWriteArrayList copyOnWriteArrayList, int i, zp8 zp8Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = zp8Var;
    }

    public void a(xl2 xl2Var) {
        for (eq8 eq8Var : this.c) {
            pqf.K(eq8Var.a, new ny2(29, xl2Var, eq8Var.b));
        }
    }
}
