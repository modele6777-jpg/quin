package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class el2 implements cyc {
    public final AtomicReference a;

    public el2(cyc cycVar) {
        this.a = new AtomicReference(cycVar);
    }

    @Override // defpackage.cyc
    public final Iterator iterator() {
        cyc cycVar = (cyc) this.a.getAndSet(null);
        if (cycVar != null) {
            return cycVar.iterator();
        }
        qc0.p("This sequence can be consumed only once.");
        return null;
    }
}
