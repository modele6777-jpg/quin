package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tsc implements x5f {
    public final ssc a;
    public final d0a b = new d0a(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public tsc(ssc sscVar) {
        this.a = sscVar;
    }

    @Override // defpackage.x5f
    public final void a(int i, d0a d0aVar) {
        int iZ;
        boolean z = (i & 1) != 0;
        if (z) {
            iZ = d0aVar.b + d0aVar.z();
        } else {
            iZ = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            d0aVar.M(iZ);
            this.d = 0;
        }
        while (d0aVar.a() > 0) {
            int i2 = this.d;
            d0a d0aVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iZ2 = d0aVar.z();
                    d0aVar.M(d0aVar.b - 1);
                    if (iZ2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(d0aVar.a(), 3 - this.d);
                d0aVar.k(d0aVar2.a, this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    d0aVar2.M(0);
                    d0aVar2.L(3);
                    d0aVar2.N(1);
                    int iZ3 = d0aVar2.z();
                    int iZ4 = d0aVar2.z();
                    this.e = (iZ3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
                    int i4 = (((iZ3 & 15) << 8) | iZ4) + 3;
                    this.c = i4;
                    byte[] bArr = d0aVar2.a;
                    if (bArr.length < i4) {
                        d0aVar2.c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(d0aVar.a(), this.c - this.d);
                d0aVar.k(d0aVar2.a, this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        d0aVar2.L(i6);
                    } else {
                        if (pqf.m(0, d0aVar2.a, i6, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        d0aVar2.L(this.c - 4);
                    }
                    d0aVar2.M(0);
                    this.a.c(d0aVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.x5f
    public final void b(rye ryeVar, n95 n95Var, xg3 xg3Var) {
        this.a.b(ryeVar, n95Var, xg3Var);
        this.f = true;
    }

    @Override // defpackage.x5f
    public final void d() {
        this.f = true;
    }
}
