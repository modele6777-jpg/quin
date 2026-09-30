package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class one {
    public static final one a;
    public static final one b;
    public static final one c;
    public static final one d;
    public static final /* synthetic */ one[] e;

    static {
        one oneVar = new one("Start", 0);
        a = oneVar;
        one oneVar2 = new one("End", 1);
        b = oneVar2;
        one oneVar3 = new one("Inner", 2);
        c = oneVar3;
        one oneVar4 = new one("NotByUser", 3);
        d = oneVar4;
        e = new one[]{oneVar, oneVar2, oneVar3, oneVar4};
    }

    public static one valueOf(String str) {
        return (one) Enum.valueOf(one.class, str);
    }

    public static one[] values() {
        return (one[]) e.clone();
    }
}
