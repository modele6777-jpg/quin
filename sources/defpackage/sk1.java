package defpackage;

import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sk1 implements wjf {
    public final /* synthetic */ int a;
    public final k79 b;

    public sk1(k79 k79Var, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = k79Var;
                no0 no0Var = kfe.b0;
                Class cls = (Class) k79Var.a(no0Var, null);
                if (cls != null && !cls.equals(wta.class)) {
                    s8f.k("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                k79Var.p(xjf.p0, zjf.b);
                k79Var.p(no0Var, wta.class);
                no0 no0Var2 = kfe.a0;
                if (k79Var.a(no0Var2, null) == null) {
                    k79Var.p(no0Var2, wta.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                no0 no0Var3 = ew6.I;
                if (((Integer) k79Var.a(no0Var3, -1)).intValue() == -1) {
                    k79Var.p(no0Var3, 2);
                    return;
                }
                return;
            case 3:
                this.b = k79Var;
                no0 no0Var4 = kfe.b0;
                Class cls2 = (Class) k79Var.a(no0Var4, null);
                if (cls2 != null && !cls2.equals(k3e.class)) {
                    s8f.k("Invalid target class configuration for ", this, ": ", cls2);
                    throw null;
                }
                k79Var.p(xjf.p0, zjf.e);
                k79Var.p(no0Var4, k3e.class);
                no0 no0Var5 = kfe.a0;
                if (k79Var.a(no0Var5, null) == null) {
                    k79Var.p(no0Var5, k3e.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            default:
                this.b = k79Var;
                no0 no0Var6 = kfe.b0;
                Class cls3 = (Class) k79Var.a(no0Var6, null);
                if (cls3 != null && !cls3.equals(hv6.class)) {
                    s8f.k("Invalid target class configuration for ", this, ": ", cls3);
                    throw null;
                }
                k79Var.p(xjf.p0, zjf.a);
                k79Var.p(no0Var6, hv6.class);
                no0 no0Var7 = kfe.a0;
                if (k79Var.a(no0Var7, null) == null) {
                    k79Var.p(no0Var7, hv6.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    public hv6 a() {
        no0 no0Var = iv6.e;
        k79 k79Var = this.b;
        Integer num = (Integer) k79Var.a(no0Var, null);
        if (num != null) {
            k79Var.p(wv6.C, num);
        } else {
            fv6 fv6Var = hv6.C;
            no0 no0Var2 = iv6.f;
            if (Objects.equals(k79Var.a(no0Var2, null), 2)) {
                k79Var.p(wv6.C, 32);
            } else if (Objects.equals(k79Var.a(no0Var2, null), 3)) {
                k79Var.p(wv6.C, 32);
                k79Var.p(wv6.D, 256);
            } else if (Objects.equals(k79Var.a(no0Var2, null), 1)) {
                k79Var.p(wv6.C, 4101);
                k79Var.p(wv6.E, qr4.c);
            } else {
                k79Var.p(wv6.C, 256);
            }
        }
        iv6 iv6Var = new iv6(bs9.d(k79Var));
        ew6.z(iv6Var);
        hv6 hv6Var = new hv6(iv6Var);
        Size size = (Size) k79Var.a(ew6.J, null);
        if (size != null) {
            hv6Var.v = new Rational(size.getWidth(), size.getHeight());
        }
        ok8.n((Executor) k79Var.a(cd7.P, dd7.a()), "The IO executor can't be null");
        no0 no0Var3 = iv6.c;
        if (k79Var.a.containsKey(no0Var3)) {
            Integer num2 = (Integer) k79Var.c(no0Var3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                yg5.l(num2, "The flash mode is not allowed to set: ");
                return null;
            }
            if (num2.intValue() == 3 && k79Var.a(iv6.y, null) == null) {
                qc0.j("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                return null;
            }
        }
        return hv6Var;
    }

    @Override // defpackage.e85
    public k79 h() {
        int i = this.a;
        return this.b;
    }

    @Override // defpackage.wjf
    public xjf o() {
        int i = this.a;
        k79 k79Var = this.b;
        switch (i) {
            case 1:
                return new iv6(bs9.d(k79Var));
            case 2:
                return new yta(bs9.d(k79Var));
            default:
                return new l3e(bs9.d(k79Var));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sk1(int i) {
        this(k79.j(), 2);
        this.a = i;
        switch (i) {
            case 1:
                this(k79.j(), 1);
                return;
            case 2:
                return;
            default:
                k79 k79VarJ = k79.j();
                this.b = k79VarJ;
                no0 no0Var = kfe.b0;
                Class cls = (Class) k79VarJ.a(no0Var, null);
                if (cls != null && !cls.equals(rk1.class)) {
                    s8f.k("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                k79VarJ.p(no0Var, rk1.class);
                no0 no0Var2 = kfe.a0;
                if (k79VarJ.a(no0Var2, null) == null) {
                    k79VarJ.p(no0Var2, rk1.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }
}
