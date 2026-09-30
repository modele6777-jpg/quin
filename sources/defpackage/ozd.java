package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ozd {
    public static final ozd a;
    public static final ozd b;
    public static final /* synthetic */ ozd[] c;

    static {
        ozd ozdVar = new ozd("Default", 0);
        a = ozdVar;
        ozd ozdVar2 = new ozd("Standard", 1);
        b = ozdVar2;
        c = new ozd[]{ozdVar, ozdVar2};
    }

    public static ozd valueOf(String str) {
        return (ozd) Enum.valueOf(ozd.class, str);
    }

    public static ozd[] values() {
        return (ozd[]) c.clone();
    }
}
