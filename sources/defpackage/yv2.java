package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yv2 {
    public static final yv2 a;
    public static final yv2 b;
    public static final yv2 c;
    public static final yv2 d;
    public static final yv2 e;
    public static final /* synthetic */ yv2[] f;

    static {
        yv2 yv2Var = new yv2("CPU_ACQUIRED", 0);
        a = yv2Var;
        yv2 yv2Var2 = new yv2("BLOCKING", 1);
        b = yv2Var2;
        yv2 yv2Var3 = new yv2("PARKING", 2);
        c = yv2Var3;
        yv2 yv2Var4 = new yv2("DORMANT", 3);
        d = yv2Var4;
        yv2 yv2Var5 = new yv2("TERMINATED", 4);
        e = yv2Var5;
        f = new yv2[]{yv2Var, yv2Var2, yv2Var3, yv2Var4, yv2Var5};
    }

    public static yv2 valueOf(String str) {
        return (yv2) Enum.valueOf(yv2.class, str);
    }

    public static yv2[] values() {
        return (yv2[]) f.clone();
    }
}
