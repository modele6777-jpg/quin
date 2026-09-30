package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gt2 implements xj5, v26 {
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        return bsa.n(xqa.d.a, (String) obj, xn2Var);
    }

    @Override // defpackage.v26
    public final m26 b() {
        return new h36(2, 0, rp9.class, rp9.a, "updateQuestion", "updateQuestion(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xj5) && (obj instanceof v26)) {
            return b().equals(((v26) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
