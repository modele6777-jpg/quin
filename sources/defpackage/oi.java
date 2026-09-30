package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oi implements AdapterView.OnItemClickListener {
    public final /* synthetic */ si a;
    public final /* synthetic */ pi b;

    public oi(pi piVar, si siVar) {
        this.b = piVar;
        this.a = siVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        pi piVar = this.b;
        DialogInterface.OnClickListener onClickListener = piVar.n;
        si siVar = this.a;
        onClickListener.onClick(siVar.b, i);
        if (piVar.p) {
            return;
        }
        siVar.b.dismiss();
    }
}
