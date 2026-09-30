package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mu7 implements xs4 {
    public final String a;
    public final int b;
    public final d0a c;
    public final zu1 d;
    public k1f e;
    public String f;
    public rr5 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public mu7(String str, int i) {
        this.a = str;
        this.b = i;
        d0a d0aVar = new d0a(UserMetadata.MAX_ATTRIBUTE_SIZE);
        this.c = d0aVar;
        byte[] bArr = d0aVar.a;
        this.d = new zu1(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.xs4
    public final void c(d0a d0aVar) throws l0a {
        int iG;
        boolean zF;
        this.e.getClass();
        while (d0aVar.a() > 0) {
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    d0a d0aVar2 = this.c;
                    zu1 zu1Var = this.d;
                    if (i == 2) {
                        int iZ = ((this.k & (-225)) << 8) | d0aVar.z();
                        this.j = iZ;
                        if (iZ > d0aVar2.a.length) {
                            d0aVar2.J(iZ);
                            byte[] bArr = d0aVar2.a;
                            zu1Var.l(bArr, bArr.length);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i != 3) {
                            r3.l();
                            return;
                        }
                        int iMin = Math.min(d0aVar.a(), this.j - this.i);
                        d0aVar.k(zu1Var.b, this.i, iMin);
                        int i2 = this.i + iMin;
                        this.i = i2;
                        if (i2 == this.j) {
                            zu1Var.m(0);
                            if (zu1Var.f()) {
                                if (this.m) {
                                }
                                this.h = 0;
                            } else {
                                this.m = true;
                                int iG2 = zu1Var.g(1);
                                int iG3 = iG2 == 1 ? zu1Var.g(1) : 0;
                                this.n = iG3;
                                if (iG3 != 0) {
                                    throw l0a.a(null, null);
                                }
                                if (iG2 == 1) {
                                    zu1Var.g((zu1Var.g(2) + 1) * 8);
                                }
                                if (!zu1Var.f()) {
                                    throw l0a.a(null, null);
                                }
                                this.o = zu1Var.g(6);
                                int iG4 = zu1Var.g(4);
                                int iG5 = zu1Var.g(3);
                                if (iG4 != 0 || iG5 != 0) {
                                    throw l0a.a(null, null);
                                }
                                if (iG2 == 0) {
                                    int iE = zu1Var.e();
                                    int iB = zu1Var.b();
                                    i iVarC0 = jgb.c0(zu1Var, true);
                                    this.v = iVarC0.c;
                                    this.s = iVarC0.a;
                                    this.u = iVarC0.b;
                                    int iB2 = iB - zu1Var.b();
                                    zu1Var.m(iE);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    zu1Var.h(bArr2, iB2);
                                    qr5 qr5Var = new qr5();
                                    qr5Var.a = this.f;
                                    qr5Var.n = qv8.l("video/mp2t");
                                    qr5Var.o = qv8.l("audio/mp4a-latm");
                                    qr5Var.k = this.v;
                                    qr5Var.I = this.u;
                                    qr5Var.K = this.s;
                                    qr5Var.r = Collections.singletonList(bArr2);
                                    qr5Var.d = this.a;
                                    qr5Var.f = this.b;
                                    rr5 rr5Var = new rr5(qr5Var);
                                    if (!rr5Var.equals(this.g)) {
                                        this.g = rr5Var;
                                        this.t = 1024000000 / ((long) rr5Var.L);
                                        this.e.g(rr5Var);
                                    }
                                } else {
                                    int iG6 = zu1Var.g((zu1Var.g(2) + 1) * 8);
                                    int iB3 = zu1Var.b();
                                    i iVarC1 = jgb.c0(zu1Var, true);
                                    this.v = iVarC1.c;
                                    this.s = iVarC1.a;
                                    this.u = iVarC1.b;
                                    zu1Var.o(iG6 - (iB3 - zu1Var.b()));
                                }
                                int iG7 = zu1Var.g(3);
                                this.p = iG7;
                                if (iG7 == 0) {
                                    zu1Var.o(8);
                                } else if (iG7 == 1) {
                                    zu1Var.o(9);
                                } else if (iG7 == 3 || iG7 == 4 || iG7 == 5) {
                                    zu1Var.o(6);
                                } else {
                                    if (iG7 != 6 && iG7 != 7) {
                                        r3.l();
                                        return;
                                    }
                                    zu1Var.o(1);
                                }
                                boolean zF2 = zu1Var.f();
                                this.q = zF2;
                                this.r = 0L;
                                if (zF2) {
                                    if (iG2 == 1) {
                                        this.r = zu1Var.g((zu1Var.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zF = zu1Var.f();
                                            this.r = (this.r << 8) + ((long) zu1Var.g(8));
                                        } while (zF);
                                    }
                                }
                                if (zu1Var.f()) {
                                    zu1Var.o(8);
                                }
                            }
                            if (this.n != 0) {
                                throw l0a.a(null, null);
                            }
                            if (this.o != 0) {
                                throw l0a.a(null, null);
                            }
                            if (this.p != 0) {
                                throw l0a.a(null, null);
                            }
                            int i3 = 0;
                            do {
                                iG = zu1Var.g(8);
                                i3 += iG;
                            } while (iG == 255);
                            int iE2 = zu1Var.e();
                            if ((iE2 & 7) == 0) {
                                d0aVar2.M(iE2 >> 3);
                            } else {
                                zu1Var.h(d0aVar2.a, i3 * 8);
                                d0aVar2.M(0);
                            }
                            this.e.e(i3, d0aVar2);
                            pa7.J(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i3, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                zu1Var.o((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iZ2 = d0aVar.z();
                    if ((iZ2 & 224) == 224) {
                        this.k = iZ2;
                        this.h = 2;
                    } else if (iZ2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (d0aVar.z() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.xs4
    public final void d() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.xs4
    public final void g(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.xs4
    public final void h(n95 n95Var, xg3 xg3Var) {
        xg3Var.d();
        xg3Var.i();
        this.e = n95Var.n(xg3Var.c, 1);
        xg3Var.i();
        this.f = (String) xg3Var.e;
    }
}
