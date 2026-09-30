package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class or4 implements xs4 {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public or4(List list) {
        this.a = 0;
        this.f = list;
        this.g = new k1f[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.xs4
    public final void c(d0a d0aVar) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (d0aVar.a() == 0) {
                            z2 = false;
                        } else {
                            if (d0aVar.z() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (d0aVar.a() == 0) {
                            z = false;
                        } else {
                            if (d0aVar.z() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = d0aVar.b;
                    int iA = d0aVar.a();
                    for (k1f k1fVar : (k1f[]) this.g) {
                        d0aVar.M(i);
                        k1fVar.e(iA, d0aVar);
                    }
                    this.e += iA;
                }
                break;
            default:
                d0a d0aVar2 = (d0a) this.f;
                ((k1f) this.g).getClass();
                if (this.b) {
                    int iA2 = d0aVar.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iA2, 10 - i2);
                        System.arraycopy(d0aVar.a, d0aVar.b, d0aVar2.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            d0aVar2.M(0);
                            if (73 == d0aVar2.z() && 68 == d0aVar2.z() && 51 == d0aVar2.z()) {
                                d0aVar2.N(3);
                                this.d = d0aVar2.y() + 10;
                            } else {
                                xo1.V("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.d - this.e);
                    ((k1f) this.g).e(iMin2, d0aVar);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xs4
    public final void d() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.xs4
    public final void e() {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    pa7.J(this.c != -9223372036854775807L);
                    for (k1f k1fVar : (k1f[]) this.g) {
                        k1fVar.a(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                }
                break;
            default:
                ((k1f) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    pa7.J(this.c != -9223372036854775807L);
                    ((k1f) this.g).a(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xs4
    public final void g(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xs4
    public final void h(n95 n95Var, xg3 xg3Var) {
        switch (this.a) {
            case 0:
                k1f[] k1fVarArr = (k1f[]) this.g;
                for (int i = 0; i < k1fVarArr.length; i++) {
                    w5f w5fVar = (w5f) ((List) this.f).get(i);
                    xg3Var.d();
                    xg3Var.i();
                    k1f k1fVarN = n95Var.n(xg3Var.c, 3);
                    qr5 qr5Var = new qr5();
                    xg3Var.i();
                    qr5Var.a = (String) xg3Var.e;
                    qr5Var.n = qv8.l("video/mp2t");
                    qr5Var.o = qv8.l("application/dvbsubs");
                    qr5Var.r = Collections.singletonList(w5fVar.b);
                    qr5Var.d = w5fVar.a;
                    k1fVarN.g(new rr5(qr5Var));
                    k1fVarArr[i] = k1fVarN;
                }
                break;
            default:
                xg3Var.d();
                xg3Var.i();
                k1f k1fVarN2 = n95Var.n(xg3Var.c, 5);
                this.g = k1fVarN2;
                qr5 qr5Var2 = new qr5();
                xg3Var.i();
                qr5Var2.a = (String) xg3Var.e;
                qr5Var2.n = qv8.l("video/mp2t");
                qr5Var2.o = qv8.l("application/id3");
                k1fVarN2.g(new rr5(qr5Var2));
                break;
        }
    }

    public or4() {
        this.a = 1;
        this.f = new d0a(10);
        this.c = -9223372036854775807L;
    }
}
