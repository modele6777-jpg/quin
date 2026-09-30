package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class ir0 implements xsc {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public ir0(long j, long j2) {
        this.a = 2;
        this.b = j;
        zsc zscVar = j2 == 0 ? zsc.c : new zsc(0L, j2);
        this.c = new wsc(zscVar, zscVar);
    }

    @Override // defpackage.xsc
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.xsc
    public final wsc f(long j) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                jr0 jr0Var = (jr0) obj;
                wsc wscVarB = jr0Var.i[0].b(j);
                while (true) {
                    pz1[] pz1VarArr = jr0Var.i;
                    if (i2 >= pz1VarArr.length) {
                        return wscVarB;
                    }
                    wsc wscVarB2 = pz1VarArr[i2].b(j);
                    if (wscVarB2.a.b < wscVarB.a.b) {
                        wscVarB = wscVarB2;
                    }
                    i2++;
                }
                break;
            case 1:
                bi5 bi5Var = (bi5) obj;
                bi5Var.k.getClass();
                w84 w84Var = bi5Var.k;
                long[] jArr = (long[]) w84Var.b;
                long[] jArr2 = (long[]) w84Var.c;
                int iD = pqf.d(jArr, pqf.i((((long) bi5Var.e) * j) / 1000000, 0L, bi5Var.j - 1), false);
                long j2 = iD == -1 ? 0L : jArr[iD];
                long j3 = iD != -1 ? jArr2[iD] : 0L;
                int i3 = bi5Var.e;
                long j4 = (j2 * 1000000) / ((long) i3);
                long j5 = this.b;
                zsc zscVar = new zsc(j4, j3 + j5);
                if (j4 == j || iD == jArr.length - 1) {
                    return new wsc(zscVar, zscVar);
                }
                int i4 = iD + 1;
                return new wsc(zscVar, new zsc((jArr[i4] * 1000000) / ((long) i3), j5 + jArr2[i4]));
            default:
                return (wsc) obj;
        }
    }

    @Override // defpackage.xsc
    public final long h() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((bi5) this.c).b();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ir0(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public /* synthetic */ ir0(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
