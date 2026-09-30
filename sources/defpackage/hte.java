package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hte {
    public static final hte a;
    public static final hte b;
    public static final hte c;
    public static final hte d;
    public static final /* synthetic */ hte[] e;

    static {
        hte hteVar = new hte("StartInput", 0);
        a = hteVar;
        hte hteVar2 = new hte("StopInput", 1);
        b = hteVar2;
        hte hteVar3 = new hte("ShowKeyboard", 2);
        c = hteVar3;
        hte hteVar4 = new hte("HideKeyboard", 3);
        d = hteVar4;
        e = new hte[]{hteVar, hteVar2, hteVar3, hteVar4};
    }

    public static hte valueOf(String str) {
        return (hte) Enum.valueOf(hte.class, str);
    }

    public static hte[] values() {
        return (hte[]) e.clone();
    }
}
