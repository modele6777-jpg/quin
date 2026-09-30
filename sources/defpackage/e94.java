package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e94 implements Executor {
    public static final e94 a;
    public static final /* synthetic */ e94[] b;

    static {
        e94 e94Var = new e94("INSTANCE", 0);
        a = e94Var;
        b = new e94[]{e94Var};
    }

    public static e94 valueOf(String str) {
        return (e94) Enum.valueOf(e94.class, str);
    }

    public static e94[] values() {
        return (e94[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
