package io.sentry.android.sqlite;

import android.database.CrossProcessCursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends CursorWrapper implements CrossProcessCursor {
    public final CrossProcessCursor a;
    public final io.sentry.n b;
    public final String c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CrossProcessCursor crossProcessCursor, io.sentry.n nVar, String str) {
        super(crossProcessCursor);
        str.getClass();
        this.a = crossProcessCursor;
        this.b = nVar;
        this.c = str;
    }

    @Override // android.database.CrossProcessCursor
    public final void fillWindow(int i, CursorWindow cursorWindow) {
        if (this.d) {
            this.a.fillWindow(i, cursorWindow);
            return;
        }
        this.d = true;
        this.b.f(this.c, new a(this, i, cursorWindow));
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        if (this.d) {
            return this.a.getCount();
        }
        this.d = true;
        return ((Number) this.b.f(this.c, new b(this))).intValue();
    }

    @Override // android.database.CrossProcessCursor
    public final CursorWindow getWindow() {
        return this.a.getWindow();
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int i, int i2) {
        if (this.d) {
            return this.a.onMove(i, i2);
        }
        this.d = true;
        return ((Boolean) this.b.f(this.c, new c(this, i, i2))).booleanValue();
    }
}
