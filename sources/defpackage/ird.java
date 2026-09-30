package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ird {
    public ord a;
    public long b;
    public boolean c;
    public int d;

    public ird(long j, ord ordVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = ordVar;
        this.b = j;
        znd zndVar = qrd.a;
        if (j != 0) {
            ord ordVarD = d();
            long j2 = ordVarD.c;
            long[] jArr = ordVarD.d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = ordVarD.b;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = ordVarD.a;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (qrd.c) {
                iA = qrd.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(ird irdVar) {
        qrd.b.A(irdVar);
    }

    public final void a() {
        synchronized (qrd.c) {
            b();
            p();
        }
    }

    public void b() {
        qrd.d = qrd.d.d(g());
    }

    public abstract void c();

    public ord d() {
        return this.a;
    }

    public abstract a26 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract a26 i();

    public final ird j() {
        psd psdVar = qrd.b;
        ird irdVar = (ird) psdVar.get();
        psdVar.A(this);
        return irdVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(c1e c1eVar);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            qrd.t(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(ord ordVar) {
        this.a = ordVar;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract ird u(a26 a26Var);
}
