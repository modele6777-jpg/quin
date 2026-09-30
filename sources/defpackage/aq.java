package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aq extends i09 implements h31, wwc, qo7, kv7, i4f {
    public final /* synthetic */ AndroidComposeView E0;
    public final c1 Z = new c1(11, this);

    public aq(AndroidComposeView androidComposeView) {
        this.E0 = androidComposeView;
    }

    @Override // defpackage.qo7
    public final boolean M(KeyEvent keyEvent) {
        mn5 mn5Var;
        int[] iArr = un5.a;
        long jQ = nk8.q(keyEvent);
        if (ko7.a(jQ, ko7.b)) {
            mn5Var = new mn5(2);
        } else if (ko7.a(jQ, ko7.c)) {
            mn5Var = new mn5(1);
        } else if (ko7.a(jQ, ko7.p)) {
            mn5Var = new mn5(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (ko7.a(jQ, ko7.g)) {
            mn5Var = new mn5(4);
        } else if (ko7.a(jQ, ko7.f)) {
            mn5Var = new mn5(3);
        } else if (ko7.a(jQ, ko7.d) || ko7.a(jQ, ko7.C)) {
            mn5Var = new mn5(5);
        } else if (ko7.a(jQ, ko7.e) || ko7.a(jQ, ko7.D)) {
            mn5Var = new mn5(6);
        } else if (ko7.a(jQ, ko7.h) || ko7.a(jQ, ko7.r) || ko7.a(jQ, ko7.E)) {
            mn5Var = new mn5(7);
        } else {
            mn5Var = (ko7.a(jQ, ko7.a) || ko7.a(jQ, ko7.u)) ? new mn5(8) : null;
        }
        if (mn5Var != null) {
            int i = mn5Var.a;
            if (nk8.r(keyEvent) == 2) {
                AndroidComposeView androidComposeView = this.E0;
                oo5 oo5VarG = ((bo5) androidComposeView.getFocusOwner()).g();
                if (oo5VarG != null && oo5VarG.Z && androidComposeView.t(i)) {
                    androidComposeView.getPlayNavigationSoundEffect().z(mn5Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                Boolean boolF = ((bo5) androidComposeView.getFocusOwner()).f(i, androidComposeView.getEmbeddedViewFocusRect(), new c1(10, mn5Var));
                if (boolF == null) {
                    return true;
                }
                if (boolF.booleanValue()) {
                    androidComposeView.getPlayNavigationSoundEffect().z(mn5Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                if (i != 1 && i != 2) {
                    return false;
                }
                Integer numC = un5.c(i);
                int iIntValue = numC != null ? numC.intValue() : 2;
                FocusFinder focusFinder = FocusFinder.getInstance();
                View rootView = androidComposeView.getRootView();
                rootView.getClass();
                View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, androidComposeView.getView(), iIntValue);
                if (viewFindNextFocus == null || viewFindNextFocus.equals(androidComposeView)) {
                    return ((bo5) androidComposeView.getFocusOwner()).i(i);
                }
            }
        }
        return false;
    }

    @Override // defpackage.h31
    public final Object X(yf9 yf9Var, v6 v6Var, zn2 zn2Var) {
        long jN = yf9Var.N(0L);
        hkb hkbVar = (hkb) v6Var.invoke();
        hkb hkbVarK = hkbVar != null ? hkbVar.k(jN) : null;
        if (hkbVarK != null) {
            this.E0.requestRectangleOnScreen(new Rect((int) hkbVarK.a, (int) hkbVarK.b, (int) hkbVarK.c, (int) hkbVarK.d), false);
        }
        return wef.a;
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        cea ceaVarV = tn8Var.v(j);
        return zn8Var.y(ceaVarV.a, ceaVarV.b, qu4.a, this.Z, new l1(ceaVarV, 1));
    }

    @Override // defpackage.qo7
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.i4f
    public final Object q() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
    }
}
