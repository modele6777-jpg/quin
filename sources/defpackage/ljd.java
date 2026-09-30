package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ljd extends j2 {
    public final um7 b;
    public final List c;
    public final boolean d;
    public final List e;
    public final yn7 f;
    public final boolean g;
    public final boolean v;
    public final boolean w;
    public final em7 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljd(um7 um7Var, List list, boolean z, List list2, yn7 yn7Var, boolean z2, boolean z3, boolean z4, em7 em7Var, x16 x16Var) {
        super(x16Var);
        um7Var.getClass();
        list.getClass();
        list2.getClass();
        this.b = um7Var;
        this.c = list;
        this.d = z;
        this.e = list2;
        this.f = yn7Var;
        this.g = z2;
        this.v = z3;
        this.w = z4;
        this.x = em7Var;
    }

    @Override // defpackage.yn7
    public final List A() {
        return this.c;
    }

    @Override // defpackage.yn7
    public final um7 B() {
        return this.b;
    }

    @Override // defpackage.j2
    public final j2 C(boolean z) {
        em7 em7Var;
        um7 um7Var = this.b;
        boolean z2 = um7Var instanceof em7;
        um7 um7VarB = um7Var;
        if (z2) {
            em7Var = (em7) um7Var;
            if (z) {
                um7VarB = job.a.b(af1.S(em7Var));
            } else {
                Class clsT = af1.T(em7Var);
                if (clsT != null) {
                    um7VarB = em7Var;
                    um7VarB = job.a.b(clsT);
                }
            }
        }
        um7VarB = em7Var;
        return new ljd(um7VarB, this.c, z, this.e, this.f, false, this.v, this.w, this.x, null);
    }

    @Override // defpackage.j2
    public final j2 F() {
        return null;
    }

    @Override // defpackage.j2
    public final yn7 d() {
        return this.f;
    }

    @Override // defpackage.j2
    public final em7 f() {
        return this.x;
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        return this.e;
    }

    @Override // defpackage.j2
    public final boolean m() {
        return this.g;
    }

    @Override // defpackage.yn7
    public final boolean o() {
        return this.d;
    }

    @Override // defpackage.j2
    public final boolean t() {
        return this.v;
    }

    @Override // defpackage.j2
    public final boolean u() {
        return false;
    }

    @Override // defpackage.j2
    public final boolean w() {
        return this.w;
    }

    @Override // defpackage.j2
    public final j2 y() {
        return null;
    }

    @Override // defpackage.j2
    public final j2 z(boolean z) {
        return new ljd(this.b, this.c, this.d && !z, this.e, this.f, z, this.v, this.w, this.x, null);
    }
}
