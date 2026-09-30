package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e68 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int iB;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((flb) this.k.get(i2)).a;
            ukb ukbVar = (ukb) view3.getLayoutParams();
            if (view3 != view && !ukbVar.a.g() && (iB = (ukbVar.a.b() - this.d) * this.e) >= 0 && iB < i) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i = iB;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((ukb) view2.getLayoutParams()).a.b();
        }
    }

    public final View b(gp3 gp3Var) {
        List list = this.k;
        if (list == null) {
            View view = gp3Var.p(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((flb) this.k.get(i)).a;
            ukb ukbVar = (ukb) view2.getLayoutParams();
            if (!ukbVar.a.g() && this.d == ukbVar.a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
