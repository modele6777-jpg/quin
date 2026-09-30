package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kfg {
    public final HashSet a = new HashSet();
    public final Handler b = new Handler(Looper.getMainLooper());

    static {
        kv2.h(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("AssetPackStateListenerRegistryV2");
    }
}
