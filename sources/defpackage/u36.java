package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u36 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m88 b;

    public /* synthetic */ u36(m88 m88Var, int i) {
        this.a = i;
        this.b = m88Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.cancel(true);
                break;
            default:
                try {
                    pa7.T(this.b);
                } catch (ExecutionException e) {
                    ynb.s0().post(new jfg(16, e));
                }
                break;
        }
    }
}
