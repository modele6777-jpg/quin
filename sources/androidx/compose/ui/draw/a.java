package androidx.compose.ui.draw;

import defpackage.bn2;
import defpackage.c82;
import defpackage.fy9;
import defpackage.j09;
import defpackage.ndb;
import defpackage.yi;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static j09 a(j09 j09Var, fy9 fy9Var, yi yiVar, bn2 bn2Var, float f, c82 c82Var, int i) {
        if ((i & 4) != 0) {
            yiVar = ndb.f;
        }
        yi yiVar2 = yiVar;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return j09Var.D(new PainterElement(fy9Var, yiVar2, bn2Var, f, c82Var));
    }
}
