package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pcg implements d58, v26 {
    public final /* synthetic */ lg2 a;

    public pcg(lg2 lg2Var) {
        this.a = lg2Var;
    }

    @Override // defpackage.v26
    public final m26 b() {
        return new h36(1, 0, lg2.class, this.a, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d58) && (obj instanceof v26)) {
            return b().equals(((v26) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
