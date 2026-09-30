package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o71 implements k71 {
    public List a;

    @Override // defpackage.k71
    public final boolean a(fac facVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (v71.j((t71) it.next(), facVar)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return ks0.n(new StringBuilder("not("), this.a, ")");
    }
}
