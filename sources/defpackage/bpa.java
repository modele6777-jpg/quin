package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bpa {
    public static final bpa a;
    public static final bpa b;
    public static final /* synthetic */ bpa[] c;

    static {
        bpa bpaVar = new bpa("EXACT", 0);
        a = bpaVar;
        bpa bpaVar2 = new bpa("INEXACT", 1);
        b = bpaVar2;
        c = new bpa[]{bpaVar, bpaVar2};
    }

    public static bpa valueOf(String str) {
        return (bpa) Enum.valueOf(bpa.class, str);
    }

    public static bpa[] values() {
        return (bpa[]) c.clone();
    }
}
