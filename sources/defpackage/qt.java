package defpackage;

import io.sentry.android.core.b1;
import io.sentry.android.replay.capture.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qt implements fo1 {
    public final qwe a;
    public final uf1 b;
    public final d3e c;

    public qt(qwe qweVar, uf1 uf1Var, d3e d3eVar) {
        qweVar.getClass();
        this.a = qweVar;
        this.b = uf1Var;
        this.c = d3eVar;
    }

    @Override // defpackage.fo1
    public final eo1 a(lf1 lf1Var, Map map, qo1 qo1Var) throws Exception {
        int i;
        ArrayList arrayList;
        qk6 qk6Var = qk6.g;
        qo1Var.getClass();
        uf1 uf1Var = this.b;
        int i2 = uf1Var.h;
        if (i2 == 0) {
            i = 0;
        } else if (i2 == 1) {
            i = 1;
        } else {
            if (i2 == 2) {
                v.a(kn2.b0(i2), "Unsupported session mode: ");
                return null;
            }
            i = i2;
        }
        mt9 mt9VarT = k99.t(uf1Var, this.c, map);
        ArrayList arrayList2 = mt9VarT.a;
        if (arrayList2.isEmpty()) {
            b1.l("CXCP", "Failed to create OutputConfigurations for " + uf1Var);
            qo1Var.a();
            return qk6Var;
        }
        ArrayList arrayList3 = uf1Var.d;
        if (arrayList3 != null) {
            arrayList = new ArrayList(t72.u(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                yt9 yt9Var = (yt9) s72.X0(((r47) it.next()).a.a);
                arrayList.add(new f47(yt9Var.a.getWidth(), yt9Var.a.getHeight(), yt9Var.b));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((f47) it2.next()).c != ((f47) arrayList.get(0)).c) {
                    qc0.p("All InputStream.Config objects must have the same format for multi resolution");
                    return null;
                }
            }
        }
        if (lf1Var.g0(new d0d(i, arrayList, arrayList2, (Executor) this.a.j.getValue(), qo1Var, uf1Var.f, uf1Var.g))) {
            return new do1(mt9VarT.b, mt9VarT.d);
        }
        b1.l("CXCP", "Failed to create capture session from " + lf1Var + " for " + qo1Var + '!');
        qo1Var.a();
        return qk6Var;
    }
}
