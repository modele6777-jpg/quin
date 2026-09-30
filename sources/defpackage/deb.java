package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class deb implements a26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ View b;
    public final /* synthetic */ e89 c;
    public final /* synthetic */ phb d;
    public final /* synthetic */ ufb e;
    public final /* synthetic */ qwc f;
    public final /* synthetic */ e89 g;

    public /* synthetic */ deb(View view, e89 e89Var, phb phbVar, ufb ufbVar, qwc qwcVar, e89 e89Var2) {
        this.b = view;
        this.c = e89Var;
        this.d = phbVar;
        this.e = ufbVar;
        this.f = qwcVar;
        this.g = e89Var2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        jr jrVarI;
        switch (this.a) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                motionEvent.getClass();
                int[] iArr = new int[2];
                this.b.getLocationOnScreen(iArr);
                if (this.d.d((((long) Float.floatToRawIntBits(motionEvent.getRawX() - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - iArr[1])) & 4294967295L)) == null) {
                    rs0.h(this.e, this.f, this.c, this.g);
                }
                return wef.a;
            default:
                ((ra4) obj).getClass();
                e89 e89Var = this.c;
                if (((Boolean) e89Var.getValue()).booleanValue()) {
                    View view = this.b;
                    jrVarI = rs0.I(view, new deb(view, this.d, this.e, this.f, this.g, e89Var));
                } else {
                    jrVarI = null;
                }
                return new seb(0, jrVarI);
        }
    }

    public /* synthetic */ deb(View view, phb phbVar, ufb ufbVar, qwc qwcVar, e89 e89Var, e89 e89Var2) {
        this.b = view;
        this.d = phbVar;
        this.e = ufbVar;
        this.f = qwcVar;
        this.c = e89Var;
        this.g = e89Var2;
    }
}
