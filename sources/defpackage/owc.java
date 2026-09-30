package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class owc {
    public static final vea l = new vea(7, new qdc(14), new fnc(19));
    public boolean a;
    public final ArrayList b = new ArrayList();
    public final y69 c;
    public final AtomicLong d;
    public cvc e;
    public wt f;
    public yvc g;
    public yuc h;
    public cvc i;
    public cvc j;
    public final vz9 k;

    public owc(long j) {
        y69 y69Var = of8.a;
        this.c = new y69();
        this.d = new AtomicLong(j);
        y69 y69Var2 = of8.a;
        y69Var2.getClass();
        this.k = q1c.f(y69Var2);
    }

    public final y69 a() {
        return (y69) this.k.getValue();
    }

    public final boolean b(bv7 bv7Var, long j, long j2, wuc wucVar, boolean z) {
        yvc yvcVar = this.g;
        if (yvcVar == null) {
            return true;
        }
        fwc fwcVar = yvcVar.a;
        long jB = fwcVar.b(bv7Var, j);
        long jB2 = fwcVar.b(bv7Var, j2);
        fwcVar.o(z);
        return fwcVar.t(jB, jB2, false, wucVar);
    }

    public final void c() {
        yuc yucVar = this.h;
        if (yucVar != null) {
            yucVar.invoke();
        }
    }

    public final void d(bv7 bv7Var, long j, wuc wucVar, boolean z) {
        wt wtVar = this.f;
        if (wtVar != null) {
            wtVar.t(Boolean.valueOf(z), bv7Var, new hl9(j), wucVar);
        }
    }

    public final ArrayList e(bv7 bv7Var) {
        boolean z = this.a;
        ArrayList arrayList = this.b;
        if (!z) {
            w72.f0(arrayList, new va2(3, new wf8(24, bv7Var)));
            this.a = true;
        }
        return arrayList;
    }
}
