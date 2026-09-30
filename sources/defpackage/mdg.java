package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmdg;", "Ls09;", "Lqdg;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final /* data */ class mdg extends s09 {
    public final float a;

    public mdg(float f) {
        this.a = f;
    }

    @Override // defpackage.s09
    public final i09 create() {
        qdg qdgVar = new qdg();
        qdgVar.Z = this.a;
        return qdgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mdg) && Float.compare(this.a, ((mdg) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return kv2.j("ZIndexElement(zIndex=", this.a, ")");
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ((qdg) i09Var).Z = this.a;
    }
}
