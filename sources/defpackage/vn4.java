package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vn4 extends CharacterStyle implements UpdateAppearance {
    public final un4 a;

    public vn4(un4 un4Var) {
        this.a = un4Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            oe5 oe5Var = oe5.a;
            un4 un4Var = this.a;
            if (pa7.t(un4Var, oe5Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(un4Var instanceof d5e)) {
                ap.c();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            d5e d5eVar = (d5e) un4Var;
            textPaint.setStrokeWidth(d5eVar.a);
            textPaint.setStrokeMiter(d5eVar.b);
            int i = d5eVar.d;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = d5eVar.c;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            au auVar = d5eVar.e;
            textPaint.setPathEffect(auVar != null ? auVar.a : null);
        }
    }
}
