package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jf3 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ j09 c;

    public jf3(int i, a26 a26Var, j09 j09Var) {
        this.a = i;
        this.b = a26Var;
        this.c = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i = this.a;
            i8c i8cVar = sf2.a;
            a26 a26Var = this.b;
            if (i == 0) {
                l46Var.f0(-101264927);
                gx6 gx6VarB = z7f.l;
                if (gx6VarB == null) {
                    fx6 fx6Var = new fx6("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    int i2 = msf.a;
                    dtd dtdVar = new dtd(y72.b);
                    s71 s71Var = new s71(1);
                    s71Var.p(3.0f, 17.25f);
                    s71Var.s(21.0f);
                    s71Var.m(3.75f);
                    s71Var.n(17.81f, 9.94f);
                    s71Var.o(-3.75f, -3.75f);
                    s71Var.n(3.0f, 17.25f);
                    s71Var.h();
                    s71Var.p(20.71f, 7.04f);
                    s71Var.j(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                    s71Var.o(-2.34f, -2.34f);
                    s71Var.j(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                    s71Var.o(-1.83f, 1.83f);
                    s71Var.o(3.75f, 3.75f);
                    s71Var.o(1.83f, -1.83f);
                    s71Var.h();
                    fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
                    gx6VarB = fx6Var.b();
                    z7f.l = gx6VarB;
                }
                String strH = tgc.h(R.string.m3c_date_picker_switch_to_input_mode, l46Var);
                boolean zG = l46Var.g(a26Var);
                Object objR = l46Var.R();
                if (zG || objR == i8cVar) {
                    objR = new zh1(a26Var, 6);
                    l46Var.p0(objR);
                }
                vf3.h((x16) objR, gx6VarB, strH, this.c, false, l46Var, 0, 16);
                l46Var.r(false);
            } else {
                l46Var.f0(-100967048);
                gx6 gx6VarB2 = z7f.m;
                if (gx6VarB2 == null) {
                    fx6 fx6Var2 = new fx6("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    int i3 = msf.a;
                    dtd dtdVar2 = new dtd(y72.b);
                    s71 s71Var2 = new s71(1);
                    s71Var2.p(9.0f, 11.0f);
                    s71Var2.n(7.0f, 11.0f);
                    s71Var2.t(2.0f);
                    s71Var2.m(2.0f);
                    s71Var2.t(-2.0f);
                    s71Var2.h();
                    s71Var2.p(13.0f, 11.0f);
                    s71Var2.m(-2.0f);
                    s71Var2.t(2.0f);
                    s71Var2.m(2.0f);
                    s71Var2.t(-2.0f);
                    s71Var2.h();
                    s71Var2.p(17.0f, 11.0f);
                    s71Var2.m(-2.0f);
                    s71Var2.t(2.0f);
                    s71Var2.m(2.0f);
                    s71Var2.t(-2.0f);
                    s71Var2.h();
                    s71Var2.p(19.0f, 4.0f);
                    s71Var2.m(-1.0f);
                    s71Var2.n(18.0f, 2.0f);
                    s71Var2.m(-2.0f);
                    s71Var2.t(2.0f);
                    s71Var2.n(8.0f, 4.0f);
                    s71Var2.n(8.0f, 2.0f);
                    s71Var2.n(6.0f, 2.0f);
                    s71Var2.t(2.0f);
                    s71Var2.n(5.0f, 4.0f);
                    s71Var2.j(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                    s71Var2.n(3.0f, 20.0f);
                    s71Var2.j(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                    s71Var2.m(14.0f);
                    s71Var2.j(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    s71Var2.n(21.0f, 6.0f);
                    s71Var2.j(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    s71Var2.h();
                    s71Var2.p(19.0f, 20.0f);
                    s71Var2.n(5.0f, 20.0f);
                    s71Var2.n(5.0f, 9.0f);
                    s71Var2.m(14.0f);
                    s71Var2.t(11.0f);
                    s71Var2.h();
                    fx6.a(fx6Var2, s71Var2.b, dtdVar2, 1.0f, 1.0f, 2, 1.0f);
                    gx6VarB2 = fx6Var2.b();
                    z7f.m = gx6VarB2;
                }
                String strH2 = tgc.h(R.string.m3c_date_picker_switch_to_calendar_mode, l46Var);
                boolean zG2 = l46Var.g(a26Var);
                Object objR2 = l46Var.R();
                if (zG2 || objR2 == i8cVar) {
                    objR2 = new zh1(a26Var, 7);
                    l46Var.p0(objR2);
                }
                vf3.h((x16) objR2, gx6VarB2, strH2, this.c, false, l46Var, 0, 16);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
