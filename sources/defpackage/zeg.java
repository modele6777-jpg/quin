package defpackage;

import com.google.android.play.core.assetpacks.c;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zeg extends xeg {
    public final c a;
    public final long b;
    public final long c;

    public zeg(c cVar, long j, long j2) {
        this.a = cVar;
        long jB = b(j);
        this.b = jB;
        this.c = b(jB + j2);
    }

    public final long b(long j) {
        if (j < 0) {
            return 0L;
        }
        c cVar = this.a;
        return j > cVar.b() ? cVar.b() : j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
