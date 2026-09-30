package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bkg implements kn9, an9, wm9, xm9 {
    public final CountDownLatch a;

    @Override // defpackage.kn9
    public void a(Object obj) {
        this.a.countDown();
    }

    @Override // defpackage.wm9
    public void c() {
        this.a.countDown();
    }

    @Override // defpackage.xm9
    public /* synthetic */ void k(Task task) {
        this.a.countDown();
    }

    @Override // defpackage.an9
    public void r(Exception exc) {
        this.a.countDown();
    }
}
