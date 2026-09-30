package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j90 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ l90 a;

    public j90(l90 l90Var) {
        this.a = l90Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        l90 l90Var = this.a;
        o90 o90Var = l90Var.U0;
        o90Var.setSelection(i);
        if (o90Var.getOnItemClickListener() != null) {
            o90Var.performItemClick(view, i, l90Var.R0.getItemId(i));
        }
        l90Var.dismiss();
    }
}
