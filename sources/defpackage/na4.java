package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lna4;", "Ls09;", "Loa4;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final /* data */ class na4 extends s09 {
    public final oz7 a;

    public na4(oz7 oz7Var) {
        this.a = oz7Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        oa4 oa4Var = new oa4();
        oa4Var.Z = this.a;
        return oa4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof na4) && pa7.t(this.a, ((na4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        oa4 oa4Var = (oa4) i09Var;
        oz7 oz7Var = oa4Var.Z;
        oz7 oz7Var2 = this.a;
        if (pa7.t(oz7Var, oz7Var2) || !oa4Var.a.Y) {
            return;
        }
        oz7 oz7Var3 = oa4Var.Z;
        oz7Var3.e();
        oz7Var3.b = null;
        oz7Var3.c = -1;
        oz7Var2.j = oa4Var;
        oa4Var.Z = oz7Var2;
    }
}
