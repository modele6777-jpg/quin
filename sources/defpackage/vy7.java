package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvy7;", "Ls09;", "Lyy7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class vy7 extends s09 {
    public final zy7 a;
    public final ssg b;
    public final ks9 c;

    public vy7(zy7 zy7Var, ssg ssgVar, ks9 ks9Var) {
        this.a = zy7Var;
        this.b = ssgVar;
        this.c = ks9Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        yy7 yy7Var = new yy7();
        yy7Var.Z = this.a;
        yy7Var.E0 = this.b;
        yy7Var.F0 = this.c;
        return yy7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy7)) {
            return false;
        }
        vy7 vy7Var = (vy7) obj;
        return pa7.t(this.a, vy7Var.a) && pa7.t(this.b, vy7Var.b) && this.c == vy7Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ub3.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        yy7 yy7Var = (yy7) i09Var;
        yy7Var.Z = this.a;
        yy7Var.E0 = this.b;
        yy7Var.F0 = this.c;
    }
}
