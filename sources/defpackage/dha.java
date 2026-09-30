package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dha implements xga, View.OnClickListener, PopupWindow.OnDismissListener {
    public final /* synthetic */ oha a;

    public dha(oha ohaVar) {
        this.a = ohaVar;
    }

    @Override // defpackage.xga
    public final void c(wga wgaVar) {
        boolean zA = wgaVar.a(4, 5, 13);
        oha ohaVar = this.a;
        if (zA) {
            ohaVar.q();
        }
        if (wgaVar.a(4, 5, 7, 13)) {
            ohaVar.s();
        }
        if (wgaVar.a(8, 13)) {
            ohaVar.t();
        }
        if (wgaVar.a(9, 13)) {
            ohaVar.v();
        }
        if (wgaVar.a(8, 9, 11, 0, 16, 17, 13)) {
            ohaVar.p();
        }
        if (wgaVar.a(11, 0, 13)) {
            ohaVar.w();
        }
        if (wgaVar.a(12, 13)) {
            ohaVar.r();
        }
        if (wgaVar.a(2, 13)) {
            ohaVar.x();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        oha ohaVar = this.a;
        ImageView imageView = ohaVar.V0;
        View view2 = ohaVar.a1;
        View view3 = ohaVar.Z0;
        View view4 = ohaVar.Y0;
        tha thaVar = ohaVar.a;
        zga zgaVar = ohaVar.F1;
        if (zgaVar == null) {
            return;
        }
        thaVar.g();
        if (ohaVar.M0 == view) {
            y45 y45Var = (y45) zgaVar;
            if (y45Var.v(9)) {
                y45Var.J();
                return;
            }
            return;
        }
        if (ohaVar.L0 == view) {
            y45 y45Var2 = (y45) zgaVar;
            if (y45Var2.v(7)) {
                y45Var2.K();
                return;
            }
            return;
        }
        if (ohaVar.O0 == view) {
            y45 y45Var3 = (y45) zgaVar;
            if (y45Var3.r() == 4 || !y45Var3.v(12)) {
                return;
            }
            y45Var3.Z();
            long jK = y45Var3.k() + y45Var3.k0;
            long jP = y45Var3.p();
            if (jP != -9223372036854775807L) {
                jK = Math.min(jK, jP);
            }
            y45Var3.I(Math.max(jK, 0L));
            return;
        }
        if (ohaVar.P0 == view) {
            y45 y45Var4 = (y45) zgaVar;
            if (y45Var4.v(11)) {
                y45Var4.Z();
                long jK2 = y45Var4.k() + (-y45Var4.j0);
                long jP2 = y45Var4.p();
                if (jP2 != -9223372036854775807L) {
                    jK2 = Math.min(jK2, jP2);
                }
                y45Var4.I(Math.max(jK2, 0L));
                return;
            }
            return;
        }
        if (ohaVar.N0 == view) {
            if (pqf.P(zgaVar, ohaVar.J1)) {
                pqf.A(zgaVar);
                return;
            }
            y45 y45Var5 = (y45) zgaVar;
            if (y45Var5.v(1)) {
                y45Var5.P(false);
                return;
            }
            return;
        }
        if (ohaVar.S0 == view) {
            y45 y45Var6 = (y45) zgaVar;
            if (y45Var6.v(15)) {
                y45Var6.Z();
                int i = y45Var6.H;
                int i2 = ohaVar.P1;
                for (int i3 = 1; i3 <= 2; i3++) {
                    int i4 = (i + i3) % 3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2 || (i2 & 2) == 0) {
                            }
                        } else if ((i2 & 1) == 0) {
                        }
                    }
                    i = i4;
                }
                y45Var6.Q(i);
                return;
            }
            return;
        }
        if (ohaVar.T0 == view) {
            y45 y45Var7 = (y45) zgaVar;
            if (y45Var7.v(14)) {
                y45Var7.Z();
                boolean z = !y45Var7.I;
                f98 f98Var = y45Var7.m;
                y45Var7.Z();
                if (y45Var7.I != z) {
                    y45Var7.I = z;
                    y45Var7.l.g.b(12, z ? 1 : 0, 0).b();
                    f98Var.c(9, new p45(z, 0));
                    y45Var7.V();
                    f98Var.b();
                    return;
                }
                return;
            }
            return;
        }
        if (view4 == view) {
            thaVar.f();
            ohaVar.d(ohaVar.E0, view4);
            return;
        }
        if (view3 == view) {
            thaVar.f();
            ohaVar.d(ohaVar.F0, view3);
        } else if (view2 == view) {
            thaVar.f();
            ohaVar.d(ohaVar.H0, view2);
        } else if (imageView == view) {
            thaVar.f();
            ohaVar.d(ohaVar.G0, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        oha ohaVar = this.a;
        if (ohaVar.V1) {
            ohaVar.a.g();
        }
    }
}
