package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ir7 {
    public final hr7 a = new hr7();

    public final void a(List list) {
        hr7 hr7Var = this.a;
        hr7Var.a.getClass();
        a48 a48Var = a48.e;
        a48 a48Var2 = a48.b;
        if (a48Var.compareTo(a48Var2) > 0) {
            hr7Var.b(list);
            return;
        }
        long jA = a19.a();
        hr7Var.b(list);
        long jA2 = zxe.a(jA);
        int size = ((ConcurrentHashMap) hr7Var.d.d).size();
        rs0 rs0Var = hr7Var.a;
        StringBuilder sbN = ub3.n(size, "Started ", " definitions in ");
        qfc qfcVar = ar4.b;
        sbN.append(ar4.h(jA2, gr4.MICROSECONDS) / 1000.0d);
        sbN.append(" ms");
        rs0Var.u(a48Var2, sbN.toString());
    }
}
