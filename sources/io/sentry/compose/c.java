package io.sentry.compose;

import defpackage.a26;
import defpackage.cb9;
import defpackage.e89;
import defpackage.gu7;
import defpackage.h0e;
import defpackage.h48;
import defpackage.ra4;
import io.sentry.android.navigation.SentryNavigationListener;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends gu7 implements a26 {
    final /* synthetic */ h48 $lifecycle;
    final /* synthetic */ h0e $navListenerSnapshot$delegate;
    final /* synthetic */ cb9 $this_withSentryObservableEffect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(cb9 cb9Var, h48 h48Var, e89 e89Var) {
        super(1);
        this.$this_withSentryObservableEffect = cb9Var;
        this.$lifecycle = h48Var;
        this.$navListenerSnapshot$delegate = e89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        ((ra4) obj).getClass();
        a aVar = new a(this.$this_withSentryObservableEffect, (SentryNavigationListener) this.$navListenerSnapshot$delegate.getValue());
        this.$lifecycle.a(aVar);
        return new b(aVar, this.$lifecycle);
    }
}
