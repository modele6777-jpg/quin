package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rq {
    public static final rq a = new rq();

    public final void a(View view, mia miaVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = miaVar instanceof ju ? PointerIcon.getSystemIcon(context, ((ju) miaVar).b) : PointerIcon.getSystemIcon(context, 1000);
        if (pa7.t(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
