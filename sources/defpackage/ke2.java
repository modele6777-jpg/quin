package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ke2 extends ClickableSpan {
    public final l68 a;

    public ke2(l68 l68Var) {
        this.a = l68Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.getClass();
    }
}
