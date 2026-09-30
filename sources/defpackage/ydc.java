package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ydc {
    public static final ydc a;
    public static final ydc b;
    public static final ydc c;
    public static final ydc d;
    public static final ydc e;
    public static final /* synthetic */ ydc[] f;

    static {
        ydc ydcVar = new ydc("TopBar", 0);
        a = ydcVar;
        ydc ydcVar2 = new ydc("MainContent", 1);
        b = ydcVar2;
        ydc ydcVar3 = new ydc("Snackbar", 2);
        c = ydcVar3;
        ydc ydcVar4 = new ydc("Fab", 3);
        d = ydcVar4;
        ydc ydcVar5 = new ydc("BottomBar", 4);
        e = ydcVar5;
        f = new ydc[]{ydcVar, ydcVar2, ydcVar3, ydcVar4, ydcVar5};
    }

    public static ydc valueOf(String str) {
        return (ydc) Enum.valueOf(ydc.class, str);
    }

    public static ydc[] values() {
        return (ydc[]) f.clone();
    }
}
