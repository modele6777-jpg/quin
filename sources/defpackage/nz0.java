package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nz0 extends h36 implements a26 {
    public static final nz0 a = new nz0(1, Bitmap.class, "recycle", "recycle()V", 0);

    @Override // defpackage.a26
    public final Object d(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        bitmap.recycle();
        return wef.a;
    }
}
