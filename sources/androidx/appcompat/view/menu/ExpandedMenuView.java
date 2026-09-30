package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.os8;
import defpackage.pr8;
import defpackage.psd;
import defpackage.qr8;
import defpackage.vr8;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements pr8, os8, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public qr8 a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        psd psdVarX = psd.x(context, attributeSet, b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) psdVarX.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(psdVarX.p(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(psdVarX.p(1));
        }
        psdVarX.z();
    }

    @Override // defpackage.pr8
    public final boolean a(vr8 vr8Var) {
        return this.a.q(vr8Var, null, 0);
    }

    @Override // defpackage.os8
    public final void b(qr8 qr8Var) {
        this.a = qr8Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((vr8) getAdapter().getItem(i));
    }
}
