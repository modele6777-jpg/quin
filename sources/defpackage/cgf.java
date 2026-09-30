package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cgf implements tc5 {
    public final agf a;
    public final int b;
    public final Integer c;
    public final int d;

    public cgf(agf agfVar, int i, Integer num) {
        agfVar.getClass();
        this.a = agfVar;
        this.b = i;
        this.c = num;
        int i2 = agfVar.g;
        this.d = i2;
        if (i < 0) {
            qc0.o(tec.f(i, "The minimum number of digits (", ") is negative"));
            throw null;
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i2 + ") is less than the minimum number of digits (" + i + ')').toString());
        }
        if (num == null || num.intValue() > i) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i + ')').toString());
    }

    @Override // defpackage.tc5
    public final as5 a() {
        sid sidVar = new sid(new dne(1, this.a.a, txa.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0, 4), this.b);
        Integer num = this.c;
        return num != null ? new sid(sidVar, num.intValue()) : sidVar;
    }

    @Override // defpackage.tc5
    public final n0a b() {
        Integer numValueOf = Integer.valueOf(this.b);
        Integer numValueOf2 = Integer.valueOf(this.d);
        agf agfVar = this.a;
        return oa7.c0(numValueOf, numValueOf2, this.c, agfVar.a, agfVar.d, false);
    }

    @Override // defpackage.tc5
    public final /* bridge */ /* synthetic */ q1 c() {
        return this.a;
    }
}
