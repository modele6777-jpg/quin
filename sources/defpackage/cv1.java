package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cv1 extends um3 implements x7e {
    public x7e e;
    public long f;
    public final /* synthetic */ int g = 0;
    public Object v;

    public cv1(ew3 ew3Var) {
        this.v = ew3Var;
    }

    @Override // defpackage.x7e
    public final int c(long j) {
        x7e x7eVar = this.e;
        x7eVar.getClass();
        return x7eVar.c(j - this.f);
    }

    @Override // defpackage.um3
    public final void e() {
        this.b = 0;
        this.c = 0L;
        this.d = false;
        this.e = null;
    }

    @Override // defpackage.x7e
    public final long f(int i) {
        x7e x7eVar = this.e;
        x7eVar.getClass();
        return x7eVar.f(i) + this.f;
    }

    @Override // defpackage.um3
    public final void g() {
        switch (this.g) {
            case 0:
                dv1 dv1Var = (dv1) ((jv2) this.v).b;
                e();
                dv1Var.b.add(this);
                break;
            default:
                ((ew3) this.v).n(this);
                break;
        }
    }

    @Override // defpackage.x7e
    public final List j(long j) {
        x7e x7eVar = this.e;
        x7eVar.getClass();
        return x7eVar.j(j - this.f);
    }

    @Override // defpackage.x7e
    public final int l() {
        x7e x7eVar = this.e;
        x7eVar.getClass();
        return x7eVar.l();
    }

    public /* synthetic */ cv1() {
    }
}
