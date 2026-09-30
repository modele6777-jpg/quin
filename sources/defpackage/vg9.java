package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vg9 extends d22 {
    public final boolean g;
    public final ArrayList v;
    public final r22 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg9(ge8 ge8Var, o22 o22Var, t99 t99Var, boolean z, int i) {
        super(ge8Var, o22Var, t99Var, ntd.T);
        o22Var.getClass();
        this.g = z;
        z67 z67VarC0 = mh3.c0(0, i);
        ArrayList arrayList = new ArrayList(t72.u(z67VarC0, 10));
        Iterator it = z67VarC0.iterator();
        while (((y67) it).c) {
            int iNextInt = ((q67) it).nextInt();
            arrayList.add(d8f.G0(this, dsf.INVARIANT, t99.e("T" + iNextInt), iNextInt, ge8Var));
        }
        this.v = arrayList;
        List listG = a6c.g(this);
        int i2 = qz3.a;
        w09 w09VarC = oz3.c(this);
        w09VarC.getClass();
        this.w = new r22(this, listG, n3d.p(w09VarC.f().e()), ge8Var);
    }

    @Override // defpackage.u09
    public final l22 E() {
        return l22.CLASS;
    }

    @Override // defpackage.u09
    public final dr8 c0() {
        return cr8.b;
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
        return this.v;
    }

    @Override // defpackage.u09, defpackage.tq8
    public final e09 i() {
        return e09.b;
    }

    @Override // defpackage.d22, defpackage.tq8
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.u09
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.z22
    public final boolean j() {
        return this.g;
    }

    @Override // defpackage.u09
    public final dr8 l0(zt7 zt7Var) {
        return cr8.b;
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
        return xu4.a;
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
        return "class " + getName() + " (not found)";
    }

    @Override // defpackage.tq8
    public final boolean w() {
        return false;
    }
}
