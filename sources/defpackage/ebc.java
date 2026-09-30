package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ebc {
    public final z9c a;
    public boolean b;
    public boolean c;
    public final Paint d;
    public final Paint e;
    public v79 f;
    public v79 g;
    public boolean h;

    public ebc(ebc ebcVar) {
        this.b = ebcVar.b;
        this.c = ebcVar.c;
        this.d = new Paint(ebcVar.d);
        this.e = new Paint(ebcVar.e);
        v79 v79Var = ebcVar.f;
        if (v79Var != null) {
            this.f = new v79(v79Var);
        }
        v79 v79Var2 = ebcVar.g;
        if (v79Var2 != null) {
            this.g = new v79(v79Var2);
        }
        this.h = ebcVar.h;
        try {
            this.a = (z9c) ebcVar.a.clone();
        } catch (CloneNotSupportedException e) {
            b1.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.a = z9c.a();
        }
    }

    public ebc() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.a = z9c.a();
    }
}
