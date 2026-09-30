package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class px2 implements yn2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Callable b;

    public /* synthetic */ px2(Callable callable, int i) {
        this.a = i;
        this.b = callable;
    }

    @Override // defpackage.yn2
    public final Object h(Task task) {
        int i = this.a;
        Callable callable = this.b;
        switch (i) {
            case 0:
                return CrashlyticsWorker.lambda$submit$0(callable, task);
            case 1:
                return CrashlyticsWorker.lambda$submitTask$2(callable, task);
            case 2:
                return CrashlyticsWorker.lambda$submitTask$3(callable, task);
            default:
                return CrashlyticsWorker.lambda$submitTaskOnSuccess$4(callable, task);
        }
    }
}
