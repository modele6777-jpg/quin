package io.sentry.android.core.internal.gestures;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements io.sentry.internal.gestures.a {
    public final io.sentry.util.f a;

    public a(io.sentry.util.f fVar) {
        this.a = fVar;
    }

    @Override // io.sentry.internal.gestures.a
    public final io.sentry.internal.gestures.c a(View view, float f, float f2, io.sentry.internal.gestures.b bVar) {
        String strP;
        if (bVar == io.sentry.internal.gestures.b.CLICKABLE && view.isClickable() && view.getVisibility() == 0) {
            String strP2 = io.sentry.config.a.p(view);
            if (strP2 == null) {
                return null;
            }
            return new io.sentry.internal.gestures.c(view, io.sentry.config.a.k(view), strP2, null, "old_view_system");
        }
        if (bVar == io.sentry.internal.gestures.b.SCROLLABLE) {
            if (((!((Boolean) this.a.a()).booleanValue() ? false : ScrollingView.class.isAssignableFrom(view.getClass())) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0 && (strP = io.sentry.config.a.p(view)) != null) {
                return new io.sentry.internal.gestures.c(view, io.sentry.config.a.k(view), strP, null, "old_view_system");
            }
            return null;
        }
        return null;
    }
}
