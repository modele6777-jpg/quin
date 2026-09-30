package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ok5 extends gbe implements a26 {

    /* JADX INFO: renamed from: $$v$c$kotlin-time-Duration$-timeout$0, reason: not valid java name */
    final /* synthetic */ long f3$$v$c$kotlintimeDuration$timeout$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok5(long j, xn2 xn2Var) {
        super(1, xn2Var);
        this.f3$$v$c$kotlintimeDuration$timeout$0 = j;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        new ok5(this.f3$$v$c$kotlintimeDuration$timeout$0, (xn2) obj).r(wef.a);
        throw null;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jzb.q(obj);
        throw new kye("Timed out waiting for " + ((Object) ar4.i(this.f3$$v$c$kotlintimeDuration$timeout$0)), null);
    }
}
