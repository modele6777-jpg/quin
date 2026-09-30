package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ht0 {
    public static final /* synthetic */ ht0[] a = {new ht0("PRESENT", 0), new ht0("ABSENT", 1), new ht0("PRESENT_OPTIONAL", 2), new ht0("ABSENT_OPTIONAL", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ht0 EF5;

    public static ht0 valueOf(String str) {
        return (ht0) Enum.valueOf(ht0.class, str);
    }

    public static ht0[] values() {
        return (ht0[]) a.clone();
    }
}
