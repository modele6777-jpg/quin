package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class iv2 extends gu7 implements a26 {
    final /* synthetic */ la1 $completer;
    final /* synthetic */ nu3 $this_asListenableFuture;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv2(la1 la1Var, pu3 pu3Var) {
        super(1);
        this.$completer = la1Var;
        this.$this_asListenableFuture = pu3Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        Throwable th = (Throwable) obj;
        la1 la1Var = this.$completer;
        if (th == null) {
            la1Var.b(this.$this_asListenableFuture.l());
        } else if (th instanceof CancellationException) {
            la1Var.c();
        } else {
            la1Var.d(th);
        }
        return wef.a;
    }
}
