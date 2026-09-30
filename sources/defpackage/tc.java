package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tc extends is5 {
    public final /* synthetic */ int x = 0;
    public final /* synthetic */ View y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.y = actionMenuItemView;
    }

    @Override // defpackage.is5
    public final efd b() {
        vc vcVar;
        int i = this.x;
        View view = this.y;
        switch (i) {
            case 0:
                uc ucVar = ((ActionMenuItemView) view).F0;
                if (ucVar == null || (vcVar = ((wc) ucVar).a.I0) == null) {
                    return null;
                }
                return vcVar.a();
            default:
                vc vcVar2 = ((xc) view).d.H0;
                if (vcVar2 == null) {
                    return null;
                }
                return vcVar2.a();
        }
    }

    @Override // defpackage.is5
    public final boolean c() {
        efd efdVarB;
        int i = this.x;
        View view = this.y;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                pr8 pr8Var = actionMenuItemView.z;
                return pr8Var != null && pr8Var.a(actionMenuItemView.w) && (efdVarB = b()) != null && efdVarB.a();
            default:
                ((xc) view).d.l();
                return true;
        }
    }

    @Override // defpackage.is5
    public boolean d() {
        switch (this.x) {
            case 1:
                yc ycVar = ((xc) this.y).d;
                if (ycVar.J0 != null) {
                    return false;
                }
                ycVar.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(xc xcVar, xc xcVar2) {
        super(xcVar2);
        this.y = xcVar;
    }
}
