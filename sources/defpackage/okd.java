package defpackage;

import com.adjust.sdk.AdjustFactory;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class okd implements RejectedExecutionHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ okd(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), str);
                break;
            default:
                AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), str);
                break;
        }
    }
}
