package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t49 implements xs4 {
    public final d0a a;
    public final u49 b;
    public final String c;
    public final int d;
    public final String e;
    public k1f f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public t49(String str, int i, String str2) {
        d0a d0aVar = new d0a(4);
        this.a = d0aVar;
        d0aVar.a[0] = -1;
        this.b = new u49();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.xs4
    public final void c(d0a d0aVar) {
        this.f.getClass();
        while (d0aVar.a() > 0) {
            int i = this.h;
            d0a d0aVar2 = this.a;
            if (i == 0) {
                byte[] bArr = d0aVar.a;
                int i2 = d0aVar.b;
                int i3 = d0aVar.c;
                while (true) {
                    if (i2 >= i3) {
                        d0aVar.M(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        d0aVar.M(i2 + 1);
                        this.k = false;
                        d0aVar2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(d0aVar.a(), 4 - this.i);
                d0aVar.k(d0aVar2.a, this.i, iMin);
                int i4 = this.i + iMin;
                this.i = i4;
                if (i4 >= 4) {
                    d0aVar2.M(0);
                    int iM = d0aVar2.m();
                    u49 u49Var = this.b;
                    if (u49Var.a(iM)) {
                        this.m = u49Var.b;
                        if (!this.j) {
                            this.l = (((long) u49Var.f) * 1000000) / ((long) u49Var.c);
                            qr5 qr5Var = new qr5();
                            qr5Var.a = this.g;
                            qr5Var.n = qv8.l(this.e);
                            qr5Var.o = qv8.l((String) u49Var.g);
                            qr5Var.p = 4096;
                            qr5Var.I = u49Var.d;
                            qr5Var.K = u49Var.c;
                            qr5Var.d = this.c;
                            qr5Var.f = this.d;
                            this.f.g(new rr5(qr5Var));
                            this.j = true;
                        }
                        d0aVar2.M(0);
                        this.f.e(4, d0aVar2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    r3.l();
                    return;
                }
                int iMin2 = Math.min(d0aVar.a(), this.m - this.i);
                this.f.e(iMin2, d0aVar);
                int i5 = this.i + iMin2;
                this.i = i5;
                if (i5 >= this.m) {
                    pa7.J(this.n != -9223372036854775807L);
                    this.f.a(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // defpackage.xs4
    public final void d() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.xs4
    public final void g(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.xs4
    public final void h(n95 n95Var, xg3 xg3Var) {
        xg3Var.d();
        xg3Var.i();
        this.g = (String) xg3Var.e;
        xg3Var.i();
        this.f = n95Var.n(xg3Var.c, 1);
    }
}
