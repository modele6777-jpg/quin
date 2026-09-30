package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lt4 extends mh3 {
    public final /* synthetic */ mh3 O;
    public final /* synthetic */ ThreadPoolExecutor P;

    public lt4(mh3 mh3Var, ThreadPoolExecutor threadPoolExecutor) {
        this.O = mh3Var;
        this.P = threadPoolExecutor;
    }

    @Override // defpackage.mh3
    public final void O(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.P;
        try {
            this.O.O(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.mh3
    public final void P(szc szcVar) {
        ThreadPoolExecutor threadPoolExecutor = this.P;
        try {
            this.O.P(szcVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
