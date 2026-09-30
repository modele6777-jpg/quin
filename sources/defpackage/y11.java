package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y11 {
    public static final y11 a = new y11();
    public static final float b = 640.0f;
    public static final float c = 56.0f;
    public static final float d = 125.0f;

    public static long b(l46 l46Var) {
        return y72.b(o82.d(m93.k, l46Var), 0.32f);
    }

    public final void a(j09 j09Var, float f, float f2, x4d x4dVar, long j, l46 l46Var, final int i) {
        final j09 j09Var2;
        final float f3;
        final float f4;
        final x4d x4dVar2;
        final long j2;
        long jD;
        float f5;
        float f6;
        x4d x4dVar3;
        j09 j09Var3;
        l46Var.h0(-1364277227);
        int i2 = i | 9654;
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                float f7 = tm7.C;
                float f8 = tm7.B;
                y6c y6cVar = ((s5d) l46Var.k(u5d.a)).e;
                jD = o82.d(tm7.A, l46Var);
                f5 = f7;
                f6 = f8;
                x4dVar3 = y6cVar;
                j09Var3 = g09.a;
            } else {
                l46Var.Z();
                j09Var3 = j09Var;
                f5 = f;
                f6 = f2;
                x4dVar3 = x4dVar;
                jD = j;
            }
            l46Var.s();
            String strH = tgc.h(R.string.m3c_bottom_sheet_drag_handle_description, l46Var);
            x6f x6fVar = red.a;
            j09 j09VarB0 = ynb.b0(0.0f, 22.0f, j09Var3, 1);
            boolean zG = l46Var.g(strH);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new ia(strH, 5);
                l46Var.p0(objR);
            }
            long j3 = jD;
            nae.a(vwc.b(j09VarB0, false, (a26) objR), x4dVar3, j3, 0L, 0.0f, 0.0f, null, af1.b0(-1039573072, new x11(f5, f6), l46Var), l46Var, 12582912, 120);
            x4dVar2 = x4dVar3;
            j2 = j3;
            j09Var2 = j09Var3;
            f3 = f5;
            f4 = f6;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            f3 = f;
            f4 = f2;
            x4dVar2 = x4dVar;
            j2 = j;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(j09Var2, f3, f4, x4dVar2, j2, i) { // from class: w11
                public final /* synthetic */ j09 b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ x4d e;
                public final /* synthetic */ long f;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(196609);
                    this.a.a(this.b, this.c, this.d, this.e, this.f, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }
}
