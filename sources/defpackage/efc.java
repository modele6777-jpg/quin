package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class efc {
    public static final String a = ff8.n("Schedulers");

    public static void a(nbg nbgVar, uzd uzdVar, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                nbgVar.e(jCurrentTimeMillis, ((lbg) it.next()).a);
            }
        }
    }

    public static void b(si2 si2Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        nbg nbgVarX = workDatabase.x();
        workDatabase.b();
        try {
            w5c w5cVar = nbgVarX.a;
            w5c w5cVar2 = nbgVarX.a;
            List list2 = (List) urg.I(w5cVar, true, false, new n8g(7));
            a(nbgVarX, si2Var.d, list2);
            List list3 = (List) urg.I(w5cVar2, true, false, new n8g(5));
            a(nbgVarX, si2Var.d, list3);
            list3.addAll(list2);
            List list4 = (List) urg.I(w5cVar2, true, false, new n8g(10));
            workDatabase.q();
            workDatabase.m();
            if (list3.size() > 0) {
                lbg[] lbgVarArr = (lbg[]) list3.toArray(new lbg[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bfc bfcVar = (bfc) it.next();
                    if (bfcVar.c()) {
                        bfcVar.e(lbgVarArr);
                    }
                }
            }
            if (list4.size() > 0) {
                lbg[] lbgVarArr2 = (lbg[]) list4.toArray(new lbg[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    bfc bfcVar2 = (bfc) it2.next();
                    if (!bfcVar2.c()) {
                        bfcVar2.e(lbgVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.m();
            throw th;
        }
    }
}
