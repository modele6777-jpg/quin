package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljw7;", "Ls09;", "Lkw7;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class jw7 extends s09 {
    public final float a;
    public final boolean b;

    public jw7(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.s09
    public final i09 create() {
        kw7 kw7Var = new kw7();
        kw7Var.Z = this.a;
        kw7Var.E0 = this.b;
        return kw7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        jw7 jw7Var = obj instanceof jw7 ? (jw7) obj : null;
        return jw7Var != null && this.a == jw7Var.a && this.b == jw7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        kw7 kw7Var = (kw7) i09Var;
        kw7Var.Z = this.a;
        kw7Var.E0 = this.b;
    }
}
