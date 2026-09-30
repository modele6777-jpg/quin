package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yzb {
    public static final yzb a;
    public static final /* synthetic */ yzb[] b;

    static {
        yzb yzbVar = new yzb("MustUse", 0);
        a = yzbVar;
        b = new yzb[]{yzbVar, new yzb("ExplicitlyIgnorable", 1), new yzb("Unspecified", 2)};
    }

    public static yzb valueOf(String str) {
        return (yzb) Enum.valueOf(yzb.class, str);
    }

    public static yzb[] values() {
        return (yzb[]) b.clone();
    }
}
