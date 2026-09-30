package defpackage;

import android.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum cne {
    a(R.attr.actionModeCutDrawable, vfh.s, "Cut"),
    b(R.attr.actionModeCopyDrawable, vfh.t, "Copy"),
    c(R.attr.actionModePasteDrawable, vfh.u, "Paste"),
    d(R.attr.actionModeSelectAllDrawable, vfh.v, "SelectAll"),
    e(0, vfh.w, "Autofill");

    private final int drawableId;
    private final Object key;
    private final int stringId;

    cne(int i, Object obj, String str) {
        this.key = obj;
        this.stringId = i;
        this.drawableId = i;
    }

    public final int a() {
        return this.drawableId;
    }

    public final Object b() {
        return this.key;
    }

    public final int c() {
        return this.stringId;
    }
}
