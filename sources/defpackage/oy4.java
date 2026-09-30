package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oy4 extends tjd {
    public final j7f b;
    public final my4 c;
    public final qy4 d;
    public final List e;
    public final boolean f;
    public final String[] g;
    public final String v;

    public oy4(j7f j7fVar, my4 my4Var, qy4 qy4Var, List list, boolean z, String... strArr) {
        qy4Var.getClass();
        list.getClass();
        this.b = j7fVar;
        this.c = my4Var;
        this.d = qy4Var;
        this.e = list;
        this.f = z;
        this.g = strArr;
        String strA = qy4Var.a();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.v = String.format(strA, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // defpackage.tt7
    public final dr8 F() {
        return this.c;
    }

    @Override // defpackage.tt7
    public final List Z() {
        return this.e;
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
        return this.f;
    }

    @Override // defpackage.tjd, defpackage.jgf
    public final jgf n0(e7f e7fVar) {
        e7fVar.getClass();
        return this;
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: o0 */
    public final tjd l0(boolean z) {
        String[] strArr = this.g;
        return new oy4(this.b, this.c, this.d, this.e, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // defpackage.tjd
    /* JADX INFO: renamed from: p0 */
    public final tjd n0(e7f e7fVar) {
        e7fVar.getClass();
        return this;
    }

    @Override // defpackage.tt7
    /* JADX INFO: renamed from: j0 */
    public final tt7 m0(zt7 zt7Var) {
        return this;
    }

    @Override // defpackage.jgf
    public final jgf m0(zt7 zt7Var) {
        return this;
    }
}
