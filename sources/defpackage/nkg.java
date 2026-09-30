package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nkg extends rkg {
    public static final nkg b = new nkg(skg.a);
    public final AtomicReference a;

    public nkg(rkg rkgVar) {
        this.a = new AtomicReference(rkgVar);
    }

    @Override // defpackage.rkg
    public final void a(String str, Level level, boolean z) {
        ((rkg) this.a.get()).a(str, level, z);
    }

    @Override // defpackage.rkg
    public final ykg b() {
        return ((rkg) this.a.get()).b();
    }

    @Override // defpackage.rkg
    public final mxb c() {
        return ((rkg) this.a.get()).c();
    }
}
