package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class if5 implements Executor {
    public static final if5 a;
    public static final /* synthetic */ if5[] b;

    static {
        if5 if5Var = new if5("INSTANCE", 0);
        a = if5Var;
        b = new if5[]{if5Var};
    }

    public static if5 valueOf(String str) {
        return (if5) Enum.valueOf(if5.class, str);
    }

    public static if5[] values() {
        return (if5[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
