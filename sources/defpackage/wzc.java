package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wzc implements xzc {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final xzc b;

    public wzc(xzc xzcVar) {
        this.b = xzcVar;
    }

    @Override // defpackage.xzc
    public final void a(zzc zzcVar) {
        if (this.a.get()) {
            return;
        }
        this.b.a(zzcVar);
    }

    public final void b() {
        this.a.set(true);
    }
}
