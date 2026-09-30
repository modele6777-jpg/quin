package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ued {
    public static final ued a;
    public static final ued b;
    public static final ued c;
    public static final /* synthetic */ ued[] d;

    static {
        ued uedVar = new ued("Hidden", 0);
        a = uedVar;
        ued uedVar2 = new ued("Expanded", 1);
        b = uedVar2;
        ued uedVar3 = new ued("PartiallyExpanded", 2);
        c = uedVar3;
        d = new ued[]{uedVar, uedVar2, uedVar3};
    }

    public static ued valueOf(String str) {
        return (ued) Enum.valueOf(ued.class, str);
    }

    public static ued[] values() {
        return (ued[]) d.clone();
    }
}
