package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yhd {
    public static final yhd a;
    public static final yhd b;
    public static final yhd c;
    public static final /* synthetic */ yhd[] d;

    static {
        yhd yhdVar = new yhd("Pending", 0);
        a = yhdVar;
        yhd yhdVar2 = new yhd("HandedOff", 1);
        b = yhdVar2;
        yhd yhdVar3 = new yhd("Skipped", 2);
        c = yhdVar3;
        d = new yhd[]{yhdVar, yhdVar2, yhdVar3};
    }

    public static yhd valueOf(String str) {
        return (yhd) Enum.valueOf(yhd.class, str);
    }

    public static yhd[] values() {
        return (yhd[]) d.clone();
    }
}
