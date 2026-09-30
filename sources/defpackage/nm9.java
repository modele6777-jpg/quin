package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nm9 implements OnBackAnimationCallback {
    public final /* synthetic */ om9 a;

    public nm9(om9 om9Var) {
        this.a = om9Var;
    }

    public final void onBackCancelled() {
        om9 om9Var = this.a;
        szc szcVar = om9Var.a;
        if (szcVar == null) {
            qc0.p("This input is not added to any dispatcher.");
            return;
        }
        if (!om9Var.b) {
            szcVar.D(om9Var, null);
        }
        ac9 ac9Var = (ac9) szcVar.c;
        if (om9Var.equals(ac9Var.h) && -1 == ac9Var.g) {
            xb9 xb9VarC = ac9Var.f;
            if (xb9VarC == null) {
                xb9VarC = ac9Var.c(-1);
            }
            ac9Var.f = null;
            ac9Var.g = 0;
            ac9Var.h = null;
            if (xb9VarC != null) {
                xb9VarC.a();
            }
            ac9Var.a.n(null, bc9.Z);
        }
        om9Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        vb9 vb9VarA = r6.a(backEvent);
        om9 om9Var = this.a;
        szc szcVar = om9Var.a;
        if (szcVar == null) {
            qc0.p("This input is not added to any dispatcher.");
            return;
        }
        if (om9Var.b) {
            ac9 ac9Var = (ac9) szcVar.c;
            if (om9Var.equals(ac9Var.h) && -1 == ac9Var.g) {
                xb9 xb9VarC = ac9Var.f;
                if (xb9VarC == null) {
                    xb9VarC = ac9Var.c(-1);
                }
                if (xb9VarC != null) {
                    xb9VarC.c(vb9VarA);
                }
                ac9Var.a.n(null, new cc9(vb9VarA));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        vb9 vb9VarA = r6.a(backEvent);
        om9 om9Var = this.a;
        szc szcVar = om9Var.a;
        if (szcVar == null) {
            qc0.p("This input is not added to any dispatcher.");
        } else {
            if (om9Var.b) {
                return;
            }
            szcVar.D(om9Var, vb9VarA);
            om9Var.b = true;
        }
    }
}
