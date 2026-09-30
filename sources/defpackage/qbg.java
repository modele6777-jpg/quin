package defpackage;

import androidx.work.Worker;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qbg implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Worker b;

    public /* synthetic */ qbg(Worker worker, int i) {
        this.a = i;
        this.b = worker;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        Worker worker = this.b;
        switch (i) {
            case 0:
                return worker.c();
            default:
                return worker.e();
        }
    }
}
