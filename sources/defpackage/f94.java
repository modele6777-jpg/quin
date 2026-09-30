package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f94 implements Executor {
    public static final f94 a;
    public static final /* synthetic */ f94[] b;

    static {
        f94 f94Var = new f94("INSTANCE", 0);
        a = f94Var;
        b = new f94[]{f94Var};
    }

    public static f94 valueOf(String str) {
        return (f94) Enum.valueOf(f94.class, str);
    }

    public static f94[] values() {
        return (f94[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
