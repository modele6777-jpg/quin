package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kkd implements l95 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public n95 f;
    public k1f g;

    public kkd(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        int i = this.b;
        int i2 = this.a;
        pa7.J((i2 == -1 || i == -1) ? false : true);
        d0a d0aVar = new d0a(i);
        ((rq3) m95Var).d(d0aVar.a, 0, i, false);
        return d0aVar.G() == i2;
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            r3.l();
            return 0;
        }
        k1f k1fVar = this.g;
        k1fVar.getClass();
        int iC = k1fVar.c(m95Var, UserMetadata.MAX_ATTRIBUTE_SIZE, true);
        if (iC != -1) {
            this.d += iC;
            return 0;
        }
        this.e = 2;
        this.g.a(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        this.f = n95Var;
        k1f k1fVarN = n95Var.n(UserMetadata.MAX_ATTRIBUTE_SIZE, 4);
        this.g = k1fVarN;
        qr5 qr5Var = new qr5();
        String str = this.c;
        qr5Var.n = qv8.l(str);
        qr5Var.o = qv8.l(str);
        k1fVarN.g(new rr5(qr5Var));
        this.f.j();
        this.f.q(new lkd());
        this.e = 1;
    }

    @Override // defpackage.l95
    public final void a() {
    }
}
