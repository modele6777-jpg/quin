package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class aqf extends o1 {
    public final v81 a;

    public aqf(v81 v81Var) {
        this.a = v81Var;
    }

    @Override // defpackage.o1
    public final v81 a() {
        return this.a;
    }

    @Override // defpackage.o1
    public final gu2 b() {
        return bqf.d;
    }

    @Override // defpackage.o1
    public final Object d(gu2 gu2Var) {
        c17 c17Var = (c17) gu2Var;
        c17Var.getClass();
        int i = pa7.t(c17Var.a, Boolean.TRUE) ? -1 : 1;
        Integer num = c17Var.b;
        Integer numValueOf = num != null ? Integer.valueOf(num.intValue() * i) : null;
        Integer num2 = c17Var.c;
        Integer numValueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i) : null;
        Integer num3 = c17Var.d;
        return dqf.a(numValueOf, numValueOf2, num3 != null ? Integer.valueOf(num3.intValue() * i) : null);
    }
}
