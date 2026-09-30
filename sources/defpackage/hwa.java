package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hwa {
    public static final hwa a;
    public static final hwa b;
    public static final /* synthetic */ hwa[] c;

    static {
        hwa hwaVar = new hwa("Subscription", 0);
        a = hwaVar;
        hwa hwaVar2 = new hwa("InAppPurchase", 1);
        b = hwaVar2;
        c = new hwa[]{hwaVar, hwaVar2};
    }

    public static hwa valueOf(String str) {
        return (hwa) Enum.valueOf(hwa.class, str);
    }

    public static hwa[] values() {
        return (hwa[]) c.clone();
    }
}
