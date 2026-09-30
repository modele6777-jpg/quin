package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gr3 implements tn8 {
    public final /* synthetic */ int a;
    public final tn8 b;
    public final Enum c;
    public final Enum d;

    public /* synthetic */ gr3(tn8 tn8Var, Enum r2, Enum r3, int i) {
        this.a = i;
        this.b = tn8Var;
        this.c = r2;
        this.d = r3;
    }

    @Override // defpackage.tn8
    public final Object E() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b.E();
    }

    @Override // defpackage.tn8
    public final int V(int i) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b.V(i);
    }

    @Override // defpackage.tn8
    public final int b(int i) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b.b(i);
    }

    @Override // defpackage.tn8
    public final int n(int i) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b.n(i);
    }

    @Override // defpackage.tn8
    public final int q(int i) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b.q(i);
    }

    @Override // defpackage.tn8
    public final cea v(long j) {
        int i = this.a;
        Enum r1 = this.c;
        Enum r2 = this.d;
        tn8 tn8Var = this.b;
        switch (i) {
            case 0:
                la7 la7Var = (la7) r2;
                ha7 ha7Var = (ha7) r1;
                ha7 ha7Var2 = ha7.b;
                if (la7Var == la7.a) {
                    return new vh5(ha7Var == ha7Var2 ? tn8Var.q(kl2.g(j)) : tn8Var.n(kl2.g(j)), kl2.c(j) ? kl2.g(j) : 32767, 0);
                }
                return new vh5(kl2.d(j) ? kl2.h(j) : 32767, ha7Var == ha7Var2 ? tn8Var.b(kl2.h(j)) : tn8Var.V(kl2.h(j)), 0);
            case 1:
                mo8 mo8Var = (mo8) r2;
                lo8 lo8Var = (lo8) r1;
                lo8 lo8Var2 = lo8.b;
                if (mo8Var == mo8.a) {
                    return new vh5(lo8Var == lo8Var2 ? tn8Var.q(kl2.g(j)) : tn8Var.n(kl2.g(j)), kl2.c(j) ? kl2.g(j) : 32767, 1);
                }
                return new vh5(kl2.d(j) ? kl2.h(j) : 32767, lo8Var == lo8Var2 ? tn8Var.b(kl2.h(j)) : tn8Var.V(kl2.h(j)), 1);
            default:
                cg9 cg9Var = (cg9) r2;
                bg9 bg9Var = (bg9) r1;
                bg9 bg9Var2 = bg9.b;
                if (cg9Var == cg9.a) {
                    return new vh5(bg9Var == bg9Var2 ? tn8Var.q(kl2.g(j)) : tn8Var.n(kl2.g(j)), kl2.c(j) ? kl2.g(j) : 32767, 2);
                }
                return new vh5(kl2.d(j) ? kl2.h(j) : 32767, bg9Var == bg9Var2 ? tn8Var.b(kl2.h(j)) : tn8Var.V(kl2.h(j)), 2);
        }
    }
}
