package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bi7 implements li7 {
    public static final bi7 b = new bi7(true);
    public static final bi7 c = new bi7(false);
    public final boolean a;

    public bi7(boolean z) {
        this.a = z;
    }

    @Override // defpackage.li7
    public final int a() {
        return 3;
    }

    @Override // defpackage.li7
    public final Object getValue() {
        return Boolean.valueOf(this.a);
    }
}
