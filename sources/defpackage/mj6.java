package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mj6 implements l95 {
    public n95 b;
    public m95 c;
    public zy1 d;
    public q49 e;
    public int g;
    public long h;
    public int i;
    public final d0a a = new d0a(16);
    public long j = -1;
    public int f = 0;

    @Override // defpackage.l95
    public final void a() {
        q49 q49Var = this.e;
        if (q49Var != null) {
            q49Var.getClass();
            this.e = null;
        }
    }

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        return an1.P(m95Var, true);
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        if (j != 0) {
            if (this.f == 3) {
                q49 q49Var = this.e;
                q49Var.getClass();
                q49Var.c(j, j2);
                return;
            }
            return;
        }
        this.f = 0;
        this.i = 0;
        this.j = -1L;
        if (this.e != null) {
            this.e = null;
        }
    }

    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) throws l0a {
        while (true) {
            int i = this.f;
            if (i == 0) {
                int i2 = this.i;
                d0a d0aVar = this.a;
                if (i2 == 0) {
                    if (!m95Var.a(d0aVar.a, 0, 8, true)) {
                        n95 n95Var = this.b;
                        n95Var.getClass();
                        n95Var.j();
                        this.b.q(new ir0(-9223372036854775807L));
                        this.f = 4;
                        return -1;
                    }
                    this.i = 8;
                    d0aVar.M(0);
                    this.h = d0aVar.B();
                    this.g = d0aVar.m();
                }
                if (this.h == 1) {
                    m95Var.readFully(d0aVar.a, 8, 8);
                    this.i += 8;
                    this.h = d0aVar.F();
                }
                if (this.g == 1836086884) {
                    long position = m95Var.getPosition();
                    this.j = position;
                    long j = this.i;
                    q39 q39Var = new q39(0L, position - j, -9223372036854775807L, position, this.h - j);
                    n95 n95Var2 = this.b;
                    n95Var2.getClass();
                    k1f k1fVarN = n95Var2.n(UserMetadata.MAX_ATTRIBUTE_SIZE, 4);
                    qr5 qr5Var = new qr5();
                    qr5Var.n = qv8.l("image/heic");
                    qr5Var.l = new su8(q39Var);
                    k1fVarN.g(new rr5(qr5Var));
                    this.f = 2;
                } else {
                    this.f = 1;
                }
            } else if (i == 1) {
                m95Var.l((int) (this.h - ((long) this.i)));
                this.i = 0;
                this.f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return -1;
                        }
                        r3.l();
                        return 0;
                    }
                    if (this.d == null || m95Var != this.c) {
                        this.c = m95Var;
                        this.d = new zy1(m95Var, this.j);
                    }
                    q49 q49Var = this.e;
                    q49Var.getClass();
                    int iE = q49Var.e(this.d, d82Var);
                    if (iE == 1) {
                        d82Var.b += this.j;
                    }
                    return iE;
                }
                if (this.e == null) {
                    this.e = new q49(d8e.V, 8);
                }
                zy1 zy1Var = new zy1(m95Var, this.j);
                this.d = zy1Var;
                if (this.e.b(zy1Var)) {
                    q49 q49Var2 = this.e;
                    long j2 = this.j;
                    n95 n95Var3 = this.b;
                    n95Var3.getClass();
                    q49Var2.f(new zy1(j2, n95Var3, 5));
                    this.f = 3;
                } else {
                    n95 n95Var4 = this.b;
                    n95Var4.getClass();
                    n95Var4.j();
                    this.b.q(new ir0(-9223372036854775807L));
                    this.f = 4;
                }
            }
        }
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        this.b = n95Var;
    }
}
