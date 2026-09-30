package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fw implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ gw b;

    public /* synthetic */ fw(int i, gw gwVar) {
        this.a = i;
        this.b = gwVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i;
        int i2;
        int i3 = 0;
        while (true) {
            i = this.a;
            i2 = 10;
            if (i3 >= 10) {
                break;
            }
            if (i >= iw.a[i3]) {
                i2 = i3 + 1;
                break;
            }
            i3++;
        }
        Thread threadNewThread = this.b.newThread(new hw(i, runnable));
        threadNewThread.setPriority(i2);
        return threadNewThread;
    }
}
