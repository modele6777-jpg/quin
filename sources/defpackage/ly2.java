package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface ly2 {
    boolean isAvailableOnDevice();

    void onGetCredential(Context context, e76 e76Var, CancellationSignal cancellationSignal, Executor executor, iy2 iy2Var);
}
