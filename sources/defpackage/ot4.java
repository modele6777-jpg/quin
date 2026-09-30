package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ot4 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile ot4 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new aud(cls, charSequence) : super.newEditable(charSequence);
    }
}
