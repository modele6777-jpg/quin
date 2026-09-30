package com.google.accompanist.drawablepainter;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import defpackage.ace;
import defpackage.ald;
import defpackage.ap;
import defpackage.c82;
import defpackage.co4;
import defpackage.cv7;
import defpackage.dec;
import defpackage.fy9;
import defpackage.lp;
import defpackage.lw7;
import defpackage.mh3;
import defpackage.mp;
import defpackage.q1c;
import defpackage.sn4;
import defpackage.uo2;
import defpackage.vl1;
import defpackage.vpb;
import defpackage.vz9;
import defpackage.ym8;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Lfy9;", "Lvpb;", "drawablepainter_release"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
public final class DrawablePainter extends fy9 implements vpb {
    public final Drawable f;
    public final vz9 g;
    public final vz9 v;
    public final ace w;

    public DrawablePainter(Drawable drawable) {
        drawable.getClass();
        this.f = drawable;
        this.g = q1c.f(0);
        lw7 lw7Var = co4.a;
        this.v = q1c.f(new ald((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : dec.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.w = new ace(new uo2(16, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.vpb
    public final void a() {
        c();
    }

    @Override // defpackage.fy9
    public final boolean b(float f) {
        this.f.setAlpha(mh3.o(ym8.L(f * 255.0f), 0, 255));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vpb
    public final void c() {
        Drawable drawable = this.f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vpb
    public final void d() {
        Drawable.Callback callback = (Drawable.Callback) this.w.getValue();
        Drawable drawable = this.f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.fy9
    public final boolean e(c82 c82Var) {
        this.f.setColorFilter(c82Var != null ? c82Var.a : null);
        return true;
    }

    @Override // defpackage.fy9
    public final void f(cv7 cv7Var) {
        int i;
        cv7Var.getClass();
        int iOrdinal = cv7Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                ap.c();
                return;
            }
        } else {
            i = 0;
        }
        this.f.setLayoutDirection(i);
    }

    @Override // defpackage.fy9
    public final long i() {
        return ((ald) this.v.getValue()).a;
    }

    @Override // defpackage.fy9
    public final void j(sn4 sn4Var) {
        sn4Var.getClass();
        vl1 vl1VarP = sn4Var.v0().p();
        ((Number) this.g.getValue()).intValue();
        try {
            vl1VarP.g();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.f;
            if (i < 28 || i >= 31 || !(drawable instanceof AnimatedImageDrawable)) {
                drawable.setBounds(0, 0, ym8.L(ald.d(sn4Var.f())), ym8.L(ald.b(sn4Var.f())));
            } else {
                vl1VarP.c(ald.d(sn4Var.f()) / ald.d(i()), ald.b(sn4Var.f()) / ald.b(i()));
            }
            Canvas canvas = mp.a;
            drawable.draw(((lp) vl1VarP).a);
        } finally {
            vl1VarP.o();
        }
    }
}
