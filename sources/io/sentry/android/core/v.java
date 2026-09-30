package io.sentry.android.core;

import android.content.SharedPreferences;
import defpackage.c2h;
import defpackage.oa7;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v {
    public final long a;
    public boolean b;
    public long c;
    public final Object d;
    public final Object e;

    public v(c2h c2hVar, String str, long j) {
        Objects.requireNonNull(c2hVar);
        this.e = c2hVar;
        oa7.x(str);
        this.d = str;
        this.a = j;
    }

    public long a() {
        if (!this.b) {
            this.b = true;
            c2h c2hVar = (c2h) this.e;
            this.c = c2hVar.E0().getLong((String) this.d, this.a);
        }
        return this.c;
    }

    public void b(long j) {
        SharedPreferences.Editor editorEdit = ((c2h) this.e).E0().edit();
        editorEdit.putLong((String) this.d, j);
        editorEdit.apply();
        this.c = j;
    }

    public v(long j, long j2, boolean z, File file, HashMap map) {
        this.a = j;
        this.d = file;
        this.c = j2;
        this.e = map;
        this.b = z;
    }
}
