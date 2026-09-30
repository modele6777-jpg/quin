package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zb3 {
    public static final zb3 a;
    public static final zb3 b;
    public static final zb3 c;
    public static final zb3 d;
    public static final /* synthetic */ zb3[] e;

    static {
        zb3 zb3Var = new zb3("MEMORY_CACHE", 0);
        a = zb3Var;
        zb3 zb3Var2 = new zb3("MEMORY", 1);
        b = zb3Var2;
        zb3 zb3Var3 = new zb3("DISK", 2);
        c = zb3Var3;
        zb3 zb3Var4 = new zb3("NETWORK", 3);
        d = zb3Var4;
        e = new zb3[]{zb3Var, zb3Var2, zb3Var3, zb3Var4};
    }

    public static zb3 valueOf(String str) {
        return (zb3) Enum.valueOf(zb3.class, str);
    }

    public static zb3[] values() {
        return (zb3[]) e.clone();
    }
}
