package io.sentry.android.replay;

import defpackage.ib8;
import defpackage.pa7;
import defpackage.ub3;
import io.sentry.r6;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public final b0 a;
    public final k b;
    public final Date c;
    public final int d;
    public final long e;
    public final r6 f;
    public final String g;
    public final List h;

    public e(b0 b0Var, k kVar, Date date, int i, long j, r6 r6Var, String str, List list) {
        this.a = b0Var;
        this.b = kVar;
        this.c = date;
        this.d = i;
        this.e = j;
        this.f = r6Var;
        this.g = str;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.a.equals(eVar.a) && this.b == eVar.b && this.c.equals(eVar.c) && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && pa7.t(this.g, eVar.g) && this.h.equals(eVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ib8.b(ub3.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31, this.e)) * 31;
        String str = this.g;
        return this.h.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "LastSegmentData(recorderConfig=" + this.a + ", cache=" + this.b + ", timestamp=" + this.c + ", id=" + this.d + ", duration=" + this.e + ", replayType=" + this.f + ", screenAtStart=" + this.g + ", events=" + this.h + ')';
    }
}
