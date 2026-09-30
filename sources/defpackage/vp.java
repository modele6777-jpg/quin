package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vp implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Class cls = AndroidComposeView.X1;
                AndroidComposeView outOfFrameExecutor = ((AndroidComposeView) obj).getOutOfFrameExecutor();
                if (outOfFrameExecutor != null) {
                    outOfFrameExecutor.E(new hl(0, runnable, Runnable.class, "run", "run()V", 0, 2));
                }
                break;
            case 1:
                ((jce) obj).e(runnable);
                break;
            default:
                lkf lkfVar = (lkf) obj;
                lkfVar.c.execute(new xu8(24, lkfVar, runnable));
                break;
        }
    }
}
