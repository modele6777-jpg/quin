package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class te2 extends va9 {
    public final se2 g;
    public final dd2 h;
    public a26 i;
    public a26 j;
    public a26 k;
    public a26 l;

    public te2(se2 se2Var, em7 em7Var, Map map, dd2 dd2Var) {
        super(se2Var, em7Var, map);
        this.g = se2Var;
        this.h = dd2Var;
    }

    @Override // defpackage.va9
    public final ua9 a() {
        re2 re2Var = (re2) super.a();
        re2Var.g = this.i;
        re2Var.v = this.j;
        re2Var.w = this.k;
        re2Var.x = this.l;
        return re2Var;
    }

    @Override // defpackage.va9
    public final ua9 b() {
        return new re2(this.g, this.h);
    }
}
