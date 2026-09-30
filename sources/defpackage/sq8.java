package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sq8 extends v69 {
    public dcc l;

    @Override // defpackage.q98
    public final void g() {
        Iterator it = this.l.iterator();
        while (true) {
            zbc zbcVar = (zbc) it;
            if (!zbcVar.hasNext()) {
                return;
            }
            rq8 rq8Var = (rq8) ((Map.Entry) zbcVar.next()).getValue();
            rq8Var.a.f(rq8Var);
        }
    }

    @Override // defpackage.q98
    public final void h() {
        Iterator it = this.l.iterator();
        while (true) {
            zbc zbcVar = (zbc) it;
            if (!zbcVar.hasNext()) {
                return;
            }
            rq8 rq8Var = (rq8) ((Map.Entry) zbcVar.next()).getValue();
            rq8Var.a.j(rq8Var);
        }
    }
}
