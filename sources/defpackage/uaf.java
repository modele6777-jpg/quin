package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uaf implements Executor {
    public static final uaf a;
    public static final Handler b;
    public static final /* synthetic */ uaf[] c;

    static {
        uaf uafVar = new uaf("INSTANCE", 0);
        a = uafVar;
        c = new uaf[]{uafVar};
        b = new Handler(Looper.getMainLooper());
    }

    public static uaf valueOf(String str) {
        return (uaf) Enum.valueOf(uaf.class, str);
    }

    public static uaf[] values() {
        return (uaf[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
