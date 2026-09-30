package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b1g implements a1g {
    public final void a(x16 x16Var, l46 l46Var, int i) {
        x16 x16Var2;
        l46 l46Var2;
        x16Var.getClass();
        l46Var.h0(1249412510);
        if (l46Var.W(i & 1, (i & 3) != 2)) {
            Context context = (Context) l46Var.k(uq.b);
            context.getClass();
            String string = context.getString(R.string.annual_report_2025_homepage_title);
            string.getClass();
            String string2 = context.getString(R.string.annual_report_share_summary);
            string2.getClass();
            w6d w6dVar = new w6d("https://quin.love/annual-report/2025-entry?os=android&entry=share_icon", string, string2, R.drawable.annual_report_share_thumbnail, "https://quin.love/images/og/annual-2025.png");
            x16Var2 = x16Var;
            l46Var2 = l46Var;
            y8c.c(w6dVar, null, x16Var2, l46Var2, 384, 2);
        } else {
            x16Var2 = x16Var;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p4c(this, x16Var2, i, 24);
        }
    }

    public final void b(Bitmap bitmap, x16 x16Var, l46 l46Var, int i) {
        x16Var.getClass();
        l46Var.h0(81048196);
        int i2 = i | (l46Var.i(bitmap) ? 4 : 2);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            t4c.c(tm7.o(g09.a, ((e8b) l46Var.k(l8b.a)).a, g21.f), null, null, 1, 0, 0L, 0.0f, new agb(15), x16Var, af1.b0(-975839965, new wt(13, bitmap), l46Var), l46Var, 805334016, 230);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o7b(i, this, bitmap, x16Var, 20);
        }
    }
}
