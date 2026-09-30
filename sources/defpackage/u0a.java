package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0a {
    public final s0a a;
    public final long b;
    public final t0a c;
    public final ArrayList d;

    public u0a(s0a s0aVar, float f) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.a = s0aVar;
        this.b = jCurrentTimeMillis;
        this.c = new t0a(s0aVar.n, f);
        this.d = new ArrayList();
    }
}
