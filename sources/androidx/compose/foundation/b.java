package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.material3.c;
import defpackage.g09;
import defpackage.i5c;
import defpackage.j09;
import defpackage.ko7;
import defpackage.m93;
import defpackage.nk8;
import defpackage.o17;
import defpackage.r17;
import defpackage.t69;
import defpackage.x16;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final j09 a(j09 j09Var, t69 t69Var, r17 r17Var, boolean z, i5c i5cVar, x16 x16Var) {
        j09 j09VarD;
        if (r17Var != null) {
            j09VarD = new ClickableElement(t69Var, r17Var, false, z, null, i5cVar, x16Var);
        } else if (r17Var == null) {
            j09VarD = new ClickableElement(t69Var, null, false, z, null, i5cVar, x16Var);
        } else {
            g09 g09Var = g09.a;
            j09VarD = t69Var != null ? o17.a(g09Var, t69Var, r17Var).D(new ClickableElement(t69Var, null, false, z, null, i5cVar, x16Var)) : m93.u(g09Var, new a(r17Var, z, i5cVar, x16Var));
        }
        return j09Var.D(j09VarD);
    }

    public static /* synthetic */ j09 b(j09 j09Var, t69 t69Var, c cVar, boolean z, i5c i5cVar, x16 x16Var, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            i5cVar = null;
        }
        return a(j09Var, t69Var, cVar, z2, i5cVar, x16Var);
    }

    public static j09 c(j09 j09Var, boolean z, String str, i5c i5cVar, x16 x16Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return j09Var.D(new ClickableElement(null, null, true, z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : i5cVar, x16Var));
    }

    public static j09 d(j09 j09Var, t69 t69Var, x16 x16Var) {
        return j09Var.D(new CombinedClickableElement(x16Var, null, t69Var, false));
    }

    public static j09 e(j09 j09Var, x16 x16Var, x16 x16Var2) {
        return j09Var.D(new CombinedClickableElement(x16Var2, x16Var, null, true));
    }

    public static final boolean f(KeyEvent keyEvent) {
        long jQ = nk8.q(keyEvent);
        int i = ko7.O;
        return ko7.a(jQ, ko7.h) || ko7.a(jQ, ko7.r) || ko7.a(jQ, ko7.E) || ko7.a(jQ, ko7.q);
    }
}
