package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pze extends ViewGroup.MarginLayoutParams {
    public int a;
    public int b;

    public pze(pze pzeVar) {
        super((ViewGroup.MarginLayoutParams) pzeVar);
        this.a = 0;
        this.a = pzeVar.a;
    }

    public pze(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
