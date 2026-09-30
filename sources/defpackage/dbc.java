package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dbc extends fbc {
    public final /* synthetic */ int a;
    public float b;
    public final float c;
    public final /* synthetic */ hbc d;
    public final Object e;

    public dbc(hbc hbcVar, float f, float f2) {
        this.a = 1;
        this.d = hbcVar;
        this.e = new RectF();
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.fbc
    public final boolean g(sac sacVar) {
        switch (this.a) {
            case 0:
                if (!(sacVar instanceof tac)) {
                    return true;
                }
                b1.l("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                return false;
            default:
                if (!(sacVar instanceof tac)) {
                    return true;
                }
                tac tacVar = (tac) sacVar;
                fac facVarT = sacVar.a.t(tacVar.n);
                if (facVarT == null) {
                    hbc.L("TextPath path reference '%s' not found", tacVar.n);
                    return false;
                }
                r9c r9cVar = (r9c) facVarT;
                abc abcVar = new abc(r9cVar.o);
                Matrix matrix = r9cVar.n;
                Path path = abcVar.a;
                if (matrix != null) {
                    path.transform(matrix);
                }
                RectF rectF = new RectF();
                path.computeBounds(rectF, true);
                ((RectF) this.e).union(rectF);
                return false;
        }
    }

    @Override // defpackage.fbc
    public final void j(String str) {
        String str2;
        int i = this.a;
        Object obj = this.e;
        hbc hbcVar = this.d;
        switch (i) {
            case 0:
                if (hbcVar.T0()) {
                    Path path = new Path();
                    str2 = str;
                    ((ebc) hbcVar.c).d.getTextPath(str2, 0, str.length(), this.b, this.c, path);
                    ((Path) obj).addPath(path);
                } else {
                    str2 = str;
                }
                this.b = ((ebc) hbcVar.c).d.measureText(str2) + this.b;
                break;
            default:
                if (hbcVar.T0()) {
                    Rect rect = new Rect();
                    ((ebc) hbcVar.c).d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.b, this.c);
                    ((RectF) obj).union(rectF);
                }
                this.b = ((ebc) hbcVar.c).d.measureText(str) + this.b;
                break;
        }
    }

    public dbc(hbc hbcVar, float f, float f2, Path path) {
        this.a = 0;
        this.d = hbcVar;
        this.b = f;
        this.c = f2;
        this.e = path;
    }
}
