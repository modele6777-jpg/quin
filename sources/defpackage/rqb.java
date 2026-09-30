package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rqb {
    public static final rqb a;
    public static final /* synthetic */ rqb[] b;

    static {
        rqb rqbVar = new rqb("AUTOMATIC", 0);
        a = rqbVar;
        b = new rqb[]{rqbVar, new rqb("HARDWARE", 1), new rqb("SOFTWARE", 2)};
    }

    public static rqb valueOf(String str) {
        return (rqb) Enum.valueOf(rqb.class, str);
    }

    public static rqb[] values() {
        return (rqb[]) b.clone();
    }
}
