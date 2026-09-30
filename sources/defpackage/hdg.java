package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hdg extends o1 {
    public final v81 a;

    public hdg(v81 v81Var) {
        this.a = v81Var;
    }

    @Override // defpackage.o1
    public final v81 a() {
        return this.a;
    }

    @Override // defpackage.o1
    public final gu2 b() {
        return idg.a;
    }

    @Override // defpackage.o1
    public final Object d(gu2 gu2Var) {
        d17 d17Var = (d17) gu2Var;
        d17Var.getClass();
        Integer num = d17Var.a;
        idg.a(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = d17Var.b;
        idg.a(num2, "monthNumber");
        return new bdg(iIntValue, num2.intValue());
    }
}
