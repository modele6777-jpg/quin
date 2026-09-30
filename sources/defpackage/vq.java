package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vq {
    public static final vq a;
    public static final vq b;
    public static final /* synthetic */ vq[] c;

    static {
        vq vqVar = new vq("SHOW_ORIGINAL", 0);
        a = vqVar;
        vq vqVar2 = new vq("SHOW_TRANSLATED", 1);
        b = vqVar2;
        c = new vq[]{vqVar, vqVar2};
    }

    public static vq valueOf(String str) {
        return (vq) Enum.valueOf(vq.class, str);
    }

    public static vq[] values() {
        return (vq[]) c.clone();
    }
}
