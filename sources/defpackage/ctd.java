package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ctd {
    public static final ctd a;
    public static final ctd b;
    public static final ctd c;
    public static final /* synthetic */ ctd[] d;

    static {
        ctd ctdVar = new ctd("Past", 0);
        a = ctdVar;
        ctd ctdVar2 = new ctd("Current", 1);
        b = ctdVar2;
        ctd ctdVar3 = new ctd("Future", 2);
        c = ctdVar3;
        d = new ctd[]{ctdVar, ctdVar2, ctdVar3};
    }

    public static ctd valueOf(String str) {
        return (ctd) Enum.valueOf(ctd.class, str);
    }

    public static ctd[] values() {
        return (ctd[]) d.clone();
    }
}
