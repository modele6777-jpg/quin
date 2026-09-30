package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ma2 extends f3 {
    public final Object a;
    public int b;
    public final /* synthetic */ na2 c;

    public ma2(na2 na2Var, int i) {
        this.c = na2Var;
        Object obj = na2.x;
        this.a = na2Var.l()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        na2 na2Var = this.c;
        if (i != -1 && i < na2Var.size()) {
            if (ok8.t(obj, na2Var.l()[this.b])) {
                return;
            }
        }
        Object obj2 = na2.x;
        this.b = na2Var.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        na2 na2Var = this.c;
        Map mapC = na2Var.c();
        if (mapC != null) {
            return mapC.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return na2Var.m()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        na2 na2Var = this.c;
        Map mapC = na2Var.c();
        Object obj2 = this.a;
        if (mapC != null) {
            return mapC.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            na2Var.put(obj2, obj);
            return null;
        }
        Object obj3 = na2Var.m()[i];
        na2Var.m()[this.b] = obj;
        return obj3;
    }
}
