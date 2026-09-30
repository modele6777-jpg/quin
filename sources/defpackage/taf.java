package defpackage;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class taf implements ac0 {
    public final Object a;
    public final ArrayList b = new ArrayList();
    public Object c;

    public taf(LayoutNode layoutNode) {
        this.a = layoutNode;
        this.c = layoutNode;
    }

    @Override // defpackage.ac0
    public final void a(int i, Object obj) {
        ((LayoutNode) this.c).N(i, (LayoutNode) obj);
    }

    public final void b() {
        this.b.clear();
        this.c = this.a;
        ((LayoutNode) this.a).o0();
    }

    @Override // defpackage.ac0
    public final void d(Object obj) {
        this.b.add(this.c);
        this.c = obj;
    }

    @Override // defpackage.ac0
    public final void e() {
        jkb rectManager;
        zo autofillManager;
        jkb rectManager2;
        LayoutNode layoutNode = (LayoutNode) this.c;
        wo0 wo0Var = layoutNode.V0;
        if (!layoutNode.W()) {
            i37.a("onReuse is only expected on attached node");
        }
        uvf uvfVar = layoutNode.E0;
        if (uvfVar != null) {
            View view = uvfVar.b;
            if (view.getParent() != uvfVar) {
                uvfVar.addView(view);
            } else {
                uvfVar.f.invoke();
            }
        }
        gw7 gw7Var = layoutNode.W0;
        if (gw7Var != null) {
            gw7Var.i(false);
        }
        layoutNode.J0 = false;
        if (layoutNode.f1) {
            layoutNode.f1 = false;
        } else {
            i09 i09Var = (zde) layoutNode.V0.f;
            for (i09 i09Var2 = i09Var; i09Var2 != null; i09Var2 = i09Var2.e) {
                if (i09Var2.Y) {
                    i09Var2.g1();
                }
            }
            for (i09 i09Var3 = i09Var; i09Var3 != null; i09Var3 = i09Var3.e) {
                if (i09Var3.Y) {
                    i09Var3.i1();
                }
            }
            while (i09Var != null) {
                if (i09Var.Y) {
                    i09Var.c1();
                }
                i09Var = i09Var.e;
            }
        }
        int i = layoutNode.b;
        Owner owner = layoutNode.Z;
        if (owner != null && (rectManager2 = owner.getRectManager()) != null) {
            rectManager2.h(layoutNode);
        }
        layoutNode.b = vwc.a.addAndGet(1);
        Owner owner2 = layoutNode.Z;
        if (owner2 != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) owner2;
            androidComposeView.m3getLayoutNodes().g(i);
            androidComposeView.m3getLayoutNodes().i(layoutNode.b, layoutNode);
        }
        for (i09 i09Var4 = (i09) wo0Var.g; i09Var4 != null; i09Var4 = i09Var4.f) {
            i09Var4.b1();
        }
        wo0Var.l();
        if (wo0Var.i(8)) {
            layoutNode.U();
        }
        LayoutNode.v0(layoutNode);
        Owner owner3 = layoutNode.Z;
        if (owner3 != null && (autofillManager = ((AndroidComposeView) owner3).getAutofillManager()) != null) {
            AndroidComposeView androidComposeView2 = autofillManager.c;
            vea veaVar = autofillManager.a;
            r69 r69Var = autofillManager.v;
            if (r69Var.f(i)) {
                veaVar.z(androidComposeView2, i, false);
            }
            twc twcVarH = layoutNode.H();
            if (twcVarH != null && twcVarH.a.b(cxc.r)) {
                r69Var.a(layoutNode.b);
                veaVar.z(androidComposeView2, layoutNode.b, true);
            }
        }
        Owner owner4 = layoutNode.Z;
        if (owner4 == null || (rectManager = owner4.getRectManager()) == null) {
            return;
        }
        rectManager.g(layoutNode);
    }

    @Override // defpackage.ac0
    public final void f(int i, int i2, int i3) {
        ((LayoutNode) this.c).h0(i, i2, i3);
    }

    @Override // defpackage.ac0
    public final void g(int i, int i2) {
        ((LayoutNode) this.c).p0(i, i2);
    }

    @Override // defpackage.ac0
    public final void l() {
        ArrayList arrayList = this.b;
        this.c = arrayList.remove(arrayList.size() - 1);
    }

    @Override // defpackage.ac0
    public final void m(int i, Object obj) {
    }

    @Override // defpackage.ac0
    public final void n() {
        Owner owner = ((LayoutNode) this.a).Z;
        if (owner != null) {
            ((AndroidComposeView) owner).u();
        }
    }

    @Override // defpackage.ac0
    public final Object o() {
        return this.c;
    }
}
