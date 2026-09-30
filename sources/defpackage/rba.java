package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rba extends gbe implements n26 {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) throws Throwable {
        rba rbaVar = new rba(3, (xn2) obj3);
        rbaVar.L$0 = (Throwable) obj2;
        rbaVar.r(wef.a);
        throw null;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Throwable th = (Throwable) this.L$0;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jzb.q(obj);
        ynb.h0(th);
        throw nzc.b(th);
    }
}
