package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cpd implements a26 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ b62 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;

    public cpd(boolean z, a26 a26Var, b62 b62Var, int i, boolean z2, float f) {
        this.a = z;
        this.b = a26Var;
        this.c = b62Var;
        this.d = i;
        this.e = z2;
        this.f = f;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        KeyEvent keyEvent = ((mo7) obj).a;
        b62 b62Var = this.c;
        float f = b62Var.b;
        if (!this.a) {
            return Boolean.FALSE;
        }
        a26 a26Var = this.b;
        if (a26Var == null) {
            return Boolean.FALSE;
        }
        int iR = nk8.r(keyEvent);
        boolean z = false;
        if (iR == 2) {
            float f2 = b62Var.a;
            float fAbs = Math.abs(f - f2);
            int i = this.d;
            int i2 = i > 0 ? i + 1 : 100;
            float f3 = fAbs / i2;
            int i3 = this.e ? -1 : 1;
            long jG = k99.g(keyEvent.getKeyCode());
            boolean zA = ko7.a(jG, ko7.d);
            float f4 = this.f;
            if (zA) {
                a26Var.d(mh3.r(Float.valueOf((i3 * f3) + f4), b62Var));
            } else if (ko7.a(jG, ko7.e)) {
                a26Var.d(mh3.r(Float.valueOf(f4 - (i3 * f3)), b62Var));
            } else if (ko7.a(jG, ko7.g)) {
                a26Var.d(mh3.r(Float.valueOf((i3 * f3) + f4), b62Var));
            } else if (ko7.a(jG, ko7.f)) {
                a26Var.d(mh3.r(Float.valueOf(f4 - (i3 * f3)), b62Var));
            } else if (ko7.a(jG, ko7.v)) {
                a26Var.d(Float.valueOf(f2));
            } else if (ko7.a(jG, ko7.w)) {
                a26Var.d(Float.valueOf(f));
            } else if (ko7.a(jG, ko7.C)) {
                a26Var.d(mh3.r(Float.valueOf(f4 - (mh3.o(i2 / 10, 1, 10) * f3)), b62Var));
            } else if (ko7.a(jG, ko7.D)) {
                a26Var.d(mh3.r(Float.valueOf((mh3.o(i2 / 10, 1, 10) * f3) + f4), b62Var));
            }
            z = true;
        } else if (iR == 1) {
            long jG2 = k99.g(keyEvent.getKeyCode());
            if (ko7.a(jG2, ko7.d) || ko7.a(jG2, ko7.e) || ko7.a(jG2, ko7.g) || ko7.a(jG2, ko7.f) || ko7.a(jG2, ko7.v) || ko7.a(jG2, ko7.w) || ko7.a(jG2, ko7.C) || ko7.a(jG2, ko7.D)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
