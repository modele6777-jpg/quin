package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ujd extends tjd {
    public final j7f b;
    public final List c;
    public final boolean d;
    public final dr8 e;
    public final a26 f;

    public ujd(j7f j7fVar, List list, boolean z, dr8 dr8Var, a26 a26Var) {
        j7fVar.getClass();
        list.getClass();
        dr8Var.getClass();
        this.b = j7fVar;
        this.c = list;
        this.d = z;
        this.e = dr8Var;
        this.f = a26Var;
        if (!(dr8Var instanceof my4) || (dr8Var instanceof uwe)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + dr8Var + '\n' + j7fVar);
    }

    @Override // defpackage.tt7
    public final dr8 F() {
        return this.e;
    }

    @Override // defpackage.tt7
    public final List Z() {
        return this.c;
    }

    @Override // defpackage.tt7
    public final e7f a0() {
        e7f.b.getClass();
        return e7f.c;
    }

    @Override // defpackage.tt7
    public final j7f c0() {
        return this.b;
    }

    @Override // defpackage.tt7
    public final boolean i0() {
        return this.d;
    }

    @Override // defpackage.tt7
    public final tt7 j0(zt7 zt7Var) {
        tjd tjdVar = (tjd) this.f.d(zt7Var);
        return tjdVar == null ? this : tjdVar;
    }

    @Override // defpackage.jgf
    /* JADX INFO: renamed from: m0 */
    public final jgf j0(zt7 zt7Var) {
        tjd tjdVar = (tjd) this.f.d(zt7Var);
        return tjdVar == null ? this : tjdVar;
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: o0 */
    public final tjd l0(boolean z) {
        if (z == this.d) {
            return this;
        }
        return z ? new yg9(this, 1) : new yg9(this, 0);
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: p0 */
    public final tjd n0(e7f e7fVar) {
        e7fVar.getClass();
        return e7fVar.isEmpty() ? this : new wjd(this, e7fVar);
    }
}
