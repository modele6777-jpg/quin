package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yo1 extends tjd implements fp1 {
    public final i8f b;
    public final cp1 c;
    public final boolean d;
    public final e7f e;

    public yo1(i8f i8fVar, cp1 cp1Var, boolean z, e7f e7fVar) {
        i8fVar.getClass();
        e7fVar.getClass();
        this.b = i8fVar;
        this.c = cp1Var;
        this.d = z;
        this.e = e7fVar;
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
        return this.d;
    }

    @Override // defpackage.tt7
    /* JADX INFO: renamed from: j0 */
    public final tt7 m0(zt7 zt7Var) {
        return new yo1(this.b.d(zt7Var), this.c, this.d, this.e);
    }

    @Override // defpackage.tjd, defpackage.jgf
    public final jgf l0(boolean z) {
        if (z == this.d) {
            return this;
        }
        return new yo1(this.b, this.c, z, this.e);
    }

    @Override // defpackage.jgf
    /* JADX INFO: renamed from: m0 */
    public final jgf j0(zt7 zt7Var) {
        return new yo1(this.b.d(zt7Var), this.c, this.d, this.e);
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: o0 */
    public final tjd l0(boolean z) {
        if (z == this.d) {
            return this;
        }
        return new yo1(this.b, this.c, z, this.e);
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: p0 */
    public final tjd n0(e7f e7fVar) {
        e7fVar.getClass();
        return new yo1(this.b, this.c, this.d, e7fVar);
    }

    @Override // defpackage.tjd
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.b);
        sb.append(')');
        sb.append(this.d ? "?" : "");
        return sb.toString();
    }
}
