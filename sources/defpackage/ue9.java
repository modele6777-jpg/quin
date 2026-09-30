package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ue9 extends tjd implements fp1 {
    public final to1 b;
    public final ve9 c;
    public final jgf d;
    public final e7f e;
    public final boolean f;
    public final boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    public ue9(to1 to1Var, ve9 ve9Var, jgf jgfVar, e7f e7fVar, boolean z, int i) {
        if ((i & 8) != 0) {
            e7f.b.getClass();
            e7fVar = e7f.c;
        }
        this(to1Var, ve9Var, jgfVar, e7fVar, (i & 16) != 0 ? false : z, false);
    }

    @Override // defpackage.tt7
    public final dr8 F() {
        return sy4.a(ny4.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // defpackage.tt7
    public final List Z() {
        return pu4.a;
    }

    @Override // defpackage.tt7
    public final e7f a0() {
        return this.e;
    }

    @Override // defpackage.tt7
    public final j7f c0() {
        return this.c;
    }

    @Override // defpackage.tt7
    public final boolean i0() {
        return this.f;
    }

    @Override // defpackage.tjd, defpackage.jgf
    public final jgf l0(boolean z) {
        return new ue9(this.b, this.c, this.d, this.e, z, 32);
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: o0 */
    public final tjd l0(boolean z) {
        return new ue9(this.b, this.c, this.d, this.e, z, 32);
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: p0 */
    public final tjd n0(e7f e7fVar) {
        e7fVar.getClass();
        return new ue9(this.b, this.c, this.d, e7fVar, this.f, this.g);
    }

    @Override // defpackage.jgf
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final ue9 j0(zt7 zt7Var) {
        n5 n5Var;
        ve9 ve9Var = this.c;
        i8f i8fVarD = ve9Var.a.d(zt7Var);
        if (ve9Var.b != null) {
            n5Var = new n5(ve9Var, zt7Var, false, 22);
        } else {
            n5Var = null;
        }
        ve9 ve9Var2 = ve9Var.c;
        if (ve9Var2 == null) {
            ve9Var2 = ve9Var;
        }
        ve9 ve9Var3 = new ve9(i8fVarD, n5Var, ve9Var2, ve9Var.d);
        jgf jgfVar = this.d;
        return new ue9(this.b, ve9Var3, jgfVar != null ? jgfVar : null, this.e, this.f, 32);
    }

    public ue9(to1 to1Var, ve9 ve9Var, jgf jgfVar, e7f e7fVar, boolean z, boolean z2) {
        to1Var.getClass();
        ve9Var.getClass();
        e7fVar.getClass();
        this.b = to1Var;
        this.c = ve9Var;
        this.d = jgfVar;
        this.e = e7fVar;
        this.f = z;
        this.g = z2;
    }
}
