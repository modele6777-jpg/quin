package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ax5 {
    public static final ax5 a;
    public static final ax5 b;
    public static final ax5 c;
    public static final ax5 d;
    public static final ax5 e;
    public static final /* synthetic */ ax5[] f;

    static {
        ax5 ax5Var = new ax5("NOT_PURCHASED", 0);
        a = ax5Var;
        ax5 ax5Var2 = new ax5("PURCHASED", 1);
        b = ax5Var2;
        ax5 ax5Var3 = new ax5("GENERATING", 2);
        c = ax5Var3;
        ax5 ax5Var4 = new ax5("RETRYABLE", 3);
        d = ax5Var4;
        ax5 ax5Var5 = new ax5("COMPLETED", 4);
        e = ax5Var5;
        f = new ax5[]{ax5Var, ax5Var2, ax5Var3, ax5Var4, ax5Var5};
    }

    public static ax5 valueOf(String str) {
        return (ax5) Enum.valueOf(ax5.class, str);
    }

    public static ax5[] values() {
        return (ax5[]) f.clone();
    }
}
