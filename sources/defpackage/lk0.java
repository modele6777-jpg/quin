package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lk0 {
    public final qn2 a;
    public final vv2 b;
    public final Object c;
    public final LinkedHashMap d;
    public final CopyOnWriteArrayList e;

    public lk0(qwe qweVar, nh1 nh1Var, dg7 dg7Var) {
        qweVar.getClass();
        nh1Var.getClass();
        dg7Var.getClass();
        this.a = jgb.k(i7h.I(new t8e(dg7Var), i7h.I(qweVar.h, new wv2("CXCP-AudioRestrictionControllerImpl"))));
        this.b = new vv2();
        this.c = new Object();
        this.d = new LinkedHashMap();
        this.e = new CopyOnWriteArrayList();
        nh1Var.a(kh1.b, new j1(10, this));
    }

    public final mk0 a() {
        LinkedHashMap linkedHashMap = this.d;
        if (linkedHashMap.containsValue(new mk0(3))) {
            return new mk0(3);
        }
        synchronized (this.c) {
        }
        if (linkedHashMap.containsValue(new mk0(1))) {
            return new mk0(1);
        }
        synchronized (this.c) {
        }
        if (linkedHashMap.containsValue(new mk0(0))) {
            return new mk0(0);
        }
        synchronized (this.c) {
        }
        return null;
    }
}
