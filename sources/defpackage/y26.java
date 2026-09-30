package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y26 extends i0 {
    public final ge8 e;
    public final kw9 f;
    public final m36 g;
    public final int v;
    public final x26 w;
    public final a36 x;
    public final List y;
    public static final j22 z = new j22(tyd.k, t99.e("Function"));
    public static final j22 X = new j22(tyd.i, t99.e("KFunction"));

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y26(ge8 ge8Var, k51 k51Var, m36 m36Var, int i) {
        super(ge8Var, m36Var.a(i));
        k51Var.getClass();
        this.e = ge8Var;
        this.f = k51Var;
        this.g = m36Var;
        this.v = i;
        this.w = new x26(this);
        this.x = new a36(ge8Var, this, 0);
        ArrayList arrayList = new ArrayList();
        z67 z67Var = new z67(1, i, 1);
        ArrayList arrayList2 = new ArrayList(t72.u(z67Var, 10));
        Iterator it = z67Var.iterator();
        while (((y67) it).c) {
            arrayList.add(d8f.G0(this, dsf.IN_VARIANCE, t99.e("P" + ((q67) it).nextInt()), arrayList.size(), this.e));
            arrayList2.add(wef.a);
        }
        arrayList.add(d8f.G0(this, dsf.OUT_VARIANCE, t99.e("R"), arrayList.size(), this.e));
        this.y = s72.j1(arrayList);
        m36 m36Var2 = this.g;
        z26.a.getClass();
        m36Var2.getClass();
        if (m36Var2.equals(i36.d) || m36Var2.equals(l36.d) || m36Var2.equals(j36.d)) {
            return;
        }
        m36Var2.equals(k36.d);
    }

    @Override // defpackage.u09
    public final l22 E() {
        return l22.INTERFACE;
    }

    @Override // defpackage.u09
    public final dr8 c0() {
        return cr8.b;
    }

    @Override // defpackage.dm3
    public final ntd e() {
        return ntd.T;
    }

    @Override // defpackage.tq8
    public final boolean e0() {
        return false;
    }

    @Override // defpackage.f00
    public final h10 getAnnotations() {
        return hj6.c;
    }

    @Override // defpackage.u09, defpackage.tq8, defpackage.gm3
    public final rz3 getVisibility() {
        rz3 rz3Var = sz3.e;
        rz3Var.getClass();
        return rz3Var;
    }

    @Override // defpackage.y22
    public final j7f h() {
        return this.w;
    }

    @Override // defpackage.u09, defpackage.z22
    public final List h0() {
        return this.y;
    }

    @Override // defpackage.u09, defpackage.tq8
    public final e09 i() {
        return e09.e;
    }

    @Override // defpackage.tq8
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.u09
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.z22
    public final boolean j() {
        return false;
    }

    @Override // defpackage.bm3
    public final bm3 k() {
        return this.f;
    }

    @Override // defpackage.u09
    public final dr8 l0(zt7 zt7Var) {
        return this.x;
    }

    @Override // defpackage.u09
    public final z12 m0() {
        return null;
    }

    @Override // defpackage.u09
    public final orf n0() {
        return null;
    }

    @Override // defpackage.u09
    public final boolean o0() {
        return false;
    }

    @Override // defpackage.u09
    public final Collection p() {
        return pu4.a;
    }

    @Override // defpackage.u09
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.u09
    public final boolean q0() {
        return false;
    }

    @Override // defpackage.u09
    public final boolean r0() {
        return false;
    }

    public final String toString() {
        String strB = getName().b();
        strB.getClass();
        return strB;
    }

    @Override // defpackage.tq8
    public final boolean w() {
        return false;
    }
}
