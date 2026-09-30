package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f2b {
    public final a26 a;
    public final a26 b;
    public final x1b c;
    public final sh0 d;
    public final r41 e;
    public final ad0 f;

    public f2b(vx7 vx7Var, x1b x1bVar) {
        zea zeaVar = new zea(16);
        this.a = vx7Var;
        this.b = zeaVar;
        this.c = x1bVar;
        this.d = vpf.m(false);
        this.e = urg.a(Integer.MAX_VALUE, null, new p59(22, this), 2);
        this.f = new ad0();
    }

    public final void a(Throwable th) {
        ad0 ad0Var;
        r41 r41Var = this.e;
        if (r41Var.e(th, false)) {
            Object objK = r41Var.k();
            while (true) {
                boolean z = objK instanceof qw1;
                ad0Var = this.f;
                if (z) {
                    break;
                }
                rw1.c(objK);
                ad0Var.addLast(objK);
                objK = r41Var.k();
            }
            if (ad0Var.isEmpty()) {
                return;
            }
            this.b.d(new ArrayList(ad0Var));
            ad0Var.clear();
        }
    }
}
