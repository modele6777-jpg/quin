package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class byf extends cs5 {
    public final String b;
    public int c;

    public byf(ng1 ng1Var) {
        super(ng1Var);
        this.b = "virtual-" + ng1Var.d() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.cs5, defpackage.kg1
    public final int b() {
        return p(0);
    }

    @Override // defpackage.cs5, defpackage.ng1
    public final String d() {
        return this.b;
    }

    @Override // defpackage.cs5, defpackage.kg1
    public final int p(int i) {
        return s2f.i(super.p(i) - this.c);
    }
}
