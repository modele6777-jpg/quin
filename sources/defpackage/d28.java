package defpackage;

import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d28 {
    public final long a;
    public final TreeSet b = new TreeSet(new qu(19));
    public long c;

    public d28(long j) {
        this.a = j;
    }

    public final void a(yid yidVar, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            zid zidVar = (zid) this.b.first();
            synchronized (yidVar) {
                yidVar.i(zidVar);
            }
        }
    }

    public final void b(yid yidVar, zid zidVar) {
        this.b.add(zidVar);
        this.c += zidVar.c;
        a(yidVar, 0L);
    }
}
