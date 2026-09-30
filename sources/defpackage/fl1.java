package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fl1 implements co5 {
    public static final fl1 a = new fl1();
    public static Boolean b;

    @Override // defpackage.co5
    public final boolean a() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw kv2.d("canFocus is read before it is written");
    }

    @Override // defpackage.co5
    public final void c(boolean z) {
        b = Boolean.valueOf(z);
    }
}
