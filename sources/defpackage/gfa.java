package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.widget.Magnifier;
import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gfa implements efa, kga {
    public static final gfa a = new gfa();
    public static final gfa b = new gfa();

    public static Typeface f(String str, ar5 ar5Var, int i) {
        if (i == 0 && pa7.t(ar5Var, ar5.w) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && pa7.t(ar5Var, ar5.z) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), ar5Var.a, i == 1);
    }

    public static void g(mn2 mn2Var, Context context, ine ineVar) {
        if (context == null) {
            return;
        }
        int i = ineVar.c;
        TextClassification textClassification = ineVar.b;
        Drawable drawable = ineVar.d;
        int i2 = 1;
        if (i < 0) {
            mn2.b(mn2Var, new z8d(8, textClassification), drawable != null ? new dd2(new ane(drawable, 0), true, -1123224187) : null, new ykc(19, context, textClassification), 6);
        } else {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            mn2.b(mn2Var, new z8d(9, remoteAction), drawable != null ? new dd2(new ane(drawable, i2), true, 1106162332) : null, new h2e(5, remoteAction), 6);
        }
    }

    @Override // defpackage.efa
    public boolean a() {
        return false;
    }

    @Override // defpackage.kga
    public Typeface b(ar5 ar5Var, int i) {
        return f(null, ar5Var, i);
    }

    @Override // defpackage.efa
    public dfa c(View view, boolean z, long j, float f, float f2, boolean z2, sw3 sw3Var, float f3) {
        return new ffa(new Magnifier(view));
    }

    @Override // defpackage.kga
    public Typeface d(o66 o66Var, ar5 ar5Var, int i) {
        return f(o66Var.f, ar5Var, i);
    }

    public void e(Drawable drawable, l46 l46Var, int i) {
        l46Var.h0(257732500);
        int i2 = (l46Var.i(drawable) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            j09 j09VarL = b.l(g09.a, nn2.e);
            boolean zI = l46Var.i(drawable);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new trd(10, drawable);
                l46Var.p0(objR);
            }
            s21.a(b21.s(j09VarL, (a26) objR), l46Var, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p4c(this, drawable, i, 15);
        }
    }
}
