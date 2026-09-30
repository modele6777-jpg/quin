package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vc extends fs8 {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ yc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(yc ycVar, Context context, k6e k6eVar, View view) {
        super(context, k6eVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = ycVar;
        if ((k6eVar.A.x & 32) != 32) {
            View view2 = ycVar.w;
            this.e = view2 == null ? (View) ycVar.v : view2;
        }
        vd9 vd9Var = ycVar.L0;
        this.h = vd9Var;
        ds8 ds8Var = this.i;
        if (ds8Var != null) {
            ds8Var.g(vd9Var);
        }
    }

    @Override // defpackage.fs8
    public final void c() {
        int i = this.l;
        yc ycVar = this.m;
        switch (i) {
            case 0:
                ycVar.I0 = null;
                super.c();
                break;
            default:
                qr8 qr8Var = ycVar.c;
                if (qr8Var != null) {
                    qr8Var.c(true);
                }
                ycVar.H0 = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(yc ycVar, Context context, qr8 qr8Var, View view) {
        super(context, qr8Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = ycVar;
        this.f = 8388613;
        vd9 vd9Var = ycVar.L0;
        this.h = vd9Var;
        ds8 ds8Var = this.i;
        if (ds8Var != null) {
            ds8Var.g(vd9Var);
        }
    }
}
