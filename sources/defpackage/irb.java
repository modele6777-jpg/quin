package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class irb {
    public static final hrb a;
    public static final grb b;
    public static final /* synthetic */ irb[] c;

    static {
        hrb hrbVar = new hrb();
        a = hrbVar;
        grb grbVar = new grb();
        b = grbVar;
        c = new irb[]{hrbVar, grbVar};
    }

    public static irb valueOf(String str) {
        return (irb) Enum.valueOf(irb.class, str);
    }

    public static irb[] values() {
        return (irb[]) c.clone();
    }

    public abstract String a(String str);
}
