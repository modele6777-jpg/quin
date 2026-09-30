package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyh6;", "Ls09;", "Lxh6;", "haze_release"}, k = 1, mv = {2, 2, 0}, xi = z7c.f)
final /* data */ class yh6 extends s09 {
    public final ii6 a;
    public final ji6 b;
    public final a26 c;

    public yh6(ii6 ii6Var, ji6 ji6Var, a26 a26Var) {
        ji6Var.getClass();
        this.a = ii6Var;
        this.b = ji6Var;
        this.c = a26Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new xh6(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh6)) {
            return false;
        }
        yh6 yh6Var = (yh6) obj;
        return pa7.t(this.a, yh6Var.a) && pa7.t(this.b, yh6Var.b) && pa7.t(this.c, yh6Var.c);
    }

    public final int hashCode() {
        ii6 ii6Var = this.a;
        int iHashCode = (this.b.hashCode() + ((ii6Var == null ? 0 : ii6Var.hashCode()) * 31)) * 31;
        a26 a26Var = this.c;
        return iHashCode + (a26Var != null ? a26Var.hashCode() : 0);
    }

    public final String toString() {
        return "HazeEffectNodeElement(state=" + this.a + ", style=" + this.b + ", block=" + this.c + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        xh6 xh6Var = (xh6) i09Var;
        xh6Var.getClass();
        xh6Var.Z = this.a;
        ji6 ji6Var = this.b;
        ji6Var.getClass();
        if (!pa7.t(xh6Var.K0, ji6Var)) {
            xh6Var.n1(xh6Var.K0, ji6Var);
            xh6Var.K0 = ji6Var;
        }
        xh6Var.E0 = this.c;
        xh6Var.A0();
    }
}
