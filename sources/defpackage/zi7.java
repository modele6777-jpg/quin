package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zi7 extends h2 {
    public final nh7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi7(wg7 wg7Var, nh7 nh7Var, String str) {
        super(wg7Var, str);
        nh7Var.getClass();
        this.f = nh7Var;
        this.a.add("primitive");
    }

    @Override // defpackage.h2
    public final nh7 F(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f;
        }
        qc0.j("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.h2
    public final nh7 T() {
        return this.f;
    }

    @Override // defpackage.zf2
    public final int j(nyc nycVar) {
        nycVar.getClass();
        return 0;
    }
}
