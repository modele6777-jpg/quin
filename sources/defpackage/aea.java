package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aea {
    public static final aea a;
    public static final aea b;
    public static final /* synthetic */ aea[] c;

    static {
        aea aeaVar = new aea("UNCHANGED", 0);
        a = aeaVar;
        aea aeaVar2 = new aea("TRANSLUCENT", 1);
        aea aeaVar3 = new aea("OPAQUE", 2);
        b = aeaVar3;
        c = new aea[]{aeaVar, aeaVar2, aeaVar3};
    }

    public static aea valueOf(String str) {
        return (aea) Enum.valueOf(aea.class, str);
    }

    public static aea[] values() {
        return (aea[]) c.clone();
    }
}
