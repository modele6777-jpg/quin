package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vtc {
    public final /* synthetic */ int a;
    public final List b;
    public final k1f[] c;
    public final a80 d;

    public vtc(List list, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = list;
                this.c = new k1f[list.size()];
                a80 a80Var = new a80(new r45(25, this));
                this.d = a80Var;
                a80Var.D(3);
                break;
            default:
                this.b = list;
                this.c = new k1f[list.size()];
                this.d = new a80(new r45(20, this));
                break;
        }
    }

    public void a(long j, d0a d0aVar) {
        if (d0aVar.a() < 9) {
            return;
        }
        int iM = d0aVar.m();
        int iM2 = d0aVar.m();
        int iZ = d0aVar.z();
        if (iM == 434 && iM2 == 1195456820 && iZ == 3) {
            this.d.a(j, d0aVar);
        }
    }

    public final void b(n95 n95Var, xg3 xg3Var) {
        int i = this.a;
        List list = this.b;
        k1f[] k1fVarArr = this.c;
        switch (i) {
            case 0:
                for (int i2 = 0; i2 < k1fVarArr.length; i2++) {
                    xg3Var.d();
                    xg3Var.i();
                    k1f k1fVarN = n95Var.n(xg3Var.c, 3);
                    rr5 rr5Var = (rr5) list.get(i2);
                    String str = rr5Var.p;
                    pa7.B("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
                    String str2 = rr5Var.a;
                    if (str2 == null) {
                        xg3Var.i();
                        str2 = (String) xg3Var.e;
                    }
                    qr5 qr5Var = new qr5();
                    qr5Var.a = str2;
                    qr5Var.n = qv8.l("video/mp2t");
                    qr5Var.o = qv8.l(str);
                    qr5Var.e = rr5Var.e;
                    qr5Var.d = rr5Var.d;
                    qr5Var.O = rr5Var.P;
                    qr5Var.r = rr5Var.s;
                    k1fVarN.g(new rr5(qr5Var));
                    k1fVarArr[i2] = k1fVarN;
                }
                break;
            default:
                for (int i3 = 0; i3 < k1fVarArr.length; i3++) {
                    xg3Var.d();
                    xg3Var.i();
                    k1f k1fVarN2 = n95Var.n(xg3Var.c, 3);
                    rr5 rr5Var2 = (rr5) list.get(i3);
                    String str3 = rr5Var2.p;
                    pa7.B("application/cea-608".equals(str3) || "application/cea-708".equals(str3), "Invalid closed caption MIME type provided: %s", str3);
                    qr5 qr5Var2 = new qr5();
                    xg3Var.i();
                    qr5Var2.a = (String) xg3Var.e;
                    qr5Var2.n = qv8.l("video/mp2t");
                    qr5Var2.o = qv8.l(str3);
                    qr5Var2.e = rr5Var2.e;
                    qr5Var2.d = rr5Var2.d;
                    qr5Var2.O = rr5Var2.P;
                    qr5Var2.r = rr5Var2.s;
                    k1fVarN2.g(new rr5(qr5Var2));
                    k1fVarArr[i3] = k1fVarN2;
                }
                break;
        }
    }
}
