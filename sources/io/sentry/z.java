package io.sentry;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z {
    public final g1 a;
    public final z0 b;
    public final long c;
    public final j7 d;

    public z(g1 g1Var, z0 z0Var, long j, int i) {
        this.a = g1Var;
        this.b = z0Var;
        this.c = j;
        this.d = new j7(new j(i));
    }

    public abstract boolean a(String str);

    public abstract void b(File file, l0 l0Var);
}
