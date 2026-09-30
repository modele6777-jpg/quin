package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d94 implements Executor {
    public static final d94 a;
    public static final /* synthetic */ d94[] b;

    static {
        d94 d94Var = new d94("INSTANCE", 0);
        a = d94Var;
        b = new d94[]{d94Var};
    }

    public static d94 valueOf(String str) {
        return (d94) Enum.valueOf(d94.class, str);
    }

    public static d94[] values() {
        return (d94[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
