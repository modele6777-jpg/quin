package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aj5 extends j2 {
    public final j2 b;
    public final j2 c;
    public final boolean d;

    public aj5(j2 j2Var, j2 j2Var2, boolean z, x16 x16Var) {
        super(x16Var);
        this.b = j2Var;
        this.c = j2Var2;
        this.d = z;
    }

    @Override // defpackage.yn7
    public final List A() {
        return this.b.A();
    }

    @Override // defpackage.yn7
    public final um7 B() {
        return this.b.B();
    }

    @Override // defpackage.j2
    public final j2 C(boolean z) {
        j2 j2VarC = this.b.C(z);
        j2 j2VarC2 = this.c.C(z);
        return j2VarC.equals(j2VarC2) ? j2VarC : new aj5(j2VarC, j2VarC2, this.d, null);
    }

    @Override // defpackage.j2
    public final j2 F() {
        return this.c;
    }

    @Override // defpackage.j2
    public final yn7 d() {
        return null;
    }

    @Override // defpackage.j2
    public final em7 f() {
        return this.b.f();
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        return this.b.getAnnotations();
    }

    @Override // defpackage.j2
    public final boolean m() {
        return false;
    }

    @Override // defpackage.yn7
    public final boolean o() {
        return this.b.o();
    }

    @Override // defpackage.j2
    public final boolean t() {
        return false;
    }

    @Override // defpackage.j2
    public final boolean u() {
        return this.d;
    }

    @Override // defpackage.j2
    public final boolean w() {
        return false;
    }

    @Override // defpackage.j2
    public final j2 y() {
        return this.b;
    }

    @Override // defpackage.j2
    public final j2 z(boolean z) {
        j2 j2VarZ = this.b.z(z);
        j2 j2VarZ2 = this.c.z(z);
        return j2VarZ.equals(j2VarZ2) ? j2VarZ : new aj5(j2VarZ, j2VarZ2, this.d, null);
    }
}
