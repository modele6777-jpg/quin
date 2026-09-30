package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qr6 implements mtd {
    public final ct6 a;
    public final ns5 b;
    public boolean c;
    public final /* synthetic */ vr6 d;

    public qr6(vr6 vr6Var, ct6 ct6Var) {
        ct6Var.getClass();
        this.d = vr6Var;
        this.a = ct6Var;
        this.b = new ns5(((yhb) vr6Var.c.d).a.j());
    }

    public final void b(si6 si6Var) {
        hm9 hm9Var;
        fu2 fu2Var;
        si6Var.getClass();
        vr6 vr6Var = this.d;
        int i = vr6Var.d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + vr6Var.d);
        }
        ns5 ns5Var = this.b;
        jye jyeVar = ns5Var.e;
        ns5Var.e = jye.d;
        jyeVar.a();
        jyeVar.b();
        vr6Var.d = 6;
        if (si6Var.size() <= 0 || (hm9Var = vr6Var.a) == null || (fu2Var = hm9Var.j) == null) {
            return;
        }
        ss6.b(fu2Var, this.a, si6Var);
    }

    @Override // defpackage.mtd
    public long c0(f41 f41Var, long j) throws IOException {
        vr6 vr6Var = this.d;
        f41Var.getClass();
        try {
            return ((yhb) vr6Var.c.d).c0(f41Var, j);
        } catch (IOException e) {
            vr6Var.b.e();
            b(vr6.f);
            throw e;
        }
    }

    @Override // defpackage.mtd
    public final jye j() {
        return this.b;
    }
}
