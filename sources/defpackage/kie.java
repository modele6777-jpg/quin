package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kie {
    public static final kie a;
    public static final kie b;
    public static final kie c;
    public static final /* synthetic */ kie[] d;

    static {
        kie kieVar = new kie("Idle", 0);
        a = kieVar;
        kie kieVar2 = new kie("Lifting", 1);
        b = kieVar2;
        kie kieVar3 = new kie("Merging", 2);
        c = kieVar3;
        d = new kie[]{kieVar, kieVar2, kieVar3};
    }

    public static kie valueOf(String str) {
        return (kie) Enum.valueOf(kie.class, str);
    }

    public static kie[] values() {
        return (kie[]) d.clone();
    }
}
