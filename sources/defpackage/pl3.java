package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pl3 {
    public static final pl3 a;
    public static final pl3 b;
    public static final pl3 c;
    public static final /* synthetic */ pl3[] d;

    static {
        pl3 pl3Var = new pl3("UnlockedDownloaded", 0);
        a = pl3Var;
        pl3 pl3Var2 = new pl3("UnlockedNotDownloaded", 1);
        b = pl3Var2;
        pl3 pl3Var3 = new pl3("Locked", 2);
        c = pl3Var3;
        d = new pl3[]{pl3Var, pl3Var2, pl3Var3};
    }

    public static pl3 valueOf(String str) {
        return (pl3) Enum.valueOf(pl3.class, str);
    }

    public static pl3[] values() {
        return (pl3[]) d.clone();
    }
}
