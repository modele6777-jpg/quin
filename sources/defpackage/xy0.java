package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xy0 implements aw2 {
    public final sz2 E0;
    public final Bitmap.CompressFormat F0;
    public final int G0;
    public final Uri H0;
    public rg7 I0;
    public final int X;
    public final boolean Y;
    public final boolean Z;
    public final Context a;
    public final WeakReference b;
    public final Uri c;
    public final Bitmap d;
    public final float[] e;
    public final int f;
    public final int g;
    public final int v;
    public final boolean w;
    public final int x;
    public final int y;
    public final int z;

    public xy0(Context context, WeakReference weakReference, Uri uri, Bitmap bitmap, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, sz2 sz2Var, Bitmap.CompressFormat compressFormat, int i8, Uri uri2) {
        fArr.getClass();
        sz2Var.getClass();
        compressFormat.getClass();
        this.a = context;
        this.b = weakReference;
        this.c = uri;
        this.d = bitmap;
        this.e = fArr;
        this.f = i;
        this.g = i2;
        this.v = i3;
        this.w = z;
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.X = i7;
        this.Y = z2;
        this.Z = z3;
        this.E0 = sz2Var;
        this.F0 = compressFormat;
        this.G0 = i8;
        this.H0 = uri2;
        this.I0 = tq.d();
    }

    public final Object a(ty0 ty0Var, gbe gbeVar) {
        js3 js3Var = ga4.a;
        Object objP0 = ynb.p0(mk8.a, new uy0(this, ty0Var, null), gbeVar);
        return objP0 == bw2.a ? objP0 : wef.a;
    }

    @Override // defpackage.aw2
    public final pv2 getCoroutineContext() {
        js3 js3Var = ga4.a;
        wg6 wg6Var = mk8.a;
        rg7 rg7Var = this.I0;
        wg6Var.getClass();
        return i7h.I(wg6Var, rg7Var);
    }
}
