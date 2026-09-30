package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t27 {
    public static final /* synthetic */ t27[] a = {new t27("Primary", 0), new t27("Secondary", 1), new t27("Success", 2), new t27("Danger", 3), new t27("Warning", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    t27 EF5;

    public static t27 valueOf(String str) {
        return (t27) Enum.valueOf(t27.class, str);
    }

    public static t27[] values() {
        return (t27[]) a.clone();
    }
}
