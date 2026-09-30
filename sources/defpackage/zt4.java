package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zt4 extends qn4 {
    public final yt4 s;

    public zt4(TextView textView) {
        this.s = new yt4(textView);
    }

    @Override // defpackage.qn4
    public final InputFilter[] A(InputFilter[] inputFilterArr) {
        return !jt4.d() ? inputFilterArr : this.s.A(inputFilterArr);
    }

    @Override // defpackage.qn4
    public final void S(boolean z) {
        if (jt4.d()) {
            this.s.S(z);
        }
    }

    @Override // defpackage.qn4
    public final void T(boolean z) {
        boolean zD = jt4.d();
        yt4 yt4Var = this.s;
        if (zD) {
            yt4Var.T(z);
        } else {
            yt4Var.u = z;
        }
    }
}
