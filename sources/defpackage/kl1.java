package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kl1 implements ll1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ kl1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ll1
    public final void b(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 1:
                ((a26) obj).d(th);
                break;
            default:
                ((ta4) obj).a();
                break;
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((a26) obj).getClass().getSimpleName() + '@' + mh3.F(this) + ']';
            default:
                return "DisposeOnCancel[" + ((ta4) obj) + ']';
        }
    }
}
