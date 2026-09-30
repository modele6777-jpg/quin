package io.sentry.android.replay;

import android.view.View;
import defpackage.a26;
import defpackage.gu7;
import defpackage.pa7;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends gu7 implements a26 {
    final /* synthetic */ View $root;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(View view) {
        super(1);
        this.$root = view;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        WeakReference weakReference = (WeakReference) obj;
        weakReference.getClass();
        return Boolean.valueOf(pa7.t(weakReference.get(), this.$root));
    }
}
