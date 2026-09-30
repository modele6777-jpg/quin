package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wj1 {
    public final List a;

    public wj1(List list) {
        this.a = list;
        yt9 yt9Var = (yt9) s72.v0(list);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((yt9) it.next()).b != yt9Var.b) {
                qc0.p("All outputs must have the same format!");
                throw null;
            }
        }
    }

    public final String toString() {
        return ks0.n(new StringBuilder("CameraStream.Config(outputs="), this.a, ", imageSourceConfig=null)");
    }
}
