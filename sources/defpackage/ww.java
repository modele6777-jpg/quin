package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ww extends h72 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ViewGroup d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ww(ViewGroup viewGroup, int i) {
        super(1);
        this.c = i;
        this.d = viewGroup;
    }

    @Override // defpackage.h72
    public final h8g f(h8g h8gVar, List list) {
        int i = this.c;
        ViewGroup viewGroup = this.d;
        switch (i) {
            case 0:
                return ((uvf) viewGroup).k(h8gVar);
            default:
                o84 o84Var = (o84) viewGroup;
                if (o84Var.E0) {
                    return h8gVar;
                }
                View childAt = o84Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, o84Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, o84Var.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? h8gVar : h8gVar.a.r(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // defpackage.h72
    public final lqb g(n7g n7gVar, lqb lqbVar) {
        int i = this.c;
        ViewGroup viewGroup = this.d;
        switch (i) {
            case 0:
                c47 c47Var = (c47) ((uvf) viewGroup).R0.V0.d;
                if (!c47Var.t1.Y) {
                    return lqbVar;
                }
                long jR = qn4.R(c47Var.N(0L));
                int i2 = (int) (jR >> 32);
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (int) (jR & 4294967295L);
                if (i3 < 0) {
                    i3 = 0;
                }
                long jL = vd0.S(c47Var).l();
                int i4 = (int) (jL >> 32);
                int i5 = (int) (jL & 4294967295L);
                long j = c47Var.c;
                long jR2 = qn4.R(c47Var.N((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i6 = i4 - ((int) (jR2 >> 32));
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - ((int) (jR2 & 4294967295L));
                int i8 = i7 >= 0 ? i7 : 0;
                return (i2 == 0 && i3 == 0 && i6 == 0 && i8 == 0) ? lqbVar : new lqb(19, ax.j((x47) lqbVar.b, i2, i3, i6, i8), ax.j((x47) lqbVar.c, i2, i3, i6, i8));
            default:
                o84 o84Var = (o84) viewGroup;
                if (o84Var.E0) {
                    return lqbVar;
                }
                View childAt = o84Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, o84Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, o84Var.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return lqbVar;
                }
                x47 x47VarB = x47.b(iMax, iMax2, iMax3, iMax4);
                int i9 = x47VarB.a;
                x47 x47Var = (x47) lqbVar.b;
                int i10 = x47VarB.b;
                int i11 = x47VarB.c;
                int i12 = x47VarB.d;
                return new lqb(19, h8g.a(x47Var, i9, i10, i11, i12), h8g.a((x47) lqbVar.c, i9, i10, i11, i12));
        }
    }
}
