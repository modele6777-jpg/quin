package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnh8;", "Ls09;", "Lph8;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = z7c.f)
public final /* data */ class nh8 extends s09 {
    public final int a;
    public final int b;

    public nh8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.s09
    public final i09 create() {
        ph8 ph8Var = new ph8();
        ph8Var.Z = this.a;
        ph8Var.E0 = this.b;
        return ph8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh8)) {
            return false;
        }
        nh8 nh8Var = (nh8) obj;
        return this.a == nh8Var.a && this.b == nh8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return kv2.h(this.a, this.b, "LottieAnimationSizeElement(width=", ", height=", ")");
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ph8 ph8Var = (ph8) i09Var;
        ph8Var.getClass();
        ph8Var.Z = this.a;
        ph8Var.E0 = this.b;
    }
}
