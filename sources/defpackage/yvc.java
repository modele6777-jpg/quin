package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yvc implements q26 {
    public final /* synthetic */ fwc a;

    @Override // defpackage.q26
    public final Object w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        bv7 bv7Var = (bv7) obj2;
        long j = ((hl9) obj3).a;
        fwc fwcVar = this.a;
        long jB = fwcVar.b(bv7Var, j);
        long jB2 = fwcVar.b(bv7Var, ((hl9) obj4).a);
        fwcVar.o(zBooleanValue);
        return Boolean.valueOf(fwcVar.t(jB, jB2, ((Boolean) obj5).booleanValue(), (wuc) obj6));
    }
}
