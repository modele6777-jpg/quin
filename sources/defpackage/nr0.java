package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nr0 extends hg7 {
    public static final /* synthetic */ long v = ud0.a.objectFieldOffset(nr0.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;
    public final pl1 e;
    public ta4 f;
    public final /* synthetic */ pr0 g;

    public nr0(pr0 pr0Var, pl1 pl1Var) {
        this.g = pr0Var;
        this.e = pl1Var;
    }

    @Override // defpackage.hg7
    public final boolean m() {
        return false;
    }

    @Override // defpackage.hg7
    public final void n(Throwable th) {
        pl1 pl1Var = this.e;
        if (th != null) {
            ig4 ig4VarH = pl1Var.H(new eb2(th, false), null);
            if (ig4VarH != null) {
                pl1Var.q(ig4VarH);
                or0 or0Var = (or0) ud0.a.getObjectVolatile(this, v);
                if (or0Var != null) {
                    or0Var.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = pr0.b;
        pr0 pr0Var = this.g;
        if (atomicIntegerFieldUpdater.decrementAndGet(pr0Var) == 0) {
            nu3[] nu3VarArr = pr0Var.a;
            ArrayList arrayList = new ArrayList(nu3VarArr.length);
            for (nu3 nu3Var : nu3VarArr) {
                arrayList.add(nu3Var.l());
            }
            pl1Var.g(arrayList);
        }
    }
}
