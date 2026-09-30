package io.sentry;

import defpackage.ks0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h2 {
    public final ArrayList a;

    public h2(List list) {
        this.a = new ArrayList(list == null ? new ArrayList(0) : list);
    }

    public c2 a() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (c2) ks0.f(1, arrayList);
    }

    public boolean b() {
        if (this.a.size() == 1) {
            return true;
        }
        c2 c2VarA = a();
        d();
        if (!(a() instanceof f2)) {
            if (!(a() instanceof d2)) {
                return false;
            }
            d2 d2Var = (d2) a();
            if (c2VarA == null || d2Var == null) {
                return false;
            }
            d2Var.a.add(c2VarA.getValue());
            return false;
        }
        f2 f2Var = (f2) a();
        d();
        e2 e2Var = (e2) a();
        if (f2Var == null || c2VarA == null || e2Var == null) {
            return false;
        }
        e2Var.a.put(f2Var.a, c2VarA.getValue());
        return false;
    }

    public boolean c(b2 b2Var) {
        Object objA = b2Var.a();
        if (a() == null && objA != null) {
            this.a.add(new g2(objA));
            return true;
        }
        if (a() instanceof f2) {
            f2 f2Var = (f2) a();
            d();
            ((e2) a()).a.put(f2Var.a, objA);
            return false;
        }
        if (!(a() instanceof d2)) {
            return false;
        }
        ((d2) a()).a.add(objA);
        return false;
    }

    public void d() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public h2() {
        this.a = new ArrayList();
    }
}
