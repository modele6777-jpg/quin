package io.sentry.android.sqlite;

import android.database.CursorWindow;
import defpackage.gu7;
import defpackage.wef;
import defpackage.x16;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends gu7 implements x16 {
    final /* synthetic */ int $position;
    final /* synthetic */ CursorWindow $window;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, int i, CursorWindow cursorWindow) {
        super(0);
        this.this$0 = dVar;
        this.$position = i;
        this.$window = cursorWindow;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        this.this$0.a.fillWindow(this.$position, this.$window);
        return wef.a;
    }
}
